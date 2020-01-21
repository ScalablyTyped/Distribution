package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateResponses extends js.Object {
  var mutate_response: js.UndefOr[js.Array[MutateResponse]] = js.undefined
}

object MutateResponses {
  @scala.inline
  def apply(mutate_response: js.Array[MutateResponse] = null): MutateResponses = {
    val __obj = js.Dynamic.literal()
    if (mutate_response != null) __obj.updateDynamic("mutate_response")(mutate_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutateResponses]
  }
}

