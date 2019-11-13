package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[js.Any] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply(params: js.Any = null): Anon_Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Params]
  }
}

