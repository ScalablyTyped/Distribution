package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceWebAudioApi extends js.Object {
  var forceWebAudioApi: js.UndefOr[Boolean] = js.undefined
}

object Anon_ForceWebAudioApi {
  @scala.inline
  def apply(forceWebAudioApi: js.UndefOr[Boolean] = js.undefined): Anon_ForceWebAudioApi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceWebAudioApi)) __obj.updateDynamic("forceWebAudioApi")(forceWebAudioApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForceWebAudioApi]
  }
}

