package typings
package navigationDashReactLib.navigationDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBackLinkProps extends RefreshLinkProps {
  /**
    * Starting at 1, The number of Crumb steps to go back
    */
  var distance: scala.Double
}

object NavigationBackLinkProps {
  @scala.inline
  def apply(distance: scala.Double, RefreshLinkProps: RefreshLinkProps = null): NavigationBackLinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    js.Dynamic.global.Object.assign(__obj, RefreshLinkProps)
    __obj.asInstanceOf[NavigationBackLinkProps]
  }
}

