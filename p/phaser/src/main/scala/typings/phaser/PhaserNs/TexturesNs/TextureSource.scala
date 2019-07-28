package typings.phaser.PhaserNs.TexturesNs

import typings.phaser.PhaserNs.Game
import typings.phaser.PhaserNs.GameObjectsNs.RenderTexture
import typings.phaser.PhaserNs.RendererNs.CanvasNs.CanvasRenderer
import typings.phaser.PhaserNs.RendererNs.WebGLNs.WebGLRenderer
import typings.phaser.integer
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Texture Source is the encapsulation of the actual source data for a Texture.
  * This is typically an Image Element, loaded from the file system or network, or a Canvas Element.
  * 
  * A Texture can contain multiple Texture Sources, which only happens when a multi-atlas is loaded.
  */
@JSGlobal("Phaser.Textures.TextureSource")
@js.native
class TextureSource protected () extends js.Object {
  def this(texture: Texture, source: HTMLCanvasElement) = this()
  /**
    * 
    * @param texture The Texture this TextureSource belongs to.
    * @param source The source image data.
    * @param width Optional width of the source image. If not given it's derived from the source itself.
    * @param height Optional height of the source image. If not given it's derived from the source itself.
    */
  def this(texture: Texture, source: HTMLImageElement) = this()
  def this(texture: Texture, source: HTMLCanvasElement, width: integer) = this()
  def this(texture: Texture, source: HTMLImageElement, width: integer) = this()
  def this(texture: Texture, source: HTMLCanvasElement, width: integer, height: integer) = this()
  def this(texture: Texture, source: HTMLImageElement, width: integer, height: integer) = this()
  /**
    * Currently un-used.
    */
  var compressionAlgorithm: integer = js.native
  /**
    * The WebGL Texture of the source image.
    */
  var glTexture: WebGLTexture = js.native
  /**
    * The height of the source image. If not specified in the constructor it will check
    * the `naturalHeight` and then `height` properties of the source image.
    */
  var height: integer = js.native
  /**
    * The image data.
    * This is either an Image element or a Canvas element.
    */
  var image: HTMLImageElement | HTMLCanvasElement = js.native
  /**
    * Is the source image a Canvas Element?
    */
  var isCanvas: Boolean = js.native
  /**
    * Are the source image dimensions a power of two?
    */
  var isPowerOf2: Boolean = js.native
  /**
    * Is the source image a Render Texture?
    */
  var isRenderTexture: Boolean = js.native
  /**
    * The Texture this TextureSource belongs to.
    */
  var renderer: CanvasRenderer | WebGLRenderer = js.native
  /**
    * The resolution of the source image.
    */
  var resolution: Double = js.native
  /**
    * The Scale Mode the image will use when rendering.
    * Either Linear or Nearest.
    */
  var scaleMode: Double = js.native
  /**
    * The source of the image data.
    * This is either an Image Element, a Canvas Element or a RenderTexture.
    */
  var source: HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
  /**
    * The Texture this TextureSource belongs to.
    */
  var texture: Texture = js.native
  /**
    * The width of the source image. If not specified in the constructor it will check
    * the `naturalWidth` and then `width` properties of the source image.
    */
  var width: integer = js.native
  /**
    * Destroys this Texture Source and nulls the references.
    */
  def destroy(): Unit = js.native
  /**
    * Creates a WebGL Texture, if required, and sets the Texture filter mode.
    * @param game A reference to the Phaser Game instance.
    */
  def init(game: Game): Unit = js.native
  /**
    * Sets the Filter Mode for this Texture.
    * 
    * The mode can be either Linear, the default, or Nearest.
    * 
    * For pixel-art you should use Nearest.
    * @param filterMode The Filter Mode.
    */
  def setFilter(filterMode: FilterMode): Unit = js.native
  /**
    * If this TextureSource is backed by a Canvas and is running under WebGL,
    * it updates the WebGLTexture using the canvas data.
    */
  def update(): Unit = js.native
}

