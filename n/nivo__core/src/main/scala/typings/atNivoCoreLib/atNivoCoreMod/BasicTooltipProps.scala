package typings
package atNivoCoreLib.atNivoCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicTooltipProps extends js.Object {
  var color: java.lang.String
  var enableChip: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[
    js.Function1[/* value */ scala.Double | java.lang.String, scala.Double | java.lang.String]
  ] = js.undefined
  var id: reactLib.reactMod.ReactNs.ReactNode
  var renderContent: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var theme: stdLib.Pick[Theme, atNivoCoreLib.atNivoCoreLibStrings.tooltip]
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object BasicTooltipProps {
  @scala.inline
  def apply(
    color: java.lang.String,
    id: reactLib.reactMod.ReactNs.ReactNode,
    theme: stdLib.Pick[Theme, atNivoCoreLib.atNivoCoreLibStrings.tooltip],
    enableChip: js.UndefOr[scala.Boolean] = js.undefined,
    format: /* value */ scala.Double | java.lang.String => scala.Double | java.lang.String = null,
    renderContent: () => reactLib.reactMod.ReactNs.ReactNode = null,
    value: java.lang.String | scala.Double = null
  ): BasicTooltipProps = {
    val __obj = js.Dynamic.literal(color = color, id = id.asInstanceOf[js.Any], theme = theme)
    if (!js.isUndefined(enableChip)) __obj.updateDynamic("enableChip")(enableChip)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicTooltipProps]
  }
}

