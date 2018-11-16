package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderStatus extends js.Object {
  def afterNextRender(element: stdLib.Element, fn: js.Function): scala.Unit = js.native
  def afterNextRender(element: stdLib.Element, fn: js.Function, args: js.Any): scala.Unit = js.native
  def hasRendered(): scala.Boolean = js.native
  def whenReady(cb: js.Function): scala.Unit = js.native
}

