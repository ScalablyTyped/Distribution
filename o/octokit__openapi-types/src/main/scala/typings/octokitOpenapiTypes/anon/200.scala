package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  /** @description Response */
  var `200`: Content
}
object `200` {
  
  inline def apply(`200`: Content): `200` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
