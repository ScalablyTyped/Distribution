package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorGetStackTraceMod {
  
  inline def apply(error: js.Error): js.Array[StackTraceElement] = ^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackTraceElement]]
  
  @JSImport("@nginstack/engine/lib/error/getStackTrace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait StackTraceElement extends StObject {
    
    var columnNumber: Double
    
    var fileName: String
    
    var functionName: String
    
    var isNativeFunction: Boolean
    
    var lineNumber: Double
    
    var source: String
    
    var tokenLength: Double
    
    var tokenPosition: Double
  }
  object StackTraceElement {
    
    inline def apply(
      columnNumber: Double,
      fileName: String,
      functionName: String,
      isNativeFunction: Boolean,
      lineNumber: Double,
      source: String,
      tokenLength: Double,
      tokenPosition: Double
    ): StackTraceElement = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], isNativeFunction = isNativeFunction.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tokenLength = tokenLength.asInstanceOf[js.Any], tokenPosition = tokenPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackTraceElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackTraceElement] (val x: Self) extends AnyVal {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setIsNativeFunction(value: Boolean): Self = StObject.set(x, "isNativeFunction", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTokenLength(value: Double): Self = StObject.set(x, "tokenLength", value.asInstanceOf[js.Any])
      
      inline def setTokenPosition(value: Double): Self = StObject.set(x, "tokenPosition", value.asInstanceOf[js.Any])
    }
  }
}
