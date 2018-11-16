package typings
package mobxDashCookieLib.libMobxDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobxCookie extends js.Object {
  var _name: java.lang.String = js.native
  var _timeout: js.UndefOr[nodeLib.NodeJSNs.Timeout] = js.native
  var value: js.UndefOr[java.lang.String] = js.native
  def _clearTimeout(): scala.Unit = js.native
  def _expiresToDateTime(expires: scala.Double): java.lang.String | stdLib.Date = js.native
  def _expiresToDateTime(expires: stdLib.Date): java.lang.String | stdLib.Date = js.native
  def _expiresToMs(expires: scala.Double): scala.Double = js.native
  def _expiresToMs(expires: stdLib.Date): scala.Double = js.native
  def _startTimeout(expires: scala.Double): scala.Unit = js.native
  def _startTimeout(expires: stdLib.Date): scala.Unit = js.native
  def _syncTimeout(): scala.Unit = js.native
  def get(): js.UndefOr[java.lang.String] = js.native
  def remove(): scala.Unit = js.native
  def set(value: java.lang.String): scala.Unit = js.native
  def set(value: java.lang.String, options: jsDashCookieLib.jsDashCookieMod.CookiesNs.CookieAttributes): scala.Unit = js.native
}

