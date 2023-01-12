package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathConstraintData
  extends StObject
     with ConstraintData {
  
  var bones: js.Array[BoneData]
  
  var offsetRotation: Double
  
  var position: Double
  
  var positionMode: PositionMode
  
  var rotateMix: Double
  
  var rotateMode: RotateMode
  
  var spacing: Double
  
  var spacingMode: SpacingMode
  
  var target: SlotData
  
  var translateMix: Double
}
object PathConstraintData {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PathConstraintData] (val x: Self) extends AnyVal {
    
    inline def setBones(value: js.Array[BoneData]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: BoneData*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setOffsetRotation(value: Double): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionMode(value: PositionMode): Self = StObject.set(x, "positionMode", value.asInstanceOf[js.Any])
    
    inline def setRotateMix(value: Double): Self = StObject.set(x, "rotateMix", value.asInstanceOf[js.Any])
    
    inline def setRotateMode(value: RotateMode): Self = StObject.set(x, "rotateMode", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingMode(value: SpacingMode): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: SlotData): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTranslateMix(value: Double): Self = StObject.set(x, "translateMix", value.asInstanceOf[js.Any])
  }
}
