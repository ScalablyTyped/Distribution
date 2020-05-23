package typings.node.fsMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEncodingOptions extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
}

object BaseEncodingOptions {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | BufferEncoding] = js.undefined): BaseEncodingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEncodingOptions]
  }
}

