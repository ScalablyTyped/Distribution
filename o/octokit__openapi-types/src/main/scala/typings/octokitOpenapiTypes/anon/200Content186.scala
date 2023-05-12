package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content186` extends StObject {
  
  /** @description Response when the suite already exists */
  var `200`: Content186
  
  /** @description Response when the suite was created */
  var `201`: Content186
}
object `200Content186` {
  
  inline def apply(`200`: Content186, `201`: Content186): `200Content186` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content186`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content186`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content186): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: Content186): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
