package typings.pngAsync

import typings.node.bufferMod.global.Buffer
import typings.pngAsync.mod.IImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("png-async/lib/filter", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Filter {
    def this(width: Double, height: Double, bpp: Double, data: Buffer, option: IImageOptions) = this()
  }
  
  @js.native
  trait Filter
    extends typings.pngAsync.chunkStreamMod.^ {
    
    /* private */ var _bpp: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _filterAvg: Any = js.native
    
    /* private */ var _filterNone: Any = js.native
    
    /* private */ var _filterPaeth: Any = js.native
    
    /* private */ var _filterSub: Any = js.native
    
    /* private */ var _filterTypes: Any = js.native
    
    /* private */ var _filterUp: Any = js.native
    
    /* private */ var _filters: Any = js.native
    
    /* private */ var _height: Any = js.native
    
    /* private */ var _line: Any = js.native
    
    /* private */ var _option: Any = js.native
    
    /* private */ var _reverseFilterLine: Any = js.native
    
    /* private */ var _width: Any = js.native
    
    def filter(): Buffer = js.native
  }
}
