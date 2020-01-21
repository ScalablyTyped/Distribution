package typings.popmotionPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnimationDef = typings.popmotionPose.typesMod.TransitionDefinition
  type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typings.popmotionPose.popmotionPoseStrings.BoundingBox with js.Any
  type CubicBezierArgs = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type DecayDefinition = typings.popmotionPose.AnonDecay with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with typings.popmotion.decayTypesMod.DecayProps with typings.popmotionPose.typesMod.NoEase
  type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typings.popmotionPose.popmotionPoseStrings.DragBounds with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.popmotionPose.popmotionPoseStrings.x
    - typings.popmotionPose.popmotionPoseStrings.y
  */
  type Draggable = typings.popmotionPose.typesMod._Draggable | scala.Boolean
  type KeyframesDefinition = typings.popmotionPose.AnonKeyframes with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with typings.popmotion.keyframesTypesMod.KeyframesProps
  type PhysicsDefinition = typings.popmotionPose.AnonPhysics with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with typings.popmotion.physicsTypesMod.PhysicsProps with typings.popmotionPose.typesMod.NoEase
  type Pose = typings.poseCore.typesMod.Pose[typings.popmotion.mod.Action_, typings.popmotionPose.typesMod.TransitionDefinition]
  type PoseMap = typings.poseCore.typesMod.PoseMap[typings.popmotion.mod.Action_, typings.popmotionPose.typesMod.TransitionDefinition]
  type PoserState = typings.poseCore.typesMod.PoserState[
    typings.popmotionPose.typesMod.Value, 
    typings.popmotion.mod.Action_, 
    typings.popmotion.typesMod.ColdSubscription, 
    typings.popmotionPose.typesMod.DomPopmotionPoser
  ]
  type ResolverProps = typings.popmotionPose.typesMod.TransitionProps with org.scalablytyped.runtime.StringDictionary[js.Any]
  type SpringDefinition = typings.popmotionPose.AnonSpring with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with typings.popmotion.springTypesMod.SpringProps with typings.popmotionPose.typesMod.NoEase
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type Transition = js.Function1[
    /* props */ typings.popmotionPose.typesMod.ResolverProps, 
    typings.popmotion.mod.Action_ | typings.popmotionPose.popmotionPoseBooleans.`false`
  ]
  type TransitionDefinition = typings.popmotionPose.typesMod.TweenDefinition | typings.popmotionPose.typesMod.PhysicsDefinition | typings.popmotionPose.typesMod.SpringDefinition | typings.popmotionPose.typesMod.DecayDefinition | typings.popmotionPose.typesMod.KeyframesDefinition
  type TweenDefinition = typings.tsEssentials.mod.Merge[
    typings.popmotionPose.AnonTween with typings.popmotionPose.typesMod.TransitionDefinitionCommonProps with typings.popmotion.tweenTypesMod.TweenProps, 
    typings.popmotionPose.AnonEase
  ]
}
