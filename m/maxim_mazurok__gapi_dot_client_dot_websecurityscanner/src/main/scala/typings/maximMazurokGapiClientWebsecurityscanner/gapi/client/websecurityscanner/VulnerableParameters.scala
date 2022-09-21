package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VulnerableParameters extends StObject {
  
  /** The vulnerable parameter names. */
  var parameterNames: js.UndefOr[js.Array[String]] = js.undefined
}
object VulnerableParameters {
  
  inline def apply(): VulnerableParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VulnerableParameters]
  }
  
  extension [Self <: VulnerableParameters](x: Self) {
    
    inline def setParameterNames(value: js.Array[String]): Self = StObject.set(x, "parameterNames", value.asInstanceOf[js.Any])
    
    inline def setParameterNamesUndefined: Self = StObject.set(x, "parameterNames", js.undefined)
    
    inline def setParameterNamesVarargs(value: String*): Self = StObject.set(x, "parameterNames", js.Array(value*))
  }
}
