package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content544` extends StObject {
  
  /** Response */
  var `200`: Content544
  
  var `404`: Content55
}
object `200Content544` {
  
  inline def apply(`200`: Content544, `404`: Content55): `200Content544` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content544`]
  }
  
  extension [Self <: `200Content544`](x: Self) {
    
    inline def set200(value: Content544): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
