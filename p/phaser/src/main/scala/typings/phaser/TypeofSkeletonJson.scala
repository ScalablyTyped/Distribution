package typings.phaser

import org.scalablytyped.runtime.Instantiable1
import typings.phaser.spine.AttachmentLoader
import typings.phaser.spine.BlendMode
import typings.phaser.spine.PositionMode
import typings.phaser.spine.RotateMode
import typings.phaser.spine.SkeletonJson
import typings.phaser.spine.SpacingMode
import typings.phaser.spine.TransformMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSkeletonJson extends Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonJson] {
  def blendModeFromString(str: String): BlendMode = js.native
  def positionModeFromString(str: String): PositionMode = js.native
  def rotateModeFromString(str: String): RotateMode = js.native
  def spacingModeFromString(str: String): SpacingMode = js.native
  def transformModeFromString(str: String): TransformMode = js.native
}

