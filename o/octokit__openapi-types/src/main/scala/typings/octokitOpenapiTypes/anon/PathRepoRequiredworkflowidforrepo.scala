package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRequiredworkflowidforrepo extends StObject {
  
  var path: RepoRequiredworkflowidforrepo
}
object PathRepoRequiredworkflowidforrepo {
  
  inline def apply(path: RepoRequiredworkflowidforrepo): PathRepoRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRequiredworkflowidforrepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
