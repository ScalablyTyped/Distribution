package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content622` extends StObject {
  
  /** @description Response */
  var `200`: Content622
}
object `200Content622` {
  
  inline def apply(`200`: Content622): `200Content622` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content622`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content622`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content622): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
