package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellStyleProps extends js.Object {
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  var theme: ITheme
}

object CellStyleProps {
  @scala.inline
  def apply(theme: ITheme, cellStyleProps: ICellStyleProps = null): CellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellStyleProps]
  }
}

