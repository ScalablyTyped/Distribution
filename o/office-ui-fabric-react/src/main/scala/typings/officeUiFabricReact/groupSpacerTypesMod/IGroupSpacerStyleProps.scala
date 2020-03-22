package typings.officeUiFabricReact.groupSpacerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupSpacer.types.IGroupSpacerProps, 'theme'>> & {  width ? :number} */
trait IGroupSpacerStyleProps extends js.Object {
  var theme: ITheme
  var width: js.UndefOr[Double] = js.undefined
}

object IGroupSpacerStyleProps {
  @scala.inline
  def apply(theme: ITheme, width: Int | Double = null): IGroupSpacerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupSpacerStyleProps]
  }
}

