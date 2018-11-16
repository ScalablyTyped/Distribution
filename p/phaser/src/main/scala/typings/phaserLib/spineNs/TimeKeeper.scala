package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TimeKeeper")
@js.native
class TimeKeeper () extends js.Object {
  var delta: scala.Double = js.native
  var frameCount: js.Any = js.native
  var frameTime: js.Any = js.native
  var framesPerSecond: scala.Double = js.native
  var lastTime: js.Any = js.native
  var maxDelta: scala.Double = js.native
  var totalTime: scala.Double = js.native
  def update(): scala.Unit = js.native
}

