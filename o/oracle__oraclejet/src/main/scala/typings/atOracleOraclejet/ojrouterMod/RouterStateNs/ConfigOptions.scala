package typings.atOracleOraclejet.ojrouterMod.RouterStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConfigOptions extends js.Object {
  var canEnter: js.UndefOr[js.Function0[Boolean | js.Promise[Boolean]]] = js.undefined
  var canExit: js.UndefOr[js.Function0[Boolean | js.Promise[Boolean]]] = js.undefined
  var enter: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var exit: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    canEnter: () => Boolean | js.Promise[Boolean] = null,
    canExit: () => Boolean | js.Promise[Boolean] = null,
    enter: () => js.Promise[Unit] | Unit = null,
    exit: () => js.Promise[Unit] | Unit = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
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

