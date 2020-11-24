package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ExecutionCapabilities extends js.Object {
  
  /** Remote execution may only support a single digest function. */
  var digestFunction: js.UndefOr[String] = js.native
  
  /** Whether remote execution is enabled for the particular server/instance. */
  var execEnabled: js.UndefOr[Boolean] = js.native
  
  /** Supported execution priority range. */
  var executionPriorityCapabilities: js.UndefOr[BuildBazelRemoteExecutionV2PriorityCapabilities] = js.native
  
  /** Supported node properties. */
  var supportedNodeProperties: js.UndefOr[js.Array[String]] = js.native
}
object BuildBazelRemoteExecutionV2ExecutionCapabilities {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ExecutionCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecutionCapabilities]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ExecutionCapabilitiesOps[Self <: BuildBazelRemoteExecutionV2ExecutionCapabilities] (val x: Self) extends AnyVal {
    
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
    def setDigestFunction(value: String): Self = this.set("digestFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestFunction: Self = this.set("digestFunction", js.undefined)
    
    @scala.inline
    def setExecEnabled(value: Boolean): Self = this.set("execEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecEnabled: Self = this.set("execEnabled", js.undefined)
    
    @scala.inline
    def setExecutionPriorityCapabilities(value: BuildBazelRemoteExecutionV2PriorityCapabilities): Self = this.set("executionPriorityCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionPriorityCapabilities: Self = this.set("executionPriorityCapabilities", js.undefined)
    
    @scala.inline
    def setSupportedNodePropertiesVarargs(value: String*): Self = this.set("supportedNodeProperties", js.Array(value :_*))
    
    @scala.inline
    def setSupportedNodeProperties(value: js.Array[String]): Self = this.set("supportedNodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedNodeProperties: Self = this.set("supportedNodeProperties", js.undefined)
  }
}
