package typings.pngAsync

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.pngAsync.mod.IImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packerMod {
  
  @JSImport("png-async/lib/packer", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Packer {
    def this(option: IImageOptions) = this()
  }
  
  @js.native
  trait Packer extends Readable {
    
    /* private */ var _option: Any = js.native
    
    /* private */ var _packChunk: Any = js.native
    
    /* private */ var _packIDAT: Any = js.native
    
    /* private */ var _packIEND: Any = js.native
    
    /* private */ var _packIHDR: Any = js.native
    
    def _read(): Unit = js.native
    
    def pack(data: Buffer, width: Double, height: Double): Unit = js.native
  }
}
