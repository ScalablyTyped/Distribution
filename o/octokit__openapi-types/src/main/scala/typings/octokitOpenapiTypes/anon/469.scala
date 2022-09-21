package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `469` extends StObject {
  
  /** Response */
  var `200`: Content454Headers
}
object `469` {
  
  inline def apply(`200`: Content454Headers): `469` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`469`]
  }
  
  extension [Self <: `469`](x: Self) {
    
    inline def set200(value: Content454Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
