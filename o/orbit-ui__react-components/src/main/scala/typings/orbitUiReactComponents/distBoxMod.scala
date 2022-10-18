package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distBoxSrcBoxMod.InnerBoxProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBoxMod {
  
  @JSImport("@orbit-ui/react-components/dist/box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/box", "Box")
  @js.native
  val Box: OrbitComponent[HTMLElement, InnerBoxProps] = js.native
  
  inline def InnerBox(props: InnerBoxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerBox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
