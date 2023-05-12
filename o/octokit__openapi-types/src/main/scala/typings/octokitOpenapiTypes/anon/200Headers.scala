package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Headers` extends StObject {
  
  /** @description The permissions the installation has are included under the `permissions` key. */
  var `200`: Headers
}
object `200Headers` {
  
  inline def apply(`200`: Headers): `200Headers` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Headers`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Headers`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
