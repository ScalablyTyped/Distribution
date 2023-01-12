package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathKeyidNumber extends StObject {
  
  var path: KeyidNumber
}
object PathKeyidNumber {
  
  inline def apply(path: KeyidNumber): PathKeyidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathKeyidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathKeyidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: KeyidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
