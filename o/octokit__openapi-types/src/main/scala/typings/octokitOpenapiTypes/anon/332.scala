package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `332` extends StObject {
  
  /** Response */
  var `200`: Content331
}
object `332` {
  
  inline def apply(`200`: Content331): `332` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`332`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `332`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content331): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
