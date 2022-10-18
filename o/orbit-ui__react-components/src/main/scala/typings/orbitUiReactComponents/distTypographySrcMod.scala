package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OmitInnerHeadingPropssize
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distTypographySrcHeadingMod.InnerHeadingProps
import typings.orbitUiReactComponents.distTypographySrcParagraphMod.InnerParagraphProps
import typings.orbitUiReactComponents.distTypographySrcTextMod.InnerTextProps
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypographySrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "H1")
  @js.native
  val H1: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "H2")
  @js.native
  val H2: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "H3")
  @js.native
  val H3: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "H4")
  @js.native
  val H4: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "H5")
  @js.native
  val H5: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "H6")
  @js.native
  val H6: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "Heading")
  @js.native
  val Heading: OrbitComponent[HTMLElement, InnerHeadingProps] = js.native
  
  inline def InnerHeading(props: InnerHeadingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHeading")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerParagraph(props: InnerParagraphProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerParagraph")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerText(props: InnerTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "P")
  @js.native
  val P: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "Paragraph")
  @js.native
  val Paragraph: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography/src", "Text")
  @js.native
  val Text: OrbitComponent[HTMLElement, InnerTextProps] = js.native
}
