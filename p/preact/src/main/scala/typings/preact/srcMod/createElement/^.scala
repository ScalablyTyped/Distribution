package typings.preact.srcMod.createElement

import typings.preact.srcJsxMod.JSXInternal.HTMLAttributes
import typings.preact.srcJsxMod.JSXInternal.SVGAttributes
import typings.preact.srcMod.Attributes
import typings.preact.srcMod.ComponentChildren
import typings.preact.srcMod.ComponentType
import typings.preact.srcMod.VNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/src", "createElement")
@js.native
object ^ extends js.Object {
  def apply(`type`: String, children: ComponentChildren*): VNode[_] = js.native
  //
  // Preact createElement
  // -----------------------------------
  def apply(
    `type`: String,
    props: HTMLAttributes with SVGAttributes with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
}

