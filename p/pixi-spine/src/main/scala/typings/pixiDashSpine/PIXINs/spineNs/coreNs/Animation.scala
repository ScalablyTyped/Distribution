package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Animation")
@js.native
class Animation protected () extends js.Object {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
  var duration: Double = js.native
  var name: String = js.native
  var timelines: js.Array[Timeline] = js.native
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Animation")
@js.native
object Animation extends js.Object {
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}

