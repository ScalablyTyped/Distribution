package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content497` extends StObject {
  
  /** Response */
  var `200`: Content497
  
  var `404`: Content48
}
object `200Content497` {
  
  inline def apply(`200`: Content497, `404`: Content48): `200Content497` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content497`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content497`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content497): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
