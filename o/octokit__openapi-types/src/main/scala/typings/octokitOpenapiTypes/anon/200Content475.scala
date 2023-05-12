package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content475` extends StObject {
  
  /** @description The permissions the installation has are included under the `permissions` key. */
  var `200`: Content475
}
object `200Content475` {
  
  inline def apply(`200`: Content475): `200Content475` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content475`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content475`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content475): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
