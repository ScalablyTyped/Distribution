package typings.mjmlDashReact.mjmlDashReactMod

import typings.csstype.csstypeMod.ColorProperty
import typings.mjmlDashReact.mjmlDashReactStrings.hamburger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlNavbarProps extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var hamburger: js.UndefOr[typings.mjmlDashReact.mjmlDashReactStrings.hamburger] = js.undefined
  var icoAlign: js.UndefOr[String] = js.undefined
  var icoClose: js.UndefOr[String] = js.undefined
  var icoColor: js.UndefOr[ColorProperty] = js.undefined
  var icoFontSize: js.UndefOr[String] = js.undefined
  var icoLineHeight: js.UndefOr[String] = js.undefined
  var icoOpen: js.UndefOr[String] = js.undefined
  var icoPadding: js.UndefOr[String] = js.undefined
  var icoPaddingBottom: js.UndefOr[String] = js.undefined
  var icoPaddingLeft: js.UndefOr[String] = js.undefined
  var icoPaddingRight: js.UndefOr[String] = js.undefined
  var icoPaddingTop: js.UndefOr[String] = js.undefined
  var icoTextDecoration: js.UndefOr[String] = js.undefined
  var icoTextTransform: js.UndefOr[String] = js.undefined
}

object MjmlNavbarProps {
  @scala.inline
  def apply(
    align: String = null,
    baseUrl: String = null,
    hamburger: hamburger = null,
    icoAlign: String = null,
    icoClose: String = null,
    icoColor: ColorProperty = null,
    icoFontSize: String = null,
    icoLineHeight: String = null,
    icoOpen: String = null,
    icoPadding: String = null,
    icoPaddingBottom: String = null,
    icoPaddingLeft: String = null,
    icoPaddingRight: String = null,
    icoPaddingTop: String = null,
    icoTextDecoration: String = null,
    icoTextTransform: String = null
  ): MjmlNavbarProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (hamburger != null) __obj.updateDynamic("hamburger")(hamburger)
    if (icoAlign != null) __obj.updateDynamic("icoAlign")(icoAlign)
    if (icoClose != null) __obj.updateDynamic("icoClose")(icoClose)
    if (icoColor != null) __obj.updateDynamic("icoColor")(icoColor.asInstanceOf[js.Any])
    if (icoFontSize != null) __obj.updateDynamic("icoFontSize")(icoFontSize)
    if (icoLineHeight != null) __obj.updateDynamic("icoLineHeight")(icoLineHeight)
    if (icoOpen != null) __obj.updateDynamic("icoOpen")(icoOpen)
    if (icoPadding != null) __obj.updateDynamic("icoPadding")(icoPadding)
    if (icoPaddingBottom != null) __obj.updateDynamic("icoPaddingBottom")(icoPaddingBottom)
    if (icoPaddingLeft != null) __obj.updateDynamic("icoPaddingLeft")(icoPaddingLeft)
    if (icoPaddingRight != null) __obj.updateDynamic("icoPaddingRight")(icoPaddingRight)
    if (icoPaddingTop != null) __obj.updateDynamic("icoPaddingTop")(icoPaddingTop)
    if (icoTextDecoration != null) __obj.updateDynamic("icoTextDecoration")(icoTextDecoration)
    if (icoTextTransform != null) __obj.updateDynamic("icoTextTransform")(icoTextTransform)
    __obj.asInstanceOf[MjmlNavbarProps]
  }
}

