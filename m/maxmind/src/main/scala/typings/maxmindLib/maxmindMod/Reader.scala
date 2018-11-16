package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", "Reader")
@js.native
class Reader[T /* <: Response */] protected () extends js.Object {
  def this(buffer: nodeLib.Buffer) = this()
  def this(buffer: nodeLib.Buffer, opts: OpenOpts) = this()
  var metadata: Metadata = js.native
  def get(ipAddress: java.lang.String): T | scala.Null = js.native
}

