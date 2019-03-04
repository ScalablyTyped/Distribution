package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Defined in lib.d.ts
interface LocalStorage {
  key;
  getItem;
  setItem;
  removeItem;
  clear;
}
*/
trait StatusBar extends js.Object {
  var isVisible: scala.Boolean
  def backgroundColorByHexString(hexString: java.lang.String): scala.Unit
  def backgroundColorByName(colorname: java.lang.String): scala.Unit
  def hide(): scala.Unit
  def overlaysWebView(doOverlay: scala.Boolean): scala.Unit
  def show(): scala.Unit
  def styleBlackOpaque(): scala.Unit
  def styleBlackTranslucent(): scala.Unit
  def styleDefault(): scala.Unit
  def styleLightContent(): scala.Unit
}

object StatusBar {
  @scala.inline
  def apply(
    backgroundColorByHexString: js.Function1[java.lang.String, scala.Unit],
    backgroundColorByName: js.Function1[java.lang.String, scala.Unit],
    hide: js.Function0[scala.Unit],
    isVisible: scala.Boolean,
    overlaysWebView: js.Function1[scala.Boolean, scala.Unit],
    show: js.Function0[scala.Unit],
    styleBlackOpaque: js.Function0[scala.Unit],
    styleBlackTranslucent: js.Function0[scala.Unit],
    styleDefault: js.Function0[scala.Unit],
    styleLightContent: js.Function0[scala.Unit]
  ): StatusBar = {
    val __obj = js.Dynamic.literal(backgroundColorByHexString = backgroundColorByHexString, backgroundColorByName = backgroundColorByName, hide = hide, isVisible = isVisible, overlaysWebView = overlaysWebView, show = show, styleBlackOpaque = styleBlackOpaque, styleBlackTranslucent = styleBlackTranslucent, styleDefault = styleDefault, styleLightContent = styleLightContent)
  
    __obj.asInstanceOf[StatusBar]
  }
}

