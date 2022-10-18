package typings.pngAsync

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCrcMod {
  
  @JSImport("png-async/lib/crc", JSImport.Namespace)
  @js.native
  open class ^ () extends CrcStream
  @JSImport("png-async/lib/crc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def crc32(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @js.native
  trait CrcStream extends Writable {
    
    /* private */ var _crc: Any = js.native
    
    def _write(data: Any, encoding: Any, cb: Any): Unit = js.native
    
    val crc32: Double = js.native
  }
}
