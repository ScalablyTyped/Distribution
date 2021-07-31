package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.AttachmentLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.SkeletonJson")
@js.native
class SkeletonJson protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.SkeletonJson {
  def this(attachmentLoader: AttachmentLoader) = this()
}
object SkeletonJson {
  
  @JSGlobal("PIXI.spine.core.SkeletonJson")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def blendModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.BlendMode = ^.asInstanceOf[js.Dynamic].applyDynamic("blendModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpine.PIXI.spine.core.BlendMode]
  
  /* static member */
  @scala.inline
  def positionModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.PositionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("positionModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpine.PIXI.spine.core.PositionMode]
  
  /* static member */
  @scala.inline
  def rotateModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.RotateMode = ^.asInstanceOf[js.Dynamic].applyDynamic("rotateModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpine.PIXI.spine.core.RotateMode]
  
  /* static member */
  @scala.inline
  def spacingModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.SpacingMode = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpine.PIXI.spine.core.SpacingMode]
  
  /* static member */
  @scala.inline
  def transformModeFromString(str: String): typings.pixiSpine.PIXI.spine.core.TransformMode = ^.asInstanceOf[js.Dynamic].applyDynamic("transformModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSpine.PIXI.spine.core.TransformMode]
}
