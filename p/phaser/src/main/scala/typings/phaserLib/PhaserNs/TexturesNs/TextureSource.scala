package typings
package phaserLib.PhaserNs.TexturesNs

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
  def this(texture: Texture, source: stdLib.HTMLCanvasElement) = this()
  /**
    * 
    * @param texture The Texture this TextureSource belongs to.
    * @param source The source image data.
    * @param width Optional width of the source image. If not given it's derived from the source itself.
    * @param height Optional height of the source image. If not given it's derived from the source itself.
    */
  def this(texture: Texture, source: stdLib.HTMLImageElement) = this()
  def this(texture: Texture, source: stdLib.HTMLCanvasElement, width: phaserLib.integer) = this()
  def this(texture: Texture, source: stdLib.HTMLImageElement, width: phaserLib.integer) = this()
  def this(texture: Texture, source: stdLib.HTMLCanvasElement, width: phaserLib.integer, height: phaserLib.integer) = this()
  def this(texture: Texture, source: stdLib.HTMLImageElement, width: phaserLib.integer, height: phaserLib.integer) = this()
  /**
    * Currently un-used.
    */
  var compressionAlgorithm: phaserLib.integer = js.native
  /**
    * The WebGL Texture of the source image.
    */
  var glTexture: stdLib.WebGLTexture = js.native
  /**
    * The height of the source image. If not specified in the constructor it will check
    * the `naturalHeight` and then `height` properties of the source image.
    */
  var height: phaserLib.integer = js.native
  /**
    * The image data.
    * This is either an Image element or a Canvas element.
    */
  var image: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
  /**
    * Is the source image a Canvas Element?
    */
  var isCanvas: scala.Boolean = js.native
  /**
    * Are the source image dimensions a power of two?
    */
  var isPowerOf2: scala.Boolean = js.native
  /**
    * Is the source image a Render Texture?
    */
  var isRenderTexture: scala.Boolean = js.native
  /**
    * The Texture this TextureSource belongs to.
    */
  var renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer | phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer = js.native
  /**
    * The resolution of the source image.
    */
  var resolution: scala.Double = js.native
  /**
    * The Scale Mode the image will use when rendering.
    * Either Linear or Nearest.
    */
  var scaleMode: scala.Double = js.native
  /**
    * The source of the image data.
    * This is either an Image Element, a Canvas Element or a RenderTexture.
    */
  var source: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | phaserLib.PhaserNs.GameObjectsNs.RenderTexture = js.native
  /**
    * The Texture this TextureSource belongs to.
    */
  var texture: Texture = js.native
  /**
    * The width of the source image. If not specified in the constructor it will check
    * the `naturalWidth` and then `width` properties of the source image.
    */
  var width: phaserLib.integer = js.native
  /**
    * Destroys this Texture Source and nulls the references.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Creates a WebGL Texture, if required, and sets the Texture filter mode.
    * @param game A reference to the Phaser Game instance.
    */
  def init(game: phaserLib.PhaserNs.Game): scala.Unit = js.native
  /**
    * Sets the Filter Mode for this Texture.
    * 
    * The mode can be either Linear, the default, or Nearest.
    * 
    * For pixel-art you should use Nearest.
    * @param filterMode The Filter Mode.
    */
  def setFilter(filterMode: FilterMode): scala.Unit = js.native
  /**
    * If this TextureSource is backed by a Canvas and is running under WebGL,
    * it updates the WebGLTexture using the canvas data.
    */
  def update(): scala.Unit = js.native
}

