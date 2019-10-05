package typings.preact.srcMod

import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/src", "hydrate")
@js.native
object hydrate extends js.Object {
  def apply(vnode: ComponentChild, parent: Document): Unit = js.native
  def apply(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
}

