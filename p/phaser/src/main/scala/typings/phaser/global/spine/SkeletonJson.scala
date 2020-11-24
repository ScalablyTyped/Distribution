package typings.phaser.global.spine

import typings.phaser.spine.AttachmentLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SkeletonJson")
@js.native
class SkeletonJson protected ()
  extends typings.phaser.spine.SkeletonJson {
  def this(attachmentLoader: AttachmentLoader) = this()
}
/* static members */
@JSGlobal("spine.SkeletonJson")
@js.native
object SkeletonJson extends js.Object {
  
  def blendModeFromString(str: String): typings.phaser.spine.BlendMode = js.native
  
  def positionModeFromString(str: String): typings.phaser.spine.PositionMode = js.native
  
  def rotateModeFromString(str: String): typings.phaser.spine.RotateMode = js.native
  
  def spacingModeFromString(str: String): typings.phaser.spine.SpacingMode = js.native
  
  def transformModeFromString(str: String): typings.phaser.spine.TransformMode = js.native
}
