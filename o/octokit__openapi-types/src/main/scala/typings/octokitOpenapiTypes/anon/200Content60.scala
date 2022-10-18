package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content60` extends StObject {
  
  /** Response */
  var `200`: Content60
}
object `200Content60` {
  
  inline def apply(`200`: Content60): `200Content60` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content60`]
  }
  
  extension [Self <: `200Content60`](x: Self) {
    
    inline def set200(value: Content60): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
