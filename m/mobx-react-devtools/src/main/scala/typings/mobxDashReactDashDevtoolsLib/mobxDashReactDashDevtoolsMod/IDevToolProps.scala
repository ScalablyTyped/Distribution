package typings
package mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDevToolProps extends js.Object {
  var highlightTimeout: js.UndefOr[scala.Double] = js.undefined
  var noPanel: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[mobxDashReactDashDevtoolsLib.Anon_Bottom] = js.undefined
}

object IDevToolProps {
  @scala.inline
  def apply(
    highlightTimeout: scala.Int | scala.Double = null,
    noPanel: js.UndefOr[scala.Boolean] = js.undefined,
    position: mobxDashReactDashDevtoolsLib.Anon_Bottom = null
  ): IDevToolProps = {
    val __obj = js.Dynamic.literal()
    if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(noPanel)) __obj.updateDynamic("noPanel")(noPanel)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IDevToolProps]
  }
}

