package typings.officeUiFabricReact.gridTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridStyleProps extends js.Object {
  /**
    * Theme to apply to the grid
    */
  var theme: ITheme
}

object IGridStyleProps {
  @scala.inline
  def apply(theme: ITheme): IGridStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridStyleProps]
  }
}

