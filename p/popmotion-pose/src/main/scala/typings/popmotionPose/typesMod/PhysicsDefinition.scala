package typings.popmotionPose.typesMod

import typings.popmotionPose.popmotionPoseStrings.physics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhysicsProps * / any */ trait PhysicsDefinition
  extends StObject
     with TransitionDefinitionCommonProps
     with NoEase
     with _TransitionDefinition {
  
  var `type`: physics
}
object PhysicsDefinition {
  
  inline def apply(ease: Unit): PhysicsDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("physics")
    __obj.asInstanceOf[PhysicsDefinition]
  }
  
  extension [Self <: PhysicsDefinition](x: Self) {
    
    inline def setType(value: physics): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
