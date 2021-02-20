package typings.pngAsync

import typings.node.Buffer
import typings.pngAsync.mod.IImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("png-async/lib/filter", JSImport.Namespace)
  @js.native
  class ^ protected () extends Filter {
    def this(width: Double, height: Double, bpp: Double, data: Buffer, option: IImageOptions) = this()
  }
  
  @js.native
  trait Filter
    extends typings.pngAsync.chunkStreamMod.^ {
    
    var _bpp: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var _filterAvg: js.Any = js.native
    
    var _filterNone: js.Any = js.native
    
    var _filterPaeth: js.Any = js.native
    
    var _filterSub: js.Any = js.native
    
    var _filterTypes: js.Any = js.native
    
    var _filterUp: js.Any = js.native
    
    var _filters: js.Any = js.native
    
    var _height: js.Any = js.native
    
    var _line: js.Any = js.native
    
    var _option: js.Any = js.native
    
    var _reverseFilterLine: js.Any = js.native
    
    var _width: js.Any = js.native
    
    def filter(): Buffer = js.native
  }
}
