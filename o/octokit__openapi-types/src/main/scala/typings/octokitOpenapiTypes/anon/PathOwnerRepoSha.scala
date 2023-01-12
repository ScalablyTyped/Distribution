package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoSha extends StObject {
  
  var path: OwnerRepoSha
}
object PathOwnerRepoSha {
  
  inline def apply(path: OwnerRepoSha): PathOwnerRepoSha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerRepoSha] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRepoSha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
