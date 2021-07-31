package typings.pgProtocol

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferReaderMod {
  
  @JSImport("pg-protocol/dist/buffer-reader", "BufferReader")
  @js.native
  class BufferReader () extends StObject {
    def this(offset: Double) = this()
    
    var buffer: js.Any = js.native
    
    def byte(): Double = js.native
    
    def bytes(length: Double): Buffer = js.native
    
    def cstring(): String = js.native
    
    var encoding: js.Any = js.native
    
    def int16(): Double = js.native
    
    def int32(): Double = js.native
    
    var offset: js.Any = js.native
    
    def setBuffer(offset: Double, buffer: Buffer): Unit = js.native
    
    def string(length: Double): String = js.native
  }
}
