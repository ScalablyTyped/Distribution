package typings.nodeDashForge.nodeDashForgeMod.cipher

import typings.nodeDashForge.nodeDashForgeMod.Byte
import typings.nodeDashForge.nodeDashForgeMod.Bytes
import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import typings.nodeDashForge.nodeDashForgeMod.util.ByteStringBuffer
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
    tagLength: Int | Double = null
  ): StartOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData)
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (tagLength != null) __obj.updateDynamic("tagLength")(tagLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
}

