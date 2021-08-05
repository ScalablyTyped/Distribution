package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnsOptions extends StObject {
  
  var parentScope: js.UndefOr[js.Object] = js.undefined
}
object OnsOptions {
  
  inline def apply(): OnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnsOptions]
  }
  
  extension [Self <: OnsOptions](x: Self) {
    
    inline def setParentScope(value: js.Object): Self = StObject.set(x, "parentScope", value.asInstanceOf[js.Any])
    
    inline def setParentScopeUndefined: Self = StObject.set(x, "parentScope", js.undefined)
  }
}
