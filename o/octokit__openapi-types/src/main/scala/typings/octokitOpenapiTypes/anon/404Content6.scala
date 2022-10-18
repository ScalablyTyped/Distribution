package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404Content6` extends StObject {
  
  /** Otherwise a `404` status code is returned. */
  var `404`: Content6
}
object `404Content6` {
  
  inline def apply(`404`: Content6): `404Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404Content6`]
  }
  
  extension [Self <: `404Content6`](x: Self) {
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
