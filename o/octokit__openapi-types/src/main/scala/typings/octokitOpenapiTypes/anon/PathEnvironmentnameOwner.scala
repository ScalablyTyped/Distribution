package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameOwner extends StObject {
  
  var path: EnvironmentnameOwner
}
object PathEnvironmentnameOwner {
  
  inline def apply(path: EnvironmentnameOwner): PathEnvironmentnameOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
