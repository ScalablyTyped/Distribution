package typings.pigpio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlert extends js.Object {
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

object AnonAlert {
  @scala.inline
  def apply(
    alert: js.UndefOr[Boolean] = js.undefined,
    edge: Int | Double = null,
    mode: Int | Double = null,
    pullUpDown: Int | Double = null,
    timeout: Int | Double = null
  ): AnonAlert = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alert)) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pullUpDown != null) __obj.updateDynamic("pullUpDown")(pullUpDown.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlert]
  }
}

