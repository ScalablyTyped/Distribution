package typings.navigationDashReact.navigationDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBackLinkProps extends RefreshLinkProps {
  /**
    * Starting at 1, The number of Crumb steps to go back
    */
  var distance: Double
}

object NavigationBackLinkProps {
  @scala.inline
  def apply(distance: Double, RefreshLinkProps: RefreshLinkProps = null): NavigationBackLinkProps = {
    val __obj = js.Dynamic.literal(distance = distance)
    js.Dynamic.global.Object.assign(__obj, RefreshLinkProps)
    __obj.asInstanceOf[NavigationBackLinkProps]
  }
}

