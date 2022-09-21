package typings.pixiSpineRuntime38.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "EventQueue")
@js.native
open class EventQueue protected () extends StObject {
  def this(animState: AnimationState) = this()
  
  var animState: AnimationState = js.native
  
  def clear(): Unit = js.native
  
  def complete(entry: TrackEntry): Unit = js.native
  
  def deprecateStuff(): Boolean = js.native
  
  def dispose(entry: TrackEntry): Unit = js.native
  
  def drain(): Unit = js.native
  
  var drainDisabled: Boolean = js.native
  
  def end(entry: TrackEntry): Unit = js.native
  
  def event(entry: TrackEntry, event: Event2): Unit = js.native
  
  def interrupt(entry: TrackEntry): Unit = js.native
  
  var objects: js.Array[Any] = js.native
  
  def start(entry: TrackEntry): Unit = js.native
}
/* static members */
object EventQueue {
  
  @JSImport("@pixi-spine/runtime-3.8", "EventQueue")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "EventQueue.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: Any = js.native
  inline def deprecatedWarning1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
}
