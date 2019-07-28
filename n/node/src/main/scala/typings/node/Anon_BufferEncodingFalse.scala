package typings.node

import typings.node.nodeNumbers.`false`
import typings.node.nodeStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferEncodingFalse extends js.Object {
  var encoding: buffer
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object Anon_BufferEncodingFalse {
  @scala.inline
  def apply(encoding: buffer, withFileTypes: `false` = null): Anon_BufferEncodingFalse = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes)
    __obj.asInstanceOf[Anon_BufferEncodingFalse]
  }
}

