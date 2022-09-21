package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.TopLevel
import typings.popmotionPose.anon.Ease
import typings.popmotionPose.anon.Type
import typings.popmotionPose.popmotionPoseBooleans.`false`
import typings.tsEssentials.typesMod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationDef = TransitionDefinition

type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
  */ typings.popmotionPose.popmotionPoseStrings.BoundingBox & TopLevel[Any]

type CubicBezierArgs = js.Tuple4[Double, Double, Double, Double]

type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
  */ typings.popmotionPose.popmotionPoseStrings.DragBounds & TopLevel[Any]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.popmotionPose.popmotionPoseStrings.x
  - typings.popmotionPose.popmotionPoseStrings.y
*/
type Draggable = _Draggable | Boolean

type Pose = typings.poseCore.typesMod.Pose[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
TransitionDefinition]

type PoseMap = typings.poseCore.typesMod.PoseMap[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
TransitionDefinition]

type PoserState = typings.poseCore.typesMod.PoserState[
Value, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
DomPopmotionPoser]

type Transformer = js.Function1[/* v */ Any, Any]

type Transition = js.Function1[
/* props */ ResolverProps, 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any) | `false`]

/* Rewritten from type alias, can be one of: 
  - typings.popmotionPose.typesMod.TweenDefinition
  - typings.popmotionPose.typesMod.PhysicsDefinition
  - typings.popmotionPose.typesMod.SpringDefinition
  - typings.popmotionPose.typesMod.DecayDefinition
  - typings.popmotionPose.typesMod.KeyframesDefinition
*/
type TransitionDefinition = _TransitionDefinition | TweenDefinition

type TweenDefinition = Merge[
Type & TransitionDefinitionCommonProps & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps */ Any), 
Ease]
