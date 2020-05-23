package typings.pigpio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert extends js.Object {
  /**
    * boolean specifying whether or not alert events are emitted when the GPIO changes state (optional, default false)
    */
  var alert: js.UndefOr[Boolean] = js.undefined
  /**
    * interrupt edge for inputs. RISING_EDGE, FALLING_EDGE, or EITHER_EDGE (optional, no default)
    */
  var edge: js.UndefOr[Double] = js.undefined
  /**
    * INPUT, OUTPUT, ALT0, ALT1, ALT2, ALT3, ALT4, or ALT5 (optional, no default)
    */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * PUD_OFF, PUD_DOWN, or PUD_UP (optional, no default)
    */
  var pullUpDown: js.UndefOr[Double] = js.undefined
  /**
    * interrupt timeout in milliseconds (optional, defaults to 0 meaning no timeout if edge specified)
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object Alert {
  @scala.inline
  def apply(
    alert: js.UndefOr[Boolean] = js.undefined,
    edge: js.UndefOr[Double] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined,
    pullUpDown: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Alert = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alert)) __obj.updateDynamic("alert")(alert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pullUpDown)) __obj.updateDynamic("pullUpDown")(pullUpDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

