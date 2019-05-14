package typings
package popmotionDashPoseLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopmotionPoserFactoryConfig[P, TD] extends js.Object {
  @JSName("extendAPI")
  var extendAPI_Original: poseDashCoreLib.libTypesMod.ExtendAPI[
    Value, 
    popmotionLib.popmotionMod.Action, 
    popmotionLib.libActionTypesMod.ColdSubscription, 
    P
  ] = js.native
  var posePriority: js.UndefOr[js.Array[java.lang.String]] = js.native
  var readValueFromSource: js.UndefOr[poseDashCoreLib.libTypesMod.ReadValueFromSource] = js.native
  @JSName("transformPose")
  var transformPose_Original: poseDashCoreLib.libTypesMod.TransformPose[
    Value, 
    popmotionLib.popmotionMod.Action, 
    popmotionLib.libActionTypesMod.ColdSubscription, 
    P, 
    TD
  ] = js.native
  def addListenerToValue(key: java.lang.String, styler: stylefireLib.libStylerTypesMod.Styler): js.Function1[/* v */ js.Any, scala.Unit] = js.native
  def extendAPI(
    api: poseDashCoreLib.libTypesMod.Poser[
      Value, 
      popmotionLib.popmotionMod.Action, 
      popmotionLib.libActionTypesMod.ColdSubscription, 
      P
    ],
    state: poseDashCoreLib.libTypesMod.PoserState[
      Value, 
      popmotionLib.popmotionMod.Action, 
      popmotionLib.libActionTypesMod.ColdSubscription, 
      P
    ],
    config: poseDashCoreLib.libTypesMod.PoserConfig[Value]
  ): poseDashCoreLib.libTypesMod.Poser[
    Value, 
    popmotionLib.popmotionMod.Action, 
    popmotionLib.libActionTypesMod.ColdSubscription, 
    P
  ] = js.native
  def forceRender(props: popmotionDashPoseLib.Anon_ElementStyler): scala.Unit = js.native
  def setValueNative(key: java.lang.String, to: js.Any, props: popmotionDashPoseLib.Anon_ElementStyler): scala.Unit = js.native
  def transformPose(
    pose: poseDashCoreLib.libTypesMod.Pose[popmotionLib.popmotionMod.Action, TD],
    key: java.lang.String,
    state: poseDashCoreLib.libTypesMod.PoserState[
      Value, 
      popmotionLib.popmotionMod.Action, 
      popmotionLib.libActionTypesMod.ColdSubscription, 
      P
    ]
  ): poseDashCoreLib.libTypesMod.Pose[popmotionLib.popmotionMod.Action, TD] = js.native
}

