package typings.mithril

import typings.mithril.mithrilMod.ComponentTypes
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Component extends js.Object {
  def apply(element: Element): Unit = js.native
  def apply(element: Element, component: ComponentTypes[_, _]): Unit = js.native
}

