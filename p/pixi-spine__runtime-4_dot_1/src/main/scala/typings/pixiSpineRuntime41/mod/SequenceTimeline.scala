package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.IHasTextureRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "SequenceTimeline")
@js.native
open class SequenceTimeline protected ()
  extends Timeline
     with SlotTimeline {
  def this(frameCount: Double, slotIndex: Double, attachment: IHasTextureRegion) = this()
  
  var attachment: IHasTextureRegion = js.native
  
  def getAttachment(): Attachment = js.native
  
  def getSlotIndex(): Double = js.native
  
  /** Sets the time, mode, index, and frame time for the specified frame.
    * @param frame Between 0 and <code>frameCount</code>, inclusive.
    * @param time Seconds between frames. */
  def setFrame(frame: Double, time: Double, mode: SequenceMode, index: Double, delay: Double): Unit = js.native
  
  /** The index of the slot in {@link Skeleton#slots} that will be changed. */
  /* CompleteClass */
  var slotIndex: Double = js.native
}
/* static members */
object SequenceTimeline {
  
  @JSImport("@pixi-spine/runtime-4.1", "SequenceTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "SequenceTimeline.DELAY")
  @js.native
  def DELAY: Double = js.native
  inline def DELAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELAY")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "SequenceTimeline.ENTRIES")
  @js.native
  def ENTRIES: Double = js.native
  inline def ENTRIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRIES")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "SequenceTimeline.MODE")
  @js.native
  def MODE: Double = js.native
  inline def MODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE")(x.asInstanceOf[js.Any])
}
