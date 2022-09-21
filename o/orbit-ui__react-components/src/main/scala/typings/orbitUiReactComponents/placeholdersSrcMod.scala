package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.contentMod.InnerContentProps
import typings.orbitUiReactComponents.footerMod.InnerFooterProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.headerMod.InnerHeaderProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholdersSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/placeholders/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/placeholders/src", "Content")
  @js.native
  val Content: OrbitComponent[HTMLElement, InnerContentProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/placeholders/src", "Footer")
  @js.native
  val Footer: OrbitComponent[HTMLElement, InnerFooterProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/placeholders/src", "Header")
  @js.native
  val Header: OrbitComponent[HTMLElement, InnerHeaderProps] = js.native
  
  inline def InnerContent(hasAsChildrenForwardedRefRest: InnerContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerContent")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerFooter(hasAsChildrenForwardedRefRest: InnerFooterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFooter")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerHeader(hasAsChildrenForwardedRefRest: InnerHeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHeader")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
