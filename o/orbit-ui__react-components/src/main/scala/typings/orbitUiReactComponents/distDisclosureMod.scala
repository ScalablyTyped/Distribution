package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distDisclosureSrcDisclosureArrowMod.InnerDisclosureArrowProps
import typings.orbitUiReactComponents.distDisclosureSrcDisclosureContextMod.DisclosureContextType
import typings.orbitUiReactComponents.distDisclosureSrcDisclosureMod.InnerDisclosureProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisclosureMod {
  
  @JSImport("@orbit-ui/react-components/dist/disclosure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure", "Disclosure")
  @js.native
  val Disclosure: OrbitComponent[HTMLElement, InnerDisclosureProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure", "DisclosureArrow")
  @js.native
  val DisclosureArrow: OrbitComponent[HTMLElement, InnerDisclosureArrowProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure", "DisclosureContext")
  @js.native
  val DisclosureContext: Context[DisclosureContextType] = js.native
  
  inline def InnerDisclosure(hasIdOpenDefaultOpenOnOpenChangeAsChildrenForwardedRefRest: InnerDisclosureProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDisclosure")(hasIdOpenDefaultOpenOnOpenChangeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDisclosureArrow(hasOpenForwardedRefRest: InnerDisclosureArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDisclosureArrow")(hasOpenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useDisclosureContext(): DisclosureContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisclosureContext")().asInstanceOf[DisclosureContextType]
}
