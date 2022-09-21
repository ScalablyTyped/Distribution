package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoSecretname extends StObject {
  
  var path: OwnerRepoSecretname
}
object PathOwnerRepoSecretname {
  
  inline def apply(path: OwnerRepoSecretname): PathOwnerRepoSecretname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoSecretname]
  }
  
  extension [Self <: PathOwnerRepoSecretname](x: Self) {
    
    inline def setPath(value: OwnerRepoSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
