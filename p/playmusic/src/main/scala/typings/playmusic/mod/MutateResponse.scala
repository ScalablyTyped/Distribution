package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateResponse extends js.Object {
  var client_id: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var response_code: js.UndefOr[String] = js.undefined
}

object MutateResponse {
  @scala.inline
  def apply(client_id: String = null, id: String = null, response_code: String = null): MutateResponse = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (response_code != null) __obj.updateDynamic("response_code")(response_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutateResponse]
  }
}

