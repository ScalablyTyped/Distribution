package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "EventTimeline")
@js.native
open class EventTimeline protected () extends Timeline {
  def this(frameCount: Double) = this()
  
  /** The event for each key frame. */
  var events: js.Array[Event2] = js.native
  
  /** Sets the time in seconds and the event for the specified key frame. */
  def setFrame(frame: Double, event: Event2): Unit = js.native
}
/* static members */
object EventTimeline {
  
  @JSImport("@pixi-spine/runtime-4.1", "EventTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "EventTimeline.propertyIds")
  @js.native
  def propertyIds: js.Array[String] = js.native
  inline def propertyIds_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyIds")(x.asInstanceOf[js.Any])
}
