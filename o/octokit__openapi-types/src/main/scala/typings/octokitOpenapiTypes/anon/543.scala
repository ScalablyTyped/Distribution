package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `543` extends StObject {
  
  /** Response */
  var `200`: Content532
}
object `543` {
  
  inline def apply(`200`: Content532): `543` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`543`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `543`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content532): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
