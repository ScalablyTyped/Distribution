package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalDeviceMetadata extends StObject {
  
  /** If populated, the Antenna Model Pattern to use. Format is: RecordCreatorId:PatternId */
  var antennaModel: js.UndefOr[String] = js.undefined
  
  /** CCG. A group of CBSDs in the same ICG requesting a common primary channel assignment. See CBRSA-TS-2001 V3.0.0 for more details. */
  var commonChannelGroup: js.UndefOr[String] = js.undefined
  
  /** ICG. A group of CBSDs that manage their own interference with the group. See CBRSA-TS-2001 V3.0.0 for more details. */
  var interferenceCoordinationGroup: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether a CPI has validated to have coordinated with the National Quiet Zone office. */
  var nrqzValidated: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. National Radio Quiet Zone validation info. */
  var nrqzValidation: js.UndefOr[SasPortalNrqzValidation] = js.undefined
}
object SasPortalDeviceMetadata {
  
  inline def apply(): SasPortalDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalDeviceMetadata] (val x: Self) extends AnyVal {
    
    inline def setAntennaModel(value: String): Self = StObject.set(x, "antennaModel", value.asInstanceOf[js.Any])
    
    inline def setAntennaModelUndefined: Self = StObject.set(x, "antennaModel", js.undefined)
    
    inline def setCommonChannelGroup(value: String): Self = StObject.set(x, "commonChannelGroup", value.asInstanceOf[js.Any])
    
    inline def setCommonChannelGroupUndefined: Self = StObject.set(x, "commonChannelGroup", js.undefined)
    
    inline def setInterferenceCoordinationGroup(value: String): Self = StObject.set(x, "interferenceCoordinationGroup", value.asInstanceOf[js.Any])
    
    inline def setInterferenceCoordinationGroupUndefined: Self = StObject.set(x, "interferenceCoordinationGroup", js.undefined)
    
    inline def setNrqzValidated(value: Boolean): Self = StObject.set(x, "nrqzValidated", value.asInstanceOf[js.Any])
    
    inline def setNrqzValidatedUndefined: Self = StObject.set(x, "nrqzValidated", js.undefined)
    
    inline def setNrqzValidation(value: SasPortalNrqzValidation): Self = StObject.set(x, "nrqzValidation", value.asInstanceOf[js.Any])
    
    inline def setNrqzValidationUndefined: Self = StObject.set(x, "nrqzValidation", js.undefined)
  }
}
