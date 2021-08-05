package typings.pngAsync

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.pngAsync.mod.IImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packerMod {
  
  @JSImport("png-async/lib/packer", JSImport.Namespace)
  @js.native
  class ^ protected () extends Packer {
    def this(option: IImageOptions) = this()
  }
  
  @js.native
  trait Packer extends Readable {
    
    /* private */ var _option: js.Any = js.native
    
    /* private */ var _packChunk: js.Any = js.native
    
    /* private */ var _packIDAT: js.Any = js.native
    
    /* private */ var _packIEND: js.Any = js.native
    
    /* private */ var _packIHDR: js.Any = js.native
    
    def _read(): Unit = js.native
    
    def pack(data: Buffer, width: Double, height: Double): Unit = js.native
  }
}
