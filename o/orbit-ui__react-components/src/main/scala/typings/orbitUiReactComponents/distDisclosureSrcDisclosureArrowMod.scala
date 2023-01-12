package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ComponentProps
import typings.react.mod.ForwardedRef
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisclosureSrcDisclosureArrowMod {
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/DisclosureArrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/DisclosureArrow", "DisclosureArrow")
  @js.native
  val DisclosureArrow: OrbitComponent[HTMLElement, InnerDisclosureArrowProps] = js.native
  
  inline def InnerDisclosureArrow(param0: InnerDisclosureArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDisclosureArrow")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type DisclosureArrowProps = ComponentProps[OrbitComponent[HTMLElement, InnerDisclosureArrowProps]]
  
  trait InnerDisclosureArrowProps extends StObject {
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * A controlled open value that determined whether or not the arrow is up or down.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An arrow can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
  }
  object InnerDisclosureArrowProps {
    
    inline def apply(): InnerDisclosureArrowProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerDisclosureArrowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerDisclosureArrowProps] (val x: Self) extends AnyVal {
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
