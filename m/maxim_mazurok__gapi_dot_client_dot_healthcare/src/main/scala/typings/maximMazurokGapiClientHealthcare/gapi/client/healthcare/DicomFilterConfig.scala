package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DicomFilterConfig extends StObject {
  
  /**
    * The Cloud Storage location of the filter configuration file. The `gcs_uri` must be in the format `gs://bucket/path/to/object`. The filter configuration file must contain a list of
    * resource paths separated by newline characters (\n or \r\n). Each resource path must be in the format "/studies/{studyUID}[/series/{seriesUID}[/instances/{instanceUID}]]" The Cloud
    * Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location.
    */
  var resourcePathsGcsUri: js.UndefOr[String] = js.undefined
}
object DicomFilterConfig {
  
  @scala.inline
  def apply(): DicomFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DicomFilterConfig]
  }
  
  @scala.inline
  implicit class DicomFilterConfigMutableBuilder[Self <: DicomFilterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePathsGcsUri(value: String): Self = StObject.set(x, "resourcePathsGcsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePathsGcsUriUndefined: Self = StObject.set(x, "resourcePathsGcsUri", js.undefined)
  }
}
