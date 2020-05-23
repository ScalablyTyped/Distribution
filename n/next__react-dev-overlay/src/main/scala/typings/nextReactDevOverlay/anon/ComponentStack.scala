package typings.nextReactDevOverlay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentStack extends js.Object {
  var componentStack: js.UndefOr[String | Null] = js.undefined
}

object ComponentStack {
  @scala.inline
  def apply(componentStack: js.UndefOr[Null | String] = js.undefined): ComponentStack = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(componentStack)) __obj.updateDynamic("componentStack")(componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStack]
  }
}

