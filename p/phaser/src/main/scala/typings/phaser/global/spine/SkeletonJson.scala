package typings.phaser.global.spine

import typings.phaser.spine.AttachmentLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SkeletonJson")
@js.native
open class SkeletonJson protected ()
  extends StObject
     with typings.phaser.spine.SkeletonJson {
  def this(attachmentLoader: AttachmentLoader) = this()
}
object SkeletonJson {
  
  @JSGlobal("spine.SkeletonJson")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def blendModeFromString(str: String): typings.phaser.spine.BlendMode = ^.asInstanceOf[js.Dynamic].applyDynamic("blendModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.BlendMode]
  
  /* static member */
  inline def positionModeFromString(str: String): typings.phaser.spine.PositionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("positionModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.PositionMode]
  
  /* static member */
  inline def rotateModeFromString(str: String): typings.phaser.spine.RotateMode = ^.asInstanceOf[js.Dynamic].applyDynamic("rotateModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.RotateMode]
  
  /* static member */
  inline def spacingModeFromString(str: String): typings.phaser.spine.SpacingMode = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.SpacingMode]
  
  /* static member */
  inline def transformModeFromString(str: String): typings.phaser.spine.TransformMode = ^.asInstanceOf[js.Dynamic].applyDynamic("transformModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.spine.TransformMode]
}
