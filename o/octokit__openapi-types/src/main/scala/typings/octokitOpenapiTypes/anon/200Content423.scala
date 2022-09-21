package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content423` extends StObject {
  
  /** The permissions the installation has are included under the `permissions` key. */
  var `200`: Content423
}
object `200Content423` {
  
  inline def apply(`200`: Content423): `200Content423` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content423`]
  }
  
  extension [Self <: `200Content423`](x: Self) {
    
    inline def set200(value: Content423): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
