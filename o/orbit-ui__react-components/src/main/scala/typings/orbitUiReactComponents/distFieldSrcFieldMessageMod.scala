package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.IsError
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.error
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.neutral
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.success
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFieldSrcFieldMessageMod {
  
  @JSImport("@orbit-ui/react-components/dist/field/src/FieldMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field/src/FieldMessage", "FieldMessage")
  @js.native
  val FieldMessage: OrbitComponent[HTMLElement, InnerFieldMessageProps] = js.native
  
  inline def getValidationProps(validationState: String): IsError = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidationProps")(validationState.asInstanceOf[js.Any]).asInstanceOf[IsError]
  
  type FieldMessageProps = ComponentProps[OrbitComponent[HTMLElement, InnerFieldMessageProps]]
  
  trait InnerFieldMessageProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the field take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The style to use.
      */
    var tone: neutral | success | error
  }
  object InnerFieldMessageProps {
    
    inline def apply(tone: neutral | success | error): InnerFieldMessageProps = {
      val __obj = js.Dynamic.literal(tone = tone.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerFieldMessageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerFieldMessageProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setTone(value: neutral | success | error): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
    }
  }
}
