package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepositoryidSecretname extends StObject {
  
  var path: RepositoryidSecretname
}
object PathRepositoryidSecretname {
  
  inline def apply(path: RepositoryidSecretname): PathRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepositoryidSecretname]
  }
  
  extension [Self <: PathRepositoryidSecretname](x: Self) {
    
    inline def setPath(value: RepositoryidSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
