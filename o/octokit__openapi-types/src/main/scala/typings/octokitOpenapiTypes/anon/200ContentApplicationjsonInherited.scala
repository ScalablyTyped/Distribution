package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonInherited` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonInherited
}
object `200ContentApplicationjsonInherited` {
  
  inline def apply(`200`: ContentApplicationjsonInherited): `200ContentApplicationjsonInherited` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonInherited`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonInherited`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonInherited): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
