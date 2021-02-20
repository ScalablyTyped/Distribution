package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDataSourceRequest extends StObject {
  
  /** The ID of the data source to delete. */
  var dataSourceId: js.UndefOr[String] = js.native
}
object DeleteDataSourceRequest {
  
  @scala.inline
  def apply(): DeleteDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDataSourceRequest]
  }
  
  @scala.inline
  implicit class DeleteDataSourceRequestMutableBuilder[Self <: DeleteDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
