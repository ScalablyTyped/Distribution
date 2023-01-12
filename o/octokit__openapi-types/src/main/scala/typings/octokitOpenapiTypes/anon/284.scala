package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `284` extends StObject {
  
  /** Response */
  var `200`: Content263
}
object `284` {
  
  inline def apply(`200`: Content263): `284` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`284`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `284`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content263): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
