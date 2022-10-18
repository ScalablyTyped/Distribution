package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  /**
    * Optional scope for lookup of aliases for computed annotations (since 1.43.0)
    */
  var scope: js.UndefOr[js.Object] = js.undefined
}
object `35` {
  
  inline def apply(): `35` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
