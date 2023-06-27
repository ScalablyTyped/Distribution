package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content220` extends StObject {
  
  /** @description Response when the suite already exists */
  var `200`: Content220
  
  /** @description Response when the suite was created */
  var `201`: Content220
}
object `200Content220` {
  
  inline def apply(`200`: Content220, `201`: Content220): `200Content220` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content220`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content220`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content220): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: Content220): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
