package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDataSourceRequest extends StObject {
  
  /** The data source to add. */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}
object AddDataSourceRequest {
  
  inline def apply(): AddDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDataSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddDataSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
