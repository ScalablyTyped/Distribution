package typings.muicss.reactMod

import typings.muicss.libReactTabMod.default
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var onActive: js.UndefOr[js.Function1[/* tab */ default, Unit]] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object TabProps {
  
  inline def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnActive(value: /* tab */ default => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
    
    inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
