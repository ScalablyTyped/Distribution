package typings.memjs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlags extends js.Object {
  var flags: Buffer
  var value: Buffer
}

object AnonFlags {
  @scala.inline
  def apply(flags: Buffer, value: Buffer): AnonFlags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFlags]
  }
}

