package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAllOwner` extends StObject {
  
  /** The array order is oldest week (index 0) to most recent week. */
  var `200`: ContentApplicationjsonAllOwner
  
  var `404`: Content48
}
object `200ContentApplicationjsonAllOwner` {
  
  inline def apply(`200`: ContentApplicationjsonAllOwner, `404`: Content48): `200ContentApplicationjsonAllOwner` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAllOwner`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAllOwner`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAllOwner): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
