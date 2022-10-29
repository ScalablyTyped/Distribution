package typings.pixiCompressedTextures

import typings.pixiCompressedTextures.anon.Compressed
import typings.pixiCompressedTextures.libResourcesMod.CompressedTextureResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParsersMod {
  
  @JSImport("@pixi/compressed-textures/lib/parsers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDDS(arrayBuffer: js.typedarray.ArrayBuffer): js.Array[CompressedTextureResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDDS")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[CompressedTextureResource]]
  
  inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer, loadKeyValueData: Boolean): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any], loadKeyValueData.asInstanceOf[js.Any])).asInstanceOf[Compressed]
}
