package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `291` extends StObject {
  
  /** @description Response */
  var `200`: `290`
}
object `291` {
  
  inline def apply(`200`: `290`): `291` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`291`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `291`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `290`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
