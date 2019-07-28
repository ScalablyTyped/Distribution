package typings.node

import typings.node.nodeStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferEncodingPersistent extends js.Object {
  var encoding: buffer
  var persistent: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object Anon_BufferEncodingPersistent {
  @scala.inline
  def apply(
    encoding: buffer,
    persistent: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): Anon_BufferEncodingPersistent = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[Anon_BufferEncodingPersistent]
  }
}

