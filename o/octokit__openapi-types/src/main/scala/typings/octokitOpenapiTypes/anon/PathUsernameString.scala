package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameString extends StObject {
  
  var path: UsernameString
}
object PathUsernameString {
  
  inline def apply(path: UsernameString): PathUsernameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathUsernameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: UsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
