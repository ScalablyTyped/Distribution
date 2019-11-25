package typings.maxmind.libMod

import typings.maxmind.libReaderResponseMod.Response
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib", "Reader")
@js.native
class Reader[T /* <: Response */] protected ()
  extends typings.maxmind.libReaderMod.default[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: OpenOpts) = this()
}

