package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgReponame extends StObject {
  
  var path: OrgReponame
}
object PathOrgReponame {
  
  inline def apply(path: OrgReponame): PathOrgReponame = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgReponame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgReponame] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgReponame): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
