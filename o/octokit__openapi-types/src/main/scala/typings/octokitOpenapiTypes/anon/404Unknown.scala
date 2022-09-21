package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404Unknown` extends StObject {
  
  /** if the user does not follow the target user */
  var `404`: Any
}
object `404Unknown` {
  
  inline def apply(`404`: Any): `404Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404Unknown`]
  }
  
  extension [Self <: `404Unknown`](x: Self) {
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
