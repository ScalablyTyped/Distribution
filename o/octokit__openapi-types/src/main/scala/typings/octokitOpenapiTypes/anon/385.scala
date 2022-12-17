package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `385` extends StObject {
  
  /** Response */
  var `200`: Content377
}
object `385` {
  
  inline def apply(`200`: Content377): `385` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`385`]
  }
  
  extension [Self <: `385`](x: Self) {
    
    inline def set200(value: Content377): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
