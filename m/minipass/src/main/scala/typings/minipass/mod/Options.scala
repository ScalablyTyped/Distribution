package typings.minipass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | String] = js.undefined, objectMode: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

