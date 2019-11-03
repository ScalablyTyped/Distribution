package typings.navigationDashReact.navigationDashReactMod

import typings.navigation.navigationMod.FluentNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluentLinkProps extends LinkProps {
  /**
    * Indicates whether to inherit the current context
    */
  var withContext: js.UndefOr[Boolean] = js.undefined
  /**
    * The function that fluently navigates to a State
    */
  def navigate(fluentNavigator: FluentNavigator): FluentNavigator
}

object FluentLinkProps {
  @scala.inline
  def apply(
    navigate: FluentNavigator => FluentNavigator,
    LinkProps: LinkProps = null,
    withContext: js.UndefOr[Boolean] = js.undefined
  ): FluentLinkProps = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction1(navigate))
    js.Dynamic.global.Object.assign(__obj, LinkProps)
    if (!js.isUndefined(withContext)) __obj.updateDynamic("withContext")(withContext)
    __obj.asInstanceOf[FluentLinkProps]
  }
}

