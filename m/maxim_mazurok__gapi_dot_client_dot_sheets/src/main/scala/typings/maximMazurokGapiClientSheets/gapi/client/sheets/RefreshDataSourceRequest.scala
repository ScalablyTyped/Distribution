package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshDataSourceRequest extends StObject {
  
  /** Reference to a DataSource. If specified, refreshes all associated data source objects for the data source. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /** Refreshes the data source objects regardless of the current state. If not set and a referenced data source object was in error state, the refresh will fail immediately. */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /** Refreshes all existing data source objects in the spreadsheet. */
  var isAll: js.UndefOr[Boolean] = js.undefined
  
  /** References to data source objects to refresh. */
  var references: js.UndefOr[DataSourceObjectReferences] = js.undefined
}
object RefreshDataSourceRequest {
  
  inline def apply(): RefreshDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshDataSourceRequest]
  }
  
  extension [Self <: RefreshDataSourceRequest](x: Self) {
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setIsAll(value: Boolean): Self = StObject.set(x, "isAll", value.asInstanceOf[js.Any])
    
    inline def setIsAllUndefined: Self = StObject.set(x, "isAll", js.undefined)
    
    inline def setReferences(value: DataSourceObjectReferences): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
  }
}
