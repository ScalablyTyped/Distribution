package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stack entry for runtime errors and assertions.
  */
trait CallFrame extends StObject {
  
  /**
    * JavaScript script column number (0-based).
    */
  var columnNumber: Double
  
  /**
    * JavaScript function name.
    */
  var functionName: String
  
  /**
    * JavaScript script line number (0-based).
    */
  var lineNumber: Double
  
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId
  
  /**
    * JavaScript script name or url.
    */
  var url: String
}
object CallFrame {
  
  inline def apply(columnNumber: Double, functionName: String, lineNumber: Double, scriptId: ScriptId, url: String): CallFrame = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallFrame] (val x: Self) extends AnyVal {
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
