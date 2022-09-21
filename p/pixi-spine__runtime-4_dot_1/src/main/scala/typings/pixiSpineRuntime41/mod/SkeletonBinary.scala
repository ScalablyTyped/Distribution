package typings.pixiSpineRuntime41.mod

import typings.pixiConstants.mod.BLEND_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "SkeletonBinary")
@js.native
open class SkeletonBinary protected () extends StObject {
  def this(attachmentLoader: AttachmentLoader) = this()
  
  var attachmentLoader: AttachmentLoader = js.native
  
  /* private */ var linkedMeshes: Any = js.native
  
  /* private */ var readAnimation: Any = js.native
  
  /* private */ var readAttachment: Any = js.native
  
  /* private */ var readDeformTimelineType: Any = js.native
  
  /* private */ var readFloatArray: Any = js.native
  
  /* private */ var readSequence: Any = js.native
  
  /* private */ var readShortArray: Any = js.native
  
  def readSkeletonData(binary: js.typedarray.Uint8Array): SkeletonData = js.native
  
  /* private */ var readSkin: Any = js.native
  
  /* private */ var readVertices: Any = js.native
  
  /** Scales bone positions, image sizes, and translations as they are loaded. This allows different size images to be used at
    * runtime than were used in Spine.
    *
    * See [Scaling](http://esotericsoftware.com/spine-loading-skeleton-data#Scaling) in the Spine Runtimes Guide. */
  var scale: Double = js.native
  
  var ver40: Boolean = js.native
}
/* static members */
object SkeletonBinary {
  
  @JSImport("@pixi-spine/runtime-4.1", "SkeletonBinary")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "SkeletonBinary.BlendModeValues")
  @js.native
  def BlendModeValues: js.Array[BLEND_MODES] = js.native
  inline def BlendModeValues_=(x: js.Array[BLEND_MODES]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlendModeValues")(x.asInstanceOf[js.Any])
}
