package typings.navigation.navigationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateInfo
  extends /**
  * Gets the additional state attributes
  */
/* extras */ StringDictionary[js.Any] {
  /**
    * Gets the default NavigationData Types for  this State
    */
  var defaultTypes: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the default NavigationData for this State
    */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the unique key
    */
  var key: String
  /**
    * Gets the route Url patterns
    */
  var route: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Gets the textual description of the state
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Gets a value that indicates whether to maintain the crumb trail
    */
  var trackCrumbTrail: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Gets a value that indicates whether NavigationData Types are
    * preserved when navigating
    */
  var trackTypes: js.UndefOr[Boolean] = js.undefined
}

object StateInfo {
  @scala.inline
  def apply(
    key: String,
    StringDictionary: /**
    * Gets the additional state attributes
    */
  /* extras */ StringDictionary[js.Any] = null,
    defaultTypes: js.Any = null,
    defaults: js.Any = null,
    route: String | js.Array[String] = null,
    title: String = null,
    trackCrumbTrail: Boolean | String = null,
    trackTypes: js.UndefOr[Boolean] = js.undefined
  ): StateInfo = {
    val __obj = js.Dynamic.literal(key = key)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (defaultTypes != null) __obj.updateDynamic("defaultTypes")(defaultTypes)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (trackCrumbTrail != null) __obj.updateDynamic("trackCrumbTrail")(trackCrumbTrail.asInstanceOf[js.Any])
    if (!js.isUndefined(trackTypes)) __obj.updateDynamic("trackTypes")(trackTypes)
    __obj.asInstanceOf[StateInfo]
  }
}

