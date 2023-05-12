package typings.memoryStreams

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memory-streams", "ReadableStream")
  @js.native
  open class ReadableStream protected () extends Readable {
    def this(contents: String) = this()
  }
  
  @JSImport("memory-streams", "WritableStream")
  @js.native
  open class WritableStream () extends Writable {
    def this(opts: WritableOptions) = this()
    
    /** Returns the written contents as a buffer. */
    def toBuffer(): Buffer = js.native
  }
}
