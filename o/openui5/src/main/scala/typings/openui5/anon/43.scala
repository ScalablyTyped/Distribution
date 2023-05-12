package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  /**
    * Optional scope for lookup of aliases for computed annotations (since 1.43.0)
    */
  var scope: js.UndefOr[js.Object] = js.undefined
}
object `43` {
  
  inline def apply(): `43` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`43`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `43`] (val x: Self) extends AnyVal {
    
    inline def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
