package typings.mixpanelDashBrowser.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mixpanelDashBrowser.mixpanelDashBrowserStrings.cookie
  - typings.mixpanelDashBrowser.mixpanelDashBrowserStrings.localStorage
*/
trait Persistence extends js.Object

object Persistence {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cookie: typings.mixpanelDashBrowser.mixpanelDashBrowserStrings.cookie = this.cast("cookie")
  @scala.inline
  def localStorage: typings.mixpanelDashBrowser.mixpanelDashBrowserStrings.localStorage = this.cast("localStorage")
}

