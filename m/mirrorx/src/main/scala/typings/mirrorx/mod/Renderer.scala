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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  def apply(element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]]): Component[js.Any, ComponentState, js.Any] = js.native
  def apply(
    element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]],
    container: Null,
    callback: js.Function0[Unit]
  ): Component[js.Any, ComponentState, js.Any] = js.native
  def apply(element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]], container: Element): Component[js.Any, ComponentState, js.Any] = js.native
  def apply(
    element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]],
    container: Element,
    callback: js.Function0[Unit]
  ): Component[js.Any, ComponentState, js.Any] = js.native
  def apply(element: SFCElement[js.Any]): Unit = js.native
  def apply(element: SFCElement[js.Any], container: Null, callback: js.Function0[Unit]): Unit = js.native
  def apply(element: SFCElement[js.Any], container: Element): Unit = js.native
  def apply(element: SFCElement[js.Any], container: Element, callback: js.Function0[Unit]): Unit = js.native
  def apply(
    parentComponent: js.Array[Component[js.Any, js.Object, js.Any]],
    element: SFCElement[js.Any],
    container: Element
  ): Unit = js.native
  def apply(
    parentComponent: js.Array[Component[js.Any, js.Object, js.Any]],
    element: SFCElement[js.Any],
    container: Element,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply(
    parentComponent: Component[js.Any, js.Object, js.Any],
    element: SFCElement[js.Any],
    container: Element
  ): Unit = js.native
  def apply(
    parentComponent: Component[js.Any, js.Object, js.Any],
    element: SFCElement[js.Any],
    container: Element,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element, callback: js.Function0[Unit]): T = js.native
  def apply[P](element: ReactElement): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Element): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Element, callback: js.Function0[Unit]): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
  def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T]): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T], container: Element): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T], container: Element, callback: js.Function0[Unit]): T = js.native
}
