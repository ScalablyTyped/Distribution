package typings
package atOracleOraclejetLib.ojrouterMod.RouterStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConfigOptions extends js.Object {
  var canEnter: js.UndefOr[js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]]] = js.undefined
  var canExit: js.UndefOr[js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]]] = js.undefined
  var enter: js.UndefOr[js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]]] = js.undefined
  var exit: js.UndefOr[js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]]] = js.undefined
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    canEnter: js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]] = null,
    canExit: js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]] = null,
    enter: js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]] = null,
    exit: js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]] = null,
    isDefault: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    value: js.Any = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (canEnter != null) __obj.updateDynamic("canEnter")(canEnter.asInstanceOf[js.Any])
    if (canExit != null) __obj.updateDynamic("canExit")(canExit.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ConfigOptions]
  }
}

