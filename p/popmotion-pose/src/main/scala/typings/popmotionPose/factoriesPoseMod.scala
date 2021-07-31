package typings.popmotionPose

import typings.popmotionPose.libTypesMod.PoserConfig
import typings.popmotionPose.typesMod.PopmotionPoserFactoryConfig
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.popmotionPose.typesMod.Value
import typings.poseCore.typesMod.Poser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoriesPoseMod {
  
  @JSImport("popmotion-pose/lib/factories/pose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[
    /* config */ PoserConfig[Value], 
    Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* config */ PoserConfig[Value], 
    Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ]
  ]]
}
