package typings.paper.paperMod

import typings.paper.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.paper.paper.MouseEvent {
  def this(
    `type`: String,
    event: NativeMouseEvent,
    point: typings.paper.paper.Point,
    target: typings.paper.paper.Item,
    delta: typings.paper.paper.Point
  ) = this()
}

