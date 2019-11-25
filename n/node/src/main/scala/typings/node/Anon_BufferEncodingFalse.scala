package typings.node

import typings.node.nodeNumbers.`false`
import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferEncodingFalse extends js.Object {
  var encoding: buffer_
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object Anon_BufferEncodingFalse {
  @scala.inline
  def apply(encoding: buffer_, withFileTypes: `false` = null): Anon_BufferEncodingFalse = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BufferEncodingFalse]
  }
}

