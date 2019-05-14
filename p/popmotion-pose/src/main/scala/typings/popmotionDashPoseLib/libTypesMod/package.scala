package typings
package popmotionDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type AnimationDef = TransitionDefinition
  type BoundingBox = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ popmotionDashPoseLib.popmotionDashPoseLibStrings.BoundingBox with js.Any
  type CubicBezierArgs = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type DecayDefinition = popmotionDashPoseLib.Anon_Decay with TransitionDefinitionCommonProps with popmotionLib.libAnimationsDecayTypesMod.DecayProps with NoEase
  type DragBounds = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ popmotionDashPoseLib.popmotionDashPoseLibStrings.DragBounds with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - popmotionDashPoseLib.popmotionDashPoseLibStrings.x
    - popmotionDashPoseLib.popmotionDashPoseLibStrings.y
  */
  type Draggable = _Draggable | scala.Boolean
  type KeyframesDefinition = popmotionDashPoseLib.Anon_Keyframes with TransitionDefinitionCommonProps with popmotionLib.libAnimationsKeyframesTypesMod.KeyframesProps
  type PhysicsDefinition = popmotionDashPoseLib.Anon_Physics with TransitionDefinitionCommonProps with popmotionLib.libAnimationsPhysicsTypesMod.PhysicsProps with NoEase
  type Pose = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias popmotion-pose.popmotion-pose/lib/types.Pose */ js.Object
  type PoseMap = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias popmotion-pose.popmotion-pose/lib/types.PoseMap */ js.Object
  type PoserState = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias popmotion-pose.popmotion-pose/lib/types.PoserState */ js.Object
  type ResolverProps = TransitionProps with org.scalablytyped.runtime.StringDictionary[js.Any]
  type SpringDefinition = popmotionDashPoseLib.Anon_Spring with TransitionDefinitionCommonProps with popmotionLib.libAnimationsSpringTypesMod.SpringProps with NoEase
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type Transition = js.Function1[
    /* props */ ResolverProps, 
    popmotionLib.popmotionMod.Action | popmotionDashPoseLib.popmotionDashPoseLibNumbers.`false`
  ]
  type TransitionDefinition = TweenDefinition | PhysicsDefinition | SpringDefinition | DecayDefinition | KeyframesDefinition
  type TweenDefinition = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Merge<{  type  :'tween'} & TransitionDefinitionCommonProps & TweenProps, {  ease  :TweenProps['ease'] | keyof typeof easingLookup | CubicBezierArgs}> */ js.Any
}
