package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowedMean extends js.Object {
  var addedValues: Double
  var dirty: Boolean
  var lastValue: Double
  var mean: Double
  var values: js.Array[Double]
  def addValue(value: Double): Unit
  def getMean(): Double
  def hasEnoughData(): Boolean
}

object WindowedMean {
  @scala.inline
  def apply(
    addValue: Double => Unit,
    addedValues: Double,
    dirty: Boolean,
    getMean: () => Double,
    hasEnoughData: () => Boolean,
    lastValue: Double,
    mean: Double,
    values: js.Array[Double]
  ): WindowedMean = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction1(addValue), addedValues = addedValues.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], getMean = js.Any.fromFunction0(getMean), hasEnoughData = js.Any.fromFunction0(hasEnoughData), lastValue = lastValue.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowedMean]
  }
}

