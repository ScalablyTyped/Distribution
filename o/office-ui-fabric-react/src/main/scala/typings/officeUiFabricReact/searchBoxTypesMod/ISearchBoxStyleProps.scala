package typings.officeUiFabricReact.searchBoxTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBoxStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hasFocus: js.UndefOr[Boolean] = js.undefined
  var hasInput: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
  var underlined: js.UndefOr[Boolean] = js.undefined
}

object ISearchBoxStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasFocus: js.UndefOr[Boolean] = js.undefined,
    hasInput: js.UndefOr[Boolean] = js.undefined,
    underlined: js.UndefOr[Boolean] = js.undefined
  ): ISearchBoxStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFocus)) __obj.updateDynamic("hasFocus")(hasFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(hasInput)) __obj.updateDynamic("hasInput")(hasInput.asInstanceOf[js.Any])
    if (!js.isUndefined(underlined)) __obj.updateDynamic("underlined")(underlined.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchBoxStyleProps]
  }
}

