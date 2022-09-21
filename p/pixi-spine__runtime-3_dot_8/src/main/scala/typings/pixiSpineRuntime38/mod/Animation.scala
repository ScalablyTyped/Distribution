package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.ArrayLike2
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A simple container for a list of timelines and a name. */
/**
  * @public
  */
@JSImport("@pixi-spine/runtime-3.8", "Animation")
@js.native
open class Animation protected ()
  extends StObject
     with Animation2 {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
  
  /** Applies all the animation's timelines to the specified skeleton.
    *
    * See Timeline {@link Timeline#apply(Skeleton, float, float, Array, float, MixBlend, MixDirection)}.
    * @param loop If true, the animation repeats after {@link #getDuration()}.
    * @param events May be null to ignore fired events. */
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  
  /** The duration of the animation in seconds, which is the highest time of all keys in the timeline. */
  /* CompleteClass */
  var duration: Double = js.native
  
  /* CompleteClass */
  override def hasTimeline(id: Double): Boolean = js.native
  
  /** The animation's name, which is unique across all animations in the skeleton. */
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var timelineIds: js.Array[Boolean] = js.native
  
  /* CompleteClass */
  var timelines: js.Array[Timeline] = js.native
}
object Animation {
  
  @JSImport("@pixi-spine/runtime-3.8", "Animation")
  @js.native
  val ^ : js.Any = js.native
  
  /** @param target After the first and before the last value.
    * @returns index of first value greater than the target. */
  /* static member */
  inline def binarySearch(values: ArrayLike2[Double], target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def binarySearch(values: ArrayLike2[Double], target: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def linearSearch(values: ArrayLike2[Double], target: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearSearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
}
