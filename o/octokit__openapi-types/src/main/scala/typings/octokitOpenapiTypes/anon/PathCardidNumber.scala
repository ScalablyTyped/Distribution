package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCardidNumber extends StObject {
  
  var path: CardidNumber
}
object PathCardidNumber {
  
  inline def apply(path: CardidNumber): PathCardidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCardidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCardidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CardidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
