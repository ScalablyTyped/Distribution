package typings.mirada

import typings.mirada.distSrcTypesMiradaMod.FormatCodec
import typings.mirada.distSrcTypesMiradaMod.FormatProxy
import typings.mirada.distSrcTypesOpencvMod.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFormatFormatMod {
  
  @JSImport("mirada/dist/src/format/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeOrThrow(buffer: js.typedarray.ArrayBuffer): js.Promise[ImageData] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeOrThrow")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageData]]
  inline def decodeOrThrow(buffer: js.typedarray.ArrayBuffer, format: String): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeOrThrow")(buffer.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  
  inline def encodeOrThrow(data: ImageData, format: String): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeOrThrow")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def encodeOrThrow(data: ImageData, format: String, quality: Double): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeOrThrow")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def getDefaultCodec(): FormatCodec = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCodec")().asInstanceOf[FormatCodec]
  
  inline def installFormatProxy(proxy: FormatProxy): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("installFormatProxy")(proxy.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def loadFormatProxies(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFormatProxies")().asInstanceOf[js.Promise[Unit]]
  
  inline def unInstallFormatProxies(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unInstallFormatProxies")().asInstanceOf[js.Promise[Unit]]
  
  inline def unloadFormatProxies(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadFormatProxies")().asInstanceOf[Unit]
}
