package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search match for resource.
  */
trait SearchMatch extends StObject {
  
  /**
    * Line with match content.
    */
  var lineContent: String
  
  /**
    * Line number in resource content.
    */
  var lineNumber: Double
}
object SearchMatch {
  
  inline def apply(lineContent: String, lineNumber: Double): SearchMatch = {
    val __obj = js.Dynamic.literal(lineContent = lineContent.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMatch]
  }
  
  extension [Self <: SearchMatch](x: Self) {
    
    inline def setLineContent(value: String): Self = StObject.set(x, "lineContent", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
  }
}
