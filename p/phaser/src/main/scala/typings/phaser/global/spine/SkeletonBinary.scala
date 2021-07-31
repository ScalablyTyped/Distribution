package typings.phaser.global.spine

import typings.phaser.spine.AttachmentLoader
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SkeletonBinary")
@js.native
class SkeletonBinary protected ()
  extends StObject
     with typings.phaser.spine.SkeletonBinary {
  def this(attachmentLoader: AttachmentLoader) = this()
  
  /* CompleteClass */
  var attachmentLoader: AttachmentLoader = js.native
  
  /* CompleteClass */
  var linkedMeshes: js.Any = js.native
  
  /* CompleteClass */
  var readAnimation: js.Any = js.native
  
  /* CompleteClass */
  var readAttachment: js.Any = js.native
  
  /* CompleteClass */
  var readCurve: js.Any = js.native
  
  /* CompleteClass */
  var readFloatArray: js.Any = js.native
  
  /* CompleteClass */
  var readShortArray: js.Any = js.native
  
  /* CompleteClass */
  override def readSkeletonData(binary: Uint8Array): typings.phaser.spine.SkeletonData = js.native
  
  /* CompleteClass */
  var readSkin: js.Any = js.native
  
  /* CompleteClass */
  var readVertices: js.Any = js.native
  
  /* CompleteClass */
  var scale: Double = js.native
  
  /* CompleteClass */
  override def setCurve(
    timeline: typings.phaser.spine.CurveTimeline,
    frameIndex: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double
  ): Unit = js.native
}
object SkeletonBinary {
  
  @JSGlobal("spine.SkeletonBinary")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.AttachmentTypeValues")
  @js.native
  def AttachmentTypeValues: js.Array[Double] = js.native
  @scala.inline
  def AttachmentTypeValues_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttachmentTypeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.BONE_ROTATE")
  @js.native
  def BONE_ROTATE: Double = js.native
  @scala.inline
  def BONE_ROTATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_ROTATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.BONE_SCALE")
  @js.native
  def BONE_SCALE: Double = js.native
  @scala.inline
  def BONE_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_SCALE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.BONE_SHEAR")
  @js.native
  def BONE_SHEAR: Double = js.native
  @scala.inline
  def BONE_SHEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_SHEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.BONE_TRANSLATE")
  @js.native
  def BONE_TRANSLATE: Double = js.native
  @scala.inline
  def BONE_TRANSLATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BONE_TRANSLATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.BlendModeValues")
  @js.native
  def BlendModeValues: js.Array[typings.phaser.spine.BlendMode] = js.native
  @scala.inline
  def BlendModeValues_=(x: js.Array[typings.phaser.spine.BlendMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlendModeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.CURVE_BEZIER")
  @js.native
  def CURVE_BEZIER: Double = js.native
  @scala.inline
  def CURVE_BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_BEZIER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.CURVE_LINEAR")
  @js.native
  def CURVE_LINEAR: Double = js.native
  @scala.inline
  def CURVE_LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_LINEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.CURVE_STEPPED")
  @js.native
  def CURVE_STEPPED: Double = js.native
  @scala.inline
  def CURVE_STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURVE_STEPPED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.PATH_MIX")
  @js.native
  def PATH_MIX: Double = js.native
  @scala.inline
  def PATH_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_MIX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.PATH_POSITION")
  @js.native
  def PATH_POSITION: Double = js.native
  @scala.inline
  def PATH_POSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_POSITION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.PATH_SPACING")
  @js.native
  def PATH_SPACING: Double = js.native
  @scala.inline
  def PATH_SPACING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_SPACING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.PositionModeValues")
  @js.native
  def PositionModeValues: js.Array[typings.phaser.spine.PositionMode] = js.native
  @scala.inline
  def PositionModeValues_=(x: js.Array[typings.phaser.spine.PositionMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PositionModeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.RotateModeValues")
  @js.native
  def RotateModeValues: js.Array[typings.phaser.spine.RotateMode] = js.native
  @scala.inline
  def RotateModeValues_=(x: js.Array[typings.phaser.spine.RotateMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotateModeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.SLOT_ATTACHMENT")
  @js.native
  def SLOT_ATTACHMENT: Double = js.native
  @scala.inline
  def SLOT_ATTACHMENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_ATTACHMENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.SLOT_COLOR")
  @js.native
  def SLOT_COLOR: Double = js.native
  @scala.inline
  def SLOT_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_COLOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.SLOT_TWO_COLOR")
  @js.native
  def SLOT_TWO_COLOR: Double = js.native
  @scala.inline
  def SLOT_TWO_COLOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOT_TWO_COLOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.SpacingModeValues")
  @js.native
  def SpacingModeValues: js.Array[typings.phaser.spine.SpacingMode] = js.native
  @scala.inline
  def SpacingModeValues_=(x: js.Array[typings.phaser.spine.SpacingMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpacingModeValues")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.SkeletonBinary.TransformModeValues")
  @js.native
  def TransformModeValues: js.Array[typings.phaser.spine.TransformMode] = js.native
  @scala.inline
  def TransformModeValues_=(x: js.Array[typings.phaser.spine.TransformMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TransformModeValues")(x.asInstanceOf[js.Any])
}
