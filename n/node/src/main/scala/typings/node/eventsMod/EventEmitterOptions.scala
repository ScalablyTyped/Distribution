package typings.node.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEmitterOptions extends js.Object {
  /**
    * Enables automatic capturing of promise rejection.
    */
  var captureRejections: js.UndefOr[Boolean] = js.undefined
}

object EventEmitterOptions {
  @scala.inline
  def apply(captureRejections: js.UndefOr[Boolean] = js.undefined): EventEmitterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureRejections)) __obj.updateDynamic("captureRejections")(captureRejections.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitterOptions]
  }
}

