package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IkConstraintData
  extends StObject
     with ConstraintData {
  
  var bendDirection: Double
  
  var bones: js.Array[BoneData]
  
  var compress: Boolean
  
  var mix: Double
  
  var softness: Double
  
  var stretch: Boolean
  
  var target: BoneData
  
  var uniform: Boolean
}
object IkConstraintData {
  
  inline def apply(
    bendDirection: Double,
    bones: js.Array[BoneData],
    compress: Boolean,
    mix: Double,
    name: String,
    order: Double,
    skinRequired: Boolean,
    softness: Double,
    stretch: Boolean,
    target: BoneData,
    uniform: Boolean
  ): IkConstraintData = {
    val __obj = js.Dynamic.literal(bendDirection = bendDirection.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], softness = softness.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], uniform = uniform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IkConstraintData]
  }
  
  extension [Self <: IkConstraintData](x: Self) {
    
    inline def setBendDirection(value: Double): Self = StObject.set(x, "bendDirection", value.asInstanceOf[js.Any])
    
    inline def setBones(value: js.Array[BoneData]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: BoneData*): Self = StObject.set(x, "bones", js.Array(value :_*))
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setSoftness(value: Double): Self = StObject.set(x, "softness", value.asInstanceOf[js.Any])
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: BoneData): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setUniform(value: Boolean): Self = StObject.set(x, "uniform", value.asInstanceOf[js.Any])
  }
}
