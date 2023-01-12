package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OnBlurOnFocus
import typings.orbitUiReactComponents.anon.`2`
import typings.react.mod.FocusEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseFocusWithinMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusWithin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFocusWithin(): OnBlurOnFocus | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")().asInstanceOf[OnBlurOnFocus | `2`]
  inline def useFocusWithin(param0: UseFocusWithinOptions): OnBlurOnFocus | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")(param0.asInstanceOf[js.Any]).asInstanceOf[OnBlurOnFocus | `2`]
  
  trait UseFocusWithinOptions extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[Element, Element], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[Element, Element], Unit]] = js.undefined
  }
  object UseFocusWithinOptions {
    
    inline def apply(): UseFocusWithinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFocusWithinOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseFocusWithinOptions] (val x: Self) extends AnyVal {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnBlur(value: /* event */ FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
