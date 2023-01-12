package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryTableSpec extends StObject {
  
  /** The BigQuery dataset id. */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /** The BigQuery table id. */
  var tableId: js.UndefOr[String] = js.undefined
  
  /** The ID of a BigQuery project the table belongs to. If not specified, the project_id is assumed. */
  var tableProjectId: js.UndefOr[String] = js.undefined
}
object BigQueryTableSpec {
  
  inline def apply(): BigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryTableSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigQueryTableSpec] (val x: Self) extends AnyVal {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    inline def setTableProjectId(value: String): Self = StObject.set(x, "tableProjectId", value.asInstanceOf[js.Any])
    
    inline def setTableProjectIdUndefined: Self = StObject.set(x, "tableProjectId", js.undefined)
  }
}
