package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonMarketplacependingchange401Content36` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonMarketplacependingchange
  
  var `401`: Content36
}
object `200ContentApplicationjsonMarketplacependingchange401Content36` {
  
  inline def apply(`200`: ContentApplicationjsonMarketplacependingchange, `401`: Content36): `200ContentApplicationjsonMarketplacependingchange401Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonMarketplacependingchange401Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonMarketplacependingchange401Content36`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonMarketplacependingchange): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content36): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
  }
}
