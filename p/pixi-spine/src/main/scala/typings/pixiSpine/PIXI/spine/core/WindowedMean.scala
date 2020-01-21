package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.WindowedMean")
@js.native
class WindowedMean () extends js.Object {
  def this(windowSize: Double) = this()
  var addedValues: Double = js.native
  var dirty: Boolean = js.native
  var lastValue: Double = js.native
  var mean: Double = js.native
  var values: js.Array[Double] = js.native
  def addValue(value: Double): Unit = js.native
  def getMean(): Double = js.native
  def hasEnoughData(): Boolean = js.native
}

