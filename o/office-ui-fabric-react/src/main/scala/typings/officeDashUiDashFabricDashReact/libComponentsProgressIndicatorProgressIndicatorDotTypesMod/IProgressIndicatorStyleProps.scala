package typings.officeDashUiDashFabricDashReact.libComponentsProgressIndicatorProgressIndicatorDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressIndicatorStyleProps extends js.Object {
  var barHeight: js.UndefOr[Double] = js.undefined
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
}

object IProgressIndicatorStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    barHeight: Int | Double = null,
    className: String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined
  ): IProgressIndicatorStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (barHeight != null) __obj.updateDynamic("barHeight")(barHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    __obj.asInstanceOf[IProgressIndicatorStyleProps]
  }
}

