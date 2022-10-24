package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.DomProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopoverSrcPopoverMod {
  
  @JSImport("@orbit-ui/react-components/dist/popover/src/Popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerPopover(param0: InnerPopoverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopover")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/popover/src/Popover", "Popover")
  @js.native
  val Popover: OrbitComponent[HTMLElement, InnerPopoverProps] = js.native
  
  trait InnerPopoverProps
    extends StObject
       with DomProps
       with AriaLabelingProps
       with InteractionStatesProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
  }
  object InnerPopoverProps {
    
    inline def apply(): InnerPopoverProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerPopoverProps]
    }
    
    extension [Self <: InnerPopoverProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    }
  }
  
  type PopoverProps = ComponentProps[OrbitComponent[HTMLElement, InnerPopoverProps]]
}
