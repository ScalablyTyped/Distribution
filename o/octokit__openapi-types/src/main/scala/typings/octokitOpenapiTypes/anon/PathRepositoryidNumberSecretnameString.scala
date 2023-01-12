package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepositoryidNumberSecretnameString extends StObject {
  
  var path: RepositoryidNumberSecretnameString
}
object PathRepositoryidNumberSecretnameString {
  
  inline def apply(path: RepositoryidNumberSecretnameString): PathRepositoryidNumberSecretnameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepositoryidNumberSecretnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepositoryidNumberSecretnameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepositoryidNumberSecretnameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
