package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringDecoderMod {
  
  @JSImport("string_decoder", "StringDecoder")
  @js.native
  class StringDecoder () extends StObject {
    def this(encoding: BufferEncoding) = this()
    
    def end(): java.lang.String = js.native
    def end(buffer: Buffer): java.lang.String = js.native
    
    def write(buffer: Buffer): java.lang.String = js.native
  }
}
