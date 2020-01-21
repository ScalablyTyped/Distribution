package typings.officeUiFabricReact

import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellStyleProps extends js.Object {
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  var theme: ITheme
}

object AnonCellStyleProps {
  @scala.inline
  def apply(theme: ITheme, cellStyleProps: ICellStyleProps = null): AnonCellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellStyleProps]
  }
}

