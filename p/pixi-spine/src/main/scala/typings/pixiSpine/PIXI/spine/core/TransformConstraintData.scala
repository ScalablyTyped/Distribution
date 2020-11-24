package typings.pixiSpine.PIXI.spine.core

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
  implicit class TransformConstraintDataOps[Self <: TransformConstraintData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBonesVarargs(value: BoneData*): Self = this.set("bones", js.Array(value :_*))
    
    @scala.inline
    def setBones(value: js.Array[BoneData]): Self = this.set("bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRotation(value: Double): Self = this.set("offsetRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetScaleX(value: Double): Self = this.set("offsetScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetScaleY(value: Double): Self = this.set("offsetScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetShearY(value: Double): Self = this.set("offsetShearY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateMix(value: Double): Self = this.set("rotateMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMix(value: Double): Self = this.set("scaleMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearMix(value: Double): Self = this.set("shearMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: BoneData): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateMix(value: Double): Self = this.set("translateMix", value.asInstanceOf[js.Any])
  }
}
