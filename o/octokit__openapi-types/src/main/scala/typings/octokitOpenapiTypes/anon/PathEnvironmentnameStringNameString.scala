package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameStringNameString extends StObject {
  
  var path: EnvironmentnameStringNameString
}
object PathEnvironmentnameStringNameString {
  
  inline def apply(path: EnvironmentnameStringNameString): PathEnvironmentnameStringNameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameStringNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameStringNameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameStringNameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
