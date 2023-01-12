package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidUsername extends StObject {
  
  var path: ProjectidUsername
}
object PathProjectidUsername {
  
  inline def apply(path: ProjectidUsername): PathProjectidUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathProjectidUsername] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ProjectidUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
