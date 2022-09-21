package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.accordionContextMod.AccordionContextType
import typings.orbitUiReactComponents.accordionHeaderMod.InnerAccordionHeaderProps
import typings.orbitUiReactComponents.accordionPanelMod.InnerAccordionPanelProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcAccordionMod.InnerAccordionProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("@orbit-ui/react-components/dist/accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion", "Accordion")
  @js.native
  val Accordion: OrbitComponent[HTMLElement, InnerAccordionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion", "AccordionContext")
  @js.native
  val AccordionContext: Context[AccordionContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion", "AccordionHeader")
  @js.native
  val AccordionHeader: OrbitComponent[HTMLElement, InnerAccordionHeaderProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion", "AccordionPanel")
  @js.native
  val AccordionPanel: OrbitComponent[HTMLElement, InnerAccordionPanelProps] = js.native
  
  inline def InnerAccordion(
    hasIdExpandedKeysPropDefaultExpandedKeysOnExpansionChangeExpansionModeAutoFocusVariantAsChildrenForwardedRefRest: InnerAccordionProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordion")(hasIdExpandedKeysPropDefaultExpandedKeysOnExpansionChangeExpansionModeAutoFocusVariantAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAccordionHeader(props: InnerAccordionHeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAccordionPanel(props: InnerAccordionPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useAccordionContext(): AccordionContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccordionContext")().asInstanceOf[AccordionContextType]
}
