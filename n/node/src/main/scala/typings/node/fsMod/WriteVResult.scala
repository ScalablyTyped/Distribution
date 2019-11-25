package typings.node.fsMod

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteVResult extends js.Object {
  var buffers: js.Array[ArrayBufferView]
  var bytesWritten: Double
}

object WriteVResult {
  @scala.inline
  def apply(buffers: js.Array[ArrayBufferView], bytesWritten: Double): WriteVResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WriteVResult]
  }
}

