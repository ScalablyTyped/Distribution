package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `544` extends StObject {
  
  /** Response */
  var `200`: Content429
}
object `544` {
  
  inline def apply(`200`: Content429): `544` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`544`]
  }
  
  extension [Self <: `544`](x: Self) {
    
    inline def set200(value: Content429): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
