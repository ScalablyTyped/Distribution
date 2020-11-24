package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2TransformationErrorHandling extends js.Object {
  
  /** Ignore errors */
  var leaveUntransformed: js.UndefOr[js.Any] = js.native
  
  /** Throw an error */
  var throwError: js.UndefOr[js.Any] = js.native
}
object GooglePrivacyDlpV2TransformationErrorHandling {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TransformationErrorHandling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TransformationErrorHandling]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TransformationErrorHandlingOps[Self <: GooglePrivacyDlpV2TransformationErrorHandling] (val x: Self) extends AnyVal {
    
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
    def setLeaveUntransformed(value: js.Any): Self = this.set("leaveUntransformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaveUntransformed: Self = this.set("leaveUntransformed", js.undefined)
    
    @scala.inline
    def setThrowError(value: js.Any): Self = this.set("throwError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowError: Self = this.set("throwError", js.undefined)
  }
}
