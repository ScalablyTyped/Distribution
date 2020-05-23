package typings.ntlmClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: typings.node.Buffer
  var parsed: DNS
}

object Buffer {
  @scala.inline
  def apply(buffer: typings.node.Buffer, parsed: DNS): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

