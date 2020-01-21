package typings.pinoHttp.mod.httpAugmentingMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerResponse extends js.Object {
  var err: js.UndefOr[Error] = js.undefined
}

object ServerResponse {
  @scala.inline
  def apply(err: Error = null): ServerResponse = {
    val __obj = js.Dynamic.literal()
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResponse]
  }
}

