package typings.popmotionPose.typesMod

import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.mod.Action_
import typings.popmotionPose.anon.ElementStyler
import typings.poseCore.typesMod.ExtendAPI
import typings.poseCore.typesMod.Poser
import typings.poseCore.typesMod.PoserConfig
import typings.poseCore.typesMod.ReadValueFromSource
import typings.poseCore.typesMod.TransformPose
import typings.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopmotionPoserFactoryConfig[P, TD] extends js.Object {
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[Value, Action_[ColdSubscription], ColdSubscription, P] = js.native
  var posePriority: js.UndefOr[js.Array[String]] = js.native
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
  @JSName("transformPose")
  var transformPose_Original: TransformPose[Value, Action_[ColdSubscription], ColdSubscription, P, TD] = js.native
  def addListenerToValue(key: String, styler: Styler): js.Function1[/* v */ js.Any, Unit] = js.native
  def extendAPI(
    api: Poser[Value, Action_[ColdSubscription], ColdSubscription, P],
    state: typings.poseCore.typesMod.PoserState[Value, Action_[ColdSubscription], ColdSubscription, P],
    config: PoserConfig[Value]
  ): Poser[Value, Action_[ColdSubscription], ColdSubscription, P] = js.native
  def forceRender(props: ElementStyler): Unit = js.native
  def setValueNative(key: String, to: js.Any, props: ElementStyler): Unit = js.native
  def transformPose(
    pose: typings.poseCore.typesMod.Pose[Action_[ColdSubscription], TD],
    key: String,
    state: typings.poseCore.typesMod.PoserState[Value, Action_[ColdSubscription], ColdSubscription, P]
  ): typings.poseCore.typesMod.Pose[Action_[ColdSubscription], TD] = js.native
}

