package typings.navigation.navigationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("navigation", "State")
@js.native
class State () extends StateInfo {
  /**
    * Gets the crumb trail key
    */
  var crumbTrailKey: String = js.native
  /**
    * Gets the formatted default array NavigationData for this State
    */
  var formattedArrayDefaults: StringDictionary[js.Array[String]] = js.native
  /**
    * Gets the formatted default NavigationData for this State
    */
  var formattedDefaults: js.Any = js.native
  /**
    * Gets the unique key
    */
  /* CompleteClass */
  override var key: String = js.native
  /**
    * Gets the route Url patterns
    */
  @JSName("route")
  var route_State: String | js.Array[String] = js.native
  /**
    * Gets the textual description of the state
    */
  @JSName("title")
  var title_State: String = js.native
  /**
    * Gets a value that indicates whether to maintain the crumb trail
    */
  @JSName("trackCrumbTrail")
  var trackCrumbTrail_State: Boolean = js.native
  /**
    * Gets a value that indicates whether NavigationData Types are
    * preserved when navigating
    */
  @JSName("trackTypes")
  var trackTypes_State: Boolean = js.native
  /**
    * Called on the old State after navigating to a different State
    */
  def dispose(): Unit = js.native
  /**
    * Called on the current State after navigating to it
    * @param data The current NavigationData
    * @param asyncData The data passed asynchronously while navigating
    */
  def navigated(data: js.Any, asyncData: js.Any): Unit = js.native
  /**
    * Called on the new State before navigating to it
    * @param data The new NavigationData
    * @param url The new target location
    * @param navigate The function to call to continue to navigate
    * @param history A value indicating whether browser history was used
    */
  def navigating(
    data: js.Any,
    url: String,
    navigate: js.Function1[/* asyncData */ js.UndefOr[js.Any], Unit],
    history: Boolean
  ): Unit = js.native
  /**
    * Truncates the crumb trail whenever a repeated or initial State is
    * encountered
    * @param The State navigated to
    * @param The new NavigationData
    * @param The Crumb collection representing the crumb trail
    * @returns Truncated crumb trail
    */
  def truncateCrumbTrail(state: State, data: js.Any, crumbs: js.Array[Crumb]): js.Array[Crumb] = js.native
  /**
    * Called on the old State before navigating to a different State
    * @param state The new State
    * @param data The new NavigationData
    * @param url The new target location
    * @param unload The function to call to continue to navigate
    * @param history A value indicating whether browser history was used
    */
  def unloading(state: State, data: js.Any, url: String, unload: js.Function0[Unit]): Unit = js.native
  def unloading(state: State, data: js.Any, url: String, unload: js.Function0[Unit], history: Boolean): Unit = js.native
  /**
    * Decodes the Url value
    * @param state The State navigated to
    * @param key The key of the navigation data item
    * @param val The Url value of the navigation data item
    * @param queryString A value indicating the Url value's location
    */
  def urlDecode(state: State, key: String, `val`: String, queryString: Boolean): String = js.native
  /**
    * Encodes the Url value
    * @param state The State navigated to
    * @param key The key of the navigation data item
    * @param val The Url value of the navigation data item
    * @param queryString A value indicating the Url value's location
    * @param index The index of the navigation data array item
    */
  def urlEncode(state: State, key: String, `val`: String, queryString: Boolean): String = js.native
  def urlEncode(state: State, key: String, `val`: String, queryString: Boolean, index: Double): String = js.native
  /**
    * Validates the NavigationData before navigating to the new State
    * @param data The new NavigationData
    * @returns Validation success indicator
    */
  def validate(data: js.Any): Boolean = js.native
}

