package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.assertive
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.button
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.circular
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.danger
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.ghost
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.off
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.outline
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.pill
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.polite
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.primary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.reset
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.rounded
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.secondary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.solid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.submit
import typings.orbitUiReactComponents.sizeMod.Size
import typings.orbitUiReactComponents.typesMod.InteractionStatesProps
import typings.orbitUiReactComponents.useMergedRefsMod.MergedRef
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useButtonMod {
  
  @JSImport("@orbit-ui/react-components/dist/button/src/useButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useButton(
    hasModuleVariantColorShapeAutoFocusFluidLoadingSizeActiveFocusHoverTypeAsForwardedRef: UseButtonProps
  ): UseButtonReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useButton")(hasModuleVariantColorShapeAutoFocusFluidLoadingSizeActiveFocusHoverTypeAsForwardedRef.asInstanceOf[js.Any]).asInstanceOf[UseButtonReturn]
  
  trait UseButtonProps
    extends StObject
       with InteractionStatesProps {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    var color: js.UndefOr[primary | secondary | danger | inherit] = js.undefined
    
    var cssModule: js.UndefOr[String] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var forwardedRef: js.UndefOr[ForwardedRef[Any]] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var shape: js.UndefOr[pill | rounded | circular] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var `type`: js.UndefOr[button | submit | reset] = js.undefined
    
    var variant: js.UndefOr[solid | outline | ghost] = js.undefined
  }
  object UseButtonProps {
    
    inline def apply(): UseButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseButtonProps]
    }
    
    extension [Self <: UseButtonProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setColor(value: primary | secondary | danger | inherit): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCssModule(value: String): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setShape(value: pill | rounded | circular): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: button | submit | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVariant(value: solid | outline | ghost): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  trait UseButtonReturn extends StObject {
    
    var `aria-busy`: Boolean
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var className: String
    
    var ref: MergedRef[Any]
    
    var `type`: js.UndefOr[button | submit | reset] = js.undefined
  }
  object UseButtonReturn {
    
    inline def apply(`aria-busy`: Boolean, className: String, ref: MergedRef[Any]): UseButtonReturn = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseButtonReturn]
    }
    
    extension [Self <: UseButtonReturn](x: Self) {
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setRef(value: MergedRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setType(value: button | submit | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
