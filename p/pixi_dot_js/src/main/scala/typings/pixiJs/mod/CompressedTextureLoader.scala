package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "CompressedTextureLoader")
@js.native
open class CompressedTextureLoader ()
  extends typings.pixiCompressedTextures.mod.CompressedTextureLoader
/* static members */
object CompressedTextureLoader {
  
  @JSImport("pixi.js", "CompressedTextureLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /**  Map of available texture extensions. */
  @JSImport("pixi.js", "CompressedTextureLoader._textureExtensions")
  @js.native
  def _textureExtensions: Any = js.native
  inline def _textureExtensions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_textureExtensions")(x.asInstanceOf[js.Any])
  
  /** Map of available texture formats. */
  @JSImport("pixi.js", "CompressedTextureLoader._textureFormats")
  @js.native
  def _textureFormats: Any = js.native
  inline def _textureFormats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_textureFormats")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("pixi.js", "CompressedTextureLoader.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Called after a compressed-textures manifest is loaded.
    *
    * This will then load the correct compression format for the device. Your manifest should adhere
    * to the following schema:
    *
    * ```js
    * import { INTERNAL_FORMATS } from '@pixi/constants';
    *
    * type CompressedTextureManifest = {
    *  textures: Array<{ src: string, format?: keyof INTERNAL_FORMATS}>,
    *  cacheID: string;
    * };
    * ```
    *
    * This is an example of a .json manifest file
    *
    * ```json
    * {
    *   "cacheID":"asset",
    *   "textures":[
    *     { "src":"asset.fallback.png" },
    *     { "format":"COMPRESSED_RGBA_S3TC_DXT5_EXT", "src":"asset.s3tc.ktx" },
    *     { "format":"COMPRESSED_RGBA8_ETC2_EAC", "src":"asset.etc.ktx" },
    *     { "format":"RGBA_PVRTC_4BPPV1_IMG", "src":"asset.pvrtc.ktx" }
    *   ]
    * }
    * ```
    */
  inline def use(resource: typings.pixiLoaders.mod.LoaderResource, next: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
