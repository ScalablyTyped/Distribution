package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content444` extends StObject {
  
  /** Response */
  var `200`: Content444
  
  var `401`: Content55
  
  var `404`: Content55
}
object `200Content444` {
  
  inline def apply(`200`: Content444, `401`: Content55, `404`: Content55): `200Content444` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content444`]
  }
  
  extension [Self <: `200Content444`](x: Self) {
    
    inline def set200(value: Content444): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content55): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
