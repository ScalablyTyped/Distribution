package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureContactSettingsRequest extends StObject {
  
  /** The list of contact notices that the caller acknowledges. The notices needed here depend on the values specified in `contact_settings`. */
  var contactNotices: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Fields of the `ContactSettings` to update. */
  var contactSettings: js.UndefOr[ContactSettings] = js.undefined
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the registrant contact is being updated, the `update_mask` is
    * `"registrant_contact"`.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /** Validate the request without actually updating the contact settings. */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ConfigureContactSettingsRequest {
  
  inline def apply(): ConfigureContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureContactSettingsRequest]
  }
  
  extension [Self <: ConfigureContactSettingsRequest](x: Self) {
    
    inline def setContactNotices(value: js.Array[String]): Self = StObject.set(x, "contactNotices", value.asInstanceOf[js.Any])
    
    inline def setContactNoticesUndefined: Self = StObject.set(x, "contactNotices", js.undefined)
    
    inline def setContactNoticesVarargs(value: String*): Self = StObject.set(x, "contactNotices", js.Array(value*))
    
    inline def setContactSettings(value: ContactSettings): Self = StObject.set(x, "contactSettings", value.asInstanceOf[js.Any])
    
    inline def setContactSettingsUndefined: Self = StObject.set(x, "contactSettings", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
