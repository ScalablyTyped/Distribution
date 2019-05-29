package typings
package atOracleOraclejetLib.ojrouterMod.RouterStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConfigOptions extends js.Object {
  var canEnter: js.UndefOr[js.Function0[scala.Boolean | js.Promise[scala.Boolean]]] = js.undefined
  var canExit: js.UndefOr[js.Function0[scala.Boolean | js.Promise[scala.Boolean]]] = js.undefined
  var enter: js.UndefOr[js.Function0[js.Promise[scala.Unit] | scala.Unit]] = js.undefined
  var exit: js.UndefOr[js.Function0[js.Promise[scala.Unit] | scala.Unit]] = js.undefined
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    canEnter: () => scala.Boolean | js.Promise[scala.Boolean] = null,
    canExit: () => scala.Boolean | js.Promise[scala.Boolean] = null,
    enter: () => js.Promise[scala.Unit] | scala.Unit = null,
    exit: () => js.Promise[scala.Unit] | scala.Unit = null,
    isDefault: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    value: js.Any = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (canEnter != null) __obj.updateDynamic("canEnter")(js.Any.fromFunction0(canEnter))
    if (canExit != null) __obj.updateDynamic("canExit")(js.Any.fromFunction0(canExit))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction0(enter))
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction0(exit))
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ConfigOptions]
  }
}

