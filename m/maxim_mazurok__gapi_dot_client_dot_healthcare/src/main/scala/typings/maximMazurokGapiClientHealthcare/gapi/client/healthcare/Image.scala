package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * Input only. Points to a Cloud Storage URI containing the consent artifact content. The URI must be in the following format: `gs://{bucket_id}/{object_id}`. The Cloud Healthcare API
    * service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location. The consent artifact content at this URI is copied to a Cloud Storage
    * location managed by the Cloud Healthcare API. Responses to fetching requests return the consent artifact content in raw_bytes.
    */
  var gcsUri: js.UndefOr[String] = js.undefined
  
  /**
    * Consent artifact content represented as a stream of bytes. This field is populated when returned in GetConsentArtifact response, but not included in CreateConsentArtifact and
    * ListConsentArtifact response.
    */
  var rawBytes: js.UndefOr[String] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
    
    inline def setRawBytes(value: String): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
    
    inline def setRawBytesUndefined: Self = StObject.set(x, "rawBytes", js.undefined)
  }
}
