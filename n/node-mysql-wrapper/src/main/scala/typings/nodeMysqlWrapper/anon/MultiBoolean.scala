package typings.nodeMysqlWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiBoolean extends js.Object {
  var multi: js.UndefOr[Boolean] = js.undefined
}

object MultiBoolean {
  @scala.inline
  def apply(multi: js.UndefOr[Boolean] = js.undefined): MultiBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiBoolean]
  }
}

