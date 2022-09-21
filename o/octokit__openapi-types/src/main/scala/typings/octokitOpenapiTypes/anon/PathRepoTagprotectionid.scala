package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoTagprotectionid extends StObject {
  
  var path: RepoTagprotectionid
}
object PathRepoTagprotectionid {
  
  inline def apply(path: RepoTagprotectionid): PathRepoTagprotectionid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoTagprotectionid]
  }
  
  extension [Self <: PathRepoTagprotectionid](x: Self) {
    
    inline def setPath(value: RepoTagprotectionid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
