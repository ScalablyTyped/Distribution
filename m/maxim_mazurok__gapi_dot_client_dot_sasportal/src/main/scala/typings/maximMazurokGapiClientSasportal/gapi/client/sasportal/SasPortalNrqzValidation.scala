package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalNrqzValidation extends StObject {
  
  /** Validation case id. */
  var caseId: js.UndefOr[String] = js.undefined
  
  /** CPI who signed the validation. */
  var cpiId: js.UndefOr[String] = js.undefined
  
  /** Device latitude associated with the validation. */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** Device longitude associated with the validation. */
  var longitude: js.UndefOr[Double] = js.undefined
  
  /** State of the NRQZ validation info. */
  var state: js.UndefOr[String] = js.undefined
}
object SasPortalNrqzValidation {
  
  inline def apply(): SasPortalNrqzValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalNrqzValidation]
  }
  
  extension [Self <: SasPortalNrqzValidation](x: Self) {
    
    inline def setCaseId(value: String): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
    
    inline def setCpiId(value: String): Self = StObject.set(x, "cpiId", value.asInstanceOf[js.Any])
    
    inline def setCpiIdUndefined: Self = StObject.set(x, "cpiId", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
