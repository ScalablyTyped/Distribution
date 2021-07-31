package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IkConstraint
  extends StObject
     with Updatable {
  
  var active: Boolean
  
  @JSName("apply")
  def apply(): Unit
  
  def apply1(
    bone: Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit
  
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit
  
  var bendDirection: Double
  
  var bones: js.Array[Bone]
  
  var compress: Boolean
  
  var data: IkConstraintData
  
  var mix: Double
  
  var softness: Double
  
  var stretch: Boolean
  
  var target: Bone
}
object IkConstraint {
  
  @scala.inline
  def apply(
    active: Boolean,
    apply: () => Unit,
    apply1: (Bone, Double, Double, Boolean, Boolean, Boolean, Double) => Unit,
    apply2: (Bone, Bone, Double, Double, Double, Boolean, Double, Double) => Unit,
    bendDirection: Double,
    bones: js.Array[Bone],
    compress: Boolean,
    data: IkConstraintData,
    isActive: () => Boolean,
    mix: Double,
    softness: Double,
    stretch: Boolean,
    target: Bone,
    update: () => Unit
  ): IkConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], apply = js.Any.fromFunction0(apply), apply1 = js.Any.fromFunction7(apply1), apply2 = js.Any.fromFunction8(apply2), bendDirection = bendDirection.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), mix = mix.asInstanceOf[js.Any], softness = softness.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[IkConstraint]
  }
  
  @scala.inline
  implicit class IkConstraintMutableBuilder[Self <: IkConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApply1(value: (Bone, Double, Double, Boolean, Boolean, Boolean, Double) => Unit): Self = StObject.set(x, "apply1", js.Any.fromFunction7(value))
    
    @scala.inline
    def setApply2(value: (Bone, Bone, Double, Double, Double, Boolean, Double, Double) => Unit): Self = StObject.set(x, "apply2", js.Any.fromFunction8(value))
    
    @scala.inline
    def setBendDirection(value: Double): Self = StObject.set(x, "bendDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBones(value: js.Array[Bone]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonesVarargs(value: Bone*): Self = StObject.set(x, "bones", js.Array(value :_*))
    
    @scala.inline
    def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: IkConstraintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftness(value: Double): Self = StObject.set(x, "softness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Bone): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
