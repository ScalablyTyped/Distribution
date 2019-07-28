package typings.popmotionDashPose.libTypesMod

import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotion.popmotionMod.Action
import typings.popmotionDashPose.Anon_ElementStyler
import typings.poseDashCore.libTypesMod.ExtendAPI
import typings.poseDashCore.libTypesMod.Poser
import typings.poseDashCore.libTypesMod.PoserConfig
import typings.poseDashCore.libTypesMod.ReadValueFromSource
import typings.poseDashCore.libTypesMod.TransformPose
import typings.stylefire.libStylerTypesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopmotionPoserFactoryConfig[P, TD] extends js.Object {
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[Value, Action, ColdSubscription, P] = js.native
  var posePriority: js.UndefOr[js.Array[String]] = js.native
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
  @JSName("transformPose")
  var transformPose_Original: TransformPose[Value, Action, ColdSubscription, P, TD] = js.native
  def addListenerToValue(key: String, styler: Styler): js.Function1[/* v */ js.Any, Unit] = js.native
  def extendAPI(
    api: Poser[Value, Action, ColdSubscription, P],
    state: typings.poseDashCore.libTypesMod.PoserState[Value, Action, ColdSubscription, P],
    config: PoserConfig[Value]
  ): Poser[Value, Action, ColdSubscription, P] = js.native
  def forceRender(props: Anon_ElementStyler): Unit = js.native
  def setValueNative(key: String, to: js.Any, props: Anon_ElementStyler): Unit = js.native
  def transformPose(
    pose: typings.poseDashCore.libTypesMod.Pose[Action, TD],
    key: String,
    state: typings.poseDashCore.libTypesMod.PoserState[Value, Action, ColdSubscription, P]
  ): typings.poseDashCore.libTypesMod.Pose[Action, TD] = js.native
}

