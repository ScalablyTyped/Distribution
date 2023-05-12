package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content571` extends StObject {
  
  /** @description Response */
  var `200`: Content571
  
  var `301`: Content36
}
object `200Content571` {
  
  inline def apply(`200`: Content571, `301`: Content36): `200Content571` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content571`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content571`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content571): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content36): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
  }
}
