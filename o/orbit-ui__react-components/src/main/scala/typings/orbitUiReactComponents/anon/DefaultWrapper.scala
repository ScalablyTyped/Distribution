package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedSrcSlotsMod.SlotElements
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultWrapper extends StObject {
  
  var defaultWrapper: js.UndefOr[ComponentType[Any]] = js.undefined
  
  var required: js.UndefOr[
    js.Array[String] | (js.Function1[/* slotElements */ SlotElements, js.Array[String]])
  ] = js.undefined
}
object DefaultWrapper {
  
  inline def apply(): DefaultWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultWrapper] (val x: Self) extends AnyVal {
    
    inline def setDefaultWrapper(value: ComponentType[Any]): Self = StObject.set(x, "defaultWrapper", value.asInstanceOf[js.Any])
    
    inline def setDefaultWrapperUndefined: Self = StObject.set(x, "defaultWrapper", js.undefined)
    
    inline def setRequired(value: js.Array[String] | (js.Function1[/* slotElements */ SlotElements, js.Array[String]])): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredFunction1(value: /* slotElements */ SlotElements => js.Array[String]): Self = StObject.set(x, "required", js.Any.fromFunction1(value))
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
  }
}
