package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAppslugString extends StObject {
  
  var path: AppslugString
}
object PathAppslugString {
  
  inline def apply(path: AppslugString): PathAppslugString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAppslugString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAppslugString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AppslugString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
