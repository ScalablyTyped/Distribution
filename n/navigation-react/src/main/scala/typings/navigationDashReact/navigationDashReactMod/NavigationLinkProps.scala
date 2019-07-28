package typings.navigationDashReact.navigationDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationLinkProps extends RefreshLinkProps {
  /**
    * The key of the State to navigate to
    */
  var stateKey: String
}

object NavigationLinkProps {
  @scala.inline
  def apply(stateKey: String, RefreshLinkProps: RefreshLinkProps = null): NavigationLinkProps = {
    val __obj = js.Dynamic.literal(stateKey = stateKey)
    js.Dynamic.global.Object.assign(__obj, RefreshLinkProps)
    __obj.asInstanceOf[NavigationLinkProps]
  }
}

