package typings.objectPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var includeInheritedProps: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(includeInheritedProps: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeInheritedProps)) __obj.updateDynamic("includeInheritedProps")(includeInheritedProps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

