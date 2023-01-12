package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameString extends StObject {
  
  var path: NameString
}
object PathNameString {
  
  inline def apply(path: NameString): PathNameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
