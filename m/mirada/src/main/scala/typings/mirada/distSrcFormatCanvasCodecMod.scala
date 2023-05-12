package typings.mirada

import typings.mirada.distSrcTypesMiradaMod.FormatCodec
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFormatCanvasCodecMod {
  
  @JSImport("mirada/dist/src/format/canvasCodec", "CanvasCodec")
  @js.native
  open class CanvasCodec ()
    extends StObject
       with FormatCodec {
    
    def encode(data: ImageData, format: String): js.Promise[js.UndefOr[js.typedarray.ArrayBuffer]] = js.native
    def encode(data: ImageData, format: String, quality: Double): js.Promise[js.UndefOr[js.typedarray.ArrayBuffer]] = js.native
  }
}
