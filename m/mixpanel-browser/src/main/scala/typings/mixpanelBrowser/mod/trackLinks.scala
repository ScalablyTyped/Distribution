package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mixpanel-browser", "track_links")
@js.native
object trackLinks extends js.Object {
  def apply(query: Query, event_name: String): Unit = js.native
  def apply(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = js.native
  def apply(query: Query, event_name: String, properties: Dict): Unit = js.native
}

