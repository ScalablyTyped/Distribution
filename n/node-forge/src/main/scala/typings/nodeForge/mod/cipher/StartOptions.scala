package typings.nodeForge.mod.cipher

import typings.nodeForge.mod.Byte
import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.util.ByteBuffer
import typings.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOptions extends js.Object {
  var additionalData: js.UndefOr[String] = js.undefined
  var iv: js.UndefOr[ByteBuffer | js.Array[Byte] | Bytes] = js.undefined
  var tag: js.UndefOr[ByteStringBuffer] = js.undefined
  var tagLength: js.UndefOr[Double] = js.undefined
}

object StartOptions {
  @scala.inline
  def apply(
    additionalData: String = null,
    iv: ByteBuffer | js.Array[Byte] | Bytes = null,
    tag: ByteStringBuffer = null,
    tagLength: js.UndefOr[Double] = js.undefined
  ): StartOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(tagLength)) __obj.updateDynamic("tagLength")(tagLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
}

