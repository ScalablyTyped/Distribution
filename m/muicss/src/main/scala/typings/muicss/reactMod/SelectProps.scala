package typings.muicss.reactMod

import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends HTMLAttributes[HTMLDivElement] {
  var label: js.UndefOr[ReactNode] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var useDefault: js.UndefOr[Boolean] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    label: ReactNode = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    useDefault: js.UndefOr[Boolean] = js.undefined
  ): SelectProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(useDefault)) __obj.updateDynamic("useDefault")(useDefault)
    __obj.asInstanceOf[SelectProps]
  }
}

