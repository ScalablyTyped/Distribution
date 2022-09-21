package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import typings.pixiSpineBase.mod.StringSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple container for a list of timelines and a name.
  * @public
  * */
@JSImport("@pixi-spine/runtime-4.1", "Animation")
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
  
  /* CompleteClass */
  var duration: Double = js.native
  
  /* CompleteClass */
  override def hasTimeline(ids: js.Array[String]): Boolean = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def setTimelines(timelines: js.Array[Timeline]): Unit = js.native
  
  /* CompleteClass */
  var timelineIds: StringSet = js.native
  
  /* CompleteClass */
  var timelines: js.Array[Timeline] = js.native
}
