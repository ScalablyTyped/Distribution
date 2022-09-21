package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content314` extends StObject {
  
  /** The list of reviews returns in chronological order. */
  var `200`: Content314
}
object `200Content314` {
  
  inline def apply(`200`: Content314): `200Content314` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content314`]
  }
  
  extension [Self <: `200Content314`](x: Self) {
    
    inline def set200(value: Content314): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
