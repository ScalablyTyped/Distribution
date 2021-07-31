package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.ProjectUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tree extends StObject {
  
  var id: String
  
  var path: String
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var tree: String
  
  var user: js.UndefOr[ProjectUser] = js.undefined
}
object Tree {
  
  @scala.inline
  def apply(id: String, path: String, tree: String): Tree = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
  
  @scala.inline
  implicit class TreeMutableBuilder[Self <: Tree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setTree(value: String): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ProjectUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
