package typings.mirada

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.mirada.distSrcFormatJimpCodecMod.Jimp
import typings.mirada.distSrcTypesMiradaMod.FormatCodec
import typings.mirada.distSrcTypesMiradaMod.FormatProxy
import typings.mirada.distSrcTypesOpencvMod.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFormatMod {
  
  @JSImport("mirada/dist/src/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/format", "CanvasCodec")
  @js.native
  open class CanvasCodec ()
    extends typings.mirada.distSrcFormatCanvasCodecMod.CanvasCodec
  
  @JSImport("mirada/dist/src/format", "JimpCodec")
  @js.native
  open class JimpCodec protected ()
    extends typings.mirada.distSrcFormatJimpCodecMod.JimpCodec {
    def this(jimp: Jimp) = this()
  }
  
  inline def decodeOrThrow(buffer: js.typedarray.ArrayBuffer): js.Promise[ImageData] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeOrThrow")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageData]]
  inline def decodeOrThrow(buffer: js.typedarray.ArrayBuffer, format: String): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeOrThrow")(buffer.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  
  inline def encodeOrThrow(data: ImageData, format: String): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeOrThrow")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def encodeOrThrow(data: ImageData, format: String, quality: Double): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeOrThrow")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  object format {
    
    @JSImport("mirada/dist/src/format", "format")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mirada/dist/src/format", "format.CanvasCodec")
    @js.native
    def CanvasCodec: Instantiable0[typings.mirada.distSrcFormatCanvasCodecMod.CanvasCodec] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("mirada/dist/src/format", "format.CanvasCodec")
    @js.native
    open class CanvasCodecCls ()
      extends typings.mirada.distSrcFormatCanvasCodecMod.CanvasCodec
    
    inline def CanvasCodec_=(x: Instantiable0[typings.mirada.distSrcFormatCanvasCodecMod.CanvasCodec]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CanvasCodec")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/format", "format.JimpCodec")
    @js.native
    def JimpCodec: Instantiable1[/* jimp */ Jimp, typings.mirada.distSrcFormatJimpCodecMod.JimpCodec] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("mirada/dist/src/format", "format.JimpCodec")
    @js.native
    open class JimpCodecCls protected ()
      extends typings.mirada.distSrcFormatJimpCodecMod.JimpCodec {
      def this(jimp: Jimp) = this()
    }
    
    inline def JimpCodec_=(x: Instantiable1[/* jimp */ Jimp, typings.mirada.distSrcFormatJimpCodecMod.JimpCodec]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JimpCodec")(x.asInstanceOf[js.Any])
    
    inline def decodeOrThrow(buffer: js.typedarray.ArrayBuffer): js.Promise[typings.mirada.mod.ImageData] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeOrThrow")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mirada.mod.ImageData]]
    inline def decodeOrThrow(buffer: js.typedarray.ArrayBuffer, format: String): js.Promise[typings.mirada.mod.ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeOrThrow")(buffer.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.mirada.mod.ImageData]]
    
    inline def encodeOrThrow(data: typings.mirada.mod.ImageData, format: String): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeOrThrow")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    inline def encodeOrThrow(data: typings.mirada.mod.ImageData, format: String, quality: Double): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeOrThrow")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    
    inline def getDefaultCodec(): FormatCodec = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCodec")().asInstanceOf[FormatCodec]
    
    inline def installFormatProxy(proxy: FormatProxy): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("installFormatProxy")(proxy.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def loadFormatProxies(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFormatProxies")().asInstanceOf[js.Promise[Unit]]
    
    inline def unInstallFormatProxies(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unInstallFormatProxies")().asInstanceOf[js.Promise[Unit]]
    
    inline def unloadFormatProxies(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadFormatProxies")().asInstanceOf[Unit]
  }
  
  inline def getDefaultCodec(): FormatCodec = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCodec")().asInstanceOf[FormatCodec]
  
  inline def installFormatProxy(proxy: FormatProxy): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("installFormatProxy")(proxy.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def loadFormatProxies(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFormatProxies")().asInstanceOf[js.Promise[Unit]]
  
  inline def unInstallFormatProxies(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unInstallFormatProxies")().asInstanceOf[js.Promise[Unit]]
  
  inline def unloadFormatProxies(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadFormatProxies")().asInstanceOf[Unit]
}
