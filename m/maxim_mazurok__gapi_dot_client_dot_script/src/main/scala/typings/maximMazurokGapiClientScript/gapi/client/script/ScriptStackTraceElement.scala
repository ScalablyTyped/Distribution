package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptStackTraceElement extends StObject {
  
  /** The name of the function that failed. */
  var function: js.UndefOr[String] = js.undefined
  
  /** The line number where the script failed. */
  var lineNumber: js.UndefOr[Double] = js.undefined
}
object ScriptStackTraceElement {
  
  inline def apply(): ScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptStackTraceElement]
  }
  
  extension [Self <: ScriptStackTraceElement](x: Self) {
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
  }
}
