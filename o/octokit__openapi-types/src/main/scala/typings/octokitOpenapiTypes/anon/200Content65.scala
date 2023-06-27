package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content65` extends StObject {
  
  /** @description Response */
  var `200`: Content65
}
object `200Content65` {
  
  inline def apply(`200`: Content65): `200Content65` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content65`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content65`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content65): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
