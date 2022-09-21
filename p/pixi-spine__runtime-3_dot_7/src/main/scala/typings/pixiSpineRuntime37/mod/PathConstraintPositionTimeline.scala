package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "PathConstraintPositionTimeline")
@js.native
open class PathConstraintPositionTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  var frames: ArrayLike2[Double] = js.native
  
  var pathConstraintIndex: Double = js.native
  
  /** Sets the time and value of the specified keyframe. */
  def setFrame(frameIndex: Double, time: Double, value: Double): Unit = js.native
}
/* static members */
object PathConstraintPositionTimeline {
  
  @JSImport("@pixi-spine/runtime-3.7", "PathConstraintPositionTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "PathConstraintPositionTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "PathConstraintPositionTimeline.PREV_TIME")
  @js.native
  def PREV_TIME: Double = js.native
  inline def PREV_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "PathConstraintPositionTimeline.PREV_VALUE")
  @js.native
  def PREV_VALUE: Double = js.native
  inline def PREV_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREV_VALUE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "PathConstraintPositionTimeline.VALUE")
  @js.native
  def VALUE: Double = js.native
  inline def VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE")(x.asInstanceOf[js.Any])
}
