package typings.preact.preactMod.h

import typings.preact.preactMod.Attributes
import typings.preact.preactMod.ComponentChildren
import typings.preact.preactMod.ComponentType
import typings.preact.preactMod.VNode
import typings.preact.srcJsxMod.JSXInternal.HTMLAttributes
import typings.preact.srcJsxMod.JSXInternal.SVGAttributes
import typings.std.EventTarget
import typings.std.Record
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "h")
@js.native
object ^ extends js.Object {
  def apply(`type`: String, children: ComponentChildren*): VNode[_] = js.native
  def apply(
    `type`: String,
    props: HTMLAttributes[EventTarget] with SVGAttributes[SVGElement] with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
}

