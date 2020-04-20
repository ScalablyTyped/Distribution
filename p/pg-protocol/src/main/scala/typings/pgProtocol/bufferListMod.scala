package typings.pgProtocol

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-protocol/dist/testing/buffer-list", JSImport.Namespace)
@js.native
object bufferListMod extends js.Object {
  @js.native
  trait BufferList extends js.Object {
    var buffers: js.Array[Buffer] = js.native
    def add(buffer: Buffer): this.type = js.native
    def add(buffer: Buffer, front: Boolean): this.type = js.native
    def addByte(byte: Double): this.type = js.native
    def addCString(`val`: String): this.type = js.native
    def addCString(`val`: String, front: Boolean): this.type = js.native
    def addChar(char: String): this.type = js.native
    def addChar(char: String, first: Boolean): this.type = js.native
    def addInt16(`val`: Double): this.type = js.native
    def addInt16(`val`: Double, front: Boolean): this.type = js.native
    def addInt32(`val`: Double): this.type = js.native
    def addInt32(`val`: Double, first: Boolean): this.type = js.native
    def addString(`val`: String): this.type = js.native
    def addString(`val`: String, front: Boolean): this.type = js.native
    def getByteLength(): Double = js.native
    def getByteLength(initial: Double): Double = js.native
    def join(): Buffer = js.native
    def join(appendLength: Boolean): Buffer = js.native
    def join(appendLength: Boolean, char: String): Buffer = js.native
  }
  
  @js.native
  class default () extends BufferList {
    def this(buffers: js.Array[Buffer]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def concat(): Buffer = js.native
  }
  
}

