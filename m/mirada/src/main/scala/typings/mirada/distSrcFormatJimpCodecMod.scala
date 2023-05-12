package typings.mirada

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.mirada.distSrcTypesMiradaMod.FormatCodec
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFormatJimpCodecMod {
  
  @JSImport("mirada/dist/src/format/jimpCodec", "JimpCodec")
  @js.native
  open class JimpCodec protected ()
    extends StObject
       with FormatCodec {
    def this(jimp: Jimp) = this()
    
    def encode(data: ImageData, format: String): js.Promise[js.UndefOr[js.typedarray.ArrayBuffer]] = js.native
    def encode(data: ImageData, format: String, quality: Double): js.Promise[js.UndefOr[js.typedarray.ArrayBuffer]] = js.native
    
    /* protected */ var jimp: Jimp = js.native
  }
  
  @js.native
  trait AnyConstructor
    extends StObject
       with /* a */ StringDictionary[Any]
       with Instantiable1[/* args (repeated) */ Any, Any]
  
  type Jimp = AnyConstructor
}
