package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2PriorityCapabilities extends js.Object {
  
  var priorities: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]] = js.native
}
object BuildBazelRemoteExecutionV2PriorityCapabilities {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2PriorityCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2PriorityCapabilities]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2PriorityCapabilitiesOps[Self <: BuildBazelRemoteExecutionV2PriorityCapabilities] (val x: Self) extends AnyVal {
    
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
    def setPrioritiesVarargs(value: BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange*): Self = this.set("priorities", js.Array(value :_*))
    
    @scala.inline
    def setPriorities(value: js.Array[BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]): Self = this.set("priorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorities: Self = this.set("priorities", js.undefined)
  }
}
