package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeFunction extends StObject {
  
  /** The function name in the script project. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The ordered list of parameter names of the function in the script project. */
  var parameters: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleAppsScriptTypeFunction {
  
  inline def apply(): GoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeFunction]
  }
  
  extension [Self <: GoogleAppsScriptTypeFunction](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
