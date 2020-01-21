package typings.maxmind.mod

import typings.maxmind.responseMod.Response
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", "Reader")
@js.native
class Reader[T /* <: Response */] protected ()
  extends typings.maxmind.readerMod.default[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: OpenOpts) = this()
}

