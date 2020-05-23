package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.BaseEncodingOptions & {  withFileTypes ? :false} */
trait BaseEncodingOptionswithFi extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object BaseEncodingOptionswithFi {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | BufferEncoding] = js.undefined, withFileTypes: `false` = null): BaseEncodingOptionswithFi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEncodingOptionswithFi]
  }
}

