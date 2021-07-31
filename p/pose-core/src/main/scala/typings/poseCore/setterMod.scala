package typings.poseCore

import typings.poseCore.typesMod.AddTransitionDelay
import typings.poseCore.typesMod.ConvertTransitionDefinition
import typings.poseCore.typesMod.GetInstantTransition
import typings.poseCore.typesMod.GetTransitionProps
import typings.poseCore.typesMod.Pose
import typings.poseCore.typesMod.PoseMap
import typings.poseCore.typesMod.PoserState
import typings.poseCore.typesMod.Props
import typings.poseCore.typesMod.ResolveTarget
import typings.poseCore.typesMod.SetValue
import typings.poseCore.typesMod.SetValueNative
import typings.poseCore.typesMod.StartAction
import typings.poseCore.typesMod.StopAction
import typings.poseCore.typesMod.TransformPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setterMod {
  
  @JSImport("pose-core/lib/factories/setter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V, A, C, P, TD](setterProps: SetterFactoryProps[V, A, C, P, TD]): js.Function3[
    /* next */ String, 
    /* nextProps */ js.UndefOr[Props], 
    /* propagate */ js.UndefOr[Boolean], 
    js.Promise[js.Array[js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(setterProps.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* next */ String, 
    /* nextProps */ js.UndefOr[Props], 
    /* propagate */ js.UndefOr[Boolean], 
    js.Promise[js.Array[js.Any]]
  ]]
  
  @scala.inline
  def resolveProp(target: js.Any, props: Props): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")(target.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait SetterFactoryProps[V, A, C, P, TD] extends StObject {
    
    def addActionDelay(delay: Double, transition: A): A
    @JSName("addActionDelay")
    var addActionDelay_Original: AddTransitionDelay[A]
    
    def convertTransitionDefinition(value: V, transitionDef: A | TD, props: Props): A
    @JSName("convertTransitionDefinition")
    var convertTransitionDefinition_Original: ConvertTransitionDefinition[V, A, TD]
    
    var forceRender: js.UndefOr[js.Function1[/* props */ Props, js.Any]] = js.undefined
    
    def getInstantTransition(value: V, props: Props): A
    @JSName("getInstantTransition")
    var getInstantTransition_Original: GetInstantTransition[V, A]
    
    def getTransitionProps(value: V, target: Double, props: Props): Props
    @JSName("getTransitionProps")
    var getTransitionProps_Original: GetTransitionProps[V]
    
    var posePriority: js.UndefOr[js.Array[String]] = js.undefined
    
    var poses: PoseMap[A, TD]
    
    def resolveTarget(value: V, target: js.Any): js.Any
    @JSName("resolveTarget")
    var resolveTarget_Original: ResolveTarget[V]
    
    def setValue(v: V, value: js.Any): Unit
    
    def setValueNative(key: String, value: js.Any, props: Props): Unit
    @JSName("setValueNative")
    var setValueNative_Original: SetValueNative
    
    @JSName("setValue")
    var setValue_Original: SetValue[V]
    
    def startAction(value: V, action: A, complete: js.Function0[js.Any]): C
    @JSName("startAction")
    var startAction_Original: StartAction[V, A, C]
    
    var state: PoserState[V, A, C, P]
    
    def stopAction(controls: C): js.Any
    @JSName("stopAction")
    var stopAction_Original: StopAction[C]
    
    var transformPose: js.UndefOr[TransformPose[V, A, C, P, TD]] = js.undefined
  }
  object SetterFactoryProps {
    
    @scala.inline
    def apply[V, A, C, P, TD](
      addActionDelay: (/* delay */ Double, A) => A,
      convertTransitionDefinition: (V, /* transitionDef */ TD | A, /* props */ Props) => A,
      getInstantTransition: (V, /* props */ Props) => A,
      getTransitionProps: (V, /* target */ Double, /* props */ Props) => Props,
      poses: PoseMap[A, TD],
      resolveTarget: (V, /* target */ js.Any) => js.Any,
      setValue: (V, /* value */ js.Any) => Unit,
      setValueNative: (/* key */ String, /* value */ js.Any, /* props */ Props) => Unit,
      startAction: (V, A, /* complete */ js.Function0[js.Any]) => C,
      state: PoserState[V, A, C, P],
      stopAction: C => js.Any
    ): SetterFactoryProps[V, A, C, P, TD] = {
      val __obj = js.Dynamic.literal(addActionDelay = js.Any.fromFunction2(addActionDelay), convertTransitionDefinition = js.Any.fromFunction3(convertTransitionDefinition), getInstantTransition = js.Any.fromFunction2(getInstantTransition), getTransitionProps = js.Any.fromFunction3(getTransitionProps), poses = poses.asInstanceOf[js.Any], resolveTarget = js.Any.fromFunction2(resolveTarget), setValue = js.Any.fromFunction2(setValue), setValueNative = js.Any.fromFunction3(setValueNative), startAction = js.Any.fromFunction3(startAction), state = state.asInstanceOf[js.Any], stopAction = js.Any.fromFunction1(stopAction))
      __obj.asInstanceOf[SetterFactoryProps[V, A, C, P, TD]]
    }
    
    @scala.inline
    implicit class SetterFactoryPropsMutableBuilder[Self <: SetterFactoryProps[?, ?, ?, ?, ?], V, A, C, P, TD] (val x: Self & (SetterFactoryProps[V, A, C, P, TD])) extends AnyVal {
      
      @scala.inline
      def setAddActionDelay(value: (/* delay */ Double, A) => A): Self = StObject.set(x, "addActionDelay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConvertTransitionDefinition(value: (V, /* transitionDef */ TD | A, /* props */ Props) => A): Self = StObject.set(x, "convertTransitionDefinition", js.Any.fromFunction3(value))
      
      @scala.inline
      def setForceRender(value: /* props */ Props => js.Any): Self = StObject.set(x, "forceRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setGetInstantTransition(value: (V, /* props */ Props) => A): Self = StObject.set(x, "getInstantTransition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetTransitionProps(value: (V, /* target */ Double, /* props */ Props) => Props): Self = StObject.set(x, "getTransitionProps", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPosePriority(value: js.Array[String]): Self = StObject.set(x, "posePriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosePriorityUndefined: Self = StObject.set(x, "posePriority", js.undefined)
      
      @scala.inline
      def setPosePriorityVarargs(value: String*): Self = StObject.set(x, "posePriority", js.Array(value :_*))
      
      @scala.inline
      def setPoses(value: PoseMap[A, TD]): Self = StObject.set(x, "poses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveTarget(value: (V, /* target */ js.Any) => js.Any): Self = StObject.set(x, "resolveTarget", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValue(value: (V, /* value */ js.Any) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValueNative(value: (/* key */ String, /* value */ js.Any, /* props */ Props) => Unit): Self = StObject.set(x, "setValueNative", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStartAction(value: (V, A, /* complete */ js.Function0[js.Any]) => C): Self = StObject.set(x, "startAction", js.Any.fromFunction3(value))
      
      @scala.inline
      def setState(value: PoserState[V, A, C, P]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopAction(value: C => js.Any): Self = StObject.set(x, "stopAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformPose(
        value: (/* pose */ Pose[A, TD], /* key */ String, /* state */ PoserState[V, A, C, P]) => Pose[A, TD]
      ): Self = StObject.set(x, "transformPose", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformPoseUndefined: Self = StObject.set(x, "transformPose", js.undefined)
    }
  }
}
