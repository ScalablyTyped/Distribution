package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
class EventQueue protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.EventQueue {
  def this(animState: typings.pixiSpine.PIXI.spine.core.AnimationState) = this()
  
  /* CompleteClass */
  var animState: typings.pixiSpine.PIXI.spine.core.AnimationState = js.native
  
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /* CompleteClass */
  override def complete(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  override def deprecateStuff(): Boolean = js.native
  
  /* CompleteClass */
  override def dispose(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  override def drain(): Unit = js.native
  
  /* CompleteClass */
  var drainDisabled: Boolean = js.native
  
  /* CompleteClass */
  override def end(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  override def event(
    entry: typings.pixiSpine.PIXI.spine.core.TrackEntry,
    event: typings.pixiSpine.PIXI.spine.core.Event
  ): Unit = js.native
  
  /* CompleteClass */
  override def interrupt(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var objects: js.Array[js.Any] = js.native
  
  /* CompleteClass */
  override def start(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
}
object EventQueue {
  
  @JSGlobal("PIXI.spine.core.EventQueue")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.EventQueue.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: js.Any = js.native
  inline def deprecatedWarning1_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
}
