package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200401403404422` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonFingerprint
  
  var `401`: Content41
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `422`: Content414
}
object `200401403404422` {
  
  inline def apply(
    `200`: ContentApplicationjsonFingerprint,
    `401`: Content41,
    `403`: Content41,
    `404`: Content41,
    `422`: Content414
  ): `200401403404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200401403404422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200401403404422`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonFingerprint): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content41): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
