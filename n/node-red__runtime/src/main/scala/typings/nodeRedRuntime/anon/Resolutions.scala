package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.ProjectUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolutions extends js.Object {
  
  var id: String = js.native
  
  var path: String = js.native
  
  var req: js.UndefOr[js.Object] = js.native
  
  var resolutions: String = js.native
  
  var user: js.UndefOr[ProjectUser] = js.native
}
object Resolutions {
  
  @scala.inline
  def apply(id: String, path: String, resolutions: String): Resolutions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolutions]
  }
  
  @scala.inline
  implicit class ResolutionsOps[Self <: Resolutions] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutions(value: String): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setUser(value: ProjectUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
