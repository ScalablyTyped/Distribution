package typings.preact.preactMod

import typings.preact.preactMod.Global.JSXNs.Element
import typings.preact.preactMod.Global.JSXNs.HTMLAttributes
import typings.preact.preactMod.Global.JSXNs.SVGAttributes
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Record
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cloneElement(element: Element, props: js.Any, children: ComponentChildren*): Element = js.native
  def h(node: String, children: ComponentChildren*): VNode[_] = js.native
  def h(
    node: String,
    params: HTMLAttributes with SVGAttributes with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def h[P](node: ComponentFactory[P], children: ComponentChildren*): VNode[_] = js.native
  def h[P](node: ComponentFactory[P], params: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  def render(node: ComponentChild, parent: Document): typings.std.Element = js.native
  def render(node: ComponentChild, parent: DocumentFragment): typings.std.Element = js.native
  def render(node: ComponentChild, parent: DocumentFragment, mergeWith: typings.std.Element): typings.std.Element = js.native
  def render(node: ComponentChild, parent: Document, mergeWith: typings.std.Element): typings.std.Element = js.native
  def render(node: ComponentChild, parent: typings.std.Element): typings.std.Element = js.native
  def render(node: ComponentChild, parent: typings.std.Element, mergeWith: typings.std.Element): typings.std.Element = js.native
  def render(node: ComponentChild, parent: ShadowRoot): typings.std.Element = js.native
  def render(node: ComponentChild, parent: ShadowRoot, mergeWith: typings.std.Element): typings.std.Element = js.native
  def rerender(): Unit = js.native
}

