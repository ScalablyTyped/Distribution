package typings.officeUiFabricReact.detailsListTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'className'> & {  isHorizontalConstrained ? :boolean,   compact ? :boolean,   isFixed ? :boolean} */
trait IDetailsListStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /** Whether the list is in compact mode */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Whether the list is fixed in size */
  var isFixed: js.UndefOr[Boolean] = js.undefined
  /** Whether the list is horizontally constrained */
  var isHorizontalConstrained: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IDetailsListStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    isFixed: js.UndefOr[Boolean] = js.undefined,
    isHorizontalConstrained: js.UndefOr[Boolean] = js.undefined
  ): IDetailsListStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFixed)) __obj.updateDynamic("isFixed")(isFixed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHorizontalConstrained)) __obj.updateDynamic("isHorizontalConstrained")(isHorizontalConstrained.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListStyleProps]
  }
}

