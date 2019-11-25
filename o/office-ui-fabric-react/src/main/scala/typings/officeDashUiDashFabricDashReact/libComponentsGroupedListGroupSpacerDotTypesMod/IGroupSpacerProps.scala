package typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupSpacerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupSpacerProps extends js.Object {
  /** Count of spacer(s) */
  var count: Double
  /** How much to indent */
  var indentWidth: js.UndefOr[Double] = js.undefined
  /**
    * Style function to be passed in to override the themed or default styles
    *
    * @deprecated unused, to be removed in 7.0
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles]] = js.undefined
  /**
    * Theme from Higher Order Component
    *
    * @deprecated unused, to be removed in 7.0
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IGroupSpacerProps {
  @scala.inline
  def apply(
    count: Double,
    indentWidth: Int | Double = null,
    styles: IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles] = null,
    theme: ITheme = null
  ): IGroupSpacerProps = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupSpacerProps]
  }
}

