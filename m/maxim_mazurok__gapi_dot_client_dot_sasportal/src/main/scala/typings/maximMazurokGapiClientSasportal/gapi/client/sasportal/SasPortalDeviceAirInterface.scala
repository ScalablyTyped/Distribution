package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalDeviceAirInterface extends StObject {
  
  /** This field specifies the radio access technology that is used for the CBSD. Conditional */
  var radioTechnology: js.UndefOr[String] = js.undefined
  
  /** This field is related to the radioTechnology field and provides the air interface specification that the CBSD is compliant with at the time of registration. Optional */
  var supportedSpec: js.UndefOr[String] = js.undefined
}
object SasPortalDeviceAirInterface {
  
  inline def apply(): SasPortalDeviceAirInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceAirInterface]
  }
  
  extension [Self <: SasPortalDeviceAirInterface](x: Self) {
    
    inline def setRadioTechnology(value: String): Self = StObject.set(x, "radioTechnology", value.asInstanceOf[js.Any])
    
    inline def setRadioTechnologyUndefined: Self = StObject.set(x, "radioTechnology", js.undefined)
    
    inline def setSupportedSpec(value: String): Self = StObject.set(x, "supportedSpec", value.asInstanceOf[js.Any])
    
    inline def setSupportedSpecUndefined: Self = StObject.set(x, "supportedSpec", js.undefined)
  }
}
