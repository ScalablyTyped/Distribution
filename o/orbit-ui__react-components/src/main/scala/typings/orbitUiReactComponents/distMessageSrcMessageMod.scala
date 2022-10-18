package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.informative
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.negative
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.positive
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.warning
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessageSrcMessageMod {
  
  @JSImport("@orbit-ui/react-components/dist/message/src/Message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMessage(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest: InnerMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMessage")(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/message/src/Message", "Message")
  @js.native
  val Message: OrbitComponent[HTMLElement, InnerMessageProps] = js.native
  
  trait InnerMessageProps extends StObject {
    
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
    
    /**
      * Called when the dismiss button is clicked.
      * @param {MouseEvent} event - React's original synthetic event.
      * @returns {void}
      */
    var onDismiss: js.UndefOr[
        js.Function1[/* event */ MouseEvent[typings.std.Element, NativeMouseEvent], Unit]
      ] = js.undefined
    
    /**
      * @ignore
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * A controlled show value.
      */
    var show: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The style to use.
      */
    var variant: js.UndefOr[informative | warning | positive | negative] = js.undefined
  }
  object InnerMessageProps {
    
    inline def apply(): InnerMessageProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerMessageProps]
    }
    
    extension [Self <: InnerMessageProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnDismiss(value: /* event */ MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setVariant(value: informative | warning | positive | negative): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type MessageProps = ComponentProps[OrbitComponent[HTMLElement, InnerMessageProps]]
}
