package typings.pgProtocol

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferWriterMod {
  
  @JSImport("pg-protocol/dist/buffer-writer", "Writer")
  @js.native
  open class Writer () extends StObject {
    def this(size: Double) = this()
    
    def add(otherBuffer: Buffer): Writer = js.native
    
    def addCString(string: String): Writer = js.native
    
    def addInt16(num: Double): Writer = js.native
    
    def addInt32(num: Double): Writer = js.native
    
    def addString(): Writer = js.native
    def addString(string: String): Writer = js.native
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var ensure: Any = js.native
    
    def flush(): Buffer = js.native
    def flush(code: Double): Buffer = js.native
    
    /* private */ var headerPosition: Any = js.native
    
    /* private */ var join: Any = js.native
    
    /* private */ var offset: Any = js.native
    
    /* private */ var size: Any = js.native
  }
}
