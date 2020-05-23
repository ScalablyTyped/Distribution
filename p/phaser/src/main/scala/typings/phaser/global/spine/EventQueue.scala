package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.EventQueue")
@js.native
class EventQueue protected ()
  extends typings.phaser.spine.EventQueue {
  def this(animState: typings.phaser.spine.AnimationState) = this()
  /* CompleteClass */
  override var animState: typings.phaser.spine.AnimationState = js.native
  /* CompleteClass */
  override var drainDisabled: Boolean = js.native
  /* CompleteClass */
  override var objects: js.Array[_] = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def complete(entry: typings.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def dispose(entry: typings.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def drain(): Unit = js.native
  /* CompleteClass */
  override def end(entry: typings.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def event(entry: typings.phaser.spine.TrackEntry, event: typings.phaser.spine.Event): Unit = js.native
  /* CompleteClass */
  override def interrupt(entry: typings.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def start(entry: typings.phaser.spine.TrackEntry): Unit = js.native
}

