package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `526` extends StObject {
  
  /** @description Response */
  var `200`: Content497
}
object `526` {
  
  inline def apply(`200`: Content497): `526` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`526`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `526`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content497): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
