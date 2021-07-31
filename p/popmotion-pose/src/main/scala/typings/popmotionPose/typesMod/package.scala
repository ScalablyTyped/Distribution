package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationDef = typings.popmotionPose.typesMod.TransitionDefinition

type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
  */ typings.popmotionPose.popmotionPoseStrings.BoundingBox & org.scalablytyped.runtime.TopLevel[js.Any]

type CubicBezierArgs = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]

type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
  */ typings.popmotionPose.popmotionPoseStrings.DragBounds & org.scalablytyped.runtime.TopLevel[js.Any]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.popmotionPose.popmotionPoseStrings.x
  - typings.popmotionPose.popmotionPoseStrings.y
*/
type Draggable = typings.popmotionPose.typesMod._Draggable | scala.Boolean

type Pose = typings.poseCore.typesMod.Pose[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
typings.popmotionPose.typesMod.TransitionDefinition]

type PoseMap = typings.poseCore.typesMod.PoseMap[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
typings.popmotionPose.typesMod.TransitionDefinition]

type PoserState = typings.poseCore.typesMod.PoserState[
typings.popmotionPose.typesMod.Value, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
typings.popmotionPose.typesMod.DomPopmotionPoser]

type Transformer = js.Function1[/* v */ js.Any, js.Any]

type Transition = js.Function1[
/* props */ typings.popmotionPose.typesMod.ResolverProps, 
(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any) | typings.popmotionPose.popmotionPoseBooleans.`false`]

/* Rewritten from type alias, can be one of: 
  - typings.popmotionPose.typesMod.TweenDefinition
  - typings.popmotionPose.typesMod.PhysicsDefinition
  - typings.popmotionPose.typesMod.SpringDefinition
  - typings.popmotionPose.typesMod.DecayDefinition
  - typings.popmotionPose.typesMod.KeyframesDefinition
*/
type TransitionDefinition = typings.popmotionPose.typesMod._TransitionDefinition | typings.popmotionPose.typesMod.TweenDefinition

type TweenDefinition = typings.tsEssentials.typesMod.Merge[
typings.popmotionPose.anon.Type & typings.popmotionPose.typesMod.TransitionDefinitionCommonProps & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps */ js.Any), 
typings.popmotionPose.anon.Ease]
