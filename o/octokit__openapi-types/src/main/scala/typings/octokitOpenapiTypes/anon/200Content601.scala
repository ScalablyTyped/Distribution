package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content601` extends StObject {
  
  /** @description Default response */
  var `200`: Content601
}
object `200Content601` {
  
  inline def apply(`200`: Content601): `200Content601` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content601`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content601`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content601): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
