package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var containsFocus: js.UndefOr[Boolean] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setContainsFocus(value: Boolean): Self = StObject.set(x, "containsFocus", value.asInstanceOf[js.Any])
    
    inline def setContainsFocusUndefined: Self = StObject.set(x, "containsFocus", js.undefined)
  }
}
