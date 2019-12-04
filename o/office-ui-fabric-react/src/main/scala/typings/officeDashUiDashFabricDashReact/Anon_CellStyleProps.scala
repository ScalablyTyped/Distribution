package typings.officeDashUiDashFabricDashReact

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellStyleProps extends js.Object {
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  var theme: ITheme
}

object Anon_CellStyleProps {
  @scala.inline
  def apply(theme: ITheme, cellStyleProps: ICellStyleProps = null): Anon_CellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CellStyleProps]
  }
}

