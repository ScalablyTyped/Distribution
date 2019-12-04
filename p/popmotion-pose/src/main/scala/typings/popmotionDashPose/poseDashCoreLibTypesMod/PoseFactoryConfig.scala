package typings.popmotionDashPose.poseDashCoreLibTypesMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoseFactoryConfig[V, A, C, P, TD] extends js.Object {
  @JSName("addActionDelay")
  var addActionDelay_Original: AddTransitionDelay[A] = js.native
  @JSName("convertTransitionDefinition")
  var convertTransitionDefinition_Original: ConvertTransitionDefinition[V, A, TD] = js.native
  @JSName("convertValue")
  var convertValue_Original: ConvertValue[V] = js.native
  @JSName("createValue")
  var createValue_Original: CreateValue[V] = js.native
  var defaultTransitions: js.UndefOr[Map[String, TransitionMap[A, TD]]] = js.native
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[V, A, C, P] = js.native
  var forceRender: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
  var getDefaultProps: js.UndefOr[js.Function1[/* config */ PoserConfig[V], Props]] = js.native
  @JSName("getInstantTransition")
  var getInstantTransition_Original: GetInstantTransition[V, A] = js.native
  @JSName("getTransitionProps")
  var getTransitionProps_Original: GetTransitionProps[V] = js.native
  var posePriority: js.UndefOr[js.Array[String]] = js.native
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
  @JSName("readValue")
  var readValue_Original: ReadValue[V] = js.native
  @JSName("resolveTarget")
  var resolveTarget_Original: ResolveTarget[V] = js.native
  @JSName("selectValueToRead")
  var selectValueToRead_Original: SelectValueToRead[V] = js.native
  @JSName("setValueNative")
  var setValueNative_Original: SetValueNative = js.native
  @JSName("setValue")
  var setValue_Original: SetValue[V] = js.native
  @JSName("startAction")
  var startAction_Original: StartAction[V, A, C] = js.native
  @JSName("stopAction")
  var stopAction_Original: StopAction[C] = js.native
  var transformPose: js.UndefOr[TransformPose[V, A, C, P, TD]] = js.native
  def addActionDelay(delay: Double, transition: A): A = js.native
  def bindOnChange(values: ValueMap[V], onChange: OnChangeCallbacks): js.Function1[/* key */ String, _] = js.native
  def convertTransitionDefinition(value: V, transitionDef: A | TD, props: Props): A = js.native
  def convertValue(value: js.Any, key: String, props: Props): V = js.native
  def createValue(init: js.Any, key: String, props: Props): V = js.native
  def createValue(init: js.Any, key: String, props: Props, createValueProps: CreateValueProps): V = js.native
  def extendAPI(api: Poser[V, A, C, P], state: PoserState[V, A, C, P], config: PoserConfig[V]): Poser[V, A, C, P] = js.native
  def getInstantTransition(value: V, props: Props): A = js.native
  def getTransitionProps(value: V, target: Double, props: Props): Props = js.native
  def readValue(value: V): js.Any = js.native
  def resolveTarget(value: V, target: js.Any): js.Any = js.native
  def selectValueToRead(value: V): js.Any = js.native
  def setValue(v: V, value: js.Any): Unit = js.native
  def setValueNative(key: String, value: js.Any, props: Props): Unit = js.native
  def startAction(value: V, action: A, complete: js.Function0[_]): C = js.native
  def stopAction(controls: C): js.Any = js.native
}

