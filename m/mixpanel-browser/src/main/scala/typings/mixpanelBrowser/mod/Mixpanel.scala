package typings.mixpanelBrowser.mod

import typings.mixpanelBrowser.anon.PartialClearOptOutInOutOp
import typings.mixpanelBrowser.anon.PartialConfig
import typings.mixpanelBrowser.anon.PartialHasOptedInOutOptio
import typings.mixpanelBrowser.anon.PartialInTrackingOptions
import typings.mixpanelBrowser.anon.PartialOutTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mixpanel extends js.Object {
  var people: People_ = js.native
  def alias(alias: String): Unit = js.native
  def alias(alias: String, original: String): Unit = js.native
  def clear_opt_in_out_tracking(): Unit = js.native
  def clear_opt_in_out_tracking(options: PartialClearOptOutInOutOp): Unit = js.native
  def disable(): Unit = js.native
  def disable(events: js.Array[String]): Unit = js.native
  def get_config(): js.Any = js.native
  def get_config(prop_name: String): js.Any = js.native
  def get_distinct_id(): js.Any = js.native
  def get_property(property_name: String): js.Any = js.native
  def has_opted_in_tracking(): Boolean = js.native
  def has_opted_in_tracking(options: PartialHasOptedInOutOptio): Boolean = js.native
  def has_opted_out_tracking(): Boolean = js.native
  def has_opted_out_tracking(options: PartialHasOptedInOutOptio): Boolean = js.native
  def identify(): js.Any = js.native
  def identify(unique_id: String): js.Any = js.native
  def init(token: String): Mixpanel = js.native
  def init(token: String, config: js.UndefOr[scala.Nothing], name: String): Mixpanel = js.native
  def init(token: String, config: PartialConfig): Mixpanel = js.native
  def init(token: String, config: PartialConfig, name: String): Mixpanel = js.native
  def opt_in_tracking(): Unit = js.native
  def opt_in_tracking(options: PartialInTrackingOptions): Unit = js.native
  def opt_out_tracking(): Unit = js.native
  def opt_out_tracking(options: PartialOutTrackingOptions): Unit = js.native
  def push(item: PushItem): Unit = js.native
  def register(props: Dict): Unit = js.native
  def register(props: Dict, days: Double): Unit = js.native
  def register_once(props: Dict): Unit = js.native
  def register_once(props: Dict, default_value: js.UndefOr[scala.Nothing], days: Double): Unit = js.native
  def register_once(props: Dict, default_value: js.Any): Unit = js.native
  def register_once(props: Dict, default_value: js.Any, days: Double): Unit = js.native
  def reset(): Unit = js.native
  def set_config(config: PartialConfig): Unit = js.native
  def time_event(event_name: String): Unit = js.native
  def track(event_name: String): Unit = js.native
  def track(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: js.UndefOr[scala.Nothing],
    callback: Callback
  ): Unit = js.native
  def track(event_name: String, properties: js.UndefOr[scala.Nothing], optionsOrCallback: Callback): Unit = js.native
  def track(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: Callback,
    callback: Callback
  ): Unit = js.native
  def track(event_name: String, properties: js.UndefOr[scala.Nothing], optionsOrCallback: RequestOptions): Unit = js.native
  def track(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: RequestOptions,
    callback: Callback
  ): Unit = js.native
  def track(event_name: String, properties: Dict): Unit = js.native
  def track(
    event_name: String,
    properties: Dict,
    optionsOrCallback: js.UndefOr[scala.Nothing],
    callback: Callback
  ): Unit = js.native
  def track(event_name: String, properties: Dict, optionsOrCallback: Callback): Unit = js.native
  def track(event_name: String, properties: Dict, optionsOrCallback: Callback, callback: Callback): Unit = js.native
  def track(event_name: String, properties: Dict, optionsOrCallback: RequestOptions): Unit = js.native
  def track(event_name: String, properties: Dict, optionsOrCallback: RequestOptions, callback: Callback): Unit = js.native
  def track_forms(query: Query, event_name: String): Unit = js.native
  def track_forms(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = js.native
  def track_forms(query: Query, event_name: String, properties: Dict): Unit = js.native
  def track_links(query: Query, event_name: String): Unit = js.native
  def track_links(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = js.native
  def track_links(query: Query, event_name: String, properties: Dict): Unit = js.native
  def unregister(property: String): Unit = js.native
}

