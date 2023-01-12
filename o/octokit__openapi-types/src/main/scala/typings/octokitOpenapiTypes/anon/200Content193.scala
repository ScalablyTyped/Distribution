package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content193` extends StObject {
  
  /** Response */
  var `200`: Content193
}
object `200Content193` {
  
  inline def apply(`200`: Content193): `200Content193` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content193`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content193`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content193): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
