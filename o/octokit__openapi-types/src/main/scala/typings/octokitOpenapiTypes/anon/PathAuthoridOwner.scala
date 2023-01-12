package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAuthoridOwner extends StObject {
  
  var path: AuthoridOwner
}
object PathAuthoridOwner {
  
  inline def apply(path: AuthoridOwner): PathAuthoridOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAuthoridOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAuthoridOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AuthoridOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
