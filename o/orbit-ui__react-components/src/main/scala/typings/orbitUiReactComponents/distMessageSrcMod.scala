package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distMessageSrcMessageMod.InnerMessageProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessageSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/message/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMessage(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest: InnerMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMessage")(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/message/src", "Message")
  @js.native
  val Message: OrbitComponent[HTMLElement, InnerMessageProps] = js.native
}
