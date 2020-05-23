package typings.officeUiFabricReact.groupHeaderTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupHeader.types.IGroupHeaderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupHeader.types.IGroupHeaderProps, 'selected' | 'className'> & {  isCollapsed ? :boolean,   compact ? :boolean} */
trait IGroupHeaderStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /** Whether the group header is in compact mode or not */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Is Header collapsed */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IGroupHeaderStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): IGroupHeaderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupHeaderStyleProps]
  }
}

