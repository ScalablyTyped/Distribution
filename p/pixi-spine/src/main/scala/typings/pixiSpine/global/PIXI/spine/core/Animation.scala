package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import typings.pixiSpine.PIXI.spine.core.Timeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Animation")
@js.native
class Animation protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.Animation {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
  
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
  var duration: Double = js.native
  
  /* CompleteClass */
  override def hasTimeline(id: Double): Boolean = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var timelineIds: js.Array[Boolean] = js.native
  
  /* CompleteClass */
  var timelines: js.Array[Timeline] = js.native
}
object Animation {
  
  @JSGlobal("PIXI.spine.core.Animation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def binarySearch(values: ArrayLike[Double], target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearSearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
}
