package typings.preact.srcMod

import typings.preact.srcJsxMod.JSXInternalNs.Element
import typings.preact.srcJsxMod.JSXInternalNs.HTMLAttributes
import typings.preact.srcJsxMod.JSXInternalNs.SVGAttributes
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Record
import typings.std.ShadowRoot
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  //
  // Preact Built-in Components
  // -----------------------------------
  // TODO: Revisit what the public type of this is...
  val Fragment: ComponentClass[js.Object, js.Object] = js.native
  val options: Options = js.native
  def cloneElement(vnode: Element): Element = js.native
  def cloneElement(vnode: Element, props: js.Any, children: ComponentChildren*): Element = js.native
  def createContext[T](defaultValue: T): Context[T] = js.native
  def createElement(`type`: String, children: ComponentChildren*): VNode[_] = js.native
  //
  // Preact createElement
  // -----------------------------------
  def createElement(
    `type`: String,
    props: HTMLAttributes with SVGAttributes with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def createElement[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
  def createElement[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  //
  // Preact helpers
  // -----------------------------------
  def createRef[T](): RefObject[T] = js.native
  def h(`type`: String, children: ComponentChildren*): VNode[_] = js.native
  def h(
    `type`: String,
    props: HTMLAttributes with SVGAttributes with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def h[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
  def h[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  def hydrate(vnode: ComponentChild, parent: Document): Unit = js.native
  def hydrate(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def hydrate(vnode: ComponentChild, parent: typings.std.Element): Unit = js.native
  def hydrate(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
  def isValidElement(vnode: js.Any): /* is preact.preact/src.VNode<{}> */ Boolean = js.native
  def render(vnode: ComponentChild, parent: Document): Unit = js.native
  def render(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def render(vnode: ComponentChild, parent: DocumentFragment, replaceNode: typings.std.Element): Unit = js.native
  def render(vnode: ComponentChild, parent: DocumentFragment, replaceNode: Text): Unit = js.native
  def render(vnode: ComponentChild, parent: Document, replaceNode: typings.std.Element): Unit = js.native
  def render(vnode: ComponentChild, parent: Document, replaceNode: Text): Unit = js.native
  //
  // Preact render
  // -----------------------------------
  def render(vnode: ComponentChild, parent: typings.std.Element): Unit = js.native
  def render(vnode: ComponentChild, parent: typings.std.Element, replaceNode: typings.std.Element): Unit = js.native
  def render(vnode: ComponentChild, parent: typings.std.Element, replaceNode: Text): Unit = js.native
  def render(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
  def render(vnode: ComponentChild, parent: ShadowRoot, replaceNode: typings.std.Element): Unit = js.native
  def render(vnode: ComponentChild, parent: ShadowRoot, replaceNode: Text): Unit = js.native
  def toChildArray(children: ComponentChildren): js.Array[VNode[js.Object] | Null] = js.native
}

