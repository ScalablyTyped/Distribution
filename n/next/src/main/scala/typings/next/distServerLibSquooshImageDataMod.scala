package typings.next

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibSquooshImageDataMod {
  
  @JSImport("next/dist/server/lib/squoosh/image_data", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ImageData {
    def this(data: js.typedarray.Uint8Array, width: Double, height: Double) = this()
    def this(data: js.typedarray.Uint8ClampedArray, width: Double, height: Double) = this()
    def this(data: Buffer, width: Double, height: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("next/dist/server/lib/squoosh/image_data", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(input: ImageData): ImageData = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[ImageData]
  }
  
  @js.native
  trait ImageData extends StObject {
    
    /* private */ var _data: Any = js.native
    
    def data: Buffer = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
}
