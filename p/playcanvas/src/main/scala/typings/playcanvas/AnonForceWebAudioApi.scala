package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceWebAudioApi extends js.Object {
  var forceWebAudioApi: js.UndefOr[Boolean] = js.undefined
}

object AnonForceWebAudioApi {
  @scala.inline
  def apply(forceWebAudioApi: js.UndefOr[Boolean] = js.undefined): AnonForceWebAudioApi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceWebAudioApi)) __obj.updateDynamic("forceWebAudioApi")(forceWebAudioApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceWebAudioApi]
  }
}

