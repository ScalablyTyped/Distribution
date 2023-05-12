package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCreatedatId` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCreatedatId
}
object `200ContentApplicationjsonCreatedatId` {
  
  inline def apply(`200`: ContentApplicationjsonCreatedatId): `200ContentApplicationjsonCreatedatId` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCreatedatId`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCreatedatId`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCreatedatId): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
