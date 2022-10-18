package typings.peekReadable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStreamReaderMod {
  
  @JSImport("peek-readable/lib/StreamReader", "EndOfStreamError")
  @js.native
  open class EndOfStreamError ()
    extends typings.peekReadable.libEndOfFileStreamMod.EndOfStreamError
  
  @JSImport("peek-readable/lib/StreamReader", "StreamReader")
  @js.native
  open class StreamReader protected () extends StObject {
    def this(s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Readable */ Any) = this()
    
    /**
      * Deferred used for postponed read request (as not data is yet available to read)
      */
    /* private */ var deferred: Any = js.native
    
    /* private */ var endOfStream: Any = js.native
    
    /**
      * Read ahead (peek) from stream. Subsequent read or peeks will return the same data
      * @param uint8Array - Uint8Array (or Buffer) to store data read from stream in
      * @param offset - Offset target
      * @param length - Number of bytes to read
      * @returns Number of bytes peeked
      */
    def peek(uint8Array: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[Double] = js.native
    
    /**
      * Store peeked data
      * @type {Array}
      */
    /* private */ var peekQueue: Any = js.native
    
    /**
      * Read chunk from stream
      * @param buffer - Target Uint8Array (or Buffer) to store data read from stream in
      * @param offset - Offset target
      * @param length - Number of bytes to read
      * @returns Number of bytes read
      */
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[Double] = js.native
    
    /**
      * Process deferred read request
      * @param request Deferred read request
      */
    /* private */ var readDeferred: Any = js.native
    
    /**
      * Read chunk from stream
      * @param buffer Target Uint8Array (or Buffer) to store data read from stream in
      * @param offset Offset target
      * @param length Number of bytes to read
      * @returns Number of bytes read
      */
    /* private */ var readFromStream: Any = js.native
    
    /* private */ var reject: Any = js.native
    
    /* private */ var s: Any = js.native
  }
}
