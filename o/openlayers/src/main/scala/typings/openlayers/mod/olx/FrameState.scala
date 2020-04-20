package typings.openlayers.mod.olx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameState extends js.Object {
  var pixelRatio: Double
  var time: Double
  var viewState: ViewState
}

object FrameState {
  @scala.inline
  def apply(pixelRatio: Double, time: Double, viewState: ViewState): FrameState = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameState]
  }
}

