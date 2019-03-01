package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Option for tray that contains initial settings for the Tray.
  */
trait TrayOption extends js.Object {
  /**
    * {string} alternate
    */
  var alticon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * {string} icon
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * {boolean} whether icons are templates
    */
  var iconsAreTemplates: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * {Menu} popup menu
    */
  var menu: js.UndefOr[nwDotJsLib.nwNs.Menu] = js.undefined
  /**
    * {string} title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * {string} tooltip
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object TrayOption {
  @scala.inline
  def apply(
    alticon: java.lang.String = null,
    icon: java.lang.String = null,
    iconsAreTemplates: js.UndefOr[scala.Boolean] = js.undefined,
    menu: nwDotJsLib.nwNs.Menu = null,
    title: java.lang.String = null,
    tooltip: java.lang.String = null
  ): TrayOption = {
    val __obj = js.Dynamic.literal()
    if (alticon != null) __obj.updateDynamic("alticon")(alticon)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(iconsAreTemplates)) __obj.updateDynamic("iconsAreTemplates")(iconsAreTemplates)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[TrayOption]
  }
}

