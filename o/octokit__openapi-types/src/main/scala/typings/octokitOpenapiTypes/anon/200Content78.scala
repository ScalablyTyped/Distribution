package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content78` extends StObject {
  
  /** Default response */
  var `200`: Content78
}
object `200Content78` {
  
  inline def apply(`200`: Content78): `200Content78` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content78`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content78`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content78): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
