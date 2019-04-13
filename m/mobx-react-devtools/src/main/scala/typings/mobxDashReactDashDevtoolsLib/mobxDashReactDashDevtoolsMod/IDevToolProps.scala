package typings
package mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDevToolProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var highlightTimeout: js.UndefOr[scala.Double] = js.undefined
  var noPanel: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[
    mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsLibStrings.topRight | mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsLibStrings.bottomRight | mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsLibStrings.bottomLeft | mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsLibStrings.topLeft | mobxDashReactDashDevtoolsLib.Anon_Bottom
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object IDevToolProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    highlightTimeout: scala.Int | scala.Double = null,
    noPanel: js.UndefOr[scala.Boolean] = js.undefined,
    position: mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsLibStrings.topRight | mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsLibStrings.bottomRight | mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsLibStrings.bottomLeft | mobxDashReactDashDevtoolsLib.mobxDashReactDashDevtoolsLibStrings.topLeft | mobxDashReactDashDevtoolsLib.Anon_Bottom = null,
    style: reactLib.reactMod.CSSProperties = null
  ): IDevToolProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(noPanel)) __obj.updateDynamic("noPanel")(noPanel)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IDevToolProps]
  }
}

