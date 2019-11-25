package typings.node.fsMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDirOptions extends js.Object {
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
}

object OpenDirOptions {
  @scala.inline
  def apply(encoding: BufferEncoding = null): OpenDirOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDirOptions]
  }
}

