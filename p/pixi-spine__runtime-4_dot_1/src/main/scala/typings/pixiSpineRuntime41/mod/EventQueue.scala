package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "EventQueue")
@js.native
open class EventQueue protected () extends StObject {
  def this(animState: AnimationState) = this()
  
  var animState: AnimationState = js.native
  
  def clear(): Unit = js.native
  
  def complete(entry: TrackEntry): Unit = js.native
  
  def dispose(entry: TrackEntry): Unit = js.native
  
  def drain(): Unit = js.native
  
  var drainDisabled: Boolean = js.native
  
  def end(entry: TrackEntry): Unit = js.native
  
  def event(entry: TrackEntry, event: Event2): Unit = js.native
  
  def interrupt(entry: TrackEntry): Unit = js.native
  
  var objects: js.Array[Any] = js.native
  
  def start(entry: TrackEntry): Unit = js.native
}
