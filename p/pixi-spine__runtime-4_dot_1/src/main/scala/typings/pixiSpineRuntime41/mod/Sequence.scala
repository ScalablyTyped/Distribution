package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.IHasTextureRegion
import typings.pixiSpineBase.mod.ISequence
import typings.pixiSpineBase.mod.ISlot
import typings.pixiSpineBase.mod.TextureRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "Sequence")
@js.native
open class Sequence protected ()
  extends StObject
     with ISequence {
  def this(count: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(slot: ISlot, attachment: IHasTextureRegion): Unit = js.native
  @JSName("apply")
  def apply(slot: Slot, attachment: IHasTextureRegion): Unit = js.native
  
  def copy(): Sequence = js.native
  
  var digits: Double = js.native
  
  def getPath(basePath: String, index: Double): String = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var regions: js.Array[TextureRegion] = js.native
  
  /** The index of the region to show for the setup pose. */
  var setupIndex: Double = js.native
  
  var start: Double = js.native
}
/* static members */
object Sequence {
  
  @JSImport("@pixi-spine/runtime-4.1", "Sequence")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "Sequence._nextID")
  @js.native
  def _nextID: Any = js.native
  inline def _nextID_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_nextID")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "Sequence.nextID")
  @js.native
  def nextID: Any = js.native
  inline def nextID_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextID")(x.asInstanceOf[js.Any])
}
