package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.ProjectUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolutions extends StObject {
  
  var id: String
  
  var path: String
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var resolutions: String
  
  var user: js.UndefOr[ProjectUser] = js.undefined
}
object Resolutions {
  
  @scala.inline
  def apply(id: String, path: String, resolutions: String): Resolutions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolutions]
  }
  
  @scala.inline
  implicit class ResolutionsMutableBuilder[Self <: Resolutions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setResolutions(value: String): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ProjectUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
