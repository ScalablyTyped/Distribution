package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `811` extends StObject {
  
  /** @description Response */
  var `200`: Content793
}
object `811` {
  
  inline def apply(`200`: Content793): `811` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`811`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `811`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content793): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
