package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content570` extends StObject {
  
  /** Response */
  var `200`: Content570
  
  var `404`: Content55
}
object `200Content570` {
  
  inline def apply(`200`: Content570, `404`: Content55): `200Content570` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content570`]
  }
  
  extension [Self <: `200Content570`](x: Self) {
    
    inline def set200(value: Content570): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
