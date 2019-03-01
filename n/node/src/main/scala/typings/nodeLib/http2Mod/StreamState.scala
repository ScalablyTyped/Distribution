package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamState extends js.Object {
  var localWindowSize: js.UndefOr[scala.Double] = js.undefined
  var state: js.UndefOr[scala.Double] = js.undefined
  var streamLocalClose: js.UndefOr[scala.Double] = js.undefined
  var streamRemoteClose: js.UndefOr[scala.Double] = js.undefined
  var sumDependencyWeight: js.UndefOr[scala.Double] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object StreamState {
  @scala.inline
  def apply(
    localWindowSize: scala.Int | scala.Double = null,
    state: scala.Int | scala.Double = null,
    streamLocalClose: scala.Int | scala.Double = null,
    streamRemoteClose: scala.Int | scala.Double = null,
    sumDependencyWeight: scala.Int | scala.Double = null,
    weight: scala.Int | scala.Double = null
  ): StreamState = {
    val __obj = js.Dynamic.literal()
    if (localWindowSize != null) __obj.updateDynamic("localWindowSize")(localWindowSize.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (streamLocalClose != null) __obj.updateDynamic("streamLocalClose")(streamLocalClose.asInstanceOf[js.Any])
    if (streamRemoteClose != null) __obj.updateDynamic("streamRemoteClose")(streamRemoteClose.asInstanceOf[js.Any])
    if (sumDependencyWeight != null) __obj.updateDynamic("sumDependencyWeight")(sumDependencyWeight.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamState]
  }
}

