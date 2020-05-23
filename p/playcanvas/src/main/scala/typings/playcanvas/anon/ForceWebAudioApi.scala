package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceWebAudioApi extends js.Object {
  var forceWebAudioApi: js.UndefOr[Boolean] = js.undefined
}

object ForceWebAudioApi {
  @scala.inline
  def apply(forceWebAudioApi: js.UndefOr[Boolean] = js.undefined): ForceWebAudioApi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceWebAudioApi)) __obj.updateDynamic("forceWebAudioApi")(forceWebAudioApi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceWebAudioApi]
  }
}

