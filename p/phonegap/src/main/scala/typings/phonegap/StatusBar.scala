package typings.phonegap

import org.scalablytyped.runtime.TopLevel
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
  var isVisible: Boolean
  def backgroundColorByHexString(hexString: String): Unit
  def backgroundColorByName(colorname: String): Unit
  def hide(): Unit
  def overlaysWebView(doOverlay: Boolean): Unit
  def show(): Unit
  def styleBlackOpaque(): Unit
  def styleBlackTranslucent(): Unit
  def styleDefault(): Unit
  def styleLightContent(): Unit
}

@JSGlobal("StatusBar")
@js.native
object StatusBar extends TopLevel[StatusBar]

