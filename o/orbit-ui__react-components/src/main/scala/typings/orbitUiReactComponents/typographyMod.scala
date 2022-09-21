package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OmitInnerHeadingPropssize
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.headingMod.InnerHeadingProps
import typings.orbitUiReactComponents.paragraphMod.InnerParagraphProps
import typings.orbitUiReactComponents.textMod.InnerTextProps
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyMod {
  
  @JSImport("@orbit-ui/react-components/dist/typography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H1")
  @js.native
  val H1: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H2")
  @js.native
  val H2: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H3")
  @js.native
  val H3: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H4")
  @js.native
  val H4: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H5")
  @js.native
  val H5: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H6")
  @js.native
  val H6: OrbitComponent[ElementType[Any], OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "Heading")
  @js.native
  val Heading: OrbitComponent[HTMLElement, InnerHeadingProps] = js.native
  
  inline def InnerHeading(props: InnerHeadingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHeading")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerParagraph(props: InnerParagraphProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerParagraph")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerText(props: InnerTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/typography", "P")
  @js.native
  val P: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "Paragraph")
  @js.native
  val Paragraph: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "Text")
  @js.native
  val Text: OrbitComponent[HTMLElement, InnerTextProps] = js.native
}
