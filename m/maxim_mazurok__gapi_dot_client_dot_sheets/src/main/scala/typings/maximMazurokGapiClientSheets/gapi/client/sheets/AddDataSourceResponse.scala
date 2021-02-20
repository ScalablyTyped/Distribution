package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddDataSourceResponse extends StObject {
  
  /** The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.native
  
  /** The data source that was created. */
  var dataSource: js.UndefOr[DataSource] = js.native
}
object AddDataSourceResponse {
  
  @scala.inline
  def apply(): AddDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDataSourceResponse]
  }
  
  @scala.inline
  implicit class AddDataSourceResponseMutableBuilder[Self <: AddDataSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
