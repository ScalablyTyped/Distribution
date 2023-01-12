package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoStatusid extends StObject {
  
  var path: RepoStatusid
}
object PathRepoStatusid {
  
  inline def apply(path: RepoStatusid): PathRepoStatusid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoStatusid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoStatusid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoStatusid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
