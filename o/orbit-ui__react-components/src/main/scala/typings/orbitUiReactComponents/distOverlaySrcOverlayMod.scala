package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcOverlayMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/Overlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerOverlay(hasShowBorderOffsetContainerElementZIndexAsChildrenForwardedRefRest: InnerOverlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlay")(hasShowBorderOffsetContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/Overlay", "Overlay")
  @js.native
  val Overlay: OrbitComponent[HTMLElement, InnerOverlayProps] = js.native
  
  trait InnerOverlayProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Hacky offset utility to apply a transparent CSS border to the overlay.
      * It's useful to prevent the overlay from closing when the mouse goes from the trigger to the overlay.
      */
    var borderOffset: js.UndefOr[String | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * A DOM element in which the overlay element will be appended via a React portal.
      */
    var containerElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Whether or not to show the overlay element.
      */
    var show: Boolean
    
    /**
      * The z-index of the overlay.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerOverlayProps {
    
    inline def apply(show: Boolean): InnerOverlayProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerOverlayProps]
    }
    
    extension [Self <: InnerOverlayProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBorderOffset(value: String | Double): Self = StObject.set(x, "borderOffset", value.asInstanceOf[js.Any])
      
      inline def setBorderOffsetUndefined: Self = StObject.set(x, "borderOffset", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainerElement(value: HTMLElement): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type OverlayProps = ComponentProps[OrbitComponent[HTMLElement, InnerOverlayProps]]
}
