package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content145` extends StObject {
  
  /** Response */
  var `200`: Content145
}
object `200Content145` {
  
  inline def apply(`200`: Content145): `200Content145` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content145`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content145`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content145): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
