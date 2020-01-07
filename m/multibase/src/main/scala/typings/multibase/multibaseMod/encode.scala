package typings.multibase.multibaseMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multibase", "encode")
@js.native
object encode extends js.Object {
  def apply(nameOrCode: code, buf: Buffer): Buffer = js.native
  /**
    * Encode data with the specified base and add the multibase prefix.
    *
    * @param nameOrCode The multibase name or code number.
    * @param buf The data to be encoded.
    */
  def apply(nameOrCode: name, buf: Buffer): Buffer = js.native
}

