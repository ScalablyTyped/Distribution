package typings
package navigationLib.navigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluentNavigator extends js.Object {
  /**
    * Gets the current Url
    */
  var url: java.lang.String = js.native
  /**
    * Navigates to a State
    * @param stateKey The key of a State
    * @param navigationData The NavigationData to be passed to the next
    * State and stored in the StateContext
    * @throws state does not match the key of a State or there is
    * NavigationData that cannot be converted to a String
    * @throws A mandatory route parameter has not been supplied a value
    */
  def navigate(stateKey: java.lang.String): FluentNavigator = js.native
  def navigate(stateKey: java.lang.String, navigationData: js.Any): FluentNavigator = js.native
  /**
    * Navigates back along the crumb trail
    * @param distance Starting at 1, the number of Crumb steps to go back
    * @throws canNavigateBack returns false for this distance
    * @throws A mandatory route parameter has not been supplied a value
    */
  def navigateBack(distance: scala.Double): FluentNavigator = js.native
  /**
    * Navigates to the current State
    * @param navigationData The NavigationData to be passed to the current
    * State and stored in the StateContext
    * @param A value determining the effect on browser history
    * @throws There is NavigationData that cannot be converted to a String
    * @throws A mandatory route parameter has not been supplied a value
    */
  def refresh(): FluentNavigator = js.native
  def refresh(navigationData: js.Any): FluentNavigator = js.native
}

