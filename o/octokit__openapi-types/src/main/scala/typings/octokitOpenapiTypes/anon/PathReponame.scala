package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReponame extends StObject {
  
  var path: Reponame
}
object PathReponame {
  
  inline def apply(path: Reponame): PathReponame = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReponame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathReponame] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Reponame): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
