package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudHealthcareV1FhirGcsDestination extends js.Object {
  
  /**
    * URI for a Cloud Storage directory where result files should be written, in the format of `gs://{bucket-id}/{path/to/destination/dir}`. If there is no trailing slash, the service
    * appends one when composing the object path. The user is responsible for creating the Cloud Storage bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}
object GoogleCloudHealthcareV1FhirGcsDestination {
  
  @scala.inline
  def apply(): GoogleCloudHealthcareV1FhirGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudHealthcareV1FhirGcsDestination]
  }
  
  @scala.inline
  implicit class GoogleCloudHealthcareV1FhirGcsDestinationOps[Self <: GoogleCloudHealthcareV1FhirGcsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUriPrefix(value: String): Self = this.set("uriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriPrefix: Self = this.set("uriPrefix", js.undefined)
  }
}
