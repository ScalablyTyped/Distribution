package typings.poseDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.poseDashCore.poseDashCoreNumbers.`-1`
  import typings.poseDashCore.poseDashCoreNumbers.`1`
  import typings.poseDashCore.poseDashCoreNumbers.`false`
  import typings.std.Map
  import typings.std.Set

  type ActiveActions[A] = Map[String, A]
  type ActivePoses = Map[String, js.Array[String]]
  type AddTransitionDelay[A] = js.Function2[/* delay */ Double, /* transition */ A, A]
  type AncestorValueList[V] = js.Array[AncestorValue[V]]
  type ApplyMap = StringDictionary[ApplyResolve | String | Double]
  type ApplyResolve = js.Function1[/* props */ Props, String | Double]
  type BooleanPropFactory = js.Function1[/* props */ Props, Boolean]
  type ChildPosers[V, A, C, P] = Set[Poser[V, A, C, P]]
  type ConvertTransitionDefinition[V, A, TD] = js.Function3[/* value */ V, /* transitionDef */ TD | A, /* props */ Props, A]
  type ConvertValue[V] = js.Function3[/* value */ js.Any, /* key */ String, /* props */ Props, V]
  type CreateValue[V] = js.Function4[
    /* init */ js.Any, 
    /* key */ String, 
    /* props */ Props, 
    /* createValueProps */ js.UndefOr[CreateValueProps], 
    V
  ]
  type CreateValueProps = js.Any
  type ExtendAPI[V, A, C, P] = js.Function3[
    /* api */ Poser[V, A, C, P], 
    /* state */ PoserState[V, A, C, P], 
    /* config */ PoserConfig[V], 
    Poser[V, A, C, P]
  ]
  type GetInstantTransition[V, A] = js.Function2[/* value */ V, /* props */ Props, A]
  type GetTransitionProps[V] = js.Function3[/* value */ V, /* target */ Double, /* props */ Props, Props]
  type NumberPropFactory = js.Function1[/* props */ Props, Double]
  type OnChangeCallbacks = StringDictionary[js.Function1[/* v */ js.Any, js.Any]]
  type PassiveValueMap = StringDictionary[js.Tuple3[String, js.Any, Boolean | String | Unit]]
  type PoseMap[A, TD] = StringDictionary[Pose[A, TD]]
  type PoserFactory[V, A, C, P] = js.Function1[/* config */ PoserConfig[V], Poser[V, A, C, P]]
  type Props = StringDictionary[js.Any]
  type ReadValue[V] = js.Function1[/* value */ V, js.Any]
  type ReadValueFromSource = js.Function2[/* key */ String, /* props */ Props, js.Any]
  type ResolveTarget[V] = js.Function2[/* value */ V, /* target */ js.Any, js.Any]
  type SelectValueToRead[V] = js.Function1[/* value */ V, js.Any]
  type SetValue[V] = js.Function2[/* v */ V, /* value */ js.Any, Unit]
  type SetValueNative = js.Function3[/* key */ String, /* value */ js.Any, /* props */ Props, Unit]
  type StaggerDirectionPropFactory = js.Function1[/* props */ Props, `1` | `-1`]
  type StartAction[V, A, C] = js.Function3[/* value */ V, /* action */ A, /* complete */ js.Function0[js.Any], C]
  type StopAction[C] = js.Function1[/* controls */ C, js.Any]
  type TransformPose[V, A, C, P, TD] = js.Function3[
    /* pose */ Pose[A, TD], 
    /* key */ String, 
    /* state */ PoserState[V, A, C, P], 
    Pose[A, TD]
  ]
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type TransitionFactory[A, TD] = js.Function1[/* props */ Props, TD | A | `false`]
  type TransitionMap[A, TD] = StringDictionary[TD | A | `false` | (TransitionFactory[A, TD])]
  type TransitionMapFactory[A, TD] = js.Function1[/* props */ Props, TransitionMap[A, TD]]
  type ValueMap[V] = Map[String, V]
}
