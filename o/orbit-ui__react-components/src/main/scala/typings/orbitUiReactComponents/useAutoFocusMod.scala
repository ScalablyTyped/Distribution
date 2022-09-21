package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.useFocusManagerMod.FocusManager
import typings.orbitUiReactComponents.useFocusManagerMod.FocusOptions
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAutoFocusMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useAutoFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAutoFocus(targetRef: RefObject[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocus")(targetRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAutoFocus(targetRef: RefObject[HTMLElement], hasIsDisabledDelayOnFocus: AutoFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocus")(targetRef.asInstanceOf[js.Any], hasIsDisabledDelayOnFocus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useAutoFocusChild(focusManager: FocusManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocusChild")(focusManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAutoFocusChild(
    focusManager: FocusManager,
    hasTargetIsDisabledDelayCanFocusOnFocusOnNotFound: AutoFocusChildOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocusChild")(focusManager.asInstanceOf[js.Any], hasTargetIsDisabledDelayCanFocusOnFocusOnNotFound.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AbstractAutoFocusOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* element */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  }
  object AbstractAutoFocusOptions {
    
    inline def apply(): AbstractAutoFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractAutoFocusOptions]
    }
    
    extension [Self <: AbstractAutoFocusOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnFocus(value: /* element */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
  
  trait AutoFocusChildOptions
    extends StObject
       with FocusOptions {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object AutoFocusChildOptions {
    
    inline def apply(): AutoFocusChildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFocusChildOptions]
    }
    
    extension [Self <: AutoFocusChildOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait AutoFocusOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* element */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  }
  object AutoFocusOptions {
    
    inline def apply(): AutoFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFocusOptions]
    }
    
    extension [Self <: AutoFocusOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnFocus(value: /* element */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
