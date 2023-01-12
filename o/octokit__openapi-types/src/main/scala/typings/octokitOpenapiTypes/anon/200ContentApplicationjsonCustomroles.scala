package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCustomroles` extends StObject {
  
  /** Response - list of custom role names */
  var `200`: ContentApplicationjsonCustomroles
}
object `200ContentApplicationjsonCustomroles` {
  
  inline def apply(`200`: ContentApplicationjsonCustomroles): `200ContentApplicationjsonCustomroles` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCustomroles`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCustomroles`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCustomroles): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
