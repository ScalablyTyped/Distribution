package typings.memjs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flags extends js.Object {
  var flags: Buffer
  var value: Buffer
}

object Anon_Flags {
  @scala.inline
  def apply(flags: Buffer, value: Buffer): Anon_Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Flags]
  }
}

