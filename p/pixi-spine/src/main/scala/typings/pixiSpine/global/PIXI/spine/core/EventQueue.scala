package typings.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
class EventQueue protected ()
  extends typings.pixiSpine.PIXI.spine.core.EventQueue {
  def this(animState: typings.pixiSpine.PIXI.spine.core.AnimationState) = this()
  /* CompleteClass */
  override var animState: typings.pixiSpine.PIXI.spine.core.AnimationState = js.native
  /* CompleteClass */
  override var drainDisabled: Boolean = js.native
  /* CompleteClass */
  override var objects: js.Array[_] = js.native
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
  override def end(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def event(
    entry: typings.pixiSpine.PIXI.spine.core.TrackEntry,
    event: typings.pixiSpine.PIXI.spine.core.Event
  ): Unit = js.native
  /* CompleteClass */
  override def interrupt(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def start(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
object EventQueue extends js.Object {
  var deprecatedWarning1: js.Any = js.native
}

