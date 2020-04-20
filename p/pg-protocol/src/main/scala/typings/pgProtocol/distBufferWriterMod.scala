package typings.pgProtocol

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-protocol/dist/BufferWriter", JSImport.Namespace)
@js.native
object distBufferWriterMod extends js.Object {
  @js.native
  class Writer () extends js.Object {
    def this(size: Double) = this()
    var _ensure: js.Any = js.native
    var buffer: js.Any = js.native
    val encoding: js.Any = js.native
    var headerPosition: js.Any = js.native
    var offset: js.Any = js.native
    def add(otherBuffer: Buffer): typings.pgProtocol.distBufferWriterMod.Writer = js.native
    def addCString(string: String): typings.pgProtocol.distBufferWriterMod.Writer = js.native
    def addChar(c: String): typings.pgProtocol.distBufferWriterMod.Writer = js.native
    def addHeader(code: Double): Unit = js.native
    def addHeader(code: Double, last: Boolean): Unit = js.native
    def addInt16(num: Double): typings.pgProtocol.distBufferWriterMod.Writer = js.native
    def addInt32(num: Double): typings.pgProtocol.distBufferWriterMod.Writer = js.native
    def addString(): typings.pgProtocol.distBufferWriterMod.Writer = js.native
    def addString(string: String): typings.pgProtocol.distBufferWriterMod.Writer = js.native
    def clear(): Unit = js.native
    def flush(): Buffer = js.native
    def flush(code: Double): Buffer = js.native
    def getByteLength(): Double = js.native
    def join(): Buffer = js.native
    def join(code: Double): Buffer = js.native
  }
  
}

