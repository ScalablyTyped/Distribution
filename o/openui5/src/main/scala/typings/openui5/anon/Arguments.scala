package typings.openui5.anon

import typings.openui5.sapUiModelContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arguments extends StObject {
  
  /**
    * Optional arguments: an optional map of binding parameters; this will be added to each resulting data
    * binding
    */
  var arguments: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Points to the given raw value, that is `oDetails.context.getProperty("") === vRawValue`
    */
  var context: default
  
  /**
    * The single operation overload that was targeted by annotations on an operation or a parameter; needed
    * to strip off the binding parameter's name from any dynamic "14.5.12 Expression edm:Path" and "14.5.13
    * Expression edm:PropertyPath" where it might be used as a first segment (since 1.72.0). This does not
    * apply to annotations on a parameter (since 1.76.0).
    */
  var overload: js.UndefOr[js.Object] = js.undefined
}
object Arguments {
  
  inline def apply(context: default): Arguments = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: Any*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setContext(value: default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setOverload(value: js.Object): Self = StObject.set(x, "overload", value.asInstanceOf[js.Any])
    
    inline def setOverloadUndefined: Self = StObject.set(x, "overload", js.undefined)
  }
}
