package typings
package phaserLib.PhaserNs.TexturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Canvas Texture is a special kind of Texture that is backed by an HTML Canvas Element as its source.
  * 
  * You can use the properties of this texture to draw to the canvas element directly, using all of the standard
  * canvas operations available in the browser. Any Game Object can be given this texture and will render with it.
  * 
  * Note: When running under WebGL the Canvas Texture needs to re-generate its base WebGLTexture and reupload it to
  * the GPU every time you modify it, otherwise the changes you make to this texture will not be visible. To do this
  * you should call `CanvasTexture.refresh()` once you are finished with your changes to the canvas. Try and keep
  * this to a minimum, especially on large canvas sizes, or you may inadvertently thrash the GPU by constantly uploading
  * texture data to it. This restriction does not apply if using the Canvas Renderer.
  * 
  * It starts with only one frame that covers the whole of the canvas. You can add further frames, that specify
  * sections of the canvas using the `add` method.
  * 
  * Should you need to resize the canvas use the `setSize` method so that it accurately updates all of the underlying
  * texture data as well. Forgetting to do this (i.e. by changing the canvas size directly from your code) could cause
  * graphical errors.
  */
@JSGlobal("Phaser.Textures.CanvasTexture")
@js.native
class CanvasTexture protected () extends Texture {
  /**
    * 
    * @param manager A reference to the Texture Manager this Texture belongs to.
    * @param key The unique string-based key of this Texture.
    * @param source The canvas element that is used as the base of this texture.
    * @param width The width of the canvas.
    * @param height The height of the canvas.
    */
  def this(manager: CanvasTexture, key: java.lang.String, source: stdLib.HTMLCanvasElement, width: phaserLib.integer, height: phaserLib.integer) = this()
  /**
    * An ArrayBuffer the same size as the context ImageData.
    */
  var buffer: stdLib.ArrayBuffer = js.native
  /**
    * The source Canvas Element.
    */
  val canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * The 2D Canvas Rendering Context.
    */
  val context: stdLib.CanvasRenderingContext2D = js.native
  /**
    * A Uint8ClampedArray view into the `buffer`.
    * Use the `update` method to populate this when the canvas changes.
    * Note that this is unavailable in some browsers, such as Epic Browser, due to their security restrictions.
    */
  var data: stdLib.Uint8ClampedArray = js.native
  /**
    * The height of the Canvas.
    * This property is read-only, if you wish to change it use the `setSize` method.
    */
  val height: phaserLib.integer = js.native
  /**
    * The context image data.
    * Use the `update` method to populate this when the canvas changes.
    */
  var imageData: stdLib.ImageData = js.native
  /**
    * An Uint32Array view into the `buffer`.
    */
  var pixels: stdLib.Uint32Array = js.native
  /**
    * The width of the Canvas.
    * This property is read-only, if you wish to change it use the `setSize` method.
    */
  val width: phaserLib.integer = js.native
  /**
    * Clears the given region of this Canvas Texture, resetting it back to transparent.
    * If no region is given, the whole Canvas Texture is cleared.
    * @param x The x coordinate of the top-left of the region to clear. Default 0.
    * @param y The y coordinate of the top-left of the region to clear. Default 0.
    * @param width The width of the region.
    * @param height The height of the region.
    */
  def clear(): CanvasTexture = js.native
  def clear(x: phaserLib.integer): CanvasTexture = js.native
  def clear(x: phaserLib.integer, y: phaserLib.integer): CanvasTexture = js.native
  def clear(x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer): CanvasTexture = js.native
  def clear(x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer): CanvasTexture = js.native
  def draw(x: phaserLib.integer, y: phaserLib.integer, source: stdLib.HTMLCanvasElement): CanvasTexture = js.native
  /**
    * Draws the given Image or Canvas element to this CanvasTexture, then updates the internal
    * ImageData buffer and arrays.
    * @param x The x coordinate to draw the source at.
    * @param y The y coordinate to draw the source at.
    * @param source The element to draw to this canvas.
    */
  def draw(x: phaserLib.integer, y: phaserLib.integer, source: stdLib.HTMLImageElement): CanvasTexture = js.native
  /**
    * Draws the given texture frame to this CanvasTexture, then updates the internal
    * ImageData buffer and arrays.
    * @param key The unique string-based key of the Texture.
    * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
    * @param x The x coordinate to draw the source at. Default 0.
    * @param y The y coordinate to draw the source at. Default 0.
    */
  def drawFrame(key: java.lang.String): CanvasTexture = js.native
  def drawFrame(key: java.lang.String, frame: java.lang.String): CanvasTexture = js.native
  def drawFrame(key: java.lang.String, frame: java.lang.String, x: phaserLib.integer): CanvasTexture = js.native
  def drawFrame(key: java.lang.String, frame: java.lang.String, x: phaserLib.integer, y: phaserLib.integer): CanvasTexture = js.native
  def drawFrame(key: java.lang.String, frame: phaserLib.integer): CanvasTexture = js.native
  def drawFrame(key: java.lang.String, frame: phaserLib.integer, x: phaserLib.integer): CanvasTexture = js.native
  def drawFrame(key: java.lang.String, frame: phaserLib.integer, x: phaserLib.integer, y: phaserLib.integer): CanvasTexture = js.native
  /**
    * Gets the Canvas Element.
    */
  def getCanvas(): stdLib.HTMLCanvasElement = js.native
  /**
    * Gets the 2D Canvas Rendering Context.
    */
  def getContext(): stdLib.CanvasRenderingContext2D = js.native
  /**
    * Gets an ImageData region from this CanvasTexture from the position and size specified.
    * You can write this back using `CanvasTexture.putData`, or manipulate it.
    * @param x The x coordinate of the top-left of the area to get the ImageData from. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param y The y coordinate of the top-left of the area to get the ImageData from. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param width The width of the rectangle from which the ImageData will be extracted. Positive values are to the right, and negative to the left.
    * @param height The height of the rectangle from which the ImageData will be extracted. Positive values are down, and negative are up.
    */
  def getData(x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer): stdLib.ImageData = js.native
  /**
    * Returns the Image Data index for the given pixel in this CanvasTexture.
    * 
    * The index can be used to read directly from the `this.data` array.
    * 
    * The index points to the red value in the array. The subsequent 3 indexes
    * point to green, blue and alpha respectively.
    * @param x The x coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param y The y coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
    */
  def getIndex(x: phaserLib.integer, y: phaserLib.integer): phaserLib.integer = js.native
  /**
    * Get the color of a specific pixel from this texture and store it in a Color object.
    * 
    * If you have drawn anything to this CanvasTexture since it was created you must call `CanvasTexture.update` to refresh the array buffer,
    * otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.
    * @param x The x coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param y The y coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param out A Color object to store the pixel values in. If not provided a new Color object will be created.
    */
  def getPixel(x: phaserLib.integer, y: phaserLib.integer): phaserLib.PhaserNs.DisplayNs.Color = js.native
  def getPixel(x: phaserLib.integer, y: phaserLib.integer, out: phaserLib.PhaserNs.DisplayNs.Color): phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Returns an array containing all of the pixels in the given region.
    * 
    * If the requested region extends outside the bounds of this CanvasTexture,
    * the region is truncated to fit.
    * 
    * If you have drawn anything to this CanvasTexture since it was created you must call `CanvasTexture.update` to refresh the array buffer,
    * otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.
    * @param x The x coordinate of the top-left of the region. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param y The y coordinate of the top-left of the region. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param width The width of the region to get. Must be an integer.
    * @param height The height of the region to get. Must be an integer. If not given will be set to the `width`.
    */
  def getPixels(x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer): js.Array[phaserLib.PhaserNs.TypesNs.TexturesNs.PixelConfig] = js.native
  def getPixels(x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer): js.Array[phaserLib.PhaserNs.TypesNs.TexturesNs.PixelConfig] = js.native
  /**
    * Puts the ImageData into the context of this CanvasTexture at the given coordinates.
    * @param imageData The ImageData to put at the given location.
    * @param x The x coordinate to put the imageData. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param y The y coordinate to put the imageData. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param dirtyX Horizontal position (x coordinate) of the top-left corner from which the image data will be extracted. Default 0.
    * @param dirtyY Vertical position (x coordinate) of the top-left corner from which the image data will be extracted. Default 0.
    * @param dirtyWidth Width of the rectangle to be painted. Defaults to the width of the image data.
    * @param dirtyHeight Height of the rectangle to be painted. Defaults to the height of the image data.
    */
  def putData(imageData: stdLib.ImageData, x: phaserLib.integer, y: phaserLib.integer): this.type = js.native
  def putData(imageData: stdLib.ImageData, x: phaserLib.integer, y: phaserLib.integer, dirtyX: phaserLib.integer): this.type = js.native
  def putData(
    imageData: stdLib.ImageData,
    x: phaserLib.integer,
    y: phaserLib.integer,
    dirtyX: phaserLib.integer,
    dirtyY: phaserLib.integer
  ): this.type = js.native
  def putData(
    imageData: stdLib.ImageData,
    x: phaserLib.integer,
    y: phaserLib.integer,
    dirtyX: phaserLib.integer,
    dirtyY: phaserLib.integer,
    dirtyWidth: phaserLib.integer
  ): this.type = js.native
  def putData(
    imageData: stdLib.ImageData,
    x: phaserLib.integer,
    y: phaserLib.integer,
    dirtyX: phaserLib.integer,
    dirtyY: phaserLib.integer,
    dirtyWidth: phaserLib.integer,
    dirtyHeight: phaserLib.integer
  ): this.type = js.native
  /**
    * This should be called manually if you are running under WebGL.
    * It will refresh the WebGLTexture from the Canvas source. Only call this if you know that the
    * canvas has changed, as there is a significant GPU texture allocation cost involved in doing so.
    */
  def refresh(): CanvasTexture = js.native
  /**
    * Sets a pixel in the CanvasTexture to the given color and alpha values.
    * 
    * This is an expensive operation to run in large quantities, so use sparingly.
    * @param x The x coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param y The y coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
    * @param red The red color value. A number between 0 and 255.
    * @param green The green color value. A number between 0 and 255.
    * @param blue The blue color value. A number between 0 and 255.
    * @param alpha The alpha value. A number between 0 and 255. Default 255.
    */
  def setPixel(
    x: phaserLib.integer,
    y: phaserLib.integer,
    red: phaserLib.integer,
    green: phaserLib.integer,
    blue: phaserLib.integer
  ): this.type = js.native
  def setPixel(
    x: phaserLib.integer,
    y: phaserLib.integer,
    red: phaserLib.integer,
    green: phaserLib.integer,
    blue: phaserLib.integer,
    alpha: phaserLib.integer
  ): this.type = js.native
  /**
    * Changes the size of this Canvas Texture.
    * @param width The new width of the Canvas.
    * @param height The new height of the Canvas. If not given it will use the width as the height.
    */
  def setSize(width: phaserLib.integer): CanvasTexture = js.native
  def setSize(width: phaserLib.integer, height: phaserLib.integer): CanvasTexture = js.native
  /**
    * This re-creates the `imageData` from the current context.
    * It then re-builds the ArrayBuffer, the `data` Uint8ClampedArray reference and the `pixels` Int32Array.
    * 
    * Warning: This is a very expensive operation, so use it sparingly.
    */
  def update(): CanvasTexture = js.native
}

