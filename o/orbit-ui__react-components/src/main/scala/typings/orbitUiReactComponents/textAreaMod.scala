package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcTextAreaMod.InnerTextAreaProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaMod {
  
  @JSImport("@orbit-ui/react-components/dist/text-area", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTextArea(props: InnerTextAreaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextArea")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/text-area", "TextArea")
  @js.native
  val TextArea: OrbitComponent[HTMLElement, InnerTextAreaProps] = js.native
}
