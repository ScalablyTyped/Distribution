package typings.openui5.anon

import typings.openui5.sapUiModelContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueAsPromise extends StObject {
  
  /**
    * Whether a `Promise` may be returned if the needed metadata is not yet loaded (since 1.57.0)
    */
  @JSName("$$valueAsPromise")
  var DollarDollarvalueAsPromise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Points to the given raw value, that is `oDetails.context.getProperty("") === vRawValue`
    */
  var context: default
}
object ValueAsPromise {
  
  inline def apply(context: default): ValueAsPromise = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAsPromise]
  }
  
  extension [Self <: ValueAsPromise](x: Self) {
    
    inline def setContext(value: default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarvalueAsPromise(value: Boolean): Self = StObject.set(x, "$$valueAsPromise", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarvalueAsPromiseUndefined: Self = StObject.set(x, "$$valueAsPromise", js.undefined)
  }
}
