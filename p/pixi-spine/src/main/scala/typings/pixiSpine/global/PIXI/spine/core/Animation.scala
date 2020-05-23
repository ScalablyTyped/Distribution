package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import typings.pixiSpine.PIXI.spine.core.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Animation")
@js.native
class Animation protected ()
  extends typings.pixiSpine.PIXI.spine.core.Animation {
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
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[typings.pixiSpine.PIXI.spine.core.Event],
    alpha: Double,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend,
    direction: typings.pixiSpine.PIXI.spine.core.MixDirection
  ): Unit = js.native
  /* CompleteClass */
  override def hasTimeline(id: Double): Boolean = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Animation")
@js.native
object Animation extends js.Object {
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}

