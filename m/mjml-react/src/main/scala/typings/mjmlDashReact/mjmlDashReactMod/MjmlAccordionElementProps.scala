package typings.mjmlDashReact.mjmlDashReactMod

import typings.csstype.csstypeMod.BackgroundColorProperty
import typings.mjmlDashReact.mjmlDashReactStrings.left
import typings.mjmlDashReact.mjmlDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlAccordionElementProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var iconAlign: js.UndefOr[String] = js.undefined
  var iconHeight: js.UndefOr[String] = js.undefined
  var iconPosition: js.UndefOr[left | right] = js.undefined
  var iconUnwrappedAlt: js.UndefOr[String] = js.undefined
  var iconUnwrappedUrl: js.UndefOr[String] = js.undefined
  var iconWidth: js.UndefOr[String] = js.undefined
  var iconWrappedAlt: js.UndefOr[String] = js.undefined
  var iconWrappedUrl: js.UndefOr[String] = js.undefined
}

object MjmlAccordionElementProps {
  @scala.inline
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    fontFamily: String = null,
    iconAlign: String = null,
    iconHeight: String = null,
    iconPosition: left | right = null,
    iconUnwrappedAlt: String = null,
    iconUnwrappedUrl: String = null,
    iconWidth: String = null,
    iconWrappedAlt: String = null,
    iconWrappedUrl: String = null
  ): MjmlAccordionElementProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
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

