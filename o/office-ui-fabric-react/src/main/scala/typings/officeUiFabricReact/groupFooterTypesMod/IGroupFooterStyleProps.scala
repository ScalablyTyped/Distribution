package typings.officeUiFabricReact.groupFooterTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupFooter.types.IGroupFooterProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupFooter.types.IGroupFooterProps, 'selected' | 'className'> & {  isCollapsed ? :boolean} */
trait IGroupFooterStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /** Whether the footer is collapsed */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IGroupFooterStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): IGroupFooterStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupFooterStyleProps]
  }
}

