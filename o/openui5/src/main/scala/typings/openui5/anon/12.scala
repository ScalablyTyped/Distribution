package typings.openui5.anon

import typings.openui5.sapUiModelContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  /**
    * If present, it must point to this meta model's root entity container, that is, `oDetails.context.getModel()
    * === this` and `oDetails.context.getPath() === "/"`
    */
  var context: js.UndefOr[default] = js.undefined
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `12`] (val x: Self) extends AnyVal {
    
    inline def setContext(value: default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
