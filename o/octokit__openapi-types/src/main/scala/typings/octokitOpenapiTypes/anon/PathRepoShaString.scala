package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoShaString extends StObject {
  
  var path: RepoShaString
}
object PathRepoShaString {
  
  inline def apply(path: RepoShaString): PathRepoShaString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoShaString]
  }
  
  extension [Self <: PathRepoShaString](x: Self) {
    
    inline def setPath(value: RepoShaString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
