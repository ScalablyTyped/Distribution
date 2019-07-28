package typings.minipass.minipassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(encoding: String = null, objectMode: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    __obj.asInstanceOf[Options]
  }
}

