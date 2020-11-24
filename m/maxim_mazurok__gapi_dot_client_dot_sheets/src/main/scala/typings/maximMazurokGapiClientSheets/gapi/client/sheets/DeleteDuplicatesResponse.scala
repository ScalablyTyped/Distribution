package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDuplicatesResponse extends js.Object {
  
  /** The number of duplicate rows removed. */
  var duplicatesRemovedCount: js.UndefOr[Double] = js.native
}
object DeleteDuplicatesResponse {
  
  @scala.inline
  def apply(): DeleteDuplicatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDuplicatesResponse]
  }
  
  @scala.inline
  implicit class DeleteDuplicatesResponseOps[Self <: DeleteDuplicatesResponse] (val x: Self) extends AnyVal {
    
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
    def setDuplicatesRemovedCount(value: Double): Self = this.set("duplicatesRemovedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicatesRemovedCount: Self = this.set("duplicatesRemovedCount", js.undefined)
  }
}
