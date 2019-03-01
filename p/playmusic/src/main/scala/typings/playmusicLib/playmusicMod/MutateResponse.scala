package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateResponse extends js.Object {
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var response_code: js.UndefOr[java.lang.String] = js.undefined
}

object MutateResponse {
  @scala.inline
  def apply(
    client_id: java.lang.String = null,
    id: java.lang.String = null,
    response_code: java.lang.String = null
  ): MutateResponse = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (id != null) __obj.updateDynamic("id")(id)
    if (response_code != null) __obj.updateDynamic("response_code")(response_code)
    __obj.asInstanceOf[MutateResponse]
  }
}

