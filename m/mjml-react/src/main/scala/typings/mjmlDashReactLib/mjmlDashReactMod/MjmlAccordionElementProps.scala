package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlAccordionElementProps extends js.Object {
  var backgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var iconAlign: js.UndefOr[java.lang.String] = js.undefined
  var iconHeight: js.UndefOr[java.lang.String] = js.undefined
  var iconPosition: js.UndefOr[
    mjmlDashReactLib.mjmlDashReactLibStrings.left | mjmlDashReactLib.mjmlDashReactLibStrings.right
  ] = js.undefined
  var iconUnwrappedAlt: js.UndefOr[java.lang.String] = js.undefined
  var iconUnwrappedUrl: js.UndefOr[java.lang.String] = js.undefined
  var iconWidth: js.UndefOr[java.lang.String] = js.undefined
  var iconWrappedAlt: js.UndefOr[java.lang.String] = js.undefined
  var iconWrappedUrl: js.UndefOr[java.lang.String] = js.undefined
}

object MjmlAccordionElementProps {
  @scala.inline
  def apply(
    backgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    fontFamily: java.lang.String = null,
    iconAlign: java.lang.String = null,
    iconHeight: java.lang.String = null,
    iconPosition: mjmlDashReactLib.mjmlDashReactLibStrings.left | mjmlDashReactLib.mjmlDashReactLibStrings.right = null,
    iconUnwrappedAlt: java.lang.String = null,
    iconUnwrappedUrl: java.lang.String = null,
    iconWidth: java.lang.String = null,
    iconWrappedAlt: java.lang.String = null,
    iconWrappedUrl: java.lang.String = null
  ): MjmlAccordionElementProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (iconAlign != null) __obj.updateDynamic("iconAlign")(iconAlign)
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight)
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
    if (iconUnwrappedAlt != null) __obj.updateDynamic("iconUnwrappedAlt")(iconUnwrappedAlt)
    if (iconUnwrappedUrl != null) __obj.updateDynamic("iconUnwrappedUrl")(iconUnwrappedUrl)
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth)
    if (iconWrappedAlt != null) __obj.updateDynamic("iconWrappedAlt")(iconWrappedAlt)
    if (iconWrappedUrl != null) __obj.updateDynamic("iconWrappedUrl")(iconWrappedUrl)
    __obj.asInstanceOf[MjmlAccordionElementProps]
  }
}

