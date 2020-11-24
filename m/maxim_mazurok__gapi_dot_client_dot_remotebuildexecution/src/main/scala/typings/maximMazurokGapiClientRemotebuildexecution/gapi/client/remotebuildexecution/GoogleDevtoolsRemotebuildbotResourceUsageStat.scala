package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildbotResourceUsageStat extends js.Object {
  
  var total: js.UndefOr[String] = js.native
  
  var used: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildbotResourceUsageStat {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildbotResourceUsageStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotResourceUsageStat]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildbotResourceUsageStatOps[Self <: GoogleDevtoolsRemotebuildbotResourceUsageStat] (val x: Self) extends AnyVal {
    
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
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    
    @scala.inline
    def setUsed(value: String): Self = this.set("used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsed: Self = this.set("used", js.undefined)
  }
}
