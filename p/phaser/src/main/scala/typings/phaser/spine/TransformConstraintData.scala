package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformConstraintData
  extends StObject
     with ConstraintData {
  
  var bones: js.Array[BoneData]
  
  var local: Boolean
  
  var offsetRotation: Double
  
  var offsetScaleX: Double
  
  var offsetScaleY: Double
  
  var offsetShearY: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var relative: Boolean
  
  var rotateMix: Double
  
  var scaleMix: Double
  
  var shearMix: Double
  
  var target: BoneData
  
  var translateMix: Double
}
object TransformConstraintData {
  
  inline def apply(
    bones: js.Array[BoneData],
    local: Boolean,
    name: String,
    offsetRotation: Double,
    offsetScaleX: Double,
    offsetScaleY: Double,
    offsetShearY: Double,
    offsetX: Double,
    offsetY: Double,
    order: Double,
    relative: Boolean,
    rotateMix: Double,
    scaleMix: Double,
    shearMix: Double,
    skinRequired: Boolean,
    target: BoneData,
    translateMix: Double
  ): TransformConstraintData = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], offsetScaleX = offsetScaleX.asInstanceOf[js.Any], offsetScaleY = offsetScaleY.asInstanceOf[js.Any], offsetShearY = offsetShearY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], scaleMix = scaleMix.asInstanceOf[js.Any], shearMix = shearMix.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformConstraintData]
  }
  
  extension [Self <: TransformConstraintData](x: Self) {
    
    inline def setBones(value: js.Array[BoneData]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: BoneData*): Self = StObject.set(x, "bones", js.Array(value :_*))
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setOffsetRotation(value: Double): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
    
    inline def setOffsetScaleX(value: Double): Self = StObject.set(x, "offsetScaleX", value.asInstanceOf[js.Any])
    
    inline def setOffsetScaleY(value: Double): Self = StObject.set(x, "offsetScaleY", value.asInstanceOf[js.Any])
    
    inline def setOffsetShearY(value: Double): Self = StObject.set(x, "offsetShearY", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRotateMix(value: Double): Self = StObject.set(x, "rotateMix", value.asInstanceOf[js.Any])
    
    inline def setScaleMix(value: Double): Self = StObject.set(x, "scaleMix", value.asInstanceOf[js.Any])
    
    inline def setShearMix(value: Double): Self = StObject.set(x, "shearMix", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: BoneData): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTranslateMix(value: Double): Self = StObject.set(x, "translateMix", value.asInstanceOf[js.Any])
  }
}
