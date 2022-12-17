package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `575` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonNodeidUser
}
object `575` {
  
  inline def apply(`201`: ContentApplicationjsonNodeidUser): `575` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`575`]
  }
  
  extension [Self <: `575`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonNodeidUser): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
