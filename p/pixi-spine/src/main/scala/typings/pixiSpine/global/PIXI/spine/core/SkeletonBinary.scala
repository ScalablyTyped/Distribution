package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.AttachmentLoader
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.SkeletonBinary")
@js.native
class SkeletonBinary protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.SkeletonBinary {
  def this(attachmentLoader: AttachmentLoader) = this()
  
  /* CompleteClass */
  var attachmentLoader: AttachmentLoader = js.native
  
  /* private */ /* CompleteClass */
  var linkedMeshes: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var readAnimation: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var readAttachment: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var readCurve: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var readFloatArray: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var readShortArray: js.Any = js.native
  
  /* CompleteClass */
  override def readSkeletonData(binary: Uint8Array): typings.pixiSpine.PIXI.spine.core.SkeletonData = js.native
  
  /* private */ /* CompleteClass */
  var readSkin: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var readVertices: js.Any = js.native
  
  /* CompleteClass */
  var scale: Double = js.native
  
  /* CompleteClass */
  override def setCurve(
    timeline: typings.pixiSpine.PIXI.spine.core.CurveTimeline,
    frameIndex: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double
  ): Unit = js.native
}
object SkeletonBinary {
  
  @JSGlobal("PIXI.spine.core.SkeletonBinary")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.AttachmentTypeValues")
  @js.native
  def AttachmentTypeValues: js.Array[Double] = js.native
  inline def AttachmentTypeValues_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttachmentTypeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.BONE_ROTATE")
  @js.native
  def BONE_ROTATE: Double = js.native
  inline def BONE_ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_ROTATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.BONE_SCALE")
  @js.native
  def BONE_SCALE: Double = js.native
  inline def BONE_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_SCALE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.BONE_SHEAR")
  @js.native
  def BONE_SHEAR: Double = js.native
  inline def BONE_SHEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_SHEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.BONE_TRANSLATE")
  @js.native
  def BONE_TRANSLATE: Double = js.native
  inline def BONE_TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_TRANSLATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.BlendModeValues")
  @js.native
  def BlendModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.BlendMode] = js.native
  inline def BlendModeValues_=(x: js.Array[typings.pixiSpine.PIXI.spine.core.BlendMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlendModeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.CURVE_BEZIER")
  @js.native
  def CURVE_BEZIER: Double = js.native
  inline def CURVE_BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_BEZIER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.CURVE_LINEAR")
  @js.native
  def CURVE_LINEAR: Double = js.native
  inline def CURVE_LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_LINEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.CURVE_STEPPED")
  @js.native
  def CURVE_STEPPED: Double = js.native
  inline def CURVE_STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_STEPPED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.PATH_MIX")
  @js.native
  def PATH_MIX: Double = js.native
  inline def PATH_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_MIX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.PATH_POSITION")
  @js.native
  def PATH_POSITION: Double = js.native
  inline def PATH_POSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_POSITION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.PATH_SPACING")
  @js.native
  def PATH_SPACING: Double = js.native
  inline def PATH_SPACING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_SPACING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.PositionModeValues")
  @js.native
  def PositionModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.PositionMode] = js.native
  inline def PositionModeValues_=(x: js.Array[typings.pixiSpine.PIXI.spine.core.PositionMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PositionModeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.RotateModeValues")
  @js.native
  def RotateModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.RotateMode] = js.native
  inline def RotateModeValues_=(x: js.Array[typings.pixiSpine.PIXI.spine.core.RotateMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotateModeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.SLOT_ATTACHMENT")
  @js.native
  def SLOT_ATTACHMENT: Double = js.native
  inline def SLOT_ATTACHMENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_ATTACHMENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.SLOT_COLOR")
  @js.native
  def SLOT_COLOR: Double = js.native
  inline def SLOT_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_COLOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.SLOT_TWO_COLOR")
  @js.native
  def SLOT_TWO_COLOR: Double = js.native
  inline def SLOT_TWO_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_TWO_COLOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.SpacingModeValues")
  @js.native
  def SpacingModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.SpacingMode] = js.native
  inline def SpacingModeValues_=(x: js.Array[typings.pixiSpine.PIXI.spine.core.SpacingMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpacingModeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SkeletonBinary.TransformModeValues")
  @js.native
  def TransformModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.TransformMode] = js.native
  inline def TransformModeValues_=(x: js.Array[typings.pixiSpine.PIXI.spine.core.TransformMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TransformModeValues")(x.asInstanceOf[js.Any])
}
