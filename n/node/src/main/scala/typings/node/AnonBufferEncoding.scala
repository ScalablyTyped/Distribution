package typings.node

import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferEncoding extends js.Object {
  var encoding: buffer_
}

object AnonBufferEncoding {
  @scala.inline
  def apply(encoding: buffer_): AnonBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferEncoding]
  }
}

