package typings.parse5SaxParser

import typings.node.nodeColonstreamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDevNullStreamMod {
  
  @JSImport("parse5-sax-parser/dist/dev-null-stream", "DevNullStream")
  @js.native
  open class DevNullStream () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(_chunk: String, _encoding: String, cb: js.Function0[Unit]): Unit = js.native
  }
}
