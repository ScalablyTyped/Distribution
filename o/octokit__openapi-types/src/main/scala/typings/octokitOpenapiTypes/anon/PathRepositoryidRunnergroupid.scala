package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepositoryidRunnergroupid extends StObject {
  
  var path: RepositoryidRunnergroupid
}
object PathRepositoryidRunnergroupid {
  
  inline def apply(path: RepositoryidRunnergroupid): PathRepositoryidRunnergroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepositoryidRunnergroupid]
  }
  
  extension [Self <: PathRepositoryidRunnergroupid](x: Self) {
    
    inline def setPath(value: RepositoryidRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
