package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content270` extends StObject {
  
  /** @description Response */
  var `200`: Content270
}
object `200Content270` {
  
  inline def apply(`200`: Content270): `200Content270` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content270`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content270`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content270): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
