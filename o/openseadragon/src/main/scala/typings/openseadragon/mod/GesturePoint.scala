package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GesturePoint extends js.Object {
  var captured: Boolean
  var contactPos: Point
  var contactTime: Double
  var currentPos: Point
  var currentTime: Double
  var direction: Double
  var id: Double
  var insideElement: Boolean
  var insideElementPressed: Boolean
  var isPrimary: Boolean
  var lastPos: Point
  var lastTime: Double
  var speed: Double
  var `type`: String
}

object GesturePoint {
  @scala.inline
  def apply(
    captured: Boolean,
    contactPos: Point,
    contactTime: Double,
    currentPos: Point,
    currentTime: Double,
    direction: Double,
    id: Double,
    insideElement: Boolean,
    insideElementPressed: Boolean,
    isPrimary: Boolean,
    lastPos: Point,
    lastTime: Double,
    speed: Double,
    `type`: String
  ): GesturePoint = {
    val __obj = js.Dynamic.literal(captured = captured.asInstanceOf[js.Any], contactPos = contactPos.asInstanceOf[js.Any], contactTime = contactTime.asInstanceOf[js.Any], currentPos = currentPos.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insideElement = insideElement.asInstanceOf[js.Any], insideElementPressed = insideElementPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], lastPos = lastPos.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GesturePoint]
  }
}

