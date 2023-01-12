package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnablement extends StObject {
  
  var path: Enablement
}
object PathEnablement {
  
  inline def apply(path: Enablement): PathEnablement = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnablement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnablement] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Enablement): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
