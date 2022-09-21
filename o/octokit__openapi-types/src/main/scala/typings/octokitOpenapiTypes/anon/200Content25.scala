package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content25` extends StObject {
  
  /** Response */
  var `200`: Content25
}
object `200Content25` {
  
  inline def apply(`200`: Content25): `200Content25` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content25`]
  }
  
  extension [Self <: `200Content25`](x: Self) {
    
    inline def set200(value: Content25): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
