package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeValueAsPromise extends StObject {
  
  /**
    * Whether {@link sap.ui.model.PropertyBinding#getValue} may return a `Promise` resolving with the value
    * (since 1.57.0)
    */
  @JSName("$$valueAsPromise")
  var DollarDollarvalueAsPromise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional scope for lookup of aliases for computed annotations (since 1.43.0)
    */
  var scope: js.UndefOr[js.Object] = js.undefined
}
object ScopeValueAsPromise {
  
  inline def apply(): ScopeValueAsPromise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeValueAsPromise]
  }
  
  extension [Self <: ScopeValueAsPromise](x: Self) {
    
    inline def setDollarDollarvalueAsPromise(value: Boolean): Self = StObject.set(x, "$$valueAsPromise", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarvalueAsPromiseUndefined: Self = StObject.set(x, "$$valueAsPromise", js.undefined)
    
    inline def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
