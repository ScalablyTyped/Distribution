package typings.maxmind.readerMod

import typings.maxmind.mod.OpenOpts
import typings.maxmind.responseMod.Response
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/reader", JSImport.Default)
@js.native
class default[T /* <: Response */] protected () extends Reader[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: OpenOpts) = this()
}

