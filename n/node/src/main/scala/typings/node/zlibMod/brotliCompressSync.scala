package typings.node.zlibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", "brotliCompressSync")
@js.native
object brotliCompressSync extends js.Object {
  def apply(buf: InputType): Buffer = js.native
  def apply(buf: InputType, options: BrotliOptions): Buffer = js.native
}

