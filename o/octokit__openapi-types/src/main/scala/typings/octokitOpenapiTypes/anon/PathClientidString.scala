package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathClientidString extends StObject {
  
  var path: ClientidString
}
object PathClientidString {
  
  inline def apply(path: ClientidString): PathClientidString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathClientidString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathClientidString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ClientidString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
