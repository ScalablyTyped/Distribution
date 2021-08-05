package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReusableConfigWrapper extends StObject {
  
  /** Required. A resource path to a ReusableConfig in the format `projects/∗/locations/∗/reusableConfigs/ *`. */
  var reusableConfig: js.UndefOr[String] = js.undefined
  
  /** Required. A user-specified inline ReusableConfigValues. */
  var reusableConfigValues: js.UndefOr[ReusableConfigValues] = js.undefined
}
object ReusableConfigWrapper {
  
  inline def apply(): ReusableConfigWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReusableConfigWrapper]
  }
  
  extension [Self <: ReusableConfigWrapper](x: Self) {
    
    inline def setReusableConfig(value: String): Self = StObject.set(x, "reusableConfig", value.asInstanceOf[js.Any])
    
    inline def setReusableConfigUndefined: Self = StObject.set(x, "reusableConfig", js.undefined)
    
    inline def setReusableConfigValues(value: ReusableConfigValues): Self = StObject.set(x, "reusableConfigValues", value.asInstanceOf[js.Any])
    
    inline def setReusableConfigValuesUndefined: Self = StObject.set(x, "reusableConfigValues", js.undefined)
  }
}
