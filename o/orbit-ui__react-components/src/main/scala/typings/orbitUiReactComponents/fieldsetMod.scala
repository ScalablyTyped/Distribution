package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.typesMod.DomProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldsetMod {
  
  @JSImport("@orbit-ui/react-components/dist/form/src/Fieldset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form/src/Fieldset", "Fieldset")
  @js.native
  val Fieldset: OrbitComponent[HTMLElement, InnerFieldsetProps] = js.native
  
  inline def InnerFieldset(hasIdLabelAsChildrenForwardedRefRest: InnerFieldsetProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFieldset")(hasIdLabelAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type FieldsetProps = ComponentProps[OrbitComponent[HTMLElement, InnerFieldsetProps]]
  
  trait InnerFieldsetProps
    extends StObject
       with DomProps {
    
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
      * A label identifying the group.
      */
    var label: String
  }
  object InnerFieldsetProps {
    
    inline def apply(label: String): InnerFieldsetProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerFieldsetProps]
    }
    
    extension [Self <: InnerFieldsetProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
}
