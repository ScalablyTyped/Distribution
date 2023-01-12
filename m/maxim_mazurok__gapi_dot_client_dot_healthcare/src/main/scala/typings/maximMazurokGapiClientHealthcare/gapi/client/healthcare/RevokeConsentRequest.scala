package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeConsentRequest extends StObject {
  
  /**
    * Optional. The resource name of the Consent artifact that contains proof of the user's revocation of the Consent, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
    */
  var consentArtifact: js.UndefOr[String] = js.undefined
}
object RevokeConsentRequest {
  
  inline def apply(): RevokeConsentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeConsentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokeConsentRequest] (val x: Self) extends AnyVal {
    
    inline def setConsentArtifact(value: String): Self = StObject.set(x, "consentArtifact", value.asInstanceOf[js.Any])
    
    inline def setConsentArtifactUndefined: Self = StObject.set(x, "consentArtifact", js.undefined)
  }
}
