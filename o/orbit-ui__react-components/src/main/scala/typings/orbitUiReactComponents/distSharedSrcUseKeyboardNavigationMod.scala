package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OnKeyDownKeyboardEventHandler
import typings.orbitUiReactComponents.distSharedSrcKeysMod.Keys
import typings.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager
import typings.react.mod.KeyboardEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseKeyboardNavigationMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useKeyboardNavigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeyboardNavigation(focusManager: FocusManager, param1: KeyboardNavigationBindings): OnKeyDownKeyboardEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownKeyboardEventHandler]
  inline def useKeyboardNavigation(focusManager: FocusManager, param1: KeyboardNavigationBindings, param2: KeyboardNavigationOptions): OnKeyDownKeyboardEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownKeyboardEventHandler]
  
  trait KeyboardNavigationBindings extends StObject {
    
    var first: js.UndefOr[js.Array[Keys]] = js.undefined
    
    var last: js.UndefOr[js.Array[Keys]] = js.undefined
    
    var next: js.UndefOr[js.Array[Keys]] = js.undefined
    
    var previous: js.UndefOr[js.Array[Keys]] = js.undefined
  }
  object KeyboardNavigationBindings {
    
    inline def apply(): KeyboardNavigationBindings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardNavigationBindings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardNavigationBindings] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: js.Array[Keys]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setFirstVarargs(value: Keys*): Self = StObject.set(x, "first", js.Array(value*))
      
      inline def setLast(value: js.Array[Keys]): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setLastVarargs(value: Keys*): Self = StObject.set(x, "last", js.Array(value*))
      
      inline def setNext(value: js.Array[Keys]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setNextVarargs(value: Keys*): Self = StObject.set(x, "next", js.Array(value*))
      
      inline def setPrevious(value: js.Array[Keys]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setPreviousVarargs(value: Keys*): Self = StObject.set(x, "previous", js.Array(value*))
    }
  }
  
  trait KeyboardNavigationOptions extends StObject {
    
    var onSelect: js.UndefOr[js.Function2[/* event */ KeyboardEvent[Element], /* element */ Element, Unit]] = js.undefined
  }
  object KeyboardNavigationOptions {
    
    inline def apply(): KeyboardNavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardNavigationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardNavigationOptions] (val x: Self) extends AnyVal {
      
      inline def setOnSelect(value: (/* event */ KeyboardEvent[Element], /* element */ Element) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
