package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudHealthcareV1DicomBigQueryDestination extends StObject {
  
  /**
    * Use `write_disposition` instead. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is
    * equivalent to write_disposition=WRITE_TRUNCATE.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /** BigQuery URI to a table, up to 2000 characters long, in the format `bq://projectId.bqDatasetId.tableId` */
  var tableUri: js.UndefOr[String] = js.undefined
  
  /** Determines whether the existing table in the destination is to be overwritten or appended to. If a write_disposition is specified, the `force` parameter is ignored. */
  var writeDisposition: js.UndefOr[String] = js.undefined
}
object GoogleCloudHealthcareV1DicomBigQueryDestination {
  
  inline def apply(): GoogleCloudHealthcareV1DicomBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudHealthcareV1DicomBigQueryDestination]
  }
  
  extension [Self <: GoogleCloudHealthcareV1DicomBigQueryDestination](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setTableUri(value: String): Self = StObject.set(x, "tableUri", value.asInstanceOf[js.Any])
    
    inline def setTableUriUndefined: Self = StObject.set(x, "tableUri", js.undefined)
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
