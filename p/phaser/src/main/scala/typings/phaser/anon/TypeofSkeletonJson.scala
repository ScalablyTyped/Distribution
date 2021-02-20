package typings.phaser.anon

import typings.phaser.spine.BlendMode
import typings.phaser.spine.PositionMode
import typings.phaser.spine.RotateMode
import typings.phaser.spine.SpacingMode
import typings.phaser.spine.TransformMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSkeletonJson extends StObject {
  
  /* static member */
  def blendModeFromString(str: String): BlendMode = js.native
  
  /* static member */
  def positionModeFromString(str: String): PositionMode = js.native
  
  /* static member */
  def rotateModeFromString(str: String): RotateMode = js.native
  
  /* static member */
  def spacingModeFromString(str: String): SpacingMode = js.native
  
  /* static member */
  def transformModeFromString(str: String): TransformMode = js.native
}
object TypeofSkeletonJson {
  
  @scala.inline
  def apply(
    blendModeFromString: String => BlendMode,
    positionModeFromString: String => PositionMode,
    rotateModeFromString: String => RotateMode,
    spacingModeFromString: String => SpacingMode,
    transformModeFromString: String => TransformMode
  ): TypeofSkeletonJson = {
    val __obj = js.Dynamic.literal(blendModeFromString = js.Any.fromFunction1(blendModeFromString), positionModeFromString = js.Any.fromFunction1(positionModeFromString), rotateModeFromString = js.Any.fromFunction1(rotateModeFromString), spacingModeFromString = js.Any.fromFunction1(spacingModeFromString), transformModeFromString = js.Any.fromFunction1(transformModeFromString))
    __obj.asInstanceOf[TypeofSkeletonJson]
  }
  
  @scala.inline
  implicit class TypeofSkeletonJsonMutableBuilder[Self <: TypeofSkeletonJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendModeFromString(value: String => BlendMode): Self = StObject.set(x, "blendModeFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPositionModeFromString(value: String => PositionMode): Self = StObject.set(x, "positionModeFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotateModeFromString(value: String => RotateMode): Self = StObject.set(x, "rotateModeFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpacingModeFromString(value: String => SpacingMode): Self = StObject.set(x, "spacingModeFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformModeFromString(value: String => TransformMode): Self = StObject.set(x, "transformModeFromString", js.Any.fromFunction1(value))
  }
}
