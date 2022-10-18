package typings.popmotionPose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUnitConversionMod {
  
  @JSImport("popmotion-pose/lib/dom/unit-conversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertPositionalUnits(
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.PoserState<imported_flip.Value, imported_flip.Action, imported_flip.ColdSubscription, imported_flip.DomPopmotionPoser> */ Any,
    nextPose: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.Pose<imported_flip.Action, imported_types.TransitionDefinition> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPositionalUnits")(state.asInstanceOf[js.Any], nextPose.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isPositional(
    pose: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.Pose<imported_flip.Action, imported_types.TransitionDefinition> */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositional")(pose.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
