package typings.multibase.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multibase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(nameOrCode: code, buf: Buffer): Buffer = js.native
  /**
    * Create a new buffer with the multibase varint+code.
    *
    * @param nameOrCode The multibase name or code number.
    * @param buf The data to be prefixed with multibase.
    */
  def apply(nameOrCode: name, buf: Buffer): Buffer = js.native
}

