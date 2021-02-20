package typings.pngAsync

import typings.node.Buffer
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crcMod {
  
  @JSImport("png-async/lib/crc", JSImport.Namespace)
  @js.native
  class ^ () extends CrcStream
  
  /* static member */
  @JSImport("png-async/lib/crc", "crc32")
  @js.native
  def crc32(buf: Buffer): Double = js.native
  
  @js.native
  trait CrcStream extends Writable {
    
    var _crc: js.Any = js.native
    
    def _write(data: js.Any, encoding: js.Any, cb: js.Any): Unit = js.native
    
    val crc32: Double = js.native
  }
}
