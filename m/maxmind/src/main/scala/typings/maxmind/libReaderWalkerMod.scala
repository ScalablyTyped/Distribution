package typings.maxmind

import typings.maxmind.libReaderWalkerMod.NodeReader
import typings.maxmind.libReaderWalkerMod.Walker
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/reader/walker", JSImport.Namespace)
@js.native
object libReaderWalkerMod extends js.Object {
  @js.native
  trait Walker extends js.Object {
    @JSName("left")
    var left_Original: NodeReader = js.native
    @JSName("right")
    var right_Original: NodeReader = js.native
    def left(offset: Double): Double = js.native
    def right(offset: Double): Double = js.native
  }
  
  def default(db: Buffer, recordSize: Double): Walker = js.native
  type NodeReader = js.Function1[/* offset */ Double, Double]
}

