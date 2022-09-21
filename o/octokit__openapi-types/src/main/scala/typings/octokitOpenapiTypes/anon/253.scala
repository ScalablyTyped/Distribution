package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `253` extends StObject {
  
  /** Response */
  var `200`: Content252
}
object `253` {
  
  inline def apply(`200`: Content252): `253` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`253`]
  }
  
  extension [Self <: `253`](x: Self) {
    
    inline def set200(value: Content252): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
