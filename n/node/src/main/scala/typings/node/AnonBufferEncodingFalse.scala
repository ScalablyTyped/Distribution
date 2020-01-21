package typings.node

import typings.node.nodeBooleans.`false`
import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferEncodingFalse extends js.Object {
  var encoding: buffer_
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object AnonBufferEncodingFalse {
  @scala.inline
  def apply(encoding: buffer_, withFileTypes: `false` = null): AnonBufferEncodingFalse = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferEncodingFalse]
  }
}

