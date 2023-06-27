package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content94` extends StObject {
  
  /** @description Default response */
  var `200`: Content94
}
object `200Content94` {
  
  inline def apply(`200`: Content94): `200Content94` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content94`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content94`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content94): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
