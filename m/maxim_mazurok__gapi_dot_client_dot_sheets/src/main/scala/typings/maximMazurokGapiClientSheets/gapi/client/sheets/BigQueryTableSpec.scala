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
  
  @scala.inline
  def apply(): BigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryTableSpec]
  }
  
  @scala.inline
  implicit class BigQueryTableSpecMutableBuilder[Self <: BigQueryTableSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    @scala.inline
    def setTableProjectId(value: String): Self = StObject.set(x, "tableProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableProjectIdUndefined: Self = StObject.set(x, "tableProjectId", js.undefined)
  }
}
