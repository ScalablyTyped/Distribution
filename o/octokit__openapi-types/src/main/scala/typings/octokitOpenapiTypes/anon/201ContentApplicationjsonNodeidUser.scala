package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonNodeidUser` extends StObject {
  
  /** @description Reaction exists */
  var `200`: ContentApplicationjsonNodeidUser
  
  /** @description Reaction created */
  var `201`: ContentApplicationjsonNodeidUser
  
  var `422`: Content346
}
object `201ContentApplicationjsonNodeidUser` {
  
  inline def apply(
    `200`: ContentApplicationjsonNodeidUser,
    `201`: ContentApplicationjsonNodeidUser,
    `422`: Content346
  ): `201ContentApplicationjsonNodeidUser` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonNodeidUser`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonNodeidUser`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonNodeidUser): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: ContentApplicationjsonNodeidUser): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
