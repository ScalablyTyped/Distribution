package typings.next

import typings.next.anon.Quality
import typings.next.distServerLibSquooshImageDataMod.default
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibSquooshImplMod {
  
  @JSImport("next/dist/server/lib/squoosh/impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBuffer(_buffer: js.typedarray.Uint8Array): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBuffer")(_buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  inline def decodeBuffer(_buffer: Buffer): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBuffer")(_buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  
  inline def encodeAvif(image: default, param1: Quality): js.Promise[Buffer | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAvif")(image.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | js.typedarray.Uint8Array]]
  
  inline def encodeJpeg(image: default, param1: Quality): js.Promise[Buffer | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeJpeg")(image.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | js.typedarray.Uint8Array]]
  
  inline def encodePng(image: default): js.Promise[Buffer | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePng")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer | js.typedarray.Uint8Array]]
  
  inline def encodeWebp(image: default, param1: Quality): js.Promise[Buffer | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWebp")(image.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | js.typedarray.Uint8Array]]
  
  inline def resize(param0: ResizeOpts): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  
  inline def rotate(image: default, numRotations: Double): js.Promise[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(image.asInstanceOf[js.Any], numRotations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.widthnumberheightneverund
    - typings.next.anon.heightnumberwidthneverund
    - typings.next.anon.heightnumberwidthnumberim
  */
  trait ResizeOpts extends StObject
  object ResizeOpts {
    
    inline def heightnumberwidthneverund(height: Double, image: default): typings.next.anon.heightnumberwidthneverund = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.heightnumberwidthneverund]
    }
    
    inline def heightnumberwidthnumberim(height: Double, image: default, width: Double): typings.next.anon.heightnumberwidthnumberim = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.heightnumberwidthnumberim]
    }
    
    inline def widthnumberheightneverund(image: default, width: Double): typings.next.anon.widthnumberheightneverund = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.widthnumberheightneverund]
    }
  }
}
