package typings
package navigationLib.navigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("navigation", "State")
@js.native
class State () extends StateInfo {
  /**
    * Gets the crumb trail key
    */
  var crumbTrailKey: java.lang.String = js.native
  /**
    * Gets the formatted default array NavigationData for this State
    */
  var formattedArrayDefaults: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  /**
    * Gets the formatted default NavigationData for this State
    */
  var formattedDefaults: js.Any = js.native
  /**
    * Gets the unique key
    */
  /* CompleteClass */
  override var key: java.lang.String = js.native
  /**
    * Gets the route Url patterns
    */
  @JSName("route")
  var route_State: java.lang.String | js.Array[java.lang.String] = js.native
  /**
    * Gets the textual description of the state
    */
  @JSName("title")
  var title_State: java.lang.String = js.native
  /**
    * Gets a value that indicates whether to maintain the crumb trail
    */
  @JSName("trackCrumbTrail")
  var trackCrumbTrail_State: scala.Boolean = js.native
  /**
    * Gets a value that indicates whether NavigationData Types are
    * preserved when navigating
    */
  @JSName("trackTypes")
  var trackTypes_State: scala.Boolean = js.native
  /**
    * Called on the old State after navigating to a different State
    */
  def dispose(): scala.Unit = js.native
  /**
    * Called on the current State after navigating to it
    * @param data The current NavigationData
    * @param asyncData The data passed asynchronously while navigating
    */
  def navigated(data: js.Any, asyncData: js.Any): scala.Unit = js.native
  /**
    * Called on the new State before navigating to it
    * @param data The new NavigationData
    * @param url The new target location
    * @param navigate The function to call to continue to navigate
    * @param history A value indicating whether browser history was used
    */
  def navigating(
    data: js.Any,
    url: java.lang.String,
    navigate: js.Function1[/* asyncData */ js.UndefOr[js.Any], scala.Unit],
    history: scala.Boolean
  ): scala.Unit = js.native
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
  def unloading(state: State, data: js.Any, url: java.lang.String, unload: js.Function0[scala.Unit]): scala.Unit = js.native
  def unloading(
    state: State,
    data: js.Any,
    url: java.lang.String,
    unload: js.Function0[scala.Unit],
    history: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Decodes the Url value
    * @param state The State navigated to
    * @param key The key of the navigation data item
    * @param val The Url value of the navigation data item
    * @param queryString A value indicating the Url value's location
    */
  def urlDecode(state: State, key: java.lang.String, `val`: java.lang.String, queryString: scala.Boolean): java.lang.String = js.native
  /**
    * Encodes the Url value
    * @param state The State navigated to
    * @param key The key of the navigation data item
    * @param val The Url value of the navigation data item
    * @param queryString A value indicating the Url value's location
    */
  def urlEncode(state: State, key: java.lang.String, `val`: java.lang.String, queryString: scala.Boolean): java.lang.String = js.native
  /**
    * Validates the NavigationData before navigating to the new State
    * @param data The new NavigationData
    * @returns Validation success indicator
    */
  def validate(data: js.Any): scala.Boolean = js.native
}

