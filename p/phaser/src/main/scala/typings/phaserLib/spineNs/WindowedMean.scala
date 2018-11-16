package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.WindowedMean")
@js.native
class WindowedMean () extends js.Object {
  def this(windowSize: scala.Double) = this()
  var addedValues: scala.Double = js.native
  var dirty: scala.Boolean = js.native
  var lastValue: scala.Double = js.native
  var mean: scala.Double = js.native
  var values: js.Array[scala.Double] = js.native
  def addValue(value: scala.Double): scala.Unit = js.native
  def getMean(): scala.Double = js.native
  def hasEnoughData(): scala.Boolean = js.native
}

