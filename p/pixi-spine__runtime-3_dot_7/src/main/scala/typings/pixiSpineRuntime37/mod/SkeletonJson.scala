package typings.pixiSpineRuntime37.mod

import typings.pixiConstants.mod.BLEND_MODES.ADD
import typings.pixiConstants.mod.BLEND_MODES.MULTIPLY
import typings.pixiConstants.mod.BLEND_MODES.NORMAL
import typings.pixiConstants.mod.BLEND_MODES.SCREEN
import typings.pixiSpineBase.mod.PositionMode
import typings.pixiSpineBase.mod.RotateMode
import typings.pixiSpineBase.mod.TransformMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "SkeletonJson")
@js.native
open class SkeletonJson protected () extends StObject {
  def this(attachmentLoader: AttachmentLoader) = this()
  
  var attachmentLoader: AttachmentLoader = js.native
  
  def getValue(map: Any, prop: String, defaultValue: Any): Any = js.native
  
  /* private */ var linkedMeshes: Any = js.native
  
  def readAnimation(map: Any, name: String, skeletonData: SkeletonData): Unit = js.native
  
  def readAttachment(map: Any, skin: Skin, slotIndex: Double, name: String, skeletonData: SkeletonData): Attachment = js.native
  
  def readCurve(map: Any, timeline: CurveTimeline, frameIndex: Double): Unit = js.native
  
  def readSkeletonData(json: String): SkeletonData = js.native
  def readSkeletonData(json: Any): SkeletonData = js.native
  
  def readVertices(map: Any, attachment: VertexAttachment, verticesLength: Double): Unit = js.native
  
  var scale: Double = js.native
}
/* static members */
object SkeletonJson {
  
  @JSImport("@pixi-spine/runtime-3.7", "SkeletonJson")
  @js.native
  val ^ : js.Any = js.native
  
  inline def blendModeFromString(str: String): NORMAL | ADD | MULTIPLY | SCREEN = ^.asInstanceOf[js.Dynamic].applyDynamic("blendModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[NORMAL | ADD | MULTIPLY | SCREEN]
  
  inline def positionModeFromString(str: String): PositionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("positionModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[PositionMode]
  
  inline def rotateModeFromString(str: String): RotateMode = ^.asInstanceOf[js.Dynamic].applyDynamic("rotateModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[RotateMode]
  
  inline def spacingModeFromString(str: String): SpacingMode = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[SpacingMode]
  
  inline def transformModeFromString(str: String): TransformMode = ^.asInstanceOf[js.Dynamic].applyDynamic("transformModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[TransformMode]
}
