package typings.pixiCompressedTextures.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/compressed-textures", "CompressedTextureResource")
@js.native
open class CompressedTextureResource protected () extends BlobResource {
  /**
    * @param source - the buffer/URL holding the compressed texture data
    * @param options
    * @param {PIXI.INTERNAL_FORMATS} options.format - the compression format
    * @param {number} options.width - the image width in pixels.
    * @param {number} options.height - the image height in pixels.
    * @param {number} [options.level=1] - the mipmap levels stored in the compressed texture, including level 0.
    * @param {number} [options.levelBuffers] - the buffers for each mipmap level. `CompressedTextureResource` can allows you
    *      to pass `null` for `source`, for cases where each level is stored in non-contiguous memory.
    */
  def this(source: String, options: ICompressedTextureResourceOptions) = this()
  def this(source: js.typedarray.Uint32Array, options: ICompressedTextureResourceOptions) = this()
  def this(source: js.typedarray.Uint8Array, options: ICompressedTextureResourceOptions) = this()
  
  /* private */ var _extension: Any = js.native
  
  /* private */ var _levelBuffers: Any = js.native
  
  /** The compression format */
  var format: INTERNAL_FORMATS = js.native
  
  /**
    * The number of mipmap levels stored in the resource buffer.
    * @default 1
    */
  var levels: Double = js.native
  
  /** @protected */
  /* protected */ def onBlobLoaded(): Unit = js.native
}
/* static members */
object CompressedTextureResource {
  
  @JSImport("@pixi/compressed-textures", "CompressedTextureResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Pre-creates buffer views for each mipmap level
    * @private
    * @param buffer -
    * @param format - compression formats
    * @param levels - mipmap levels
    * @param blockWidth -
    * @param blockHeight -
    * @param imageWidth - width of the image in pixels
    * @param imageHeight - height of the image in pixels
    */
  @JSImport("@pixi/compressed-textures", "CompressedTextureResource._createLevelBuffers")
  @js.native
  def _createLevelBuffers: Any = js.native
  inline def _createLevelBuffers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_createLevelBuffers")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the key (to ContextSystem#extensions) for the WebGL extension supporting the compression format
    * @private
    * @param format - the compression format to get the extension for.
    */
  @JSImport("@pixi/compressed-textures", "CompressedTextureResource._formatToExtension")
  @js.native
  def _formatToExtension: Any = js.native
  inline def _formatToExtension_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_formatToExtension")(x.asInstanceOf[js.Any])
}
