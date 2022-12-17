package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `304Unknown` extends StObject {
  
  /** Response */
  var `200`: Content12
  
  var `304`: Any
}
object `304Unknown` {
  
  inline def apply(`200`: Content12, `304`: Any): `304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`304Unknown`]
  }
  
  extension [Self <: `304Unknown`](x: Self) {
    
    inline def set200(value: Content12): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
