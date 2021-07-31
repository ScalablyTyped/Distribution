package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDataSourceRequest extends StObject {
  
  /** The data source to add. */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}
object AddDataSourceRequest {
  
  @scala.inline
  def apply(): AddDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDataSourceRequest]
  }
  
  @scala.inline
  implicit class AddDataSourceRequestMutableBuilder[Self <: AddDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
