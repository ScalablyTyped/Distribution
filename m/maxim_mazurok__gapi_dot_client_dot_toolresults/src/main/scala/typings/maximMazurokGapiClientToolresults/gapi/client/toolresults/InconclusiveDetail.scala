package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InconclusiveDetail extends StObject {
  
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
  implicit class InconclusiveDetailMutableBuilder[Self <: InconclusiveDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortedByUser(value: Boolean): Self = StObject.set(x, "abortedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortedByUserUndefined: Self = StObject.set(x, "abortedByUser", js.undefined)
    
    @scala.inline
    def setHasErrorLogs(value: Boolean): Self = StObject.set(x, "hasErrorLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasErrorLogsUndefined: Self = StObject.set(x, "hasErrorLogs", js.undefined)
    
    @scala.inline
    def setInfrastructureFailure(value: Boolean): Self = StObject.set(x, "infrastructureFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureFailureUndefined: Self = StObject.set(x, "infrastructureFailure", js.undefined)
  }
}
