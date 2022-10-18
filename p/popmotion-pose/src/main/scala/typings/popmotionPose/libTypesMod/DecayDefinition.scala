package typings.popmotionPose.libTypesMod

import typings.popmotionPose.popmotionPoseStrings.decay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecayProps * / any */ trait DecayDefinition
  extends StObject
     with TransitionDefinitionCommonProps
     with NoEase
     with _TransitionDefinition {
  
  var `type`: decay
}
object DecayDefinition {
  
  inline def apply(ease: Unit): DecayDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decay")
    __obj.asInstanceOf[DecayDefinition]
  }
  
  extension [Self <: DecayDefinition](x: Self) {
    
    inline def setType(value: decay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
