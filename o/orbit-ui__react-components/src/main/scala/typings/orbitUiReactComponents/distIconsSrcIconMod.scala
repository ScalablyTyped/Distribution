package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OmitInnerIconPropssrc
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
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

object distIconsSrcIconMod {
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/Icon", "Icon")
  @js.native
  val Icon: OrbitComponent[svg, InnerIconProps] = js.native
  
  inline def InnerIcon(props: InnerIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createIcon(src: ElementType[Any]): OrbitComponent[svg, OmitInnerIconPropssrc] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIcon")(src.asInstanceOf[js.Any]).asInstanceOf[OrbitComponent[svg, OmitInnerIconPropssrc]]
  
  type IconProps = ComponentProps[OrbitComponent[svg, InnerIconProps]]
  
  trait InnerIconProps
    extends StObject
       with AriaLabelingProps {
    
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
      * An icon as a React component.
      */
    var src: ElementType[Any]
  }
  object InnerIconProps {
    
    inline def apply(src: ElementType[Any]): InnerIconProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerIconProps]
    }
    
    extension [Self <: InnerIconProps](x: Self) {
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSrc(value: ElementType[Any]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
