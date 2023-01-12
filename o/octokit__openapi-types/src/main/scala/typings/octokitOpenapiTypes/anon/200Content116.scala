package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content116` extends StObject {
  
  /** Response */
  var `200`: Content116
  
  /** if user has no team membership */
  var `404`: Any
}
object `200Content116` {
  
  inline def apply(`200`: Content116, `404`: Any): `200Content116` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content116`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content116`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content116): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
