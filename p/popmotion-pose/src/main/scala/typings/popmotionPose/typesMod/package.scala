package typings.popmotionPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnimationDef = typings.popmotionPose.typesMod.TransitionDefinition
  type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typings.popmotionPose.popmotionPoseStrings.BoundingBox with org.scalablytyped.runtime.TopLevel[js.Any]
  type CubicBezierArgs = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typings.popmotionPose.popmotionPoseStrings.DragBounds with org.scalablytyped.runtime.TopLevel[js.Any]
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.popmotionPose.popmotionPoseStrings.x
    - typings.popmotionPose.popmotionPoseStrings.y
  */
  type Draggable = typings.popmotionPose.typesMod._Draggable | scala.Boolean
  type Pose = typings.poseCore.typesMod.Pose[
    typings.popmotion.mod.Action_[typings.popmotion.actionTypesMod.ColdSubscription], 
    typings.popmotionPose.typesMod.TransitionDefinition
  ]
  type PoseMap = typings.poseCore.typesMod.PoseMap[
    typings.popmotion.mod.Action_[typings.popmotion.actionTypesMod.ColdSubscription], 
    typings.popmotionPose.typesMod.TransitionDefinition
  ]
  type PoserState = typings.poseCore.typesMod.PoserState[
    typings.popmotionPose.typesMod.Value, 
    typings.popmotion.mod.Action_[typings.popmotion.actionTypesMod.ColdSubscription], 
    typings.popmotion.actionTypesMod.ColdSubscription, 
    typings.popmotionPose.typesMod.DomPopmotionPoser
  ]
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type Transition = js.Function1[
    /* props */ typings.popmotionPose.typesMod.ResolverProps, 
    typings.popmotion.mod.Action_[typings.popmotion.actionTypesMod.ColdSubscription] | typings.popmotionPose.popmotionPoseBooleans.`false`
  ]
}
