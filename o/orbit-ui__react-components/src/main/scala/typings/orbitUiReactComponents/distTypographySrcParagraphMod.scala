package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypographySrcParagraphMod {
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Paragraph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerParagraph(props: InnerParagraphProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerParagraph")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Paragraph", "P")
  @js.native
  val P: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Paragraph", "Paragraph")
  @js.native
  val Paragraph: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  trait InnerParagraphProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children
      */
    var children: ReactNode
    
    /**
      * A paragraph can inherit it's parent color.
      */
    var color: js.UndefOr[inherit] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * A paragraph can vary in size.
      */
    var size: js.UndefOr[xs | sm | md | lg | xl | `2xl` | inherit] = js.undefined
  }
  object InnerParagraphProps {
    
    inline def apply(): InnerParagraphProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerParagraphProps]
    }
    
    extension [Self <: InnerParagraphProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: inherit): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setSize(value: xs | sm | md | lg | xl | `2xl` | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type ParagraphProps = ComponentProps[OrbitComponent[HTMLElement, InnerParagraphProps]]
}
