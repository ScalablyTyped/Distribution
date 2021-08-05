package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDicomDataRequest extends StObject {
  
  /**
    * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent requires the `roles/storage.objectViewer` Cloud IAM roles on the Cloud Storage
    * location.
    */
  var gcsSource: js.UndefOr[GoogleCloudHealthcareV1DicomGcsSource] = js.undefined
}
object ImportDicomDataRequest {
  
  inline def apply(): ImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportDicomDataRequest]
  }
  
  extension [Self <: ImportDicomDataRequest](x: Self) {
    
    inline def setGcsSource(value: GoogleCloudHealthcareV1DicomGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
