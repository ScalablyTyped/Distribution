package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities extends js.Object {
  
  var updateEnabled: js.UndefOr[Boolean] = js.native
}
object BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilitiesOps[Self <: BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities] (val x: Self) extends AnyVal {
    
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
    def setUpdateEnabled(value: Boolean): Self = this.set("updateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateEnabled: Self = this.set("updateEnabled", js.undefined)
  }
}
