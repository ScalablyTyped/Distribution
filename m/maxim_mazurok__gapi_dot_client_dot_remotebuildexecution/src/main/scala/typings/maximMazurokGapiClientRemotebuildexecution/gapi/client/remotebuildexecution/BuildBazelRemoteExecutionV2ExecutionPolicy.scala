package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ExecutionPolicy extends js.Object {
  
  /**
    * The priority (relative importance) of this action. Generally, a lower value means that the action should be run sooner than actions having a greater priority value, but the
    * interpretation of a given value is server- dependent. A priority of 0 means the *default* priority. Priorities may be positive or negative, and such actions should run later or
    * sooner than actions having the default priority, respectively. The particular semantics of this field is up to the server. In particular, every server will have their own supported
    * range of priorities, and will decide how these map into scheduling policy.
    */
  var priority: js.UndefOr[Double] = js.native
}
object BuildBazelRemoteExecutionV2ExecutionPolicy {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ExecutionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecutionPolicy]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ExecutionPolicyOps[Self <: BuildBazelRemoteExecutionV2ExecutionPolicy] (val x: Self) extends AnyVal {
    
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
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
