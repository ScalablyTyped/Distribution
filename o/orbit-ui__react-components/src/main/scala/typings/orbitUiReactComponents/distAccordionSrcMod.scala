package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distAccordionSrcAccordionContextMod.AccordionContextType
import typings.orbitUiReactComponents.distAccordionSrcAccordionHeaderMod.InnerAccordionHeaderProps
import typings.orbitUiReactComponents.distAccordionSrcAccordionMod.InnerAccordionProps
import typings.orbitUiReactComponents.distAccordionSrcAccordionPanelMod.InnerAccordionPanelProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccordionSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src", "Accordion")
  @js.native
  val Accordion: OrbitComponent[HTMLElement, InnerAccordionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src", "AccordionContext")
  @js.native
  val AccordionContext: Context[AccordionContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src", "AccordionHeader")
  @js.native
  val AccordionHeader: OrbitComponent[HTMLElement, InnerAccordionHeaderProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src", "AccordionPanel")
  @js.native
  val AccordionPanel: OrbitComponent[HTMLElement, InnerAccordionPanelProps] = js.native
  
  inline def InnerAccordion(param0: InnerAccordionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordion")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAccordionHeader(props: InnerAccordionHeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAccordionPanel(props: InnerAccordionPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useAccordionContext(): AccordionContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccordionContext")().asInstanceOf[AccordionContextType]
}
