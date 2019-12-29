package typings.nodegit

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/buf", JSImport.Namespace)
@js.native
object bufMod extends js.Object {
  @js.native
  class Buf () extends js.Object {
    var asize: Double = js.native
    var ptr: String = js.native
    var size: Double = js.native
    def containsNul(): Double = js.native
    def free(): Unit = js.native
    def grow(targetSize: Double): js.Promise[Buf] = js.native
    def isBinary(): Double = js.native
    def set(data: Buffer, datalen: Double): js.Promise[Buf] = js.native
  }
  
}

