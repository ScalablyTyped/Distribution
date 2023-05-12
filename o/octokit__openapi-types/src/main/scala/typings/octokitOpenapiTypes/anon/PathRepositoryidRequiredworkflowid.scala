package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepositoryidRequiredworkflowid extends StObject {
  
  var path: RepositoryidRequiredworkflowid
}
object PathRepositoryidRequiredworkflowid {
  
  inline def apply(path: RepositoryidRequiredworkflowid): PathRepositoryidRequiredworkflowid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepositoryidRequiredworkflowid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepositoryidRequiredworkflowid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepositoryidRequiredworkflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
