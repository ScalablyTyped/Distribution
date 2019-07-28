package typings.mmmagic.mmmagicMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mmmagic", "Magic")
@js.native
class Magic () extends js.Object {
  def this(magicPath: String) = this()
  def this(mask: bitmask) = this()
  def this(magicPath: String, mask: bitmask) = this()
  def detect(data: Buffer, callback: js.Function2[/* err */ Error, /* result */ String, Unit]): Unit = js.native
  def detectFile(path: String, callback: js.Function2[/* err */ Error, /* result */ String, Unit]): Unit = js.native
}

