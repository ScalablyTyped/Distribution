package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201401403404422` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonLastusedat
  
  var `401`: Content41
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `422`: Content414
}
object `201401403404422` {
  
  inline def apply(
    `201`: ContentApplicationjsonLastusedat,
    `401`: Content41,
    `403`: Content41,
    `404`: Content41,
    `422`: Content414
  ): `201401403404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201401403404422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201401403404422`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonLastusedat): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content41): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
