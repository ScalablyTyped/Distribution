package typings.peekReadable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("peek-readable", "EndOfStreamError")
  @js.native
  open class EndOfStreamError ()
    extends typings.peekReadable.endOfFileStreamMod.EndOfStreamError
  
  @JSImport("peek-readable", "StreamReader")
  @js.native
  open class StreamReader protected ()
    extends typings.peekReadable.streamReaderMod.StreamReader {
    def this(s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Readable */ Any) = this()
  }
}
