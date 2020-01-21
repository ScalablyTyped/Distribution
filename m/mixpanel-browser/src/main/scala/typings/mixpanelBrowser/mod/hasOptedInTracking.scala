package typings.mixpanelBrowser.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mixpanel-browser", "has_opted_in_tracking")
@js.native
object hasOptedInTracking extends js.Object {
  def apply(): Boolean = js.native
  def apply(options: Partial[HasOptedInOutOptions]): Boolean = js.native
}

