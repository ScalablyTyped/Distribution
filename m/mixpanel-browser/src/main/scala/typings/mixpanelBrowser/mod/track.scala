package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mixpanel-browser", "track")
@js.native
object track extends js.Object {
  def apply(event_name: String): Unit = js.native
  def apply(event_name: String, properties: Dict): Unit = js.native
  def apply(event_name: String, properties: Dict, callback: js.Function0[Unit]): Unit = js.native
}

