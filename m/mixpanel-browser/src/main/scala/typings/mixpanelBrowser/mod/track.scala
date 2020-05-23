package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mixpanel-browser", "track")
@js.native
object track extends js.Object {
  def apply(event_name: String): Unit = js.native
  def apply(event_name: String, properties: Dict): Unit = js.native
  def apply(event_name: String, properties: Dict, optionsOrCallback: js.Function0[Unit]): Unit = js.native
  def apply(
    event_name: String,
    properties: Dict,
    optionsOrCallback: js.Function0[Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def apply(event_name: String, properties: Dict, optionsOrCallback: RequestOptions): Unit = js.native
  def apply(
    event_name: String,
    properties: Dict,
    optionsOrCallback: RequestOptions,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

