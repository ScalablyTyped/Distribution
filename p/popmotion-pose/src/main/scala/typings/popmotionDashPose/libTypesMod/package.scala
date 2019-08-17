package typings.popmotionDashPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.popmotion.libAnimationsDecayTypesMod.DecayProps
  import typings.popmotion.libAnimationsKeyframesTypesMod.KeyframesProps
  import typings.popmotion.libAnimationsPhysicsTypesMod.PhysicsProps
  import typings.popmotion.libAnimationsSpringTypesMod.SpringProps
  import typings.popmotion.libAnimationsTweenTypesMod.TweenProps
  import typings.popmotion.popmotionMod.Action
  import typings.popmotionDashPose.Anon_Decay
  import typings.popmotionDashPose.Anon_Ease
  import typings.popmotionDashPose.Anon_Keyframes
  import typings.popmotionDashPose.Anon_Physics
  import typings.popmotionDashPose.Anon_Spring
  import typings.popmotionDashPose.Anon_Tween
  import typings.popmotionDashPose.popmotionDashPoseNumbers.`false`
  import typings.tsDashEssentials.distTypesMod.Merge

  type AnimationDef = TransitionDefinition
  type BoundingBox = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typings.popmotionDashPose.popmotionDashPoseStrings.BoundingBox with js.Any
  type CubicBezierArgs = js.Tuple4[Double, Double, Double, Double]
  type DecayDefinition = Anon_Decay with TransitionDefinitionCommonProps with DecayProps with NoEase
  type DragBounds = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typings.popmotionDashPose.popmotionDashPoseStrings.DragBounds with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.popmotionDashPose.popmotionDashPoseStrings.x
    - typings.popmotionDashPose.popmotionDashPoseStrings.y
  */
  type Draggable = _Draggable | Boolean
  type KeyframesDefinition = Anon_Keyframes with TransitionDefinitionCommonProps with KeyframesProps
  type PhysicsDefinition = Anon_Physics with TransitionDefinitionCommonProps with PhysicsProps with NoEase
  type Pose = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias popmotion-pose.popmotion-pose/lib/types.Pose */ js.Object
  type PoseMap = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias popmotion-pose.popmotion-pose/lib/types.PoseMap */ js.Object
  type PoserState = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias popmotion-pose.popmotion-pose/lib/types.PoserState */ js.Object
  type ResolverProps = TransitionProps with StringDictionary[js.Any]
  type SpringDefinition = Anon_Spring with TransitionDefinitionCommonProps with SpringProps with NoEase
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type Transition = js.Function1[/* props */ ResolverProps, Action | `false`]
  type TransitionDefinition = TweenDefinition | PhysicsDefinition | SpringDefinition | DecayDefinition | KeyframesDefinition
  type TweenDefinition = Merge[Anon_Tween with TransitionDefinitionCommonProps with TweenProps, Anon_Ease]
}
