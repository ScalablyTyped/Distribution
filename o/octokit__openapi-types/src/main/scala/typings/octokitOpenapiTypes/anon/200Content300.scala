package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content300` extends StObject {
  
  /** Response */
  var `200`: Content300
}
object `200Content300` {
  
  inline def apply(`200`: Content300): `200Content300` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content300`]
  }
  
  extension [Self <: `200Content300`](x: Self) {
    
    inline def set200(value: Content300): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
