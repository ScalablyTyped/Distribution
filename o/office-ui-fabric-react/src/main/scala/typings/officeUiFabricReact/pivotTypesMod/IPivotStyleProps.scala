package typings.officeUiFabricReact.pivotTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'className'> & {  rootIsLarge ? :boolean,   rootIsTabs ? :boolean,   linkIsSelected ? :boolean} */
trait IPivotStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether Pivot link is selected.
    * @deprecated Is not populated with valid value. Specify `linkIsSelected` styling instead.
    */
  var linkIsSelected: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether Pivot has large format. */
  var rootIsLarge: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether Pivot has tabbed format. */
  var rootIsTabs: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IPivotStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    linkIsSelected: js.UndefOr[Boolean] = js.undefined,
    rootIsLarge: js.UndefOr[Boolean] = js.undefined,
    rootIsTabs: js.UndefOr[Boolean] = js.undefined
  ): IPivotStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(linkIsSelected)) __obj.updateDynamic("linkIsSelected")(linkIsSelected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rootIsLarge)) __obj.updateDynamic("rootIsLarge")(rootIsLarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rootIsTabs)) __obj.updateDynamic("rootIsTabs")(rootIsTabs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPivotStyleProps]
  }
}

