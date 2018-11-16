package typings
package pngjs2Lib.pngjs2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pngjs2", "PNG")
@js.native
object PNGNs extends js.Object {
  @JSName("sync")
  @js.native
  object syncNs extends js.Object {
    def read(buffer: java.lang.String): pngjs2Lib.pngjs2Mod.PNG = js.native
    def read(buffer: java.lang.String, options: pngjs2Lib.pngjs2Mod.PNGOptions): pngjs2Lib.pngjs2Mod.PNG = js.native
    def read(buffer: nodeLib.Buffer): pngjs2Lib.pngjs2Mod.PNG = js.native
    def read(buffer: nodeLib.Buffer, options: pngjs2Lib.pngjs2Mod.PNGOptions): pngjs2Lib.pngjs2Mod.PNG = js.native
  }
  
}

