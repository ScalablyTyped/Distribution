package typings.popmotionPose.libTypesMod

import typings.popmotionPose.popmotionPoseStrings.keyframes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyframesProps * / any */ trait KeyframesDefinition
  extends StObject
     with TransitionDefinitionCommonProps
     with _TransitionDefinition {
  
  var `type`: keyframes
}
object KeyframesDefinition {
  
  inline def apply(): KeyframesDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyframes")
    __obj.asInstanceOf[KeyframesDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyframesDefinition] (val x: Self) extends AnyVal {
    
    inline def setType(value: keyframes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
