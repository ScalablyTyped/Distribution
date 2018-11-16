package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Utils")
@js.native
class Utils () extends js.Object

@JSGlobal("PIXI.spine.core.Utils")
@js.native
object Utils extends js.Object {
  var SUPPORTS_TYPED_ARRAYS: scala.Boolean = js.native
  def arrayCopy[T](
    source: pixiDashSpineLib.PIXINs.spineNs.coreNs.ArrayLike[T],
    sourceStart: scala.Double,
    dest: pixiDashSpineLib.PIXINs.spineNs.coreNs.ArrayLike[T],
    destStart: scala.Double,
    numElements: scala.Double
  ): scala.Unit = js.native
  def ensureArrayCapacity[T](array: js.Array[T], size: scala.Double): js.Array[T] = js.native
  def ensureArrayCapacity[T](array: js.Array[T], size: scala.Double, value: js.Any): js.Array[T] = js.native
  def newArray[T](size: scala.Double, defaultValue: T): js.Array[T] = js.native
  def newFloatArray(size: scala.Double): pixiDashSpineLib.PIXINs.spineNs.coreNs.ArrayLike[scala.Double] = js.native
  def newShortArray(size: scala.Double): pixiDashSpineLib.PIXINs.spineNs.coreNs.ArrayLike[scala.Double] = js.native
  def setArraySize[T](array: js.Array[T], size: scala.Double): js.Array[T] = js.native
  def setArraySize[T](array: js.Array[T], size: scala.Double, value: js.Any): js.Array[T] = js.native
  def toFloatArray(array: js.Array[scala.Double]): js.Array[scala.Double] | stdLib.Float32Array = js.native
  def toSinglePrecision(value: scala.Double): scala.Double = js.native
  def webkit602BugfixHelper(alpha: scala.Double, pose: pixiDashSpineLib.PIXINs.spineNs.coreNs.MixPose): scala.Unit = js.native
}

