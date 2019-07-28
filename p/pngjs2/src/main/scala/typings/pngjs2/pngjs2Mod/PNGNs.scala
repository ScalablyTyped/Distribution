package typings.pngjs2.pngjs2Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pngjs2", "PNG")
@js.native
object PNGNs extends js.Object {
  @JSName("sync")
  @js.native
  object syncNs extends js.Object {
    def read(buffer: String): PNG = js.native
    def read(buffer: String, options: PNGOptions): PNG = js.native
    def read(buffer: Buffer): PNG = js.native
    def read(buffer: Buffer, options: PNGOptions): PNG = js.native
  }
  
}

