package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OmitInnerHeadingPropssize
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
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

object distTypographySrcHeadingMod {
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Heading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Heading", "H1")
  @js.native
  val H1: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Heading", "H2")
  @js.native
  val H2: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Heading", "H3")
  @js.native
  val H3: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Heading", "H4")
  @js.native
  val H4: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Heading", "H5")
  @js.native
  val H5: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Heading", "H6")
  @js.native
  val H6: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src/Heading", "Heading")
  @js.native
  val Heading: OrbitComponent[HTMLElement, InnerHeadingProps] = js.native
  
  inline def InnerHeading(props: InnerHeadingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHeading")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type HeadingProps = ComponentProps[OrbitComponent[HTMLElement, InnerHeadingProps]]
  
  trait InnerHeadingProps extends StObject {
    
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
      * A heading can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl] = js.undefined
  }
  object InnerHeadingProps {
    
    inline def apply(): InnerHeadingProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerHeadingProps]
    }
    
    extension [Self <: InnerHeadingProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
