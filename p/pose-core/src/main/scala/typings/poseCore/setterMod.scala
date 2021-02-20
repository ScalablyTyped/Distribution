package typings.poseCore

import typings.poseCore.typesMod.AddTransitionDelay
import typings.poseCore.typesMod.ConvertTransitionDefinition
import typings.poseCore.typesMod.GetInstantTransition
import typings.poseCore.typesMod.GetTransitionProps
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setterMod {
  
  @JSImport("pose-core/lib/factories/setter", JSImport.Default)
  @js.native
  def default[V, A, C, P, TD](setterProps: SetterFactoryProps[V, A, C, P, TD]): js.Function3[
    /* next */ String, 
    /* nextProps */ js.UndefOr[Props], 
    /* propagate */ js.UndefOr[Boolean], 
    js.Promise[js.Array[_]]
  ] = js.native
  
  @JSImport("pose-core/lib/factories/setter", "resolveProp")
  @js.native
  def resolveProp(target: js.Any, props: Props): js.Any = js.native
  
  @js.native
  trait SetterFactoryProps[V, A, C, P, TD] extends StObject {
    
    def addActionDelay(delay: Double, transition: A): A = js.native
    @JSName("addActionDelay")
    var addActionDelay_Original: AddTransitionDelay[A] = js.native
    
    def convertTransitionDefinition(value: V, transitionDef: A | TD, props: Props): A = js.native
    @JSName("convertTransitionDefinition")
    var convertTransitionDefinition_Original: ConvertTransitionDefinition[V, A, TD] = js.native
    
    var forceRender: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
    
    def getInstantTransition(value: V, props: Props): A = js.native
    @JSName("getInstantTransition")
    var getInstantTransition_Original: GetInstantTransition[V, A] = js.native
    
    def getTransitionProps(value: V, target: Double, props: Props): Props = js.native
    @JSName("getTransitionProps")
    var getTransitionProps_Original: GetTransitionProps[V] = js.native
    
    var posePriority: js.UndefOr[js.Array[String]] = js.native
    
    var poses: PoseMap[A, TD] = js.native
    
    def resolveTarget(value: V, target: js.Any): js.Any = js.native
    @JSName("resolveTarget")
    var resolveTarget_Original: ResolveTarget[V] = js.native
    
    def setValue(v: V, value: js.Any): Unit = js.native
    
    def setValueNative(key: String, value: js.Any, props: Props): Unit = js.native
    @JSName("setValueNative")
    var setValueNative_Original: SetValueNative = js.native
    
    @JSName("setValue")
    var setValue_Original: SetValue[V] = js.native
    
    def startAction(value: V, action: A, complete: js.Function0[_]): C = js.native
    @JSName("startAction")
    var startAction_Original: StartAction[V, A, C] = js.native
    
    var state: PoserState[V, A, C, P] = js.native
    
    def stopAction(controls: C): js.Any = js.native
    @JSName("stopAction")
    var stopAction_Original: StopAction[C] = js.native
    
    var transformPose: js.UndefOr[TransformPose[V, A, C, P, TD]] = js.native
  }
}
