package typings.preact.mod

import typings.std.DocumentFragment
import typings.std.Document_
import typings.std.Element
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "hydrate")
@js.native
object hydrate extends js.Object {
  def apply(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def apply(vnode: ComponentChild, parent: Document_): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
}

