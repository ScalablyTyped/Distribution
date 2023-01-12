package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content465404Content48410Content48` extends StObject {
  
  /** Response */
  var `200`: Content465
  
  var `404`: Content48
  
  var `410`: Content48
}
object `200Content465404Content48410Content48` {
  
  inline def apply(`200`: Content465, `404`: Content48, `410`: Content48): `200Content465404Content48410Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content465404Content48410Content48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content465404Content48410Content48`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content465): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content48): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
