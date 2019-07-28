package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamState extends js.Object {
  var localClose: js.UndefOr[Double] = js.undefined
  var localWindowSize: js.UndefOr[Double] = js.undefined
  var remoteClose: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[Double] = js.undefined
  var sumDependencyWeight: js.UndefOr[Double] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object StreamState {
  @scala.inline
  def apply(
    localClose: Int | Double = null,
    localWindowSize: Int | Double = null,
    remoteClose: Int | Double = null,
    state: Int | Double = null,
    sumDependencyWeight: Int | Double = null,
    weight: Int | Double = null
  ): StreamState = {
    val __obj = js.Dynamic.literal()
    if (localClose != null) __obj.updateDynamic("localClose")(localClose.asInstanceOf[js.Any])
    if (localWindowSize != null) __obj.updateDynamic("localWindowSize")(localWindowSize.asInstanceOf[js.Any])
    if (remoteClose != null) __obj.updateDynamic("remoteClose")(remoteClose.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (sumDependencyWeight != null) __obj.updateDynamic("sumDependencyWeight")(sumDependencyWeight.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamState]
  }
}

