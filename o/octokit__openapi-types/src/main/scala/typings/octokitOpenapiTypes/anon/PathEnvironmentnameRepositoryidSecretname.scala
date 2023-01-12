package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameRepositoryidSecretname extends StObject {
  
  var path: EnvironmentnameRepositoryidSecretname
}
object PathEnvironmentnameRepositoryidSecretname {
  
  inline def apply(path: EnvironmentnameRepositoryidSecretname): PathEnvironmentnameRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameRepositoryidSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameRepositoryidSecretname] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameRepositoryidSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
