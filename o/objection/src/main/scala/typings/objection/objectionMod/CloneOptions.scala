package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object CloneOptions {
  @scala.inline
  def apply(shallow: js.UndefOr[Boolean] = js.undefined): CloneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneOptions]
  }
}

