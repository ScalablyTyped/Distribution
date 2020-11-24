package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFilterViewRequest extends js.Object {
  
  /** The ID of the filter to delete. */
  var filterId: js.UndefOr[Double] = js.native
}
object DeleteFilterViewRequest {
  
  @scala.inline
  def apply(): DeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFilterViewRequest]
  }
  
  @scala.inline
  implicit class DeleteFilterViewRequestOps[Self <: DeleteFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilterId(value: Double): Self = this.set("filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterId: Self = this.set("filterId", js.undefined)
  }
}
