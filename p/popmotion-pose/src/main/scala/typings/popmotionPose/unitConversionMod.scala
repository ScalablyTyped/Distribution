package typings.popmotionPose

import typings.popmotionPose.libTypesMod.Pose
import typings.popmotionPose.libTypesMod.PoserState
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.popmotionPose.typesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitConversionMod {
  
  @JSImport("popmotion-pose/lib/dom/unit-conversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertPositionalUnits(
    state: PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.ColdSubscription */ js.Any, 
      DomPopmotionPoser
    ],
    nextPose: Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ js.Any, 
      TransitionDefinition
    ]
  ): Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ js.Any, 
    TransitionDefinition
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPositionalUnits")(state.asInstanceOf[js.Any], nextPose.asInstanceOf[js.Any])).asInstanceOf[Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ js.Any, 
    TransitionDefinition
  ]]
  
  inline def isPositional(
    pose: Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_flip.Action */ js.Any, 
      TransitionDefinition
    ]
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositional")(pose.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
