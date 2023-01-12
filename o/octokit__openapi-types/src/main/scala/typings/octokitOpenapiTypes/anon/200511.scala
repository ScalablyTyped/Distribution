package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200511` extends StObject {
  
  /** Response */
  var `200`: `511`
  
  var `404`: Content48
}
object `200511` {
  
  inline def apply(`200`: `511`, `404`: Content48): `200511` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200511`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200511`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `511`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
