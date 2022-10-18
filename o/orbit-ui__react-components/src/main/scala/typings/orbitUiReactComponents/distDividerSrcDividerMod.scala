package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDividerSrcDividerMod {
  
  @JSImport("@orbit-ui/react-components/dist/divider/src/Divider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/divider/src/Divider", "Divider")
  @js.native
  val Divider: OrbitComponent[HTMLElement, InnerDividerProps] = js.native
  
  inline def InnerDivider(hasOrientationAsChildrenForwardedRefRest: InnerDividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDivider")(hasOrientationAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type DividerProps = ComponentProps[OrbitComponent[HTMLElement, InnerDividerProps]]
  
  trait InnerDividerProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * @ignore
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: js.UndefOr[ForwardedRef[Any]] = js.undefined
    
    /**
      * The orientation of the divider.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  }
  object InnerDividerProps {
    
    inline def apply(): InnerDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerDividerProps]
    }
    
    extension [Self <: InnerDividerProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
}
