package typings.pixiSpineRuntime41.mod

import typings.pixiConstants.mod.BLEND_MODES.ADD
import typings.pixiConstants.mod.BLEND_MODES.MULTIPLY
import typings.pixiConstants.mod.BLEND_MODES.NORMAL
import typings.pixiConstants.mod.BLEND_MODES.SCREEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "SkeletonJson")
@js.native
open class SkeletonJson protected () extends StObject {
  def this(attachmentLoader: AttachmentLoader) = this()
  
  var attachmentLoader: AttachmentLoader = js.native
  
  /* private */ var linkedMeshes: Any = js.native
  
  def readAnimation(map: Any, name: String, skeletonData: SkeletonData): Unit = js.native
  
  def readAttachment(map: Any, skin: Skin, slotIndex: Double, name: String, skeletonData: SkeletonData): Attachment | Null = js.native
  
  def readSequence(map: Any): Sequence = js.native
  
  def readSkeletonData(json: String): SkeletonData = js.native
  def readSkeletonData(json: Any): SkeletonData = js.native
  
  def readVertices(map: Any, attachment: VertexAttachment, verticesLength: Double): Unit = js.native
  
  /** Scales bone positions, image sizes, and translations as they are loaded. This allows different size images to be used at
    * runtime than were used in Spine.
    *
    * See [Scaling](http://esotericsoftware.com/spine-loading-skeleton-data#Scaling) in the Spine Runtimes Guide. */
  var scale: Double = js.native
}
/* static members */
object SkeletonJson {
  
  @JSImport("@pixi-spine/runtime-4.1", "SkeletonJson")
  @js.native
  val ^ : js.Any = js.native
  
  inline def blendModeFromString(str: String): NORMAL | ADD | MULTIPLY | SCREEN = ^.asInstanceOf[js.Dynamic].applyDynamic("blendModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[NORMAL | ADD | MULTIPLY | SCREEN]
}
