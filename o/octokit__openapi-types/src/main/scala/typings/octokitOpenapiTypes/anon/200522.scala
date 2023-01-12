package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200522` extends StObject {
  
  /** Response */
  var `200`: `522`
  
  var `404`: Content48
}
object `200522` {
  
  inline def apply(`200`: `522`, `404`: Content48): `200522` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200522`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200522`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `522`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
