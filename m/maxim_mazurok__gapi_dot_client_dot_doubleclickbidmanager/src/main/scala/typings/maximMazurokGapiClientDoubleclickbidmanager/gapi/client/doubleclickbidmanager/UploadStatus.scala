package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadStatus extends js.Object {
  
  /** Reasons why upload can't be completed. */
  var errors: js.UndefOr[js.Array[String]] = js.native
  
  /** Per-row upload status. */
  var rowStatus: js.UndefOr[js.Array[RowStatus]] = js.native
}
object UploadStatus {
  
  @scala.inline
  def apply(): UploadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadStatus]
  }
  
  @scala.inline
  implicit class UploadStatusOps[Self <: UploadStatus] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setRowStatusVarargs(value: RowStatus*): Self = this.set("rowStatus", js.Array(value :_*))
    
    @scala.inline
    def setRowStatus(value: js.Array[RowStatus]): Self = this.set("rowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowStatus: Self = this.set("rowStatus", js.undefined)
  }
}
