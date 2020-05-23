package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeKeeper extends js.Object {
  var delta: Double
  var frameCount: js.Any
  var frameTime: js.Any
  var framesPerSecond: Double
  var lastTime: js.Any
  var maxDelta: Double
  var totalTime: Double
  def update(): Unit
}

object TimeKeeper {
  @scala.inline
  def apply(
    delta: Double,
    frameCount: js.Any,
    frameTime: js.Any,
    framesPerSecond: Double,
    lastTime: js.Any,
    maxDelta: Double,
    totalTime: Double,
    update: () => Unit
  ): TimeKeeper = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], frameTime = frameTime.asInstanceOf[js.Any], framesPerSecond = framesPerSecond.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], maxDelta = maxDelta.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TimeKeeper]
  }
}

