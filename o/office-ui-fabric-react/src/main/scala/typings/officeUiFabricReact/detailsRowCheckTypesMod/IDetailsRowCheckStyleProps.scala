package typings.officeUiFabricReact.detailsRowCheckTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.types.IDetailsRowCheckProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.types.IDetailsRowCheckProps, 'compact' | 'isHeader' | 'selected' | 'anySelected' | 'canSelect' | 'className'> & {  isVisible ? :boolean} */
trait IDetailsRowCheckStyleProps extends js.Object {
  var anySelected: js.UndefOr[Boolean] = js.undefined
  var canSelect: Boolean
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var isHeader: js.UndefOr[Boolean] = js.undefined
  /** Is checkbox visible */
  var isVisible: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IDetailsRowCheckStyleProps {
  @scala.inline
  def apply(
    canSelect: Boolean,
    theme: ITheme,
    anySelected: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    isHeader: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): IDetailsRowCheckStyleProps = {
    val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(anySelected)) __obj.updateDynamic("anySelected")(anySelected.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowCheckStyleProps]
  }
}

