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

object distGroupSrcGroupMod {
  
  @JSImport("@orbit-ui/react-components/dist/group/src/Group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/group/src/Group", "Group")
  @js.native
  val Group: OrbitComponent[HTMLElement, InnerGroupProps] = js.native
  
  inline def InnerGroup(hasOrientationAlignVerticalAlignWrapChildrenForwardedRefRest: InnerGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerGroup")(hasOrientationAlignVerticalAlignWrapChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type GroupProps = ComponentProps[OrbitComponent[HTMLElement, InnerGroupProps]]
  
  trait InnerGroupProps extends StObject {
    
    /**
      * The horizontal alignment of the elements.
      */
    var align: js.UndefOr[start | end | center] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children
      */
    var children: ReactNode
    
    /**
      * Whether the elements take up the width & height of their container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Space to display between each elements.
      */
    var gap: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ] = js.undefined
    
    /**
      * Whether or not to inline the elements.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The orientation of the elements.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Whether or not to reverse the order of the elements.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A WAI-ARIA accessibility role. See [MDN](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Roles).
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * The vertical alignment of the elements.
      */
    var verticalAlign: js.UndefOr[start | end | center] = js.undefined
    
    /**
      * Whether elements are forced onto one line or can wrap onto multiple lines
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object InnerGroupProps {
    
    inline def apply(): InnerGroupProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerGroupProps]
    }
    
    extension [Self <: InnerGroupProps](x: Self) {
      
      inline def setAlign(value: start | end | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setGap(
        value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setVerticalAlign(value: start | end | center): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
