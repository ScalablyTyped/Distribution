package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameOrgRepositoryid extends StObject {
  
  var path: NameOrgRepositoryid
}
object PathNameOrgRepositoryid {
  
  inline def apply(path: NameOrgRepositoryid): PathNameOrgRepositoryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameOrgRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameOrgRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameOrgRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
