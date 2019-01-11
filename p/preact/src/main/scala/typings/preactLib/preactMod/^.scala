package typings
package preactLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var options: preactLib.Anon_DebounceRendering = js.native
  def cloneElement(
    element: preactLib.preactMod.Global.JSXNs.Element,
    props: js.Any,
    children: preactLib.preactMod.preactNs.ComponentChildren*
  ): preactLib.preactMod.Global.JSXNs.Element = js.native
  def h(
    node: java.lang.String,
    params: preactLib.preactMod.Global.JSXNs.HTMLAttributes with preactLib.preactMod.Global.JSXNs.SVGAttributes with ((stdLib.Record[java.lang.String, _]) | scala.Null),
    children: preactLib.preactMod.preactNs.ComponentChildren*
  ): preactLib.preactMod.preactNs.VNode[_] = js.native
  def h[P](
    node: preactLib.preactMod.preactNs.ComponentFactory[P],
    params: preactLib.preactMod.preactNs.Attributes with (P | scala.Null),
    children: preactLib.preactMod.preactNs.ComponentChildren*
  ): preactLib.preactMod.preactNs.VNode[_] = js.native
  def render(node: preactLib.preactMod.preactNs.ComponentChild, parent: stdLib.Document): stdLib.Element = js.native
  def render(node: preactLib.preactMod.preactNs.ComponentChild, parent: stdLib.DocumentFragment): stdLib.Element = js.native
  def render(
    node: preactLib.preactMod.preactNs.ComponentChild,
    parent: stdLib.DocumentFragment,
    mergeWith: stdLib.Element
  ): stdLib.Element = js.native
  def render(
    node: preactLib.preactMod.preactNs.ComponentChild,
    parent: stdLib.Document,
    mergeWith: stdLib.Element
  ): stdLib.Element = js.native
  def render(node: preactLib.preactMod.preactNs.ComponentChild, parent: stdLib.Element): stdLib.Element = js.native
  def render(
    node: preactLib.preactMod.preactNs.ComponentChild,
    parent: stdLib.Element,
    mergeWith: stdLib.Element
  ): stdLib.Element = js.native
  def render(node: preactLib.preactMod.preactNs.ComponentChild, parent: stdLib.ShadowRoot): stdLib.Element = js.native
  def render(
    node: preactLib.preactMod.preactNs.ComponentChild,
    parent: stdLib.ShadowRoot,
    mergeWith: stdLib.Element
  ): stdLib.Element = js.native
  def rerender(): scala.Unit = js.native
}

