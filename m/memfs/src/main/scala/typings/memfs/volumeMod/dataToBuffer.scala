package typings.memfs.volumeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/volume", "dataToBuffer")
@js.native
object dataToBuffer extends js.Object {
  def apply(data: TData): Buffer = js.native
  def apply(data: TData, encoding: String): Buffer = js.native
}

