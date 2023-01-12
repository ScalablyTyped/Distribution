package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRepositoryidRunnergroupid extends StObject {
  
  var path: OrgRepositoryidRunnergroupid
}
object PathOrgRepositoryidRunnergroupid {
  
  inline def apply(path: OrgRepositoryidRunnergroupid): PathOrgRepositoryidRunnergroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRepositoryidRunnergroupid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgRepositoryidRunnergroupid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgRepositoryidRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
