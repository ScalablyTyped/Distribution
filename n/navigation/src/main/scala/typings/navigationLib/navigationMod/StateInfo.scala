package typings
package navigationLib.navigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateInfo
  extends /**
  * Gets the additional state attributes
  */
/* extras */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var key: java.lang.String
  /**
    * Gets the route Url patterns
    */
  var route: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Gets the textual description of the state
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets a value that indicates whether to maintain the crumb trail
    */
  var trackCrumbTrail: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Gets a value that indicates whether NavigationData Types are
    * preserved when navigating
    */
  var trackTypes: js.UndefOr[scala.Boolean] = js.undefined
}

