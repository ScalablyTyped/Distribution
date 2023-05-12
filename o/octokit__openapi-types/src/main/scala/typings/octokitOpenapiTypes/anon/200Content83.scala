package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content83` extends StObject {
  
  /** @description Default response */
  var `200`: Content83
}
object `200Content83` {
  
  inline def apply(`200`: Content83): `200Content83` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content83`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content83`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content83): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
