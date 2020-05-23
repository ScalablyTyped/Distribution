package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.AttachmentLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.SkeletonJson")
@js.native
class SkeletonJson protected ()
  extends typings.pixiSpine.PIXI.spine.core.SkeletonJson {
  def this(attachmentLoader: AttachmentLoader) = this()
}

/* static members */
@JSGlobal("PIXI.spine.core.SkeletonJson")
@js.native
object SkeletonJson extends js.Object {
  def blendModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.BlendMode = js.native
  def positionModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.PositionMode = js.native
  def rotateModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.RotateMode = js.native
  def spacingModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.SpacingMode = js.native
  def transformModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.TransformMode = js.native
}

