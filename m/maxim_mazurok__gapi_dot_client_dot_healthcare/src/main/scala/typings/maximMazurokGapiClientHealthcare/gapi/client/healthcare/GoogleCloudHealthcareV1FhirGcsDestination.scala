package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudHealthcareV1FhirGcsDestination extends StObject {
  
  /**
    * URI for a Cloud Storage directory where result files should be written, in the format of `gs://{bucket-id}/{path/to/destination/dir}`. If there is no trailing slash, the service
    * appends one when composing the object path. The user is responsible for creating the Cloud Storage bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.undefined
}
object GoogleCloudHealthcareV1FhirGcsDestination {
  
  inline def apply(): GoogleCloudHealthcareV1FhirGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudHealthcareV1FhirGcsDestination]
  }
  
  extension [Self <: GoogleCloudHealthcareV1FhirGcsDestination](x: Self) {
    
    inline def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    inline def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
