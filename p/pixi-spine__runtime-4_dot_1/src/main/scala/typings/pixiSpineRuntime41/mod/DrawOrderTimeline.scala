package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "DrawOrderTimeline")
@js.native
open class DrawOrderTimeline protected () extends Timeline {
  def this(frameCount: Double) = this()
  
  /** The draw order for each key frame. See {@link #setFrame(int, float, int[])}. */
  var drawOrders: js.Array[js.Array[Double] | Null] = js.native
  
  /** Sets the time in seconds and the draw order for the specified key frame.
    * @param drawOrder For each slot in {@link Skeleton#slots}, the index of the new draw order. May be null to use setup pose
    *           draw order. */
  def setFrame(frame: Double, time: Double): Unit = js.native
  def setFrame(frame: Double, time: Double, drawOrder: js.Array[Double]): Unit = js.native
}
/* static members */
object DrawOrderTimeline {
  
  @JSImport("@pixi-spine/runtime-4.1", "DrawOrderTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "DrawOrderTimeline.propertyIds")
  @js.native
  def propertyIds: js.Array[String] = js.native
  inline def propertyIds_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyIds")(x.asInstanceOf[js.Any])
}
