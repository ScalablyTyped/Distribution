package typings
package atNivoCoreLib.atNivoCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableTooltipProps extends js.Object {
  var renderContent: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var rows: js.Array[js.Array[reactLib.reactMod.ReactNs.ReactNode]]
  var theme: stdLib.Pick[Theme, atNivoCoreLib.atNivoCoreLibStrings.tooltip]
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object TableTooltipProps {
  @scala.inline
  def apply(
    rows: js.Array[js.Array[reactLib.reactMod.ReactNs.ReactNode]],
    theme: stdLib.Pick[Theme, atNivoCoreLib.atNivoCoreLibStrings.tooltip],
    renderContent: () => reactLib.reactMod.ReactNs.ReactNode = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null
  ): TableTooltipProps = {
    val __obj = js.Dynamic.literal(rows = rows, theme = theme)
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTooltipProps]
  }
}

