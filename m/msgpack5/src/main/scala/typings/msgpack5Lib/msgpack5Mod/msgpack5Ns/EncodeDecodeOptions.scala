package typings
package msgpack5Lib.msgpack5Mod.msgpack5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeDecodeOptions extends js.Object {
  var header: js.UndefOr[scala.Boolean] = js.undefined
}

object EncodeDecodeOptions {
  @scala.inline
  def apply(header: js.UndefOr[scala.Boolean] = js.undefined): EncodeDecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    __obj.asInstanceOf[EncodeDecodeOptions]
  }
}

