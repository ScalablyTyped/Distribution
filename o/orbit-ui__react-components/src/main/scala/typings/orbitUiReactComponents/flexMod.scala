package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
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
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`first baseline`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`last baseline`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`safe center`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`self-end`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`self-start`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-around`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-between`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`space-evenly`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`unsafe center`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`wrap-reverse`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.baseline
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.center
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.column
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.left
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.nowrap
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.right
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.row
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.stretch
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.wrap
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexMod {
  
  @JSImport("@orbit-ui/react-components/dist/layout/src/Flex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/layout/src/Flex", "Flex")
  @js.native
  val Flex: OrbitComponent[HTMLElement, InnerFlexProps] = js.native
  
  inline def InnerFlex(
    hasDirectionInlineReverseAlignContentAlignItemsJustifyContentGapWrapFluidHasWidthHeightStyleChildrenForwardedRefRest: InnerFlexProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFlex")(hasDirectionInlineReverseAlignContentAlignItemsJustifyContentGapWrapFluidHasWidthHeightStyleChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type FlexProps = ComponentProps[OrbitComponent[HTMLElement, InnerFlexProps]]
  
  trait InnerFlexProps extends StObject {
    
    /**
      * The distribution of space around child items along the cross axis. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/align-content).
      */
    var alignContent: js.UndefOr[
        start | end | center | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ] = js.undefined
    
    /**
      * The alignment of children within their container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/align-items).
      */
    var alignItems: js.UndefOr[
        start | end | center | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children
      */
    var children: ReactNode
    
    /**
      * How the elements are placed in the container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction).
      */
    var direction: js.UndefOr[row | column] = js.undefined
    
    /**
      * Whether the elements take up all the space of their container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The space between both rows and columns. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/gap).
      */
    var gap: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ] = js.undefined
    
    /**
      * Whether or not to inline the elements.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The distribution of space around items along the main axis. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content).
      */
    var justifyContent: js.UndefOr[
        start | end | center | left | right | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ] = js.undefined
    
    /**
      * Whether or not to reverse the order of the elements.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Whether flex items are forced onto one line or can wrap onto multiple lines. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap).
      */
    var wrap: js.UndefOr[
        nowrap | typings.orbitUiReactComponents.orbitUiReactComponentsStrings.wrap | `wrap-reverse`
      ] = js.undefined
    
    /**
      * Whether to wrap children in a `div` element.
      */
    var wrapChildren: js.UndefOr[Boolean] = js.undefined
  }
  object InnerFlexProps {
    
    inline def apply(): InnerFlexProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerFlexProps]
    }
    
    extension [Self <: InnerFlexProps](x: Self) {
      
      inline def setAlignContent(
        value: start | end | center | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(
        value: start | end | center | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: row | column): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
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
      
      inline def setJustifyContent(
        value: start | end | center | left | right | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrap(value: nowrap | wrap | `wrap-reverse`): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapChildren(value: Boolean): Self = StObject.set(x, "wrapChildren", value.asInstanceOf[js.Any])
      
      inline def setWrapChildrenUndefined: Self = StObject.set(x, "wrapChildren", js.undefined)
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
