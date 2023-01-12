package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `297` extends StObject {
  
  /** Response */
  var `200`: Content296
}
object `297` {
  
  inline def apply(`200`: Content296): `297` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`297`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `297`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content296): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
