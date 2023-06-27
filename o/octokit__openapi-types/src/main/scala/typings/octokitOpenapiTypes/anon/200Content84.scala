package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content84` extends StObject {
  
  /** @description Response */
  var `200`: Content84
}
object `200Content84` {
  
  inline def apply(`200`: Content84): `200Content84` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content84`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content84`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content84): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
