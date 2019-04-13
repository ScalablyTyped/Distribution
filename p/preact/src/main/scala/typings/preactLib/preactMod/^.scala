package typings
package preactLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cloneElement(element: preactLib.preactMod.Global.JSXNs.Element, props: js.Any, children: ComponentChildren*): preactLib.preactMod.Global.JSXNs.Element = js.native
  def h(
    node: java.lang.String,
    params: preactLib.preactMod.Global.JSXNs.HTMLAttributes with preactLib.preactMod.Global.JSXNs.SVGAttributes with ((stdLib.Record[java.lang.String, _]) | scala.Null),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def h[P](node: ComponentFactory[P], params: Attributes with (P | scala.Null), children: ComponentChildren*): VNode[_] = js.native
  def render(node: ComponentChild, parent: stdLib.Document): stdLib.Element = js.native
  def render(node: ComponentChild, parent: stdLib.DocumentFragment): stdLib.Element = js.native
  def render(node: ComponentChild, parent: stdLib.DocumentFragment, mergeWith: stdLib.Element): stdLib.Element = js.native
  def render(node: ComponentChild, parent: stdLib.Document, mergeWith: stdLib.Element): stdLib.Element = js.native
  def render(node: ComponentChild, parent: stdLib.Element): stdLib.Element = js.native
  def render(node: ComponentChild, parent: stdLib.Element, mergeWith: stdLib.Element): stdLib.Element = js.native
  def render(node: ComponentChild, parent: stdLib.ShadowRoot): stdLib.Element = js.native
  def render(node: ComponentChild, parent: stdLib.ShadowRoot, mergeWith: stdLib.Element): stdLib.Element = js.native
  def rerender(): scala.Unit = js.native
}

