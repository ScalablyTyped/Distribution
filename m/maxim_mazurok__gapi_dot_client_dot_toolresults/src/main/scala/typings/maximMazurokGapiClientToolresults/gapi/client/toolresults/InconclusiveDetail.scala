package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InconclusiveDetail extends js.Object {
  
  /**
    * If the end user aborted the test execution before a pass or fail could be determined. For example, the user pressed ctrl-c which sent a kill signal to the test runner while the test
    * was running.
    */
  var abortedByUser: js.UndefOr[Boolean] = js.native
  
  /** If results are being provided to the user in certain cases of infrastructure failures */
  var hasErrorLogs: js.UndefOr[Boolean] = js.native
  
  /**
    * If the test runner could not determine success or failure because the test depends on a component other than the system under test which failed. For example, a mobile test requires
    * provisioning a device where the test executes, and that provisioning can fail.
    */
  var infrastructureFailure: js.UndefOr[Boolean] = js.native
}
object InconclusiveDetail {
  
  @scala.inline
  def apply(): InconclusiveDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InconclusiveDetail]
  }
  
  @scala.inline
  implicit class InconclusiveDetailOps[Self <: InconclusiveDetail] (val x: Self) extends AnyVal {
    
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
    def setAbortedByUser(value: Boolean): Self = this.set("abortedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortedByUser: Self = this.set("abortedByUser", js.undefined)
    
    @scala.inline
    def setHasErrorLogs(value: Boolean): Self = this.set("hasErrorLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasErrorLogs: Self = this.set("hasErrorLogs", js.undefined)
    
    @scala.inline
    def setInfrastructureFailure(value: Boolean): Self = this.set("infrastructureFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfrastructureFailure: Self = this.set("infrastructureFailure", js.undefined)
  }
}
