package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait People_ extends js.Object {
  def append(prop: String, value: js.Any): Unit = js.native
  def append(prop: String, value: js.Any, callback: Callback): Unit = js.native
  def append(prop: Dict): Unit = js.native
  def append(prop: Dict, callback: Callback): Unit = js.native
  def clear_charges(): Unit = js.native
  def clear_charges(callback: Callback): Unit = js.native
  def delete_user(): Unit = js.native
  def increment(prop: String): Unit = js.native
  def increment(prop: String, by: Double): Unit = js.native
  def increment(prop: String, by: Double, callback: Callback): Unit = js.native
  def increment(prop: String, callback: Callback): Unit = js.native
  def increment(prop: Dict): Unit = js.native
  def increment(prop: Dict, callback: Callback): Unit = js.native
  def remove(prop: String, value: js.Any): Unit = js.native
  def remove(prop: String, value: js.Any, callback: Callback): Unit = js.native
  def remove(prop: Dict): Unit = js.native
  def remove(prop: Dict, callback: Callback): Unit = js.native
  def set(prop: String, to: js.Any): Unit = js.native
  def set(prop: String, to: js.Any, callback: Callback): Unit = js.native
  def set(prop: Dict): Unit = js.native
  def set(prop: Dict, callback: Callback): Unit = js.native
  def set_once(prop: String, to: js.Any): Unit = js.native
  def set_once(prop: String, to: js.Any, callback: Callback): Unit = js.native
  def set_once(prop: Dict): Unit = js.native
  def set_once(prop: Dict, callback: Callback): Unit = js.native
  def track_charge(amount: Double): Unit = js.native
  def track_charge(amount: Double, propertiesOrCallback: js.UndefOr[scala.Nothing], callback: Callback): Unit = js.native
  def track_charge(amount: Double, propertiesOrCallback: Callback): Unit = js.native
  def track_charge(amount: Double, propertiesOrCallback: Callback, callback: Callback): Unit = js.native
  def track_charge(amount: Double, propertiesOrCallback: Dict): Unit = js.native
  def track_charge(amount: Double, propertiesOrCallback: Dict, callback: Callback): Unit = js.native
  def union(prop: String, value: js.Any): Unit = js.native
  def union(prop: String, value: js.Any, callback: Callback): Unit = js.native
  def union(prop: Dict): Unit = js.native
  def union(prop: Dict, callback: Callback): Unit = js.native
  def unset(prop: String): Unit = js.native
  def unset(prop: String, callback: Callback): Unit = js.native
  def unset(prop: js.Array[String]): Unit = js.native
  def unset(prop: js.Array[String], callback: Callback): Unit = js.native
}

