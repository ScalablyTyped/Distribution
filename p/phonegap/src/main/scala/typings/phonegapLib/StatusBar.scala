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
    backgroundColorByHexString: java.lang.String => scala.Unit,
    backgroundColorByName: java.lang.String => scala.Unit,
    hide: () => scala.Unit,
    isVisible: scala.Boolean,
    overlaysWebView: scala.Boolean => scala.Unit,
    show: () => scala.Unit,
    styleBlackOpaque: () => scala.Unit,
    styleBlackTranslucent: () => scala.Unit,
    styleDefault: () => scala.Unit,
    styleLightContent: () => scala.Unit
  ): StatusBar = {
    val __obj = js.Dynamic.literal(backgroundColorByHexString = js.Any.fromFunction1(backgroundColorByHexString), backgroundColorByName = js.Any.fromFunction1(backgroundColorByName), hide = js.Any.fromFunction0(hide), isVisible = isVisible, overlaysWebView = js.Any.fromFunction1(overlaysWebView), show = js.Any.fromFunction0(show), styleBlackOpaque = js.Any.fromFunction0(styleBlackOpaque), styleBlackTranslucent = js.Any.fromFunction0(styleBlackTranslucent), styleDefault = js.Any.fromFunction0(styleDefault), styleLightContent = js.Any.fromFunction0(styleLightContent))
  
    __obj.asInstanceOf[StatusBar]
  }
}

