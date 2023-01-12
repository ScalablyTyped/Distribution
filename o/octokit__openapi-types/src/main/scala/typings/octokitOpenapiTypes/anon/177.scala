package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  /** Response */
  var `200`: Content175
}
object `177` {
  
  inline def apply(`200`: Content175): `177` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`177`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `177`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content175): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
