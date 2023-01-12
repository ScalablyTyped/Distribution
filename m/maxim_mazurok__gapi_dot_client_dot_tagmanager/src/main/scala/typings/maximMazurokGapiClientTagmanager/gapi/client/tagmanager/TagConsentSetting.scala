package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagConsentSetting extends StObject {
  
  /** The tag's consent status. If set to NEEDED, the runtime will check that the consent types specified by the consent_type field have been granted. */
  var consentStatus: js.UndefOr[String] = js.undefined
  
  /** The type of consents to check for during tag firing if in the consent NEEDED state. This parameter must be of type LIST where each list item is of type STRING. */
  var consentType: js.UndefOr[Parameter] = js.undefined
}
object TagConsentSetting {
  
  inline def apply(): TagConsentSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagConsentSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagConsentSetting] (val x: Self) extends AnyVal {
    
    inline def setConsentStatus(value: String): Self = StObject.set(x, "consentStatus", value.asInstanceOf[js.Any])
    
    inline def setConsentStatusUndefined: Self = StObject.set(x, "consentStatus", js.undefined)
    
    inline def setConsentType(value: Parameter): Self = StObject.set(x, "consentType", value.asInstanceOf[js.Any])
    
    inline def setConsentTypeUndefined: Self = StObject.set(x, "consentType", js.undefined)
  }
}
