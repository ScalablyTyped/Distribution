package typings.poseCore

import org.scalablytyped.runtime.StringDictionary
import typings.poseCore.poseCoreBooleans.`false`
import typings.poseCore.poseCoreNumbers.`-1`
import typings.poseCore.poseCoreNumbers.`1`
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ActiveActions[A] = Map[String, A]
  
  type ActivePoses = Map[String, js.Array[String]]
  
  type AddTransitionDelay[A] = js.Function2[/* delay */ Double, /* transition */ A, A]
  
  @js.native
  trait AncestorValue[V] extends StObject {
    
    var label: js.UndefOr[String] = js.native
    
    var values: ValueMap[V] = js.native
  }
  object AncestorValue {
    
    @scala.inline
    def apply[V](values: ValueMap[V]): AncestorValue[V] = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[AncestorValue[V]]
    }
    
    @scala.inline
    implicit class AncestorValueMutableBuilder[Self <: AncestorValue[_], V] (val x: Self with AncestorValue[V]) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValues(value: ValueMap[V]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  @js.native
  trait Pose[A, TD]
    extends /* key */ StringDictionary[js.Any] {
    
    var afterChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.native
    
    var applyAtEnd: js.UndefOr[ApplyMap] = js.native
    
    var applyAtStart: js.UndefOr[ApplyMap] = js.native
    
    var beforeChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.native
    
    var delay: js.UndefOr[Double | NumberPropFactory] = js.native
    
    var delayChildren: js.UndefOr[Double | NumberPropFactory] = js.native
    
    var preTransform: js.UndefOr[js.Function0[_]] = js.native
    
    var preTransition: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
    
    var staggerChildren: js.UndefOr[Double | NumberPropFactory] = js.native
    
    var staggerDirection: js.UndefOr[`1` | `-1` | StaggerDirectionPropFactory] = js.native
    
    var transition: js.UndefOr[(TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])] = js.native
  }
  object Pose {
    
    @scala.inline
    def apply[A, TD](): Pose[A, TD] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pose[A, TD]]
    }
    
    @scala.inline
    implicit class PoseMutableBuilder[Self <: Pose[_, _], A, TD] (val x: Self with (Pose[A, TD])) extends AnyVal {
      
      @scala.inline
      def setAfterChildren(value: Boolean | BooleanPropFactory): Self = StObject.set(x, "afterChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterChildrenFunction1(value: /* props */ Props => Boolean): Self = StObject.set(x, "afterChildren", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterChildrenUndefined: Self = StObject.set(x, "afterChildren", js.undefined)
      
      @scala.inline
      def setApplyAtEnd(value: ApplyMap): Self = StObject.set(x, "applyAtEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyAtEndUndefined: Self = StObject.set(x, "applyAtEnd", js.undefined)
      
      @scala.inline
      def setApplyAtStart(value: ApplyMap): Self = StObject.set(x, "applyAtStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyAtStartUndefined: Self = StObject.set(x, "applyAtStart", js.undefined)
      
      @scala.inline
      def setBeforeChildren(value: Boolean | BooleanPropFactory): Self = StObject.set(x, "beforeChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeChildrenFunction1(value: /* props */ Props => Boolean): Self = StObject.set(x, "beforeChildren", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeChildrenUndefined: Self = StObject.set(x, "beforeChildren", js.undefined)
      
      @scala.inline
      def setDelay(value: Double | NumberPropFactory): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayChildren(value: Double | NumberPropFactory): Self = StObject.set(x, "delayChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayChildrenFunction1(value: /* props */ Props => Double): Self = StObject.set(x, "delayChildren", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelayChildrenUndefined: Self = StObject.set(x, "delayChildren", js.undefined)
      
      @scala.inline
      def setDelayFunction1(value: /* props */ Props => Double): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setPreTransform(value: () => _): Self = StObject.set(x, "preTransform", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreTransformUndefined: Self = StObject.set(x, "preTransform", js.undefined)
      
      @scala.inline
      def setPreTransition(value: /* props */ Props => _): Self = StObject.set(x, "preTransition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreTransitionUndefined: Self = StObject.set(x, "preTransition", js.undefined)
      
      @scala.inline
      def setStaggerChildren(value: Double | NumberPropFactory): Self = StObject.set(x, "staggerChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaggerChildrenFunction1(value: /* props */ Props => Double): Self = StObject.set(x, "staggerChildren", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStaggerChildrenUndefined: Self = StObject.set(x, "staggerChildren", js.undefined)
      
      @scala.inline
      def setStaggerDirection(value: `1` | `-1` | StaggerDirectionPropFactory): Self = StObject.set(x, "staggerDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaggerDirectionFunction1(value: /* props */ Props => `1` | `-1`): Self = StObject.set(x, "staggerDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStaggerDirectionUndefined: Self = StObject.set(x, "staggerDirection", js.undefined)
      
      @scala.inline
      def setTransition(value: (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionFunction1(value: /* props */ Props => TransitionMap[A, TD]): Self = StObject.set(x, "transition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  @js.native
  trait PoseFactoryConfig[V, A, C, P, TD] extends StObject {
    
    def addActionDelay(delay: Double, transition: A): A = js.native
    @JSName("addActionDelay")
    var addActionDelay_Original: AddTransitionDelay[A] = js.native
    
    def bindOnChange(values: ValueMap[V], onChange: OnChangeCallbacks): js.Function1[/* key */ String, _] = js.native
    
    def convertTransitionDefinition(value: V, transitionDef: A | TD, props: Props): A = js.native
    @JSName("convertTransitionDefinition")
    var convertTransitionDefinition_Original: ConvertTransitionDefinition[V, A, TD] = js.native
    
    def convertValue(value: js.Any, key: String, props: Props): V = js.native
    @JSName("convertValue")
    var convertValue_Original: ConvertValue[V] = js.native
    
    def createValue(init: js.Any, key: String, props: Props): V = js.native
    def createValue(init: js.Any, key: String, props: Props, createValueProps: CreateValueProps): V = js.native
    @JSName("createValue")
    var createValue_Original: CreateValue[V] = js.native
    
    var defaultTransitions: js.UndefOr[Map[String, TransitionMap[A, TD]]] = js.native
    
    def extendAPI(api: Poser[V, A, C, P], state: PoserState[V, A, C, P], config: PoserConfig[V]): Poser[V, A, C, P] = js.native
    @JSName("extendAPI")
    var extendAPI_Original: ExtendAPI[V, A, C, P] = js.native
    
    var forceRender: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
    
    var getDefaultProps: js.UndefOr[js.Function1[/* config */ PoserConfig[V], Props]] = js.native
    
    def getInstantTransition(value: V, props: Props): A = js.native
    @JSName("getInstantTransition")
    var getInstantTransition_Original: GetInstantTransition[V, A] = js.native
    
    def getTransitionProps(value: V, target: Double, props: Props): Props = js.native
    @JSName("getTransitionProps")
    var getTransitionProps_Original: GetTransitionProps[V] = js.native
    
    var posePriority: js.UndefOr[js.Array[String]] = js.native
    
    def readValue(value: V): js.Any = js.native
    
    var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
    
    @JSName("readValue")
    var readValue_Original: ReadValue[V] = js.native
    
    def resolveTarget(value: V, target: js.Any): js.Any = js.native
    @JSName("resolveTarget")
    var resolveTarget_Original: ResolveTarget[V] = js.native
    
    def selectValueToRead(value: V): js.Any = js.native
    @JSName("selectValueToRead")
    var selectValueToRead_Original: SelectValueToRead[V] = js.native
    
    def setValue(v: V, value: js.Any): Unit = js.native
    
    def setValueNative(key: String, value: js.Any, props: Props): Unit = js.native
    @JSName("setValueNative")
    var setValueNative_Original: SetValueNative = js.native
    
    @JSName("setValue")
    var setValue_Original: SetValue[V] = js.native
    
    def startAction(value: V, action: A, complete: js.Function0[_]): C = js.native
    @JSName("startAction")
    var startAction_Original: StartAction[V, A, C] = js.native
    
    def stopAction(controls: C): js.Any = js.native
    @JSName("stopAction")
    var stopAction_Original: StopAction[C] = js.native
    
    var transformPose: js.UndefOr[TransformPose[V, A, C, P, TD]] = js.native
  }
  
  type PoseMap[A, TD] = StringDictionary[Pose[A, TD]]
  
  @js.native
  trait Poser[V, A, C, P] extends StObject {
    
    def _addChild(config: PoserConfig[V], factory: PoserFactory[V, A, C, P]): Poser[V, A, C, P] = js.native
    
    def clearChildren(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def get(): js.Any = js.native
    def get(key: String): js.Any = js.native
    
    def has(key: String): Boolean = js.native
    
    def removeChild(child: Poser[V, A, C, P]): Unit = js.native
    
    def set(next: String): js.Promise[_] = js.native
    def set(next: String, props: Props): js.Promise[_] = js.native
    
    def setProps(props: Props): Unit = js.native
    
    def unset(toUnset: String): js.Promise[_] = js.native
    def unset(toUnset: String, props: Props): js.Promise[_] = js.native
  }
  
  @js.native
  trait PoserConfig[V]
    extends /* key */ StringDictionary[js.Any] {
    
    var ancestorValues: js.UndefOr[AncestorValueList[V]] = js.native
    
    var initialPose: js.UndefOr[String | js.Array[String]] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[OnChangeCallbacks] = js.native
    
    var parentValues: js.UndefOr[ValueMap[V]] = js.native
    
    var passive: js.UndefOr[PassiveValueMap] = js.native
    
    var props: js.UndefOr[Props] = js.native
    
    var values: js.UndefOr[StringDictionary[V]] = js.native
  }
  object PoserConfig {
    
    @scala.inline
    def apply[V](): PoserConfig[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoserConfig[V]]
    }
    
    @scala.inline
    implicit class PoserConfigMutableBuilder[Self <: PoserConfig[_], V] (val x: Self with PoserConfig[V]) extends AnyVal {
      
      @scala.inline
      def setAncestorValues(value: AncestorValueList[V]): Self = StObject.set(x, "ancestorValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAncestorValuesUndefined: Self = StObject.set(x, "ancestorValues", js.undefined)
      
      @scala.inline
      def setAncestorValuesVarargs(value: AncestorValue[V]*): Self = StObject.set(x, "ancestorValues", js.Array(value :_*))
      
      @scala.inline
      def setInitialPose(value: String | js.Array[String]): Self = StObject.set(x, "initialPose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPoseUndefined: Self = StObject.set(x, "initialPose", js.undefined)
      
      @scala.inline
      def setInitialPoseVarargs(value: String*): Self = StObject.set(x, "initialPose", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(value: OnChangeCallbacks): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setParentValues(value: ValueMap[V]): Self = StObject.set(x, "parentValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentValuesUndefined: Self = StObject.set(x, "parentValues", js.undefined)
      
      @scala.inline
      def setPassive(value: PassiveValueMap): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setValues(value: StringDictionary[V]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type PoserFactory[V, A, C, P] = js.Function1[/* config */ PoserConfig[V], Poser[V, A, C, P]]
  
  @js.native
  trait PoserState[V, A, C, P] extends StObject {
    
    var activeActions: ActiveActions[C] = js.native
    
    var activePoses: ActivePoses = js.native
    
    var children: ChildPosers[V, A, C, P] = js.native
    
    var props: Props = js.native
    
    var values: ValueMap[V] = js.native
  }
  object PoserState {
    
    @scala.inline
    def apply[V, A, C, P](
      activeActions: ActiveActions[C],
      activePoses: ActivePoses,
      children: ChildPosers[V, A, C, P],
      props: Props,
      values: ValueMap[V]
    ): PoserState[V, A, C, P] = {
      val __obj = js.Dynamic.literal(activeActions = activeActions.asInstanceOf[js.Any], activePoses = activePoses.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoserState[V, A, C, P]]
    }
    
    @scala.inline
    implicit class PoserStateMutableBuilder[Self <: PoserState[_, _, _, _], V, A, C, P] (val x: Self with (PoserState[V, A, C, P])) extends AnyVal {
      
      @scala.inline
      def setActiveActions(value: ActiveActions[C]): Self = StObject.set(x, "activeActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePoses(value: ActivePoses): Self = StObject.set(x, "activePoses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ChildPosers[V, A, C, P]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: ValueMap[V]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
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
