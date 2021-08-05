package typings.popmotionPose

import typings.popmotionPose.libTypesMod.Pose
import typings.popmotionPose.libTypesMod.PoserState
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.popmotionPose.typesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flipMod {
  
  @JSImport("popmotion-pose/lib/dom/flip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flipPose(
    props: PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      DomPopmotionPoser
    ],
    nextPose: Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      TransitionDefinition
    ]
  ): Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    TransitionDefinition
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipPose")(props.asInstanceOf[js.Any], nextPose.asInstanceOf[js.Any])).asInstanceOf[Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    TransitionDefinition
  ]]
  
  inline def isFlipPose(
    flip: Boolean,
    key: String,
    state: PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      DomPopmotionPoser
    ]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFlipPose")(flip.asInstanceOf[js.Any], key.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setValue(
    hasValuesProps: PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      DomPopmotionPoser
    ],
    key: String,
    to: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(hasValuesProps.asInstanceOf[js.Any], key.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
