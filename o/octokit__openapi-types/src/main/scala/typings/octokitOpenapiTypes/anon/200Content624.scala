package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content624` extends StObject {
  
  /** @description Response */
  var `200`: Content624
}
object `200Content624` {
  
  inline def apply(`200`: Content624): `200Content624` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content624`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content624`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content624): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
