package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  /** @description if child teams exist */
  var `200`: Content99
}
object `152` {
  
  inline def apply(`200`: Content99): `152` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`152`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `152`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content99): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
