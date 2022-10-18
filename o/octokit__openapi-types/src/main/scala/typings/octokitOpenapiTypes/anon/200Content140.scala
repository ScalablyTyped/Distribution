package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content140` extends StObject {
  
  /** Response */
  var `200`: Content140
}
object `200Content140` {
  
  inline def apply(`200`: Content140): `200Content140` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content140`]
  }
  
  extension [Self <: `200Content140`](x: Self) {
    
    inline def set200(value: Content140): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
