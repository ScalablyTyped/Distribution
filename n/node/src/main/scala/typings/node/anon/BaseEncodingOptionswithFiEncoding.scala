package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.BaseEncodingOptions & {  withFileTypes  :true} */
trait BaseEncodingOptionswithFiEncoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  var withFileTypes: `true`
}

object BaseEncodingOptionswithFiEncoding {
  @scala.inline
  def apply(withFileTypes: `true`, encoding: js.UndefOr[Null | BufferEncoding] = js.undefined): BaseEncodingOptionswithFiEncoding = {
    val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEncodingOptionswithFiEncoding]
  }
}

