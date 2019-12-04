package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TimeKeeper")
@js.native
class TimeKeeper () extends js.Object {
  var delta: Double = js.native
  var frameCount: js.Any = js.native
  var frameTime: js.Any = js.native
  var framesPerSecond: Double = js.native
  var lastTime: js.Any = js.native
  var maxDelta: Double = js.native
  var totalTime: Double = js.native
  def update(): Unit = js.native
}

