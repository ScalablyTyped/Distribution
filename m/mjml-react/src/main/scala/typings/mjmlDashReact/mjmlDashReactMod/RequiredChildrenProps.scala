package typings.mjmlDashReact.mjmlDashReactMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredChildrenProps extends js.Object {
  var children: ReactNode
}

object RequiredChildrenProps {
  @scala.inline
  def apply(children: ReactNode = null): RequiredChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredChildrenProps]
  }
}

