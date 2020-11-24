package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemoteworkersV1test2CommandOutputs extends js.Object {
  
  /**
    * exit_code is only fully reliable if the status' code is OK. If the task exceeded its deadline or was cancelled, the process may still produce an exit code as it is cancelled, and
    * this will be populated, but a successful (zero) is unlikely to be correct unless the status code is OK.
    */
  var exitCode: js.UndefOr[Double] = js.native
  
  /**
    * The output files. The blob referenced by the digest should contain one of the following (implementation-dependent): * A marshalled DirectoryMetadata of the returned filesystem * A
    * LUCI-style .isolated file
    */
  var outputs: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2Digest] = js.native
}
object GoogleDevtoolsRemoteworkersV1test2CommandOutputs {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2CommandOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandOutputs]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2CommandOutputsOps[Self <: GoogleDevtoolsRemoteworkersV1test2CommandOutputs] (val x: Self) extends AnyVal {
    
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
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setOutputs(value: GoogleDevtoolsRemoteworkersV1test2Digest): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
  }
}
