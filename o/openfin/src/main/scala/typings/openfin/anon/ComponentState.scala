package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentState extends js.Object {
  var componentState: js.UndefOr[Url] = js.undefined
  var container: js.Any
}

object ComponentState {
  @scala.inline
  def apply(container: js.Any, componentState: Url = null): ComponentState = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (componentState != null) __obj.updateDynamic("componentState")(componentState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentState]
  }
}

