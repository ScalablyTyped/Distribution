package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403Content48404Unknown` extends StObject {
  
  var `403`: Content48
  
  /** Not Found if team synchronization is set up */
  var `404`: Any
  
  /** Unprocessable Entity if you attempt to add an organization to a team or you attempt to add a user to a team when they are not a member of at least one other team in the same organization */
  var `422`: Any
}
object `403Content48404Unknown` {
  
  inline def apply(`403`: Content48, `404`: Any, `422`: Any): `403Content48404Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403Content48404Unknown`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403Content48404Unknown`] (val x: Self) extends AnyVal {
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
