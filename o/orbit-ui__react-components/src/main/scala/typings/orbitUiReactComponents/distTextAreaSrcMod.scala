package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distTextAreaSrcTextAreaMod.InnerTextAreaProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextAreaSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/text-area/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTextArea(props: InnerTextAreaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextArea")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/text-area/src", "TextArea")
  @js.native
  val TextArea: OrbitComponent[HTMLElement, InnerTextAreaProps] = js.native
}
