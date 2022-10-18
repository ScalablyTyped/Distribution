package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepositoryidNumberSecretname extends StObject {
  
  var path: RepositoryidNumberSecretname
}
object PathRepositoryidNumberSecretname {
  
  inline def apply(path: RepositoryidNumberSecretname): PathRepositoryidNumberSecretname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepositoryidNumberSecretname]
  }
  
  extension [Self <: PathRepositoryidNumberSecretname](x: Self) {
    
    inline def setPath(value: RepositoryidNumberSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
