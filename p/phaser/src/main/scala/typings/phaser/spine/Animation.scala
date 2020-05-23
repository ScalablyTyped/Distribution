package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var duration: Double
  var name: String
  var timelineIds: js.Array[Boolean]
  var timelines: js.Array[Timeline]
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
  ): Unit
  def hasTimeline(id: Double): Boolean
}

object Animation {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, Boolean, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    duration: Double,
    hasTimeline: Double => Boolean,
    name: String,
    timelineIds: js.Array[Boolean],
    timelines: js.Array[Timeline]
  ): Animation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction8(apply), duration = duration.asInstanceOf[js.Any], hasTimeline = js.Any.fromFunction1(hasTimeline), name = name.asInstanceOf[js.Any], timelineIds = timelineIds.asInstanceOf[js.Any], timelines = timelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

