package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentStore extends StObject {
  
  /** Optional. Default time to live for Consents created in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents. */
  var defaultConsentTtl: js.UndefOr[String] = js.undefined
  
  /** Optional. If `true`, UpdateConsent creates the Consent if it does not already exist. If unspecified, defaults to `false`. */
  var enableConsentCreateOnUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. User-supplied key-value pairs used to organize consent stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
    * conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}. Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
    * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}. No more than 64 labels can be associated with a given store. For more information:
    * https://cloud.google.com/healthcare/docs/how-tos/labeling-resources
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Resource name of the consent store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. Cannot be changed after
    * creation.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ConsentStore {
  
  inline def apply(): ConsentStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsentStore] (val x: Self) extends AnyVal {
    
    inline def setDefaultConsentTtl(value: String): Self = StObject.set(x, "defaultConsentTtl", value.asInstanceOf[js.Any])
    
    inline def setDefaultConsentTtlUndefined: Self = StObject.set(x, "defaultConsentTtl", js.undefined)
    
    inline def setEnableConsentCreateOnUpdate(value: Boolean): Self = StObject.set(x, "enableConsentCreateOnUpdate", value.asInstanceOf[js.Any])
    
    inline def setEnableConsentCreateOnUpdateUndefined: Self = StObject.set(x, "enableConsentCreateOnUpdate", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
