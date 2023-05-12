package typings.onfidoOpencv.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.mirada.distSrcFormatJimpCodecMod.Jimp
import typings.mirada.distSrcTypesMiradaMod.FormatCodec
import typings.mirada.distSrcTypesMiradaMod.FormatProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object format {
  
  @JSImport("@onfido/opencv", "format")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@onfido/opencv", "format.CanvasCodec")
  @js.native
  open class CanvasCodec ()
    extends typings.mirada.distSrcFormatCanvasCodecMod.CanvasCodec
  @JSImport("@onfido/opencv", "format.CanvasCodec")
  @js.native
  def CanvasCodec: Instantiable0[typings.mirada.distSrcFormatCanvasCodecMod.CanvasCodec] = js.native
  inline def CanvasCodec_=(x: Instantiable0[typings.mirada.distSrcFormatCanvasCodecMod.CanvasCodec]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CanvasCodec")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@onfido/opencv", "format.JimpCodec")
  @js.native
  open class JimpCodec protected ()
    extends typings.mirada.distSrcFormatJimpCodecMod.JimpCodec {
    def this(jimp: Jimp) = this()
  }
  @JSImport("@onfido/opencv", "format.JimpCodec")
  @js.native
  def JimpCodec: Instantiable1[/* jimp */ Jimp, typings.mirada.distSrcFormatJimpCodecMod.JimpCodec] = js.native
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
