package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`0`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`10`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`11`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`12`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`13`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`1`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`2`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`3`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`4`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`5`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`6`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`7`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`8`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`9`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.center
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.start
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

object distToolbarSrcToolbarMod {
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src/Toolbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerToolbar(param0: InnerToolbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToolbar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src/Toolbar", "Toolbar")
  @js.native
  val Toolbar: OrbitComponent[HTMLElement, InnerToolbarProps] = js.native
  
  trait InnerToolbarProps extends StObject {
    
    /**
      * The horizontal alignment of the elements.
      */
    var align: js.UndefOr[start | end | center] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the toolbar should autoFocus the first tabbable element on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the toolbar elements are disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the toolbar take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The space between the elements.
      */
    var gap: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ] = js.undefined
    
    /**
      * The orientation of the elements.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * The vertical alignment of the elements.
      */
    var verticalAlign: js.UndefOr[start | end | center] = js.undefined
    
    /**
      * Whether or not the elements are forced onto one line or can wrap onto multiple lines
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object InnerToolbarProps {
    
    inline def apply(): InnerToolbarProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerToolbarProps]
    }
    
    extension [Self <: InnerToolbarProps](x: Self) {
      
      inline def setAlign(value: start | end | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setGap(
        value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setVerticalAlign(value: start | end | center): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type ToolbarProps = ComponentProps[OrbitComponent[HTMLElement, InnerToolbarProps]]
}
