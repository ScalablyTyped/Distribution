package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `165` extends StObject {
  
  var path: Owner
}
object `165` {
  
  inline def apply(path: Owner): `165` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`165`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `165`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
