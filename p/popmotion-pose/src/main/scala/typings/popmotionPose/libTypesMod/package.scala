package typings.popmotionPose.libTypesMod

import typings.popmotionPose.anon.Ease
import typings.popmotionPose.anon.Type
import typings.popmotionPose.popmotionPoseBooleans.`false`
import typings.tsEssentials.distTypesMod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationDef = TransitionDefinition

type CubicBezierArgs = js.Tuple4[Double, Double, Double, Double]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.popmotionPose.popmotionPoseStrings.x
  - typings.popmotionPose.popmotionPoseStrings.y
*/
type Draggable = _Draggable | Boolean

type Pose = typings.poseCore.libTypesMod.Pose[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
TransitionDefinition]

type PoseMap = typings.poseCore.libTypesMod.PoseMap[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
TransitionDefinition]

type PoserState = typings.poseCore.libTypesMod.PoserState[
Value, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
DomPopmotionPoser]

type Transformer = js.Function1[/* v */ Any, Any]

type Transition = js.Function1[
/* props */ ResolverProps, 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any) | `false`]

/* Rewritten from type alias, can be one of: 
  - typings.popmotionPose.libTypesMod.TweenDefinition
  - typings.popmotionPose.libTypesMod.PhysicsDefinition
  - typings.popmotionPose.libTypesMod.SpringDefinition
  - typings.popmotionPose.libTypesMod.DecayDefinition
  - typings.popmotionPose.libTypesMod.KeyframesDefinition
*/
type TransitionDefinition = _TransitionDefinition | TweenDefinition

type TweenDefinition = Merge[
Type & TransitionDefinitionCommonProps & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps */ Any), 
Ease]
