package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content156` extends StObject {
  
  /** Response */
  var `200`: Content156
}
object `200Content156` {
  
  inline def apply(`200`: Content156): `200Content156` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content156`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content156`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content156): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
