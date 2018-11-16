package typings
package plottableLib.buildSrcUtilsBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/bucket", "Bucket")
@js.native
class Bucket protected () extends js.Object {
  def this(index: scala.Double, xValue: scala.Double, yValue: scala.Double) = this()
  var bucketValue: js.Any = js.native
  var entryIndex: js.Any = js.native
  var exitIndex: js.Any = js.native
  var maxIndex: js.Any = js.native
  var maxValue: js.Any = js.native
  var minIndex: js.Any = js.native
  var minValue: js.Any = js.native
  def addToBucket(value: scala.Double, index: scala.Double): scala.Unit = js.native
  def getUniqueIndices(): js.Array[scala.Double] = js.native
  def isInBucket(value: scala.Double): scala.Boolean = js.native
}

