package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `423` extends StObject {
  
  /** @description Response */
  var `200`: Content421
}
object `423` {
  
  inline def apply(`200`: Content421): `423` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`423`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `423`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content421): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
