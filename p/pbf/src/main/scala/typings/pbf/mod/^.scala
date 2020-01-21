package typings.pbf.mod

import typings.pbf.pbfNumbers.`0`
import typings.pbf.pbfNumbers.`1`
import typings.pbf.pbfNumbers.`2`
import typings.pbf.pbfNumbers.`5`
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pbf", JSImport.Namespace)
@js.native
class ^ () extends Pbf {
  def this(buffer: ArrayBuffer) = this()
  def this(buffer: Uint8Array) = this()
}

@JSImport("pbf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Bytes: `2` = js.native
  val Fixed32: `5` = js.native
  val Fixed64: `1` = js.native
  val Varint: `0` = js.native
}

