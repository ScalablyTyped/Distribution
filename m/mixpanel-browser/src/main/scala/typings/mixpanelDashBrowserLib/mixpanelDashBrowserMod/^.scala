package typings
package mixpanelDashBrowserLib.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mixpanel-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val people: People = js.native
  def alias(alias: java.lang.String): scala.Unit = js.native
  def alias(alias: java.lang.String, original: java.lang.String): scala.Unit = js.native
  def clear_opt_in_out_tracking(): scala.Unit = js.native
  def clear_opt_in_out_tracking(options: stdLib.Partial[ClearOptOutInOutOptions]): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def disable(events: js.Array[java.lang.String]): scala.Unit = js.native
  def get_config(): js.Any = js.native
  def get_config(prop_name: java.lang.String): js.Any = js.native
  def get_distinct_id(): js.Any = js.native
  def get_property(property_name: java.lang.String): js.Any = js.native
  def has_opted_in_tracking(): scala.Boolean = js.native
  def has_opted_in_tracking(options: stdLib.Partial[HasOptedInOutOptions]): scala.Boolean = js.native
  def has_opted_out_tracking(): scala.Boolean = js.native
  def has_opted_out_tracking(options: stdLib.Partial[HasOptedInOutOptions]): scala.Boolean = js.native
  def identify(): js.Any = js.native
  def identify(unique_id: java.lang.String): js.Any = js.native
  def init(token: java.lang.String): Mixpanel = js.native
  def init(token: java.lang.String, config: stdLib.Partial[Config]): Mixpanel = js.native
  def init(token: java.lang.String, config: stdLib.Partial[Config], name: java.lang.String): Mixpanel = js.native
  def opt_in_tracking(): scala.Unit = js.native
  def opt_in_tracking(options: stdLib.Partial[InTrackingOptions]): scala.Unit = js.native
  def opt_out_tracking(): scala.Unit = js.native
  def opt_out_tracking(options: stdLib.Partial[OutTrackingOptions]): scala.Unit = js.native
  def push(item: PushItem): scala.Unit = js.native
  def register(props: Dict): scala.Unit = js.native
  def register(props: Dict, days: scala.Double): scala.Unit = js.native
  def register_once(props: Dict): scala.Unit = js.native
  def register_once(props: Dict, default_value: js.Any): scala.Unit = js.native
  def register_once(props: Dict, default_value: js.Any, days: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def set_config(config: stdLib.Partial[Config]): scala.Unit = js.native
  def time_event(event_name: java.lang.String): scala.Unit = js.native
  def track(event_name: java.lang.String): scala.Unit = js.native
  def track(event_name: java.lang.String, properties: Dict): scala.Unit = js.native
  def track(event_name: java.lang.String, properties: Dict, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def track_forms(query: java.lang.String, event_name: java.lang.String): scala.Unit = js.native
  def track_forms(query: java.lang.String, event_name: java.lang.String, properties: js.Function0[scala.Unit]): scala.Unit = js.native
  def track_forms(query: java.lang.String, event_name: java.lang.String, properties: Dict): scala.Unit = js.native
  def track_links(query: java.lang.String, event_name: java.lang.String): scala.Unit = js.native
  def track_links(query: java.lang.String, event_name: java.lang.String, properties: js.Function0[scala.Unit]): scala.Unit = js.native
  def track_links(query: java.lang.String, event_name: java.lang.String, properties: Dict): scala.Unit = js.native
  def unregister(property: java.lang.String): scala.Unit = js.native
}

