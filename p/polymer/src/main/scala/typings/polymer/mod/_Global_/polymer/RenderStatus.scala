package typings.polymer.mod._Global_.polymer

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderStatus extends js.Object {
  def afterNextRender(element: Element, fn: js.Function): Unit = js.native
  def afterNextRender(element: Element, fn: js.Function, args: js.Any): Unit = js.native
  def hasRendered(): Boolean = js.native
  def whenReady(cb: js.Function): Unit = js.native
}

