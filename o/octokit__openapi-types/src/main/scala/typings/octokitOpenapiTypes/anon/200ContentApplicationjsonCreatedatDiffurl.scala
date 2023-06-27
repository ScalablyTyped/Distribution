package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCreatedatDiffurl` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCreatedatDiffurl
  
  var `422`: Content414
}
object `200ContentApplicationjsonCreatedatDiffurl` {
  
  inline def apply(`200`: ContentApplicationjsonCreatedatDiffurl, `422`: Content414): `200ContentApplicationjsonCreatedatDiffurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCreatedatDiffurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCreatedatDiffurl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCreatedatDiffurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
