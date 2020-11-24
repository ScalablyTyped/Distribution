package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.ProjectUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowUnrelatedHistories extends js.Object {
  
  var allowUnrelatedHistories: js.UndefOr[Boolean] = js.native
  
  var remote: String = js.native
  
  var req: js.UndefOr[js.Object] = js.native
  
  var track: js.UndefOr[Boolean] = js.native
  
  var user: js.UndefOr[ProjectUser] = js.native
}
object AllowUnrelatedHistories {
  
  @scala.inline
  def apply(remote: String): AllowUnrelatedHistories = {
    val __obj = js.Dynamic.literal(remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowUnrelatedHistories]
  }
  
  @scala.inline
  implicit class AllowUnrelatedHistoriesOps[Self <: AllowUnrelatedHistories] (val x: Self) extends AnyVal {
    
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
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnrelatedHistories(value: Boolean): Self = this.set("allowUnrelatedHistories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnrelatedHistories: Self = this.set("allowUnrelatedHistories", js.undefined)
    
    @scala.inline
    def setReq(value: js.Object): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setTrack(value: Boolean): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    
    @scala.inline
    def setUser(value: ProjectUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
