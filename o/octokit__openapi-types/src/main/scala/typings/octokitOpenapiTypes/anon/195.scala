package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195` extends StObject {
  
  /** @description Response */
  var `200`: Content164
}
object `195` {
  
  inline def apply(`200`: Content164): `195` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`195`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `195`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content164): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
