package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataSourceRequest extends StObject {
  
  /** The ID of the data source to delete. */
  var dataSourceId: js.UndefOr[String] = js.undefined
}
object DeleteDataSourceRequest {
  
  inline def apply(): DeleteDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDataSourceRequest]
  }
  
  extension [Self <: DeleteDataSourceRequest](x: Self) {
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
