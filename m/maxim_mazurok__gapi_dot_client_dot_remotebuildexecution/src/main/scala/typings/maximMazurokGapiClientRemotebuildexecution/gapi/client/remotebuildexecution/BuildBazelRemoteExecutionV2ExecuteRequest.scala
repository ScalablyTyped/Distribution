package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ExecuteRequest extends js.Object {
  
  /** The digest of the Action to execute. */
  var actionDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /** An optional policy for execution of the action. The server will have a default policy if this is not provided. */
  var executionPolicy: js.UndefOr[BuildBazelRemoteExecutionV2ExecutionPolicy] = js.native
  
  /**
    * An optional policy for the results of this execution in the remote cache. The server will have a default policy if this is not provided. This may be applied to both the ActionResult
    * and the associated blobs.
    */
  var resultsCachePolicy: js.UndefOr[BuildBazelRemoteExecutionV2ResultsCachePolicy] = js.native
  
  /**
    * If true, the action will be executed even if its result is already present in the ActionCache. The execution is still allowed to be merged with other in-flight executions of the
    * same action, however - semantically, the service MUST only guarantee that the results of an execution with this field set were not visible before the corresponding execution request
    * was sent. Note that actions from execution requests setting this field set are still eligible to be entered into the action cache upon completion, and services SHOULD overwrite any
    * existing entries that may exist. This allows skip_cache_lookup requests to be used as a mechanism for replacing action cache entries that reference outputs no longer available or
    * that are poisoned in any way. If false, the result may be served from the action cache.
    */
  var skipCacheLookup: js.UndefOr[Boolean] = js.native
}
object BuildBazelRemoteExecutionV2ExecuteRequest {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ExecuteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecuteRequest]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ExecuteRequestOps[Self <: BuildBazelRemoteExecutionV2ExecuteRequest] (val x: Self) extends AnyVal {
    
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
    def setActionDigest(value: BuildBazelRemoteExecutionV2Digest): Self = this.set("actionDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionDigest: Self = this.set("actionDigest", js.undefined)
    
    @scala.inline
    def setExecutionPolicy(value: BuildBazelRemoteExecutionV2ExecutionPolicy): Self = this.set("executionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionPolicy: Self = this.set("executionPolicy", js.undefined)
    
    @scala.inline
    def setResultsCachePolicy(value: BuildBazelRemoteExecutionV2ResultsCachePolicy): Self = this.set("resultsCachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultsCachePolicy: Self = this.set("resultsCachePolicy", js.undefined)
    
    @scala.inline
    def setSkipCacheLookup(value: Boolean): Self = this.set("skipCacheLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipCacheLookup: Self = this.set("skipCacheLookup", js.undefined)
  }
}
