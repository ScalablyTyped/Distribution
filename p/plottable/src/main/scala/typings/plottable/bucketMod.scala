package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/bucket", JSImport.Namespace)
@js.native
object bucketMod extends js.Object {
  @js.native
  class Bucket protected () extends js.Object {
    def this(index: Double, xValue: Double, yValue: Double) = this()
    var bucketValue: js.Any = js.native
    var entryIndex: js.Any = js.native
    var exitIndex: js.Any = js.native
    var maxIndex: js.Any = js.native
    var maxValue: js.Any = js.native
    var minIndex: js.Any = js.native
    var minValue: js.Any = js.native
    def addToBucket(value: Double, index: Double): Unit = js.native
    def getUniqueIndices(): js.Array[Double] = js.native
    def isInBucket(value: Double): Boolean = js.native
  }
  
}

