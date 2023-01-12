package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoSarifid extends StObject {
  
  var path: RepoSarifid
}
object PathRepoSarifid {
  
  inline def apply(path: RepoSarifid): PathRepoSarifid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoSarifid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoSarifid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoSarifid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
