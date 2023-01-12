package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoTreesha extends StObject {
  
  var path: RepoTreesha
  
  var query: Recursive
}
object PathRepoTreesha {
  
  inline def apply(path: RepoTreesha, query: Recursive): PathRepoTreesha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoTreesha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoTreesha] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoTreesha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Recursive): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
