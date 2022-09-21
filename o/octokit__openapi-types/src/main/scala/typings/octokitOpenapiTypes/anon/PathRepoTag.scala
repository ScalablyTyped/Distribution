package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoTag extends StObject {
  
  var path: RepoTag
}
object PathRepoTag {
  
  inline def apply(path: RepoTag): PathRepoTag = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoTag]
  }
  
  extension [Self <: PathRepoTag](x: Self) {
    
    inline def setPath(value: RepoTag): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
