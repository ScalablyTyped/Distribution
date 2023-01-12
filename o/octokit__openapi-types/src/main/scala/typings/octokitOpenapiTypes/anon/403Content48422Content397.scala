package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403Content48422Content397` extends StObject {
  
  var `403`: Content48
  
  var `422`: Content397
}
object `403Content48422Content397` {
  
  inline def apply(`403`: Content48, `422`: Content397): `403Content48422Content397` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403Content48422Content397`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403Content48422Content397`] (val x: Self) extends AnyVal {
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
