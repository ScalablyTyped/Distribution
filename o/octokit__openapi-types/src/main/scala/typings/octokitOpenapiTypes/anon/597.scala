package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `597` extends StObject {
  
  /** Response */
  var `200`: Content431Headers
}
object `597` {
  
  inline def apply(`200`: Content431Headers): `597` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`597`]
  }
  
  extension [Self <: `597`](x: Self) {
    
    inline def set200(value: Content431Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
