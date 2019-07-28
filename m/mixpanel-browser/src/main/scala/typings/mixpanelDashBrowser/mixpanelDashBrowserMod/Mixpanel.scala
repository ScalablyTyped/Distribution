package typings.mixpanelDashBrowser.mixpanelDashBrowserMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mixpanel extends js.Object {
  var people: People = js.native
  def alias(alias: String): Unit = js.native
  def alias(alias: String, original: String): Unit = js.native
  def clear_opt_in_out_tracking(): Unit = js.native
  def clear_opt_in_out_tracking(options: Partial[ClearOptOutInOutOptions]): Unit = js.native
  def disable(): Unit = js.native
  def disable(events: js.Array[String]): Unit = js.native
  def get_config(): js.Any = js.native
  def get_config(prop_name: String): js.Any = js.native
  def get_distinct_id(): js.Any = js.native
  def get_property(property_name: String): js.Any = js.native
  def has_opted_in_tracking(): Boolean = js.native
  def has_opted_in_tracking(options: Partial[HasOptedInOutOptions]): Boolean = js.native
  def has_opted_out_tracking(): Boolean = js.native
  def has_opted_out_tracking(options: Partial[HasOptedInOutOptions]): Boolean = js.native
  def identify(): js.Any = js.native
  def identify(unique_id: String): js.Any = js.native
  def init(token: String): Mixpanel = js.native
  def init(token: String, config: Partial[Config]): Mixpanel = js.native
  def init(token: String, config: Partial[Config], name: String): Mixpanel = js.native
  def opt_in_tracking(): Unit = js.native
  def opt_in_tracking(options: Partial[InTrackingOptions]): Unit = js.native
  def opt_out_tracking(): Unit = js.native
  def opt_out_tracking(options: Partial[OutTrackingOptions]): Unit = js.native
  def push(item: PushItem): Unit = js.native
  def register(props: Dict): Unit = js.native
  def register(props: Dict, days: Double): Unit = js.native
  def register_once(props: Dict): Unit = js.native
  def register_once(props: Dict, default_value: js.Any): Unit = js.native
  def register_once(props: Dict, default_value: js.Any, days: Double): Unit = js.native
  def reset(): Unit = js.native
  def set_config(config: Partial[Config]): Unit = js.native
  def time_event(event_name: String): Unit = js.native
  def track(event_name: String): Unit = js.native
  def track(event_name: String, properties: Dict): Unit = js.native
  def track(event_name: String, properties: Dict, callback: js.Function0[Unit]): Unit = js.native
  def track_forms(query: String, event_name: String): Unit = js.native
  def track_forms(query: String, event_name: String, properties: js.Function0[Unit]): Unit = js.native
  def track_forms(query: String, event_name: String, properties: Dict): Unit = js.native
  def track_links(query: String, event_name: String): Unit = js.native
  def track_links(query: String, event_name: String, properties: js.Function0[Unit]): Unit = js.native
  def track_links(query: String, event_name: String, properties: Dict): Unit = js.native
  def unregister(property: String): Unit = js.native
}

