package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mixpanelBrowser.mixpanelBrowserStrings.cookie
  - typings.mixpanelBrowser.mixpanelBrowserStrings.localStorage
*/
trait Persistence extends js.Object

object Persistence {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cookie: typings.mixpanelBrowser.mixpanelBrowserStrings.cookie = this.cast("cookie")
  @scala.inline
  def localStorage: typings.mixpanelBrowser.mixpanelBrowserStrings.localStorage = this.cast("localStorage")
}

