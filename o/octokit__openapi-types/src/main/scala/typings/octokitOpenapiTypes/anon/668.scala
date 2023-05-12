package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `668` extends StObject {
  
  /** @description Response */
  var `200`: Content655
}
object `668` {
  
  inline def apply(`200`: Content655): `668` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`668`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `668`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content655): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
