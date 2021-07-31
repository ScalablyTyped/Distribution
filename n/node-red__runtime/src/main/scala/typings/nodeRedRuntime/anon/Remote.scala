package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.ProjectUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remote extends StObject {
  
  var id: String
  
  var remote: Boolean
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var user: js.UndefOr[ProjectUser] = js.undefined
}
object Remote {
  
  @scala.inline
  def apply(id: String, remote: Boolean): Remote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote]
  }
  
  @scala.inline
  implicit class RemoteMutableBuilder[Self <: Remote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setUser(value: ProjectUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
