package typings.atNivoTooltip.atNivoTooltipMod

import typings.atNivoTooltip.atNivoTooltipStrings.tooltip
import typings.react.reactMod.ReactNode
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicTooltipProps extends js.Object {
  var color: String
  var enableChip: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Function1[/* value */ Double | String, Double | String]] = js.undefined
  var id: ReactNode
  var renderContent: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var theme: Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ _, 
    tooltip
  ]
  var value: js.UndefOr[String | Double] = js.undefined
}

object BasicTooltipProps {
  @scala.inline
  def apply(
    color: String,
    theme: Pick[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Theme */ _, 
      tooltip
    ],
    enableChip: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double | String => Double | String = null,
    id: ReactNode = null,
    renderContent: () => ReactNode = null,
    value: String | Double = null
  ): BasicTooltipProps = {
    val __obj = js.Dynamic.literal(color = color, theme = theme)
    if (!js.isUndefined(enableChip)) __obj.updateDynamic("enableChip")(enableChip)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicTooltipProps]
  }
}

