package typings.pgProtocol

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-protocol/dist/BufferReader", JSImport.Namespace)
@js.native
object distBufferReaderMod extends js.Object {
  @js.native
  class BufferReader () extends js.Object {
    def this(offset: Double) = this()
    var buffer: js.Any = js.native
    var encoding: js.Any = js.native
    var offset: js.Any = js.native
    def byte(): Double = js.native
    def bytes(length: Double): Buffer = js.native
    def cstring(): String = js.native
    def int16(): Double = js.native
    def int32(): Double = js.native
    def setBuffer(offset: Double, buffer: Buffer): Unit = js.native
    def string(length: Double): String = js.native
  }
  
}

