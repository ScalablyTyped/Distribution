package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2ExecuteOperationMetadata extends StObject {
  
  /** The digest of the Action being executed. */
  var actionDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /** The current stage of execution. */
  var stage: js.UndefOr[String] = js.undefined
  
  /** If set, the client can use this resource name with ByteStream.Read to stream the standard error from the endpoint hosting streamed responses. */
  var stderrStreamName: js.UndefOr[String] = js.undefined
  
  /** If set, the client can use this resource name with ByteStream.Read to stream the standard output from the endpoint hosting streamed responses. */
  var stdoutStreamName: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2ExecuteOperationMetadata {
  
  inline def apply(): BuildBazelRemoteExecutionV2ExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecuteOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBazelRemoteExecutionV2ExecuteOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setActionDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "actionDigest", value.asInstanceOf[js.Any])
    
    inline def setActionDigestUndefined: Self = StObject.set(x, "actionDigest", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setStderrStreamName(value: String): Self = StObject.set(x, "stderrStreamName", value.asInstanceOf[js.Any])
    
    inline def setStderrStreamNameUndefined: Self = StObject.set(x, "stderrStreamName", js.undefined)
    
    inline def setStdoutStreamName(value: String): Self = StObject.set(x, "stdoutStreamName", value.asInstanceOf[js.Any])
    
    inline def setStdoutStreamNameUndefined: Self = StObject.set(x, "stdoutStreamName", js.undefined)
  }
}
