package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.ProjectUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowUnrelatedHistories extends StObject {
  
  var allowUnrelatedHistories: js.UndefOr[Boolean] = js.undefined
  
  var remote: String
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var track: js.UndefOr[Boolean] = js.undefined
  
  var user: js.UndefOr[ProjectUser] = js.undefined
}
object AllowUnrelatedHistories {
  
  inline def apply(remote: String): AllowUnrelatedHistories = {
    val __obj = js.Dynamic.literal(remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowUnrelatedHistories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowUnrelatedHistories] (val x: Self) extends AnyVal {
    
    inline def setAllowUnrelatedHistories(value: Boolean): Self = StObject.set(x, "allowUnrelatedHistories", value.asInstanceOf[js.Any])
    
    inline def setAllowUnrelatedHistoriesUndefined: Self = StObject.set(x, "allowUnrelatedHistories", js.undefined)
    
    inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    inline def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setUser(value: ProjectUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
