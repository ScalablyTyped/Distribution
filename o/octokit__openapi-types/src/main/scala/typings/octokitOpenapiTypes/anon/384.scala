package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `384` extends StObject {
  
  /** Response */
  var `200`: Content56Headers
}
object `384` {
  
  inline def apply(`200`: Content56Headers): `384` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`384`]
  }
  
  extension [Self <: `384`](x: Self) {
    
    inline def set200(value: Content56Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
