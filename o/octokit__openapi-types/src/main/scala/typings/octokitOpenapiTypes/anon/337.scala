package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `337` extends StObject {
  
  /** Response */
  var `200`: Content336
}
object `337` {
  
  inline def apply(`200`: Content336): `337` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`337`]
  }
  
  extension [Self <: `337`](x: Self) {
    
    inline def set200(value: Content336): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
