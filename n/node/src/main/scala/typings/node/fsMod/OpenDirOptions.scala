package typings.node.fsMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDirOptions extends js.Object {
  /**
    * Number of directory entries that are buffered
    * internally when reading from the directory. Higher values lead to better
    * performance but higher memory usage.
    * @default 32
    */
  var bufferSize: js.UndefOr[Double] = js.undefined
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
}

object OpenDirOptions {
  @scala.inline
  def apply(bufferSize: Int | Double = null, encoding: BufferEncoding = null): OpenDirOptions = {
    val __obj = js.Dynamic.literal()
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDirOptions]
  }
}

