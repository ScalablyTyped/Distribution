package typings.node.fsMod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadVResult extends js.Object {
  var buffers: js.Array[ArrayBufferView]
  var bytesRead: Double
}

object ReadVResult {
  @scala.inline
  def apply(buffers: js.Array[ArrayBufferView], bytesRead: Double): ReadVResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadVResult]
  }
}

