package typings.mirrorx.mod

import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.ReactElement
import typings.react.mod.SFCElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  def apply(element: js.Array[CElement[_, Component[_, ComponentState, _]]]): Component[_, ComponentState, _] = js.native
  def apply(
    element: js.Array[CElement[_, Component[_, ComponentState, _]]],
    container: Null,
    callback: js.Function0[Unit]
  ): Component[_, ComponentState, _] = js.native
  def apply(element: js.Array[CElement[_, Component[_, ComponentState, _]]], container: Element): Component[_, ComponentState, _] = js.native
  def apply(
    element: js.Array[CElement[_, Component[_, ComponentState, _]]],
    container: Element,
    callback: js.Function0[Unit]
  ): Component[_, ComponentState, _] = js.native
  def apply(element: SFCElement[_]): Unit = js.native
  def apply(element: SFCElement[_], container: Null, callback: js.Function0[Unit]): Unit = js.native
  def apply(element: SFCElement[_], container: Element): Unit = js.native
  def apply(element: SFCElement[_], container: Element, callback: js.Function0[Unit]): Unit = js.native
  def apply(parentComponent: js.Array[Component[_, js.Object, _]], element: SFCElement[_], container: Element): Unit = js.native
  def apply(
    parentComponent: js.Array[Component[_, js.Object, _]],
    element: SFCElement[_],
    container: Element,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply(parentComponent: Component[_, js.Object, _], element: SFCElement[_], container: Element): Unit = js.native
  def apply(
    parentComponent: Component[_, js.Object, _],
    element: SFCElement[_],
    container: Element,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element, callback: js.Function0[Unit]): T = js.native
  def apply[P](element: ReactElement): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Element): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Element, callback: js.Function0[Unit]): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T]): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Element): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Element, callback: js.Function0[Unit]): T = js.native
}
