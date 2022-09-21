package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRunnerid extends StObject {
  
  var path: RepoRunnerid
}
object PathRepoRunnerid {
  
  inline def apply(path: RepoRunnerid): PathRepoRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRunnerid]
  }
  
  extension [Self <: PathRepoRunnerid](x: Self) {
    
    inline def setPath(value: RepoRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
