package typings.popmotionPose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomFlipMod {
  
  @JSImport("popmotion-pose/lib/dom/flip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flipPose(
    props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.PoserState<Value, Action, ColdSubscription, DomPopmotionPoser> */ Any,
    nextPose: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.Pose<Action, imported_types.TransitionDefinition> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flipPose")(props.asInstanceOf[js.Any], nextPose.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isFlipPose(
    flip: Boolean,
    key: String,
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.PoserState<Value, Action, ColdSubscription, DomPopmotionPoser> */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlipPose")(flip.asInstanceOf[js.Any], key.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setValue(
    hasValuesProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.PoserState<Value, Action, ColdSubscription, DomPopmotionPoser> */ Any,
    key: String,
    to: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(hasValuesProps.asInstanceOf[js.Any], key.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
