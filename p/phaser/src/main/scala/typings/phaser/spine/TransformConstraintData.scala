package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformConstraintData extends ConstraintData {
  
  var bones: js.Array[BoneData] = js.native
  
  var local: Boolean = js.native
  
  var offsetRotation: Double = js.native
  
  var offsetScaleX: Double = js.native
  
  var offsetScaleY: Double = js.native
  
  var offsetShearY: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var relative: Boolean = js.native
  
  var rotateMix: Double = js.native
  
  var scaleMix: Double = js.native
  
  var shearMix: Double = js.native
  
  var target: BoneData = js.native
  
  var translateMix: Double = js.native
}
object TransformConstraintData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TransformConstraintDataMutableBuilder[Self <: TransformConstraintData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBones(value: js.Array[BoneData]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonesVarargs(value: BoneData*): Self = StObject.set(x, "bones", js.Array(value :_*))
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRotation(value: Double): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetScaleX(value: Double): Self = StObject.set(x, "offsetScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetScaleY(value: Double): Self = StObject.set(x, "offsetScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetShearY(value: Double): Self = StObject.set(x, "offsetShearY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateMix(value: Double): Self = StObject.set(x, "rotateMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMix(value: Double): Self = StObject.set(x, "scaleMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearMix(value: Double): Self = StObject.set(x, "shearMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: BoneData): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateMix(value: Double): Self = StObject.set(x, "translateMix", value.asInstanceOf[js.Any])
  }
}
