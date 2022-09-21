package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400Content420` extends StObject {
  
  /** Response */
  var `200`: Content467
  
  var `400`: Content420
}
object `400Content420` {
  
  inline def apply(`200`: Content467, `400`: Content420): `400Content420` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400Content420`]
  }
  
  extension [Self <: `400Content420`](x: Self) {
    
    inline def set200(value: Content467): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: Content420): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
  }
}
