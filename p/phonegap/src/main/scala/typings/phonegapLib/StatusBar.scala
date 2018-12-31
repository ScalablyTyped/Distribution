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

