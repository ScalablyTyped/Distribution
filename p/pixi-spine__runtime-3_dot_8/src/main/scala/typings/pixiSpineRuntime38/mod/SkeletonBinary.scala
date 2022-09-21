package typings.pixiSpineRuntime38.mod

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiSpineBase.mod.PositionMode
import typings.pixiSpineBase.mod.RotateMode
import typings.pixiSpineBase.mod.TransformMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary")
@js.native
open class SkeletonBinary protected () extends StObject {
  def this(attachmentLoader: AttachmentLoader) = this()
  
  var attachmentLoader: AttachmentLoader = js.native
  
  /* private */ var linkedMeshes: Any = js.native
  
  /* private */ var readAnimation: Any = js.native
  
  /* private */ var readAttachment: Any = js.native
  
  /* private */ var readCurve: Any = js.native
  
  /* private */ var readFloatArray: Any = js.native
  
  /* private */ var readShortArray: Any = js.native
  
  def readSkeletonData(binary: js.typedarray.Uint8Array): SkeletonData = js.native
  
  /* private */ var readSkin: Any = js.native
  
  /* private */ var readVertices: Any = js.native
  
  var scale: Double = js.native
  
  def setCurve(timeline: CurveTimeline, frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
}
/* static members */
object SkeletonBinary {
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.AttachmentTypeValues")
  @js.native
  def AttachmentTypeValues: js.Array[Double] = js.native
  inline def AttachmentTypeValues_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttachmentTypeValues")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.BONE_ROTATE")
  @js.native
  def BONE_ROTATE: Double = js.native
  inline def BONE_ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_ROTATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.BONE_SCALE")
  @js.native
  def BONE_SCALE: Double = js.native
  inline def BONE_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_SCALE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.BONE_SHEAR")
  @js.native
  def BONE_SHEAR: Double = js.native
  inline def BONE_SHEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_SHEAR")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.BONE_TRANSLATE")
  @js.native
  def BONE_TRANSLATE: Double = js.native
  inline def BONE_TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_TRANSLATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.BlendModeValues")
  @js.native
  def BlendModeValues: js.Array[BLEND_MODES] = js.native
  inline def BlendModeValues_=(x: js.Array[BLEND_MODES]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlendModeValues")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.CURVE_BEZIER")
  @js.native
  def CURVE_BEZIER: Double = js.native
  inline def CURVE_BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_BEZIER")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.CURVE_LINEAR")
  @js.native
  def CURVE_LINEAR: Double = js.native
  inline def CURVE_LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_LINEAR")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.CURVE_STEPPED")
  @js.native
  def CURVE_STEPPED: Double = js.native
  inline def CURVE_STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_STEPPED")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.PATH_MIX")
  @js.native
  def PATH_MIX: Double = js.native
  inline def PATH_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_MIX")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.PATH_POSITION")
  @js.native
  def PATH_POSITION: Double = js.native
  inline def PATH_POSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_POSITION")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.PATH_SPACING")
  @js.native
  def PATH_SPACING: Double = js.native
  inline def PATH_SPACING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_SPACING")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.PositionModeValues")
  @js.native
  def PositionModeValues: js.Array[PositionMode] = js.native
  inline def PositionModeValues_=(x: js.Array[PositionMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PositionModeValues")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.RotateModeValues")
  @js.native
  def RotateModeValues: js.Array[RotateMode] = js.native
  inline def RotateModeValues_=(x: js.Array[RotateMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotateModeValues")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.SLOT_ATTACHMENT")
  @js.native
  def SLOT_ATTACHMENT: Double = js.native
  inline def SLOT_ATTACHMENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_ATTACHMENT")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.SLOT_COLOR")
  @js.native
  def SLOT_COLOR: Double = js.native
  inline def SLOT_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_COLOR")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.SLOT_TWO_COLOR")
  @js.native
  def SLOT_TWO_COLOR: Double = js.native
  inline def SLOT_TWO_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_TWO_COLOR")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.SpacingModeValues")
  @js.native
  def SpacingModeValues: js.Array[SpacingMode] = js.native
  inline def SpacingModeValues_=(x: js.Array[SpacingMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpacingModeValues")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "SkeletonBinary.TransformModeValues")
  @js.native
  def TransformModeValues: js.Array[TransformMode] = js.native
  inline def TransformModeValues_=(x: js.Array[TransformMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TransformModeValues")(x.asInstanceOf[js.Any])
}
