package typings.popmotionPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnimationDef = typings.popmotionPose.typesMod.TransitionDefinition
  
  type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typings.popmotionPose.popmotionPoseStrings.BoundingBox with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type CubicBezierArgs = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  type DecayDefinition = typings.popmotionPose.anon.Type with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecayProps */ js.Any) with typings.popmotionPose.typesMod.NoEase
  
  type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typings.popmotionPose.popmotionPoseStrings.DragBounds with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.popmotionPose.popmotionPoseStrings.x
    - typings.popmotionPose.popmotionPoseStrings.y
  */
  type Draggable = typings.popmotionPose.typesMod._Draggable | scala.Boolean
  
  type KeyframesDefinition = typings.popmotionPose.anon.`0` with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyframesProps */ js.Any)
  
  type PhysicsDefinition = typings.popmotionPose.anon.`1` with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhysicsProps */ js.Any) with typings.popmotionPose.typesMod.NoEase
  
  type Pose = typings.poseCore.typesMod.Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    typings.popmotionPose.typesMod.TransitionDefinition
  ]
  
  type PoseMap = typings.poseCore.typesMod.PoseMap[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    typings.popmotionPose.typesMod.TransitionDefinition
  ]
  
  type PoserState = typings.poseCore.typesMod.PoserState[
    typings.popmotionPose.typesMod.Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
    typings.popmotionPose.typesMod.DomPopmotionPoser
  ]
  
  type SpringDefinition = typings.popmotionPose.anon.`2` with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringProps */ js.Any) with typings.popmotionPose.typesMod.NoEase
  
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  
  type Transition = js.Function1[
    /* props */ typings.popmotionPose.typesMod.ResolverProps, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any) | typings.popmotionPose.popmotionPoseBooleans.`false`
  ]
  
  type TransitionDefinition = typings.popmotionPose.typesMod.TweenDefinition | typings.popmotionPose.typesMod.PhysicsDefinition | typings.popmotionPose.typesMod.SpringDefinition | typings.popmotionPose.typesMod.DecayDefinition | typings.popmotionPose.typesMod.KeyframesDefinition
  
  type TweenDefinition = typings.tsEssentials.typesMod.Merge[
    typings.popmotionPose.anon.`3` with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps */ js.Any), 
    typings.popmotionPose.anon.Ease
  ]
}
