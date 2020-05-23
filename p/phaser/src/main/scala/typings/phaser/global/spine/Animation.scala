package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Animation")
@js.native
class Animation protected ()
  extends typings.phaser.spine.Animation {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
  /* CompleteClass */
  override var duration: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var timelineIds: js.Array[Boolean] = js.native
  /* CompleteClass */
  override var timelines: js.Array[Timeline] = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.phaser.spine.Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[typings.phaser.spine.Event],
    alpha: Double,
    blend: typings.phaser.spine.MixBlend,
    direction: typings.phaser.spine.MixDirection
  ): Unit = js.native
  /* CompleteClass */
  override def hasTimeline(id: Double): Boolean = js.native
}

/* static members */
@JSGlobal("spine.Animation")
@js.native
object Animation extends js.Object {
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}

