package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodytextCommitid403Content36` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonBodytextCommitid
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `422`: Content471
}
object `200ContentApplicationjsonBodytextCommitid403Content36` {
  
  inline def apply(
    `200`: ContentApplicationjsonBodytextCommitid,
    `403`: Content36,
    `404`: Content36,
    `422`: Content471
  ): `200ContentApplicationjsonBodytextCommitid403Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodytextCommitid403Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonBodytextCommitid403Content36`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBodytextCommitid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content471): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
