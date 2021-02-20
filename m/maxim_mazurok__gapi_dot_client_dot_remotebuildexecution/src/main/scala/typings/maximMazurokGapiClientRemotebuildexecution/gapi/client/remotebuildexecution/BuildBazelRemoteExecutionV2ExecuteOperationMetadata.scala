package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ExecuteOperationMetadata extends StObject {
  
  /** The digest of the Action being executed. */
  var actionDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /** The current stage of execution. */
  var stage: js.UndefOr[String] = js.native
  
  /** If set, the client can use this name with ByteStream.Read to stream the standard error. */
  var stderrStreamName: js.UndefOr[String] = js.native
  
  /** If set, the client can use this name with ByteStream.Read to stream the standard output. */
  var stdoutStreamName: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2ExecuteOperationMetadata {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecuteOperationMetadata]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ExecuteOperationMetadataMutableBuilder[Self <: BuildBazelRemoteExecutionV2ExecuteOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "actionDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDigestUndefined: Self = StObject.set(x, "actionDigest", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    @scala.inline
    def setStderrStreamName(value: String): Self = StObject.set(x, "stderrStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderrStreamNameUndefined: Self = StObject.set(x, "stderrStreamName", js.undefined)
    
    @scala.inline
    def setStdoutStreamName(value: String): Self = StObject.set(x, "stdoutStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutStreamNameUndefined: Self = StObject.set(x, "stdoutStreamName", js.undefined)
  }
}
