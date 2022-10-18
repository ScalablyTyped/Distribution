package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentArtifact extends StObject {
  
  /** Optional. Screenshots, PDFs, or other binary information documenting the user's consent. */
  var consentContentScreenshots: js.UndefOr[js.Array[Image]] = js.undefined
  
  /** Optional. An string indicating the version of the consent information shown to the user. */
  var consentContentVersion: js.UndefOr[String] = js.undefined
  
  /** Optional. A signature from a guardian. */
  var guardianSignature: js.UndefOr[Signature] = js.undefined
  
  /** Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Resource name of the Consent artifact, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. User's UUID provided by the client. */
  var userId: js.UndefOr[String] = js.undefined
  
  /** Optional. User's signature. */
  var userSignature: js.UndefOr[Signature] = js.undefined
  
  /** Optional. A signature from a witness. */
  var witnessSignature: js.UndefOr[Signature] = js.undefined
}
object ConsentArtifact {
  
  inline def apply(): ConsentArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentArtifact]
  }
  
  extension [Self <: ConsentArtifact](x: Self) {
    
    inline def setConsentContentScreenshots(value: js.Array[Image]): Self = StObject.set(x, "consentContentScreenshots", value.asInstanceOf[js.Any])
    
    inline def setConsentContentScreenshotsUndefined: Self = StObject.set(x, "consentContentScreenshots", js.undefined)
    
    inline def setConsentContentScreenshotsVarargs(value: Image*): Self = StObject.set(x, "consentContentScreenshots", js.Array(value*))
    
    inline def setConsentContentVersion(value: String): Self = StObject.set(x, "consentContentVersion", value.asInstanceOf[js.Any])
    
    inline def setConsentContentVersionUndefined: Self = StObject.set(x, "consentContentVersion", js.undefined)
    
    inline def setGuardianSignature(value: Signature): Self = StObject.set(x, "guardianSignature", value.asInstanceOf[js.Any])
    
    inline def setGuardianSignatureUndefined: Self = StObject.set(x, "guardianSignature", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserSignature(value: Signature): Self = StObject.set(x, "userSignature", value.asInstanceOf[js.Any])
    
    inline def setUserSignatureUndefined: Self = StObject.set(x, "userSignature", js.undefined)
    
    inline def setWitnessSignature(value: Signature): Self = StObject.set(x, "witnessSignature", value.asInstanceOf[js.Any])
    
    inline def setWitnessSignatureUndefined: Self = StObject.set(x, "witnessSignature", js.undefined)
  }
}
