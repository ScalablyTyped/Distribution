package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `534` extends StObject {
  
  /** @description Response */
  var `200`: Content511
}
object `534` {
  
  inline def apply(`200`: Content511): `534` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`534`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `534`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content511): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
