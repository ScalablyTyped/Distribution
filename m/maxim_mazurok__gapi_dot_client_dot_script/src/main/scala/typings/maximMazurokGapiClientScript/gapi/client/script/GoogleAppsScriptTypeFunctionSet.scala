package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeFunctionSet extends StObject {
  
  /** A list of functions composing the set. */
  var values: js.UndefOr[js.Array[GoogleAppsScriptTypeFunction]] = js.undefined
}
object GoogleAppsScriptTypeFunctionSet {
  
  inline def apply(): GoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeFunctionSet]
  }
  
  extension [Self <: GoogleAppsScriptTypeFunctionSet](x: Self) {
    
    inline def setValues(value: js.Array[GoogleAppsScriptTypeFunction]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: GoogleAppsScriptTypeFunction*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
