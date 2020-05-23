package typings.pgProtocol

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-protocol/dist/buffer-writer", JSImport.Namespace)
@js.native
object bufferWriterMod extends js.Object {
  @js.native
  class Writer () extends js.Object {
    def this(size: Double) = this()
    var buffer: js.Any = js.native
    var ensure: js.Any = js.native
    var headerPosition: js.Any = js.native
    var join: js.Any = js.native
    var offset: js.Any = js.native
    var size: js.Any = js.native
    def add(otherBuffer: Buffer): Writer = js.native
    def addCString(string: String): Writer = js.native
    def addInt16(num: Double): Writer = js.native
    def addInt32(num: Double): Writer = js.native
    def addString(): Writer = js.native
    def addString(string: String): Writer = js.native
    def flush(): Buffer = js.native
    def flush(code: Double): Buffer = js.native
  }
  
}

