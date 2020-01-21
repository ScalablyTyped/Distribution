package typings.mixpanelBrowser.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mixpanel-browser", "init")
@js.native
object init extends js.Object {
  def apply(token: String): Mixpanel = js.native
  def apply(token: String, config: Partial[Config]): Mixpanel = js.native
  def apply(token: String, config: Partial[Config], name: String): Mixpanel = js.native
}

