package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200662422Content414` extends StObject {
  
  /** @description Response */
  var `200`: `662`
  
  var `422`: Content414
}
object `200662422Content414` {
  
  inline def apply(`200`: `662`, `422`: Content414): `200662422Content414` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200662422Content414`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200662422Content414`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `662`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
