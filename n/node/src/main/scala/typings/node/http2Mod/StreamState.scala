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
    localClose: js.UndefOr[Double] = js.undefined,
    localWindowSize: js.UndefOr[Double] = js.undefined,
    remoteClose: js.UndefOr[Double] = js.undefined,
    state: js.UndefOr[Double] = js.undefined,
    sumDependencyWeight: js.UndefOr[Double] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): StreamState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(localClose)) __obj.updateDynamic("localClose")(localClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localWindowSize)) __obj.updateDynamic("localWindowSize")(localWindowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteClose)) __obj.updateDynamic("remoteClose")(remoteClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sumDependencyWeight)) __obj.updateDynamic("sumDependencyWeight")(sumDependencyWeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamState]
  }
}

