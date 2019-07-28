package typings.paper.paperMod

import typings.paper.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.paper.paperNs.MouseEvent {
  def this(
    `type`: String,
    event: NativeMouseEvent,
    point: typings.paper.paperNs.Point,
    target: typings.paper.paperNs.Item,
    delta: typings.paper.paperNs.Point
  ) = this()
}

