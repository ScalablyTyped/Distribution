package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `620` extends StObject {
  
  /** Response */
  var `200`: Content448Headers
}
object `620` {
  
  inline def apply(`200`: Content448Headers): `620` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`620`]
  }
  
  extension [Self <: `620`](x: Self) {
    
    inline def set200(value: Content448Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
