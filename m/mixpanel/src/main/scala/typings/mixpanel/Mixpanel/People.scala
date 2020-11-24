package typings.mixpanel.Mixpanel

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait People extends js.Object {
  
  def append(keys: StringDictionary[js.Any]): Unit = js.native
  def append(keys: StringDictionary[js.Any], callback: js.Function0[Unit]): Unit = js.native
  /**
    * Append a value to a list-valued people analytics property.
    *
    * ### Usage:
    *
    *     // append a value to a list, creating it if needed
    *     mixpanel.people.append('pages_visited', 'homepage');
    *
    *     // like mixpanel.people.set(), you can append multiple
    *     // properties at once:
    *     mixpanel.people.append({
    *         list1: 'bob',
    *         list2: 123
    *     });
    *
    * @param prop If a string, this is the name of the property. If an object, this is an associative array of names and values.
    * @param value An item to append to the list
    * @param callback If provided, the callback will be called after the tracking event
    */
  def append(prop: String, value: js.Any): Unit = js.native
  def append(prop: String, value: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Permanently clear all revenue report transactions from the
    * current user's people analytics profile.
    *
    * ### Usage:
    *
    *     mixpanel.people.clear_charges();
    *
    * @param callback If provided, the callback will be called after the tracking event
    */
  def clear_charges(): Unit = js.native
  def clear_charges(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Permanently deletes the current people analytics profile from
    * Mixpanel (using the current `distinct_id`).
    *
    * ### Usage:
    *
    *     // remove the all data you have stored about the current user
    *     mixpanel.people.delete_user();
    *
    */
  def delete_user(): Unit = js.native
  
  def increment(keys: StringDictionary[Double]): Unit = js.native
  def increment(keys: StringDictionary[Double], callback: js.Function0[Unit]): Unit = js.native
  /**
    * Increment/decrement numeric people analytics properties.
    *
    * ### Usage:
    *
    *     mixpanel.people.increment('page_views', 1);
    *
    *     // or, for convenience, if you're just incrementing a counter by
    *     // 1, you can simply do
    *     mixpanel.people.increment('page_views');
    *
    *     // to decrement a counter, pass a negative number
    *     mixpanel.people.increment('credits_left', -1);
    *
    *     // like mixpanel.people.set(), you can increment multiple
    *     // properties at once:
    *     mixpanel.people.increment({
    *         counter1: 1,
    *         counter2: 6
    *     });
    *
    * @param prop If a string, this is the name of the property. If an object, this is an associative array of names and numeric values.
    * @param value An amount to increment the given property
    * @param callback If provided, the callback will be called after the tracking event
    */
  def increment(prop: String): Unit = js.native
  def increment(prop: String, value: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def increment(prop: String, value: Double): Unit = js.native
  def increment(prop: String, value: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def set(keys: StringDictionary[js.Any]): Unit = js.native
  def set(keys: StringDictionary[js.Any], callback: js.Function0[Unit]): Unit = js.native
  /**
    * Set properties on a user record.
    *
    * ### Usage:
    *
    *     mixpanel.people.set('gender', 'm');
    *
    *     // or set multiple properties at once
    *     mixpanel.people.set({
    *         'Company': 'Acme',
    *         'Plan': 'Premium',
    *         'Upgrade date': new Date()
    *     });
    *     // properties can be strings, integers, dates, or lists
    *
    * @param prop If a string, this is the name of the property. If an object, this is an associative array of names and values.
    * @param value A value to set on the given property name
    * @param callback If provided, the callback will be called after the tracking event
    */
  def set(prop: String, value: js.Any): Unit = js.native
  def set(prop: String, value: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  def set_once(keys: StringDictionary[js.Any]): Unit = js.native
  def set_once(keys: StringDictionary[js.Any], callback: js.Function0[Unit]): Unit = js.native
  /**
    * Set properties on a user record, only if they do not yet exist.
    * This will not overwrite previous people property values, unlike
    * `people.set()`.
    *
    * ### Usage:
    *
    *     mixpanel.people.set_once('First Login Date', new Date());
    *
    *     // or set multiple properties at once
    *     mixpanel.people.set_once({
    *         'First Login Date': new Date(),
    *         'Starting Plan': 'Premium'
    *     });
    *
    *     // properties can be strings, integers or dates
    *
    * @param prop If a string, this is the name of the property. If an object, this is an associative array of names and values.
    * @param value A value to set on the given property name
    * @param callback If provided, the callback will be called after the tracking event
    */
  def set_once(prop: String, value: js.Any): Unit = js.native
  def set_once(prop: String, value: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Record that you have charged the current user a certain amount
    * of money. Charges recorded with `track_charge()` will appear in the
    * Mixpanel revenue report.
    *
    * ### Usage:
    *
    *     // charge a user $50
    *     mixpanel.people.track_charge(50);
    *
    *     // charge a user $30.50 on the 2nd of january
    *     mixpanel.people.track_charge(30.50, {
    *         '$time': new Date('jan 1 2012')
    *     });
    *
    * @param amount The amount of money charged to the current user
    * @param properties An associative array of properties associated with the charge
    * @param callback If provided, the callback will be called when the server responds
    */
  def track_charge(amount: Double): Unit = js.native
  def track_charge(amount: Double, properties: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def track_charge(amount: Double, properties: StringDictionary[js.Any]): Unit = js.native
  def track_charge(amount: Double, properties: StringDictionary[js.Any], callback: js.Function0[Unit]): Unit = js.native
  
  def union(keys: StringDictionary[js.Any]): Unit = js.native
  def union(keys: StringDictionary[js.Any], callback: js.Function0[Unit]): Unit = js.native
  /**
    * Merge a given list with a list-valued people analytics property,
    * excluding duplicate values.
    *
    * ### Usage:
    *
    *     // merge a value to a list, creating it if needed
    *     mixpanel.people.union('pages_visited', 'homepage');
    *
    *     // like mixpanel.people.set(), you can append multiple
    *     // properties at once:
    *     mixpanel.people.union({
    *         list1: 'bob',
    *         list2: 123
    *     });
    *
    *     // like mixpanel.people.append(), you can append multiple
    *     // values to the same list:
    *     mixpanel.people.union({
    *         list1: ['bob', 'billy']
    *     });
    *
    * @param prop If a string, this is the name of the property. If an object, this is an associative array of names and values.
    * @param value Value / values to merge with the given property
    * @param callback If provided, the callback will be called after the tracking event
    */
  def union(prop: String, values: js.Any): Unit = js.native
  def union(prop: String, values: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Unset properties on a user record (permanently removes the properties and their values from a profile).
    *
    * ### Usage:
    *
    *     mixpanel.people.unset('gender');
    *
    *     // or unset multiple properties at once
    *     mixpanel.people.unset(['gender', 'Company']);
    *
    * @param prop If a string, this is the name of the property. If an array, this is a list of property names.
    * @param callback If provided, the callback will be called after the tracking event
    */
  def unset(prop: String): Unit = js.native
  def unset(prop: String, callback: js.Function0[Unit]): Unit = js.native
  def unset(prop: js.Array[String]): Unit = js.native
  def unset(prop: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
}
