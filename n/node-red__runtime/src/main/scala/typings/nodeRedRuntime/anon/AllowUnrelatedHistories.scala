package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.ProjectUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowUnrelatedHistories extends StObject {
  
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
  implicit class AllowUnrelatedHistoriesMutableBuilder[Self <: AllowUnrelatedHistories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnrelatedHistories(value: Boolean): Self = StObject.set(x, "allowUnrelatedHistories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnrelatedHistoriesUndefined: Self = StObject.set(x, "allowUnrelatedHistories", js.undefined)
    
    @scala.inline
    def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    @scala.inline
    def setUser(value: ProjectUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
