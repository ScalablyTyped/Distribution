package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var encoding: BufferEncoding
}

object AnonEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding): AnonEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEncoding]
  }
}

