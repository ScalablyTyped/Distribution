package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectProps extends js.Object {
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var push: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var to: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]
}

object RedirectProps {
  @scala.inline
  def apply(
    to: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    from: java.lang.String = null,
    path: java.lang.String = null,
    push: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): RedirectProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (from != null) __obj.updateDynamic("from")(from)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RedirectProps]
  }
}

