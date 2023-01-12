package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathThreadidNumber extends StObject {
  
  var path: ThreadidNumber
}
object PathThreadidNumber {
  
  inline def apply(path: ThreadidNumber): PathThreadidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathThreadidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathThreadidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ThreadidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
