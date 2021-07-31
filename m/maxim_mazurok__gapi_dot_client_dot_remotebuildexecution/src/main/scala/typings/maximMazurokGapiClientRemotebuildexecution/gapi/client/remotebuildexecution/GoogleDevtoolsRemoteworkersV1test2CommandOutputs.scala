package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2CommandOutputs extends StObject {
  
  /**
    * exit_code is only fully reliable if the status' code is OK. If the task exceeded its deadline or was cancelled, the process may still produce an exit code as it is cancelled, and
    * this will be populated, but a successful (zero) is unlikely to be correct unless the status code is OK.
    */
  var exitCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The output files. The blob referenced by the digest should contain one of the following (implementation-dependent): * A marshalled DirectoryMetadata of the returned filesystem * A
    * LUCI-style .isolated file
    */
  var outputs: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2Digest] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2CommandOutputs {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2CommandOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandOutputs]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2CommandOutputsMutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2CommandOutputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    @scala.inline
    def setOutputs(value: GoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
  }
}
