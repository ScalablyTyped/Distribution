package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRepositoryidSecretname extends StObject {
  
  var path: OrgRepositoryidSecretname
}
object PathOrgRepositoryidSecretname {
  
  inline def apply(path: OrgRepositoryidSecretname): PathOrgRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRepositoryidSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgRepositoryidSecretname] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgRepositoryidSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
