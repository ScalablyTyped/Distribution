package typings.ntlmClient

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: Buffer
  var parsed: AnonDNS
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: Buffer, parsed: AnonDNS): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}

