package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", "Reader")
@js.native
class Reader[T /* <: maxmindLib.libReaderResponseMod.Response */] protected ()
  extends maxmindLib.libReaderMod.default[T] {
  def this(db: nodeLib.Buffer) = this()
  def this(db: nodeLib.Buffer, opts: js.Object) = this()
}

