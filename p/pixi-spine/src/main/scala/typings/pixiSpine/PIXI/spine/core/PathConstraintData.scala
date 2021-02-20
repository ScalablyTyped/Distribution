package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathConstraintData extends ConstraintData {
  
  var bones: js.Array[BoneData] = js.native
  
  var offsetRotation: Double = js.native
  
  var position: Double = js.native
  
  var positionMode: PositionMode = js.native
  
  var rotateMix: Double = js.native
  
  var rotateMode: RotateMode = js.native
  
  var spacing: Double = js.native
  
  var spacingMode: SpacingMode = js.native
  
  var target: SlotData = js.native
  
  var translateMix: Double = js.native
}
object PathConstraintData {
  
  @scala.inline
  def apply(
    bones: js.Array[BoneData],
    name: String,
    offsetRotation: Double,
    order: Double,
    position: Double,
    positionMode: PositionMode,
    rotateMix: Double,
    rotateMode: RotateMode,
    skinRequired: Boolean,
    spacing: Double,
    spacingMode: SpacingMode,
    target: SlotData,
    translateMix: Double
  ): PathConstraintData = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionMode = positionMode.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], rotateMode = rotateMode.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], spacingMode = spacingMode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConstraintData]
  }
  
  @scala.inline
  implicit class PathConstraintDataMutableBuilder[Self <: PathConstraintData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBones(value: js.Array[BoneData]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonesVarargs(value: BoneData*): Self = StObject.set(x, "bones", js.Array(value :_*))
    
    @scala.inline
    def setOffsetRotation(value: Double): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionMode(value: PositionMode): Self = StObject.set(x, "positionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateMix(value: Double): Self = StObject.set(x, "rotateMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateMode(value: RotateMode): Self = StObject.set(x, "rotateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingMode(value: SpacingMode): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: SlotData): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateMix(value: Double): Self = StObject.set(x, "translateMix", value.asInstanceOf[js.Any])
  }
}
