package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distPlaceholdersSrcContentMod.InnerContentProps
import typings.orbitUiReactComponents.distPlaceholdersSrcFooterMod.InnerFooterProps
import typings.orbitUiReactComponents.distPlaceholdersSrcHeaderMod.InnerHeaderProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlaceholdersMod {
  
  @JSImport("@orbit-ui/react-components/dist/placeholders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/placeholders", "Content")
  @js.native
  val Content: OrbitComponent[HTMLElement, InnerContentProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/placeholders", "Footer")
  @js.native
  val Footer: OrbitComponent[HTMLElement, InnerFooterProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/placeholders", "Header")
  @js.native
  val Header: OrbitComponent[HTMLElement, InnerHeaderProps] = js.native
  
  inline def InnerContent(param0: InnerContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerContent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerFooter(param0: InnerFooterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFooter")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerHeader(param0: InnerHeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHeader")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
