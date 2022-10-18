package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  /** @description Can be `enabled` or `disabled`. */
  var status: js.UndefOr[String] = js.undefined
}
object `77` {
  
  inline def apply(): `77` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`77`]
  }
  
  extension [Self <: `77`](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
