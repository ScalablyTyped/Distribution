package typings.polymerDashTs.polymer

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dom extends js.Object {
  def apply(node: Base): HTMLElement = js.native
  def apply(node: HTMLElement): HTMLElement = js.native
  def flush(): js.Any = js.native
}

