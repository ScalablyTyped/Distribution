package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.ButtonProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.ghost
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.outline
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.solid
import typings.react.mod.FormEvent
import typings.react.mod.ForwardedRef
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonSrcUseToggleButtonMod {
  
  @JSImport("@orbit-ui/react-components/dist/button/src/useToggleButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useToggleButton[Shape](
    hasVariantShapeCheckedDefaultCheckedValueOnChangeOnCheckActiveIsCheckableForwardedRef: UseToggleButtonProps[Shape]
  ): ButtonProps[Shape] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggleButton")(hasVariantShapeCheckedDefaultCheckedValueOnChangeOnCheckActiveIsCheckableForwardedRef.asInstanceOf[js.Any]).asInstanceOf[ButtonProps[Shape]]
  
  trait UseToggleButtonProps[Shape] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean | Null] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var forwardedRef: js.UndefOr[ForwardedRef[Any]] = js.undefined
    
    var isCheckable: Boolean
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ FormEvent[HTMLButtonElement], /* isChecked */ Boolean, Unit]
      ] = js.undefined
    
    var onCheck: js.UndefOr[js.Function2[/* event */ FormEvent[HTMLButtonElement], /* value */ String, Unit]] = js.undefined
    
    var shape: js.UndefOr[Shape] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[solid | outline | ghost] = js.undefined
  }
  object UseToggleButtonProps {
    
    inline def apply[Shape](isCheckable: Boolean): UseToggleButtonProps[Shape] = {
      val __obj = js.Dynamic.literal(isCheckable = isCheckable.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseToggleButtonProps[Shape]]
    }
    
    extension [Self <: UseToggleButtonProps[?], Shape](x: Self & UseToggleButtonProps[Shape]) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedNull: Self = StObject.set(x, "checked", null)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setIsCheckable(value: Boolean): Self = StObject.set(x, "isCheckable", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: (/* event */ FormEvent[HTMLButtonElement], /* isChecked */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCheck(value: (/* event */ FormEvent[HTMLButtonElement], /* value */ String) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVariant(value: solid | outline | ghost): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
