package typings.mirrorx.mod

import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.FunctionComponentElement
import typings.react.mod.ReactElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  def apply(element: js.Array[CElement[Any, Component[Any, ComponentState, Any]]]): Component[Any, ComponentState, Any] = js.native
  def apply(
    element: js.Array[CElement[Any, Component[Any, ComponentState, Any]]],
    container: Null,
    callback: js.Function0[Unit]
  ): Component[Any, ComponentState, Any] = js.native
  def apply(element: js.Array[CElement[Any, Component[Any, ComponentState, Any]]], container: Element): Component[Any, ComponentState, Any] = js.native
  def apply(
    element: js.Array[CElement[Any, Component[Any, ComponentState, Any]]],
    container: Element,
    callback: js.Function0[Unit]
  ): Component[Any, ComponentState, Any] = js.native
  def apply(element: FunctionComponentElement[Any]): Unit = js.native
  def apply(element: FunctionComponentElement[Any], container: Null, callback: js.Function0[Unit]): Unit = js.native
  def apply(element: FunctionComponentElement[Any], container: Element): Unit = js.native
  def apply(element: FunctionComponentElement[Any], container: Element, callback: js.Function0[Unit]): Unit = js.native
  def apply(
    parentComponent: js.Array[Component[Any, js.Object, Any]],
    element: FunctionComponentElement[Any],
    container: Element
  ): Unit = js.native
  def apply(
    parentComponent: js.Array[Component[Any, js.Object, Any]],
    element: FunctionComponentElement[Any],
    container: Element,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply(
    parentComponent: Component[Any, js.Object, Any],
    element: FunctionComponentElement[Any],
    container: Element
  ): Unit = js.native
  def apply(
    parentComponent: Component[Any, js.Object, Any],
    element: FunctionComponentElement[Any],
    container: Element,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element, callback: js.Function0[Unit]): T = js.native
  def apply[P](element: ReactElement): (Component[P, ComponentState, Any]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): (Component[P, ComponentState, Any]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Element): (Component[P, ComponentState, Any]) | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Element, callback: js.Function0[Unit]): (Component[P, ComponentState, Any]) | Element | Unit = js.native
  def apply[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T]): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], container: Element): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], container: Element, callback: js.Function0[Unit]): T = js.native
}
