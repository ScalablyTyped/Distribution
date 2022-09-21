package typings.node

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeStringDecoderMod {
  
  @JSImport("node:string_decoder", "StringDecoder")
  @js.native
  open class StringDecoder ()
    extends typings.node.stringDecoderMod.StringDecoder {
    def this(encoding: BufferEncoding) = this()
  }
}
