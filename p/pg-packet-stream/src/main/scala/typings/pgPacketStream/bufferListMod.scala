package typings.pgPacketStream

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferListMod {
  
  @JSImport("pg-packet-stream/dist/testing/buffer-list", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BufferList {
    def this(buffers: js.Array[Buffer]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pg-packet-stream/dist/testing/buffer-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def concat(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")().asInstanceOf[Buffer]
  }
  
  @js.native
  trait BufferList extends StObject {
    
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
    
    var buffers: js.Array[Buffer] = js.native
    
    def getByteLength(): Double = js.native
    def getByteLength(initial: Double): Double = js.native
    
    def join(): Buffer = js.native
    def join(appendLength: Boolean): Buffer = js.native
    def join(appendLength: Boolean, char: String): Buffer = js.native
    def join(appendLength: Unit, char: String): Buffer = js.native
  }
}
