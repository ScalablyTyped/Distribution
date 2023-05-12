package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameString extends StObject {
  
  var path: EnvironmentnameString
}
object PathEnvironmentnameString {
  
  inline def apply(path: EnvironmentnameString): PathEnvironmentnameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
