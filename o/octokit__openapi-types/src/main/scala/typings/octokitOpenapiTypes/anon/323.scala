package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `323` extends StObject {
  
  /** Response when creating a secret */
  var `201`: Content308
}
object `323` {
  
  inline def apply(`201`: Content308): `323` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`323`]
  }
  
  extension [Self <: `323`](x: Self) {
    
    inline def set201(value: Content308): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
