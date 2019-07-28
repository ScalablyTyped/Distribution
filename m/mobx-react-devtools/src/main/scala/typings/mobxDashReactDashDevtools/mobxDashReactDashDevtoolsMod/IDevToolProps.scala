package typings.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsMod

import typings.mobxDashReactDashDevtools.Anon_Bottom
import typings.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsStrings.bottomLeft
import typings.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsStrings.bottomRight
import typings.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsStrings.topLeft
import typings.mobxDashReactDashDevtools.mobxDashReactDashDevtoolsStrings.topRight
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDevToolProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var highlightTimeout: js.UndefOr[Double] = js.undefined
  var noPanel: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[topRight | bottomRight | bottomLeft | topLeft | Anon_Bottom] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object IDevToolProps {
  @scala.inline
  def apply(
    className: String = null,
    highlightTimeout: Int | Double = null,
    noPanel: js.UndefOr[Boolean] = js.undefined,
    position: topRight | bottomRight | bottomLeft | topLeft | Anon_Bottom = null,
    style: CSSProperties = null
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

