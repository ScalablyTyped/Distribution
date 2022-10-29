package typings.pixiCompressedTextures

import typings.pixiCompressedTextures.libResourcesMod.CompressedTextureResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParsersParseDDSMod {
  
  @JSImport("@pixi/compressed-textures/lib/parsers/parseDDS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDDS(arrayBuffer: js.typedarray.ArrayBuffer): js.Array[CompressedTextureResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDDS")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[CompressedTextureResource]]
}
