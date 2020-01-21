package typings.node

import typings.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingFalseWithFileTypesBufferEncoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object AnonEncodingFalseWithFileTypesBufferEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding = null, withFileTypes: `false` = null): AnonEncodingFalseWithFileTypesBufferEncoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingFalseWithFileTypesBufferEncoding]
  }
}

