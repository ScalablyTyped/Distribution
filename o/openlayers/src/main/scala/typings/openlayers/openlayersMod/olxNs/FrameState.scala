package typings.openlayers.openlayersMod.olxNs

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
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio, time = time, viewState = viewState)
  
    __obj.asInstanceOf[FrameState]
  }
}

