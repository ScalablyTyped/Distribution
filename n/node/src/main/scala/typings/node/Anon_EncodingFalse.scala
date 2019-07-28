package typings.node

import typings.node.nodeNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFalse extends js.Object {
  var encoding: BufferEncoding | Null
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object Anon_EncodingFalse {
  @scala.inline
  def apply(encoding: BufferEncoding = null, withFileTypes: `false` = null): Anon_EncodingFalse = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes)
    __obj.asInstanceOf[Anon_EncodingFalse]
  }
}

