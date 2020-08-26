package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mixpanel-browser", "track")
@js.native
object track extends js.Object {
  def apply(event_name: String): Unit = js.native
  def apply(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: js.UndefOr[scala.Nothing],
    callback: Callback
  ): Unit = js.native
  def apply(event_name: String, properties: js.UndefOr[scala.Nothing], optionsOrCallback: Callback): Unit = js.native
  def apply(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: Callback,
    callback: Callback
  ): Unit = js.native
  def apply(event_name: String, properties: js.UndefOr[scala.Nothing], optionsOrCallback: RequestOptions): Unit = js.native
  def apply(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: RequestOptions,
    callback: Callback
  ): Unit = js.native
  def apply(event_name: String, properties: Dict): Unit = js.native
  def apply(
    event_name: String,
    properties: Dict,
    optionsOrCallback: js.UndefOr[scala.Nothing],
    callback: Callback
  ): Unit = js.native
  def apply(event_name: String, properties: Dict, optionsOrCallback: Callback): Unit = js.native
  def apply(event_name: String, properties: Dict, optionsOrCallback: Callback, callback: Callback): Unit = js.native
  def apply(event_name: String, properties: Dict, optionsOrCallback: RequestOptions): Unit = js.native
  def apply(event_name: String, properties: Dict, optionsOrCallback: RequestOptions, callback: Callback): Unit = js.native
}

