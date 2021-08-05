package typings.peekReadable

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("peek-readable", "EndOfStreamError")
  @js.native
  class EndOfStreamError ()
    extends typings.peekReadable.endOfFileStreamMod.EndOfStreamError
  
  @JSImport("peek-readable", "StreamReader")
  @js.native
  class StreamReader protected () extends StObject {
    def this(s: Readable) = this()
    
    /**
      * Read chunk from stream
      * @param buffer Buffer to store data read from stream in
      * @param offset Offset buffer
      * @param length Number of bytes to read
      * @returns {any}
      */
    /* private */ var _read: js.Any = js.native
    
    /* private */ var endOfStream: js.Any = js.native
    
    /**
      * Read ahead (peek) from stream. Subsequent read or peeks will return the same data
      * @param buffer - Buffer to store data read from stream in
      * @param offset - Offset buffer
      * @param length - Number of bytes to read
      * @returns Number of bytes peeked
      */
    def peek(buffer: Buffer, offset: Double, length: Double): js.Promise[Double] = js.native
    def peek(buffer: Uint8Array, offset: Double, length: Double): js.Promise[Double] = js.native
    
    /**
      * Store peeked data
      * @type {Array}
      */
    /* private */ var peekQueue: js.Any = js.native
    
    /**
      * Read chunk from stream
      * @param buffer - Target buffer to store data read from stream in
      * @param offset - Offset of target buffer
      * @param length - Number of bytes to read
      * @returns Number of bytes read
      */
    def read(buffer: Buffer, offset: Double, length: Double): js.Promise[Double] = js.native
    def read(buffer: Uint8Array, offset: Double, length: Double): js.Promise[Double] = js.native
    
    /* private */ var reject: js.Any = js.native
    
    /**
      * Deferred read request
      */
    /* private */ var request: js.Any = js.native
    
    /* private */ var s: js.Any = js.native
    
    /* private */ var tryRead: js.Any = js.native
  }
}
