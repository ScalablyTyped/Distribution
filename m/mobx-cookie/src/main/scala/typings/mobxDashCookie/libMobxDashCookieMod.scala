package typings.mobxDashCookie

import typings.jsDashCookie.jsDashCookieMod.CookieAttributes
import typings.mobxDashCookie.libMobxDashCookieMod.MobxCookie
import typings.node.NodeJS.Timeout
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-cookie/lib/mobx-cookie", JSImport.Namespace)
@js.native
object libMobxDashCookieMod extends js.Object {
  @js.native
  trait MobxCookie extends js.Object {
    var _name: String = js.native
    var _timeout: js.UndefOr[Timeout] = js.native
    var value: js.UndefOr[String] = js.native
    def _clearTimeout(): Unit = js.native
    def _expiresToDateTime(expires: Double): String | Date = js.native
    def _expiresToDateTime(expires: Date): String | Date = js.native
    def _expiresToMs(expires: Double): Double = js.native
    def _expiresToMs(expires: Date): Double = js.native
    def _startTimeout(expires: Double): Unit = js.native
    def _startTimeout(expires: Date): Unit = js.native
    def _syncTimeout(): Unit = js.native
    def get(): js.UndefOr[String] = js.native
    def remove(): Unit = js.native
    def set(value: String): Unit = js.native
    def set(value: String, options: CookieAttributes): Unit = js.native
  }
  
  @js.native
  class default protected () extends MobxCookie {
    def this(name: String) = this()
  }
  
}

