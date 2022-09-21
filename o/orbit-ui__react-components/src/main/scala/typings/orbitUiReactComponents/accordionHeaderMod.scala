package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Key
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.typesMod.InteractionStatesProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionHeaderMod {
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/AccordionHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/AccordionHeader", "AccordionHeader")
  @js.native
  val AccordionHeader: OrbitComponent[HTMLElement, InnerAccordionHeaderProps] = js.native
  
  inline def InnerAccordionHeader(props: InnerAccordionHeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type AccordionHeaderProps = ComponentProps[OrbitComponent[HTMLElement, InnerAccordionHeaderProps]]
  
  trait InnerAccordionHeaderProps
    extends StObject
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
      * Whether or not the tab is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The header item props
      */
    var header: js.UndefOr[Key] = js.undefined
  }
  object InnerAccordionHeaderProps {
    
    inline def apply(): InnerAccordionHeaderProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerAccordionHeaderProps]
    }
    
    extension [Self <: InnerAccordionHeaderProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setHeader(value: Key): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
