package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `735` extends StObject {
  
  /** @description Response */
  var `200`: Content576
}
object `735` {
  
  inline def apply(`200`: Content576): `735` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`735`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `735`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content576): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
