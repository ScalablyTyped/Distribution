package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content551404Content55` extends StObject {
  
  /** Response */
  var `200`: Content551
  
  var `404`: Content55
}
object `200Content551404Content55` {
  
  inline def apply(`200`: Content551, `404`: Content55): `200Content551404Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content551404Content55`]
  }
  
  extension [Self <: `200Content551404Content55`](x: Self) {
    
    inline def set200(value: Content551): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
