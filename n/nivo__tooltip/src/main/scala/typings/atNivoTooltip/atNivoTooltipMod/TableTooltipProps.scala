package typings.atNivoTooltip.atNivoTooltipMod

import typings.atNivoTooltip.PickimportwarningQualifyReferencesresolveTypeRefma
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableTooltipProps extends js.Object {
  var renderContent: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var rows: js.Array[js.Array[ReactNode]]
  var theme: PickimportwarningQualifyReferencesresolveTypeRefma
  var title: js.UndefOr[ReactNode] = js.undefined
}

object TableTooltipProps {
  @scala.inline
  def apply(
    rows: js.Array[js.Array[ReactNode]],
    theme: PickimportwarningQualifyReferencesresolveTypeRefma,
    renderContent: () => ReactNode = null,
    title: ReactNode = null
  ): TableTooltipProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTooltipProps]
  }
}

