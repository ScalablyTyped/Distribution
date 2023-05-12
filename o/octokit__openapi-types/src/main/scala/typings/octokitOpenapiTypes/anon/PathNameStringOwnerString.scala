package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameStringOwnerString extends StObject {
  
  var path: NameStringOwnerString
}
object PathNameStringOwnerString {
  
  inline def apply(path: NameStringOwnerString): PathNameStringOwnerString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameStringOwnerString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameStringOwnerString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameStringOwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
