package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distMessageSrcMessageMod.InnerMessageProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessageMod {
  
  @JSImport("@orbit-ui/react-components/dist/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMessage(param0: InnerMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMessage")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/message", "Message")
  @js.native
  val Message: OrbitComponent[HTMLElement, InnerMessageProps] = js.native
}
