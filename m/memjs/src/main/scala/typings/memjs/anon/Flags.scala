package typings.memjs.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var flags: Buffer
  var value: Buffer
}

object Flags {
  @scala.inline
  def apply(flags: Buffer, value: Buffer): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
}

