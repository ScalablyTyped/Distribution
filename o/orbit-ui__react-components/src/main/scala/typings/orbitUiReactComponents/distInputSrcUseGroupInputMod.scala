package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Align
import typings.orbitUiReactComponents.anon.Disabled
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`0`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`10`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`11`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`12`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`13`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`1`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`2`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`3`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`4`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`5`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`6`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`7`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`8`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`9`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.group
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.radiogroup
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputSrcUseGroupInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/input/src/useGroupInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useGroupInput(
    hasRoleModuleRequiredValidationStateOrientationGapWrapSizeReverseDisabledIsInFieldGroupRef: UseGroupInputProps
  ): UseGroupInputReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useGroupInput")(hasRoleModuleRequiredValidationStateOrientationGapWrapSizeReverseDisabledIsInFieldGroupRef.asInstanceOf[js.Any]).asInstanceOf[UseGroupInputReturn]
  
  trait UseGroupInputProps extends StObject {
    
    var cssModule: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var gap: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ] = js.undefined
    
    var groupRef: Ref[Any]
    
    var isInField: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[group | radiogroup] = js.undefined
    
    var size: js.UndefOr[sm | md] = js.undefined
    
    var validationState: js.UndefOr[valid | invalid] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object UseGroupInputProps {
    
    inline def apply(): UseGroupInputProps = {
      val __obj = js.Dynamic.literal(groupRef = null)
      __obj.asInstanceOf[UseGroupInputProps]
    }
    
    extension [Self <: UseGroupInputProps](x: Self) {
      
      inline def setCssModule(value: String): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGap(
        value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGroupRef(value: Ref[Any]): Self = StObject.set(x, "groupRef", value.asInstanceOf[js.Any])
      
      inline def setGroupRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "groupRef", js.Any.fromFunction1(value))
      
      inline def setGroupRefNull: Self = StObject.set(x, "groupRef", null)
      
      inline def setIsInField(value: Boolean): Self = StObject.set(x, "isInField", value.asInstanceOf[js.Any])
      
      inline def setIsInFieldUndefined: Self = StObject.set(x, "isInField", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setRole(value: group | radiogroup): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait UseGroupInputReturn extends StObject {
    
    var groupProps: Align
    
    var itemProps: Disabled
  }
  object UseGroupInputReturn {
    
    inline def apply(groupProps: Align, itemProps: Disabled): UseGroupInputReturn = {
      val __obj = js.Dynamic.literal(groupProps = groupProps.asInstanceOf[js.Any], itemProps = itemProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseGroupInputReturn]
    }
    
    extension [Self <: UseGroupInputReturn](x: Self) {
      
      inline def setGroupProps(value: Align): Self = StObject.set(x, "groupProps", value.asInstanceOf[js.Any])
      
      inline def setItemProps(value: Disabled): Self = StObject.set(x, "itemProps", value.asInstanceOf[js.Any])
    }
  }
}
