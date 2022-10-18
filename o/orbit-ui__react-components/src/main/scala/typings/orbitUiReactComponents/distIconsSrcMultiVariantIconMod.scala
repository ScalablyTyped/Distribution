package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OmitInnerMultiVariantIcon
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.svg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIconsSrcMultiVariantIconMod {
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/MultiVariantIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMultiVariantIcon(hasComponent24Component32SizeForwardedRefRest: InnerMultiVariantIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMultiVariantIcon")(hasComponent24Component32SizeForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/MultiVariantIcon", "MultiVariantIcon")
  @js.native
  val MultiVariantIcon: OrbitComponent[svg, InnerMultiVariantIconProps] = js.native
  
  inline def createMultiVariantIcon(src24: ElementType[Any], src32: ElementType[Any]): OrbitComponent[svg, OmitInnerMultiVariantIcon] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiVariantIcon")(src24.asInstanceOf[js.Any], src32.asInstanceOf[js.Any])).asInstanceOf[OrbitComponent[svg, OmitInnerMultiVariantIcon]]
  
  trait InnerMultiVariantIconProps extends StObject {
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * An icon can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
    
    /**
      * An icon as a React component for the 24px variant.
      */
    var src24: ElementType[Any]
    
    /**
      * An icon as a React component for the 32px variant.
      */
    var src32: ElementType[Any]
  }
  object InnerMultiVariantIconProps {
    
    inline def apply(src24: ElementType[Any], src32: ElementType[Any]): InnerMultiVariantIconProps = {
      val __obj = js.Dynamic.literal(src24 = src24.asInstanceOf[js.Any], src32 = src32.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerMultiVariantIconProps]
    }
    
    extension [Self <: InnerMultiVariantIconProps](x: Self) {
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSrc24(value: ElementType[Any]): Self = StObject.set(x, "src24", value.asInstanceOf[js.Any])
      
      inline def setSrc32(value: ElementType[Any]): Self = StObject.set(x, "src32", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiVariantIconProps = ComponentProps[OrbitComponent[svg, InnerMultiVariantIconProps]]
}
