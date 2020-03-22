package typings.officeUiFabricReact.groupedListTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupedList.types.IGroupedListProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupedList.types.IGroupedListProps, 'className'> & {  isCollapsed ? :boolean,   compact ? :boolean} */
trait IGroupedListStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /** Whether the group is in compact mode or not */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** whether or not the group is collapsed */
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IGroupedListStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    isCollapsed: js.UndefOr[Boolean] = js.undefined
  ): IGroupedListStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupedListStyleProps]
  }
}

