package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTargetuserUsername extends StObject {
  
  var path: TargetuserUsername
}
object PathTargetuserUsername {
  
  inline def apply(path: TargetuserUsername): PathTargetuserUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTargetuserUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTargetuserUsername] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TargetuserUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
