package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content506` extends StObject {
  
  /** if repository contains content */
  var `200`: Content506
  
  var `403`: Content48
  
  var `404`: Content48
}
object `200Content506` {
  
  inline def apply(`200`: Content506, `403`: Content48, `404`: Content48): `200Content506` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content506`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content506`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content506): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
