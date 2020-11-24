package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DicomFilterConfig extends js.Object {
  
  /**
    * The Cloud Storage location of the filter configuration file. The `gcs_uri` must be in the format `gs://bucket/path/to/object`. The filter configuration file must contain a list of
    * resource paths separated by newline characters (\n or \r\n). Each resource path must be in the format "/studies/{studyUID}[/series/{seriesUID}[/instances/{instanceUID}]]" The Cloud
    * Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location.
    */
  var resourcePathsGcsUri: js.UndefOr[String] = js.native
}
object DicomFilterConfig {
  
  @scala.inline
  def apply(): DicomFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DicomFilterConfig]
  }
  
  @scala.inline
  implicit class DicomFilterConfigOps[Self <: DicomFilterConfig] (val x: Self) extends AnyVal {
    
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
    def setResourcePathsGcsUri(value: String): Self = this.set("resourcePathsGcsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePathsGcsUri: Self = this.set("resourcePathsGcsUri", js.undefined)
  }
}
