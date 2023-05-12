package typings.phaser.Phaser

import typings.phaser.EachTextureCallback
import typings.phaser.Phaser.Cameras.Scene2D.BaseCamera
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Image
import typings.phaser.Phaser.GameObjects.RenderTexture
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.Pipelines.SinglePipeline
import typings.phaser.Phaser.Renderer.WebGL.RenderTarget
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Types.Create.GenerateTextureConfig
import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotCallback
import typings.phaser.Phaser.Types.Textures.CompressedTextureData
import typings.phaser.Phaser.Types.Textures.PixelConfig
import typings.phaser.Phaser.Types.Textures.SpriteSheetConfig
import typings.phaser.Phaser.Types.Textures.SpriteSheetFromAtlasConfig
import typings.phaser.Phaser.Types.Textures.StampConfig
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Textures {
  
  @js.native
  sealed trait FilterMode extends StObject
  /**
    * Filter Types.
    */
  @JSGlobal("Phaser.Textures.FilterMode")
  @js.native
  object FilterMode extends StObject {
    
    /**
      * Linear filter type.
      */
    @js.native
    sealed trait LINEAR
      extends StObject
         with FilterMode
    
    /**
      * Nearest neighbor filter type.
      */
    @js.native
    sealed trait NEAREST
      extends StObject
         with FilterMode
  }
  
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
  @js.native
  trait CanvasTexture
    extends StObject
       with Texture {
    
    /**
      * An ArrayBuffer the same size as the context ImageData.
      */
    var buffer: js.typedarray.ArrayBuffer = js.native
    
    /**
      * The source Canvas Element.
      */
    val canvas: HTMLCanvasElement = js.native
    
    /**
      * Clears the given region of this Canvas Texture, resetting it back to transparent.
      * If no region is given, the whole Canvas Texture is cleared.
      * @param x The x coordinate of the top-left of the region to clear. Default 0.
      * @param y The y coordinate of the top-left of the region to clear. Default 0.
      * @param width The width of the region.
      * @param height The height of the region.
      * @param update Update the internal ImageData buffer and arrays. Default true.
      */
    def clear(): CanvasTexture = js.native
    def clear(x: Double): CanvasTexture = js.native
    def clear(x: Double, y: Double): CanvasTexture = js.native
    def clear(x: Double, y: Double, width: Double): CanvasTexture = js.native
    def clear(x: Double, y: Double, width: Double, height: Double): CanvasTexture = js.native
    def clear(x: Double, y: Double, width: Double, height: Double, update: Boolean): CanvasTexture = js.native
    def clear(x: Double, y: Double, width: Double, height: Unit, update: Boolean): CanvasTexture = js.native
    def clear(x: Double, y: Double, width: Unit, height: Double): CanvasTexture = js.native
    def clear(x: Double, y: Double, width: Unit, height: Double, update: Boolean): CanvasTexture = js.native
    def clear(x: Double, y: Double, width: Unit, height: Unit, update: Boolean): CanvasTexture = js.native
    def clear(x: Double, y: Unit, width: Double): CanvasTexture = js.native
    def clear(x: Double, y: Unit, width: Double, height: Double): CanvasTexture = js.native
    def clear(x: Double, y: Unit, width: Double, height: Double, update: Boolean): CanvasTexture = js.native
    def clear(x: Double, y: Unit, width: Double, height: Unit, update: Boolean): CanvasTexture = js.native
    def clear(x: Double, y: Unit, width: Unit, height: Double): CanvasTexture = js.native
    def clear(x: Double, y: Unit, width: Unit, height: Double, update: Boolean): CanvasTexture = js.native
    def clear(x: Double, y: Unit, width: Unit, height: Unit, update: Boolean): CanvasTexture = js.native
    def clear(x: Unit, y: Double): CanvasTexture = js.native
    def clear(x: Unit, y: Double, width: Double): CanvasTexture = js.native
    def clear(x: Unit, y: Double, width: Double, height: Double): CanvasTexture = js.native
    def clear(x: Unit, y: Double, width: Double, height: Double, update: Boolean): CanvasTexture = js.native
    def clear(x: Unit, y: Double, width: Double, height: Unit, update: Boolean): CanvasTexture = js.native
    def clear(x: Unit, y: Double, width: Unit, height: Double): CanvasTexture = js.native
    def clear(x: Unit, y: Double, width: Unit, height: Double, update: Boolean): CanvasTexture = js.native
    def clear(x: Unit, y: Double, width: Unit, height: Unit, update: Boolean): CanvasTexture = js.native
    def clear(x: Unit, y: Unit, width: Double): CanvasTexture = js.native
    def clear(x: Unit, y: Unit, width: Double, height: Double): CanvasTexture = js.native
    def clear(x: Unit, y: Unit, width: Double, height: Double, update: Boolean): CanvasTexture = js.native
    def clear(x: Unit, y: Unit, width: Double, height: Unit, update: Boolean): CanvasTexture = js.native
    def clear(x: Unit, y: Unit, width: Unit, height: Double): CanvasTexture = js.native
    def clear(x: Unit, y: Unit, width: Unit, height: Double, update: Boolean): CanvasTexture = js.native
    def clear(x: Unit, y: Unit, width: Unit, height: Unit, update: Boolean): CanvasTexture = js.native
    
    /**
      * The 2D Canvas Rendering Context.
      */
    val context: CanvasRenderingContext2D = js.native
    
    /**
      * A Uint8ClampedArray view into the `buffer`.
      * Use the `update` method to populate this when the canvas changes.
      * Note that this is unavailable in some browsers, such as Epic Browser, due to their security restrictions.
      */
    var data: js.typedarray.Uint8ClampedArray = js.native
    
    def draw(x: Double, y: Double, source: HTMLCanvasElement): CanvasTexture = js.native
    def draw(x: Double, y: Double, source: HTMLCanvasElement, update: Boolean): CanvasTexture = js.native
    /**
      * Draws the given Image or Canvas element to this CanvasTexture, then updates the internal
      * ImageData buffer and arrays.
      * @param x The x coordinate to draw the source at.
      * @param y The y coordinate to draw the source at.
      * @param source The element to draw to this canvas.
      * @param update Update the internal ImageData buffer and arrays. Default true.
      */
    def draw(x: Double, y: Double, source: HTMLImageElement): CanvasTexture = js.native
    def draw(x: Double, y: Double, source: HTMLImageElement, update: Boolean): CanvasTexture = js.native
    
    /**
      * Draws the given texture frame to this CanvasTexture, then updates the internal
      * ImageData buffer and arrays.
      * @param key The unique string-based key of the Texture.
      * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
      * @param x The x coordinate to draw the source at. Default 0.
      * @param y The y coordinate to draw the source at. Default 0.
      * @param update Update the internal ImageData buffer and arrays. Default true.
      */
    def drawFrame(key: String): CanvasTexture = js.native
    def drawFrame(key: String, frame: String): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Double, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Unit, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Double, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Unit, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: Double, x: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Double, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Unit, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Double, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Unit, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: Unit, x: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Double, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Unit, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Double): CanvasTexture = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Double, update: Boolean): CanvasTexture = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Unit, update: Boolean): CanvasTexture = js.native
    
    /**
      * Gets the Canvas Element.
      */
    def getCanvas(): HTMLCanvasElement = js.native
    
    /**
      * Gets the 2D Canvas Rendering Context.
      */
    def getContext(): CanvasRenderingContext2D = js.native
    
    /**
      * Gets an ImageData region from this CanvasTexture from the position and size specified.
      * You can write this back using `CanvasTexture.putData`, or manipulate it.
      * @param x The x coordinate of the top-left of the area to get the ImageData from. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param y The y coordinate of the top-left of the area to get the ImageData from. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param width The width of the rectangle from which the ImageData will be extracted. Positive values are to the right, and negative to the left.
      * @param height The height of the rectangle from which the ImageData will be extracted. Positive values are down, and negative are up.
      */
    def getData(x: Double, y: Double, width: Double, height: Double): ImageData = js.native
    
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
    def getIndex(x: Double, y: Double): Double = js.native
    
    /**
      * Get the color of a specific pixel from this texture and store it in a Color object.
      * 
      * If you have drawn anything to this CanvasTexture since it was created you must call `CanvasTexture.update` to refresh the array buffer,
      * otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.
      * @param x The x coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param y The y coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param out A Color object to store the pixel values in. If not provided a new Color object will be created.
      */
    def getPixel(x: Double, y: Double): Color = js.native
    def getPixel(x: Double, y: Double, out: Color): Color = js.native
    
    /**
      * Returns an array containing all of the pixels in the given region.
      * 
      * If the requested region extends outside the bounds of this CanvasTexture,
      * the region is truncated to fit.
      * 
      * If you have drawn anything to this CanvasTexture since it was created you must call `CanvasTexture.update` to refresh the array buffer,
      * otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.
      * @param x The x coordinate of the top-left of the region. Must lay within the dimensions of this CanvasTexture and be an integer. Default 0.
      * @param y The y coordinate of the top-left of the region. Must lay within the dimensions of this CanvasTexture and be an integer. Default 0.
      * @param width The width of the region to get. Must be an integer. Defaults to the canvas width if not given.
      * @param height The height of the region to get. Must be an integer. If not given will be set to the `width`.
      */
    def getPixels(): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Double, y: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Double, y: Double, width: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Double, y: Double, width: Double, height: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Double, y: Double, width: Unit, height: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Double, y: Unit, width: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Double, y: Unit, width: Double, height: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Double, y: Unit, width: Unit, height: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Unit, y: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Unit, y: Double, width: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Unit, y: Double, width: Double, height: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Unit, y: Double, width: Unit, height: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Unit, y: Unit, width: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Unit, y: Unit, width: Double, height: Double): js.Array[js.Array[PixelConfig]] = js.native
    def getPixels(x: Unit, y: Unit, width: Unit, height: Double): js.Array[js.Array[PixelConfig]] = js.native
    
    /**
      * The height of the Canvas.
      * This property is read-only, if you wish to change it use the `setSize` method.
      */
    val height: Double = js.native
    
    /**
      * The context image data.
      * Use the `update` method to populate this when the canvas changes.
      */
    var imageData: ImageData = js.native
    
    /**
      * An Uint32Array view into the `buffer`.
      */
    var pixels: js.typedarray.Uint32Array = js.native
    
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
    def putData(imageData: ImageData, x: Double, y: Double): this.type = js.native
    def putData(imageData: ImageData, x: Double, y: Double, dirtyX: Double): this.type = js.native
    def putData(imageData: ImageData, x: Double, y: Double, dirtyX: Double, dirtyY: Double): this.type = js.native
    def putData(imageData: ImageData, x: Double, y: Double, dirtyX: Double, dirtyY: Double, dirtyWidth: Double): this.type = js.native
    def putData(
      imageData: ImageData,
      x: Double,
      y: Double,
      dirtyX: Double,
      dirtyY: Double,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): this.type = js.native
    def putData(
      imageData: ImageData,
      x: Double,
      y: Double,
      dirtyX: Double,
      dirtyY: Double,
      dirtyWidth: Unit,
      dirtyHeight: Double
    ): this.type = js.native
    def putData(imageData: ImageData, x: Double, y: Double, dirtyX: Double, dirtyY: Unit, dirtyWidth: Double): this.type = js.native
    def putData(
      imageData: ImageData,
      x: Double,
      y: Double,
      dirtyX: Double,
      dirtyY: Unit,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): this.type = js.native
    def putData(
      imageData: ImageData,
      x: Double,
      y: Double,
      dirtyX: Double,
      dirtyY: Unit,
      dirtyWidth: Unit,
      dirtyHeight: Double
    ): this.type = js.native
    def putData(imageData: ImageData, x: Double, y: Double, dirtyX: Unit, dirtyY: Double): this.type = js.native
    def putData(imageData: ImageData, x: Double, y: Double, dirtyX: Unit, dirtyY: Double, dirtyWidth: Double): this.type = js.native
    def putData(
      imageData: ImageData,
      x: Double,
      y: Double,
      dirtyX: Unit,
      dirtyY: Double,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): this.type = js.native
    def putData(
      imageData: ImageData,
      x: Double,
      y: Double,
      dirtyX: Unit,
      dirtyY: Double,
      dirtyWidth: Unit,
      dirtyHeight: Double
    ): this.type = js.native
    def putData(imageData: ImageData, x: Double, y: Double, dirtyX: Unit, dirtyY: Unit, dirtyWidth: Double): this.type = js.native
    def putData(
      imageData: ImageData,
      x: Double,
      y: Double,
      dirtyX: Unit,
      dirtyY: Unit,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): this.type = js.native
    def putData(
      imageData: ImageData,
      x: Double,
      y: Double,
      dirtyX: Unit,
      dirtyY: Unit,
      dirtyWidth: Unit,
      dirtyHeight: Double
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
    def setPixel(x: Double, y: Double, red: Double, green: Double, blue: Double): this.type = js.native
    def setPixel(x: Double, y: Double, red: Double, green: Double, blue: Double, alpha: Double): this.type = js.native
    
    /**
      * Changes the size of this Canvas Texture.
      * @param width The new width of the Canvas.
      * @param height The new height of the Canvas. If not given it will use the width as the height.
      */
    def setSize(width: Double): CanvasTexture = js.native
    def setSize(width: Double, height: Double): CanvasTexture = js.native
    
    /**
      * This re-creates the `imageData` from the current context.
      * It then re-builds the ArrayBuffer, the `data` Uint8ClampedArray reference and the `pixels` Int32Array.
      * 
      * Warning: This is a very expensive operation, so use it sparingly.
      */
    def update(): CanvasTexture = js.native
    
    /**
      * The width of the Canvas.
      * This property is read-only, if you wish to change it use the `setSize` method.
      */
    val width: Double = js.native
  }
  
  /**
    * A Dynamic Texture is a special texture that allows you to draw textures, frames and most kind of
    * Game Objects directly to it.
    * 
    * You can take many complex objects and draw them to this one texture, which can then be used as the
    * base texture for other Game Objects, such as Sprites. Should you then update this texture, all
    * Game Objects using it will instantly be updated as well, reflecting the changes immediately.
    * 
    * It's a powerful way to generate dynamic textures at run-time that are WebGL friendly and don't invoke
    * expensive GPU uploads on each change.
    * 
    * ```js
    * const t = this.textures.addDynamicTexture('player', 64, 128);
    * // draw objects to t
    * this.add.sprite(x, y, 'player');
    * ```
    * 
    * Because this is a standard Texture within Phaser, you can add frames to it, meaning you can use it
    * to generate sprite sheets, texture atlases or tile sets.
    * 
    * Under WebGL1, a FrameBuffer, which is what this Dynamic Texture uses internally, cannot be anti-aliased.
    * This means that when drawing objects such as Shapes or Graphics instances to this texture, they may appear
    * to be drawn with no aliasing around the edges. This is a technical limitation of WebGL1. To get around it,
    * create your shape as a texture in an art package, then draw that to this texture.
    * 
    * Based on the assumption that you will be using this Dynamic Texture as a source for Sprites, it will
    * automatically invert any drawing done to it on the y axis. If you do not require this, please call the
    * `setIsSpriteTexture()` method and pass it `false` as its parameter. Do this before you start drawing
    * to this texture, otherwise you will get vertically inverted frames under WebGL. This isn't required
    * for Canvas.
    */
  @js.native
  trait DynamicTexture
    extends StObject
       with Texture {
    
    /**
      * Use this method if you have already called `beginDraw` and need to batch
      * draw a large number of objects to this Dynamic Texture.
      * 
      * This method batches the drawing of the given objects to this texture,
      * without causing a WebGL bind or batch flush for each one.
      * 
      * It is faster than calling `draw`, but you must be careful to manage the
      * flow of code and remember to call `endDraw()`. If you don't need to draw large
      * numbers of objects it's much safer and easier to use the `draw` method instead.
      * 
      * The flow should be:
      * 
      * ```javascript
      * // Call once:
      * DynamicTexture.beginDraw();
      * 
      * // repeat n times:
      * DynamicTexture.batchDraw();
      * // or
      * DynamicTexture.batchDrawFrame();
      * 
      * // Call once:
      * DynamicTexture.endDraw();
      * ```
      * 
      * Do not call any methods other than `batchDraw`, `batchDrawFrame`, or `endDraw` once you
      * have started a batch. Also, be very careful not to destroy this Dynamic Texture while the
      * batch is still open. Doing so will cause a run-time error in the WebGL Renderer.
      * 
      * You can use the `DynamicTexture.isDrawing` boolean property to tell if a batch is
      * currently open, or not.
      * 
      * This method can accept any of the following:
      * 
      * * Any renderable Game Object, such as a Sprite, Text, Graphics or TileSprite.
      * * Tilemap Layers.
      * * A Group. The contents of which will be iterated and drawn in turn.
      * * A Container. The contents of which will be iterated fully, and drawn in turn.
      * * A Scene's Display List. Pass in `Scene.children` to draw the whole list.
      * * Another Dynamic Texture or Render Texture.
      * * A Texture Frame instance.
      * * A string. This is used to look-up a texture from the Texture Manager.
      * 
      * Note: You cannot draw a Dynamic Texture to itself.
      * 
      * If passing in a Group or Container it will only draw children that return `true`
      * when their `willRender()` method is called. I.e. a Container with 10 children,
      * 5 of which have `visible=false` will only draw the 5 visible ones.
      * 
      * If passing in an array of Game Objects it will draw them all, regardless if
      * they pass a `willRender` check or not.
      * 
      * You can pass in a string in which case it will look for a texture in the Texture
      * Manager matching that string, and draw the base frame. If you need to specify
      * exactly which frame to draw then use the method `drawFrame` instead.
      * 
      * You can pass in the `x` and `y` coordinates to draw the objects at. The use of
      * the coordinates differ based on what objects are being drawn. If the object is
      * a Group, Container or Display List, the coordinates are _added_ to the positions
      * of the children. For all other types of object, the coordinates are exact.
      * 
      * The `alpha` and `tint` values are only used by Texture Frames.
      * Game Objects use their own alpha and tint values when being drawn.
      * @param entries Any renderable Game Object, or Group, Container, Display List, other Dynamic or Texture, Texture Frame or an array of any of these.
      * @param x The x position to draw the Frame at, or the offset applied to the object. Default 0.
      * @param y The y position to draw the Frame at, or the offset applied to the object. Default 0.
      * @param alpha The alpha value. Only used when drawing Texture Frames to this texture. Game Objects use their own alpha. Default 1.
      * @param tint The tint color value. Only used when drawing Texture Frames to this texture. Game Objects use their own tint. WebGL only. Default 0xffffff.
      */
    def batchDraw(entries: Any): this.type = js.native
    def batchDraw(entries: Any, x: Double): this.type = js.native
    def batchDraw(entries: Any, x: Double, y: Double): this.type = js.native
    def batchDraw(entries: Any, x: Double, y: Double, alpha: Double): this.type = js.native
    def batchDraw(entries: Any, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
    def batchDraw(entries: Any, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def batchDraw(entries: Any, x: Double, y: Unit, alpha: Double): this.type = js.native
    def batchDraw(entries: Any, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def batchDraw(entries: Any, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def batchDraw(entries: Any, x: Unit, y: Double): this.type = js.native
    def batchDraw(entries: Any, x: Unit, y: Double, alpha: Double): this.type = js.native
    def batchDraw(entries: Any, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
    def batchDraw(entries: Any, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def batchDraw(entries: Any, x: Unit, y: Unit, alpha: Double): this.type = js.native
    def batchDraw(entries: Any, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def batchDraw(entries: Any, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    
    /**
      * Use this method if you have already called `beginDraw` and need to batch
      * draw a large number of texture frames to this Dynamic Texture.
      * 
      * This method batches the drawing of the given frames to this Dynamic Texture,
      * without causing a WebGL bind or batch flush for each one.
      * 
      * It is faster than calling `drawFrame`, but you must be careful to manage the
      * flow of code and remember to call `endDraw()`. If you don't need to draw large
      * numbers of frames it's much safer and easier to use the `drawFrame` method instead.
      * 
      * The flow should be:
      * 
      * ```javascript
      * // Call once:
      * DynamicTexture.beginDraw();
      * 
      * // repeat n times:
      * DynamicTexture.batchDraw();
      * // or
      * DynamicTexture.batchDrawFrame();
      * 
      * // Call once:
      * DynamicTexture.endDraw();
      * ```
      * 
      * Do not call any methods other than `batchDraw`, `batchDrawFrame`, or `endDraw` once you
      * have started a batch. Also, be very careful not to destroy this Dynamic Texture while the
      * batch is still open. Doing so will cause a run-time error in the WebGL Renderer.
      * 
      * You can use the `DynamicTexture.isDrawing` boolean property to tell if a batch is
      * currently open, or not.
      * 
      * Textures are referenced by their string-based keys, as stored in the Texture Manager.
      * 
      * You can optionally provide a position, alpha and tint value to apply to the frame
      * before it is drawn.
      * @param key The key of the texture to be used, as stored in the Texture Manager.
      * @param frame The name or index of the frame within the Texture.
      * @param x The x position to draw the frame at. Default 0.
      * @param y The y position to draw the frame at. Default 0.
      * @param alpha The alpha value. Only used when drawing Texture Frames to this texture. Game Objects use their own alpha. Default 1.
      * @param tint The tint color value. Only used when drawing Texture Frames to this texture. Game Objects use their own tint. WebGL only. Default 0xffffff.
      */
    def batchDrawFrame(key: String): this.type = js.native
    def batchDrawFrame(key: String, frame: String): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Double, y: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Double, y: Double, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Unit, y: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Double, y: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Unit, y: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Double, y: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    
    /**
      * Use this method if you need to batch draw a large number of Game Objects to
      * this Dynamic Texture in a single pass, or on a frequent basis. This is especially
      * useful under WebGL, however, if your game is using Canvas only, it will not make
      * any speed difference in that situation.
      * 
      * This method starts the beginning of a batched draw, unless one is already open.
      * 
      * Batched drawing is faster than calling `draw` in loop, but you must be careful
      * to manage the flow of code and remember to call `endDraw()` when you're finished.
      * 
      * If you don't need to draw large numbers of objects it's much safer and easier
      * to use the `draw` method instead.
      * 
      * The flow should be:
      * 
      * ```javascript
      * // Call once:
      * DynamicTexture.beginDraw();
      * 
      * // repeat n times:
      * DynamicTexture.batchDraw();
      * // or
      * DynamicTexture.batchDrawFrame();
      * 
      * // Call once:
      * DynamicTexture.endDraw();
      * ```
      * 
      * Do not call any methods other than `batchDraw`, `batchDrawFrame`, or `endDraw` once you
      * have started a batch. Also, be very careful not to destroy this Dynamic Texture while the
      * batch is still open. Doing so will cause a run-time error in the WebGL Renderer.
      * 
      * You can use the `DynamicTexture.isDrawing` boolean property to tell if a batch is
      * currently open, or not.
      */
    def beginDraw(): this.type = js.native
    
    /**
      * An internal Camera that can be used to move around this Dynamic Texture.
      * 
      * Control it just like you would any Scene Camera. The difference is that it only impacts
      * the placement of **Game Objects** (not textures) that you then draw to this texture.
      * 
      * You can scroll, zoom and rotate this Camera.
      */
    var camera: BaseCamera = js.native
    
    /**
      * A reference to the Rendering Context belonging to the Canvas Element this Dynamic Texture is drawing to.
      */
    var canvas: HTMLCanvasElement = js.native
    
    /**
      * Fully clears this Dynamic Texture, erasing everything from it and resetting it back to
      * a blank, transparent, texture.
      */
    def clear(): this.type = js.native
    
    /**
      * The 2D Canvas Rendering Context.
      */
    val context: CanvasRenderingContext2D = js.native
    
    /**
      * Is this Dynamic Texture dirty or not? If not it won't spend time clearing or filling itself.
      */
    var dirty: Boolean = js.native
    
    /**
      * Draws the given object, or an array of objects, to this Dynamic Texture.
      * 
      * It can accept any of the following:
      * 
      * * Any renderable Game Object, such as a Sprite, Text, Graphics or TileSprite.
      * * Tilemap Layers.
      * * A Group. The contents of which will be iterated and drawn in turn.
      * * A Container. The contents of which will be iterated fully, and drawn in turn.
      * * A Scene Display List. Pass in `Scene.children` to draw the whole list.
      * * Another Dynamic Texture, or a Render Texture.
      * * A Texture Frame instance.
      * * A string. This is used to look-up the texture from the Texture Manager.
      * 
      * Note 1: You cannot draw a Dynamic Texture to itself.
      * 
      * Note 2: For Game Objects that have Post FX Pipelines, the pipeline _cannot_ be
      * used when drawn to this texture.
      * 
      * If passing in a Group or Container it will only draw children that return `true`
      * when their `willRender()` method is called. I.e. a Container with 10 children,
      * 5 of which have `visible=false` will only draw the 5 visible ones.
      * 
      * If passing in an array of Game Objects it will draw them all, regardless if
      * they pass a `willRender` check or not.
      * 
      * You can pass in a string in which case it will look for a texture in the Texture
      * Manager matching that string, and draw the base frame. If you need to specify
      * exactly which frame to draw then use the method `drawFrame` instead.
      * 
      * You can pass in the `x` and `y` coordinates to draw the objects at. The use of
      * the coordinates differ based on what objects are being drawn. If the object is
      * a Group, Container or Display List, the coordinates are _added_ to the positions
      * of the children. For all other types of object, the coordinates are exact.
      * 
      * The `alpha` and `tint` values are only used by Texture Frames.
      * Game Objects use their own alpha and tint values when being drawn.
      * 
      * Calling this method causes the WebGL batch to flush, so it can write the texture
      * data to the framebuffer being used internally. The batch is flushed at the end,
      * after the entries have been iterated. So if you've a bunch of objects to draw,
      * try and pass them in an array in one single call, rather than making lots of
      * separate calls.
      * 
      * If you are not planning on using this Dynamic Texture as a base texture for Sprite
      * Game Objects, then you should set `DynamicTexture.isSpriteTexture = false` before
      * calling this method, otherwise you will get vertically inverted frames in WebGL.
      * @param entries Any renderable Game Object, or Group, Container, Display List, other Render Texture, Texture Frame or an array of any of these.
      * @param x The x position to draw the Frame at, or the offset applied to the object. Default 0.
      * @param y The y position to draw the Frame at, or the offset applied to the object. Default 0.
      * @param alpha The alpha value. Only used when drawing Texture Frames to this texture. Game Objects use their own alpha. Default 1.
      * @param tint The tint color value. Only used when drawing Texture Frames to this texture. Game Objects use their own tint. WebGL only. Default 0xffffff.
      */
    def draw(entries: Any): this.type = js.native
    def draw(entries: Any, x: Double): this.type = js.native
    def draw(entries: Any, x: Double, y: Double): this.type = js.native
    def draw(entries: Any, x: Double, y: Double, alpha: Double): this.type = js.native
    def draw(entries: Any, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
    def draw(entries: Any, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def draw(entries: Any, x: Double, y: Unit, alpha: Double): this.type = js.native
    def draw(entries: Any, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def draw(entries: Any, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def draw(entries: Any, x: Unit, y: Double): this.type = js.native
    def draw(entries: Any, x: Unit, y: Double, alpha: Double): this.type = js.native
    def draw(entries: Any, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
    def draw(entries: Any, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def draw(entries: Any, x: Unit, y: Unit, alpha: Double): this.type = js.native
    def draw(entries: Any, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def draw(entries: Any, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    
    /**
      * Draws the Texture Frame to the Render Texture at the given position.
      * 
      * Textures are referenced by their string-based keys, as stored in the Texture Manager.
      * 
      * ```javascript
      * var rt = this.add.renderTexture(0, 0, 800, 600);
      * rt.drawFrame(key, frame);
      * ```
      * 
      * You can optionally provide a position, alpha and tint value to apply to the frame
      * before it is drawn.
      * 
      * Calling this method will cause a batch flush, so if you've got a stack of things to draw
      * in a tight loop, try using the `draw` method instead.
      * 
      * If you need to draw a Sprite to this Render Texture, use the `draw` method instead.
      * 
      * If you are not planning on using this Dynamic Texture as a base texture for Sprite
      * Game Objects, then you should set `DynamicTexture.isSpriteTexture = false` before
      * calling this method, otherwise you will get vertically inverted frames in WebGL.
      * @param key The key of the texture to be used, as stored in the Texture Manager.
      * @param frame The name or index of the frame within the Texture. Set to `null` to skip this argument if not required.
      * @param x The x position to draw the frame at. Default 0.
      * @param y The y position to draw the frame at. Default 0.
      * @param alpha The alpha value. Only used when drawing Texture Frames to this texture. Default 1.
      * @param tint The tint color value. Only used when drawing Texture Frames to this texture. WebGL only. Default 0xffffff.
      */
    def drawFrame(key: String): this.type = js.native
    def drawFrame(key: String, frame: String): this.type = js.native
    def drawFrame(key: String, frame: String, x: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Double, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
    def drawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
    
    /**
      * Use this method to finish batch drawing to this Dynamic Texture.
      * 
      * Doing so will stop the WebGL Renderer from capturing draws and then blit the
      * framebuffer to the Render Target owned by this texture.
      * 
      * Calling this method without first calling `beginDraw` will have no effect.
      * 
      * Batch drawing is faster than calling `draw`, but you must be careful to manage the
      * flow of code and remember to call `endDraw()` when you're finished.
      * 
      * If you don't need to draw large numbers of objects it's much safer and easier
      * to use the `draw` method instead.
      * 
      * The flow should be:
      * 
      * ```javascript
      * // Call once:
      * DynamicTexture.beginDraw();
      * 
      * // repeat n times:
      * DynamicTexture.batchDraw();
      * // or
      * DynamicTexture.batchDrawFrame();
      * 
      * // Call once:
      * DynamicTexture.endDraw();
      * ```
      * 
      * Do not call any methods other than `batchDraw`, `batchDrawFrame`, or `endDraw` once you
      * have started a batch. Also, be very careful not to destroy this Dynamic Texture while the
      * batch is still open. Doing so will cause a run-time error in the WebGL Renderer.
      * 
      * You can use the `DynamicTexture.isDrawing` boolean property to tell if a batch is
      * currently open, or not.
      * @param erase Draws all objects in this batch using a blend mode of ERASE. This has the effect of erasing any filled pixels in the objects being drawn. Default false.
      */
    def endDraw(): this.type = js.native
    def endDraw(erase: Boolean): this.type = js.native
    
    /**
      * Draws the given object, or an array of objects, to this Dynamic Texture using a blend mode of ERASE.
      * This has the effect of erasing any filled pixels present in the objects from this texture.
      * 
      * It can accept any of the following:
      * 
      * * Any renderable Game Object, such as a Sprite, Text, Graphics or TileSprite.
      * * Tilemap Layers.
      * * A Group. The contents of which will be iterated and drawn in turn.
      * * A Container. The contents of which will be iterated fully, and drawn in turn.
      * * A Scene Display List. Pass in `Scene.children` to draw the whole list.
      * * Another Dynamic Texture, or a Render Texture.
      * * A Texture Frame instance.
      * * A string. This is used to look-up the texture from the Texture Manager.
      * 
      * Note: You cannot erase a Dynamic Texture from itself.
      * 
      * If passing in a Group or Container it will only draw children that return `true`
      * when their `willRender()` method is called. I.e. a Container with 10 children,
      * 5 of which have `visible=false` will only draw the 5 visible ones.
      * 
      * If passing in an array of Game Objects it will draw them all, regardless if
      * they pass a `willRender` check or not.
      * 
      * You can pass in a string in which case it will look for a texture in the Texture
      * Manager matching that string, and draw the base frame.
      * 
      * You can pass in the `x` and `y` coordinates to draw the objects at. The use of
      * the coordinates differ based on what objects are being drawn. If the object is
      * a Group, Container or Display List, the coordinates are _added_ to the positions
      * of the children. For all other types of object, the coordinates are exact.
      * 
      * Calling this method causes the WebGL batch to flush, so it can write the texture
      * data to the framebuffer being used internally. The batch is flushed at the end,
      * after the entries have been iterated. So if you've a bunch of objects to draw,
      * try and pass them in an array in one single call, rather than making lots of
      * separate calls.
      * 
      * If you are not planning on using this Dynamic Texture as a base texture for Sprite
      * Game Objects, then you should set `DynamicTexture.isSpriteTexture = false` before
      * calling this method, otherwise you will get vertically inverted frames in WebGL.
      * @param entries Any renderable Game Object, or Group, Container, Display List, Render Texture, Texture Frame, or an array of any of these.
      * @param x The x position to draw the Frame at, or the offset applied to the object. Default 0.
      * @param y The y position to draw the Frame at, or the offset applied to the object. Default 0.
      */
    def erase(entries: Any): this.type = js.native
    def erase(entries: Any, x: Double): this.type = js.native
    def erase(entries: Any, x: Double, y: Double): this.type = js.native
    def erase(entries: Any, x: Unit, y: Double): this.type = js.native
    
    /**
      * Fills this Dynamic Texture with the given color.
      * 
      * By default it will fill the entire texture, however you can set it to fill a specific
      * rectangular area by using the x, y, width and height arguments.
      * 
      * The color should be given in hex format, i.e. 0xff0000 for red, 0x00ff00 for green, etc.
      * @param rgb The color to fill this Dynamic Texture with, such as 0xff0000 for red.
      * @param alpha The alpha value used by the fill. Default 1.
      * @param x The left coordinate of the fill rectangle. Default 0.
      * @param y The top coordinate of the fill rectangle. Default 0.
      * @param width The width of the fill rectangle. Default this.width.
      * @param height The height of the fill rectangle. Default this.height.
      */
    def fill(rgb: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Double, y: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Double, y: Double, width: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Double, y: Double, width: Unit, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Double, y: Unit, width: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Double, y: Unit, width: Double, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Double, y: Unit, width: Unit, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Unit, y: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Unit, y: Double, width: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Unit, y: Double, width: Double, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Unit, y: Double, width: Unit, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Unit, y: Unit, width: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Unit, y: Unit, width: Double, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Double, x: Unit, y: Unit, width: Unit, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Double, y: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Double, y: Double, width: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Double, y: Double, width: Double, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Double, y: Double, width: Unit, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Double, y: Unit, width: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Double, y: Unit, width: Double, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Double, y: Unit, width: Unit, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Unit, y: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Unit, y: Double, width: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Unit, y: Double, width: Double, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Unit, y: Double, width: Unit, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Unit, y: Unit, width: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Unit, y: Unit, width: Double, height: Double): this.type = js.native
    def fill(rgb: Double, alpha: Unit, x: Unit, y: Unit, width: Unit, height: Double): this.type = js.native
    
    /**
      * Returns the underlying WebGLTexture, if not running in Canvas mode.
      */
    def getWebGLTexture(): WebGLTexture | Null = js.native
    
    /**
      * This flag is set to 'true' during `beginDraw` and reset to 'false` in `endDraw`,
      * allowing you to determine if this Dynamic Texture is batch drawing, or not.
      */
    val isDrawing: Boolean = js.native
    
    /**
      * Is this Dynamic Texture being used as the base texture for a Sprite Game Object?
      * 
      * This is enabled by default, as we expect that will be the core use for Dynamic Textures.
      * 
      * However, to disable it, call `RenderTexture.setIsSpriteTexture(false)`.
      * 
      * You should do this _before_ drawing to this texture, so that it correctly
      * inverses the frames for WebGL rendering. Not doing so will result in vertically flipped frames.
      * 
      * This property is used in the `endDraw` method.
      */
    var isSpriteTexture: Boolean = js.native
    
    /**
      * A reference to the WebGL Single Pipeline.
      * 
      * This property remains `null` under Canvas.
      */
    var pipeline: SinglePipeline = js.native
    
    /**
      * Internal destroy handler, called as part of the destroy process.
      */
    /* protected */ def preDestroy(): Unit = js.native
    
    /**
      * This is a NOOP method. Bitmap Masks are not supported by the Canvas Renderer.
      * @param renderer The Canvas Renderer which would be rendered to.
      * @param mask The masked Game Object which would be rendered.
      * @param camera The Camera to render to.
      */
    def renderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera): Unit = js.native
    def renderCanvas(renderer: WebGLRenderer, mask: GameObject, camera: Camera): Unit = js.native
    
    /**
      * The Render Target that belongs to this Dynamic Texture.
      * 
      * A Render Target encapsulates a framebuffer and texture for the WebGL Renderer.
      * 
      * This property remains `null` under Canvas.
      */
    var renderTarget: RenderTarget = js.native
    
    /**
      * Renders this Dynamic Texture onto the Stamp Game Object as a BitmapMask.
      * @param renderer A reference to the current active WebGL renderer.
      * @param src The Game Object being rendered in this call.
      * @param camera The Camera that is rendering the Game Object.
      * @param parentMatrix This transform matrix is defined if the game object is nested
      */
    def renderWebGL(renderer: WebGLRenderer, src: Image, camera: Camera, parentMatrix: TransformMatrix): Unit = js.native
    
    /**
      * A reference to either the Canvas or WebGL Renderer that the Game instance is using.
      */
    var renderer: CanvasRenderer | WebGLRenderer = js.native
    
    /**
      * Takes the given Texture Frame and draws it to this Dynamic Texture as a fill pattern,
      * i.e. in a grid-layout based on the frame dimensions.
      * 
      * Textures are referenced by their string-based keys, as stored in the Texture Manager.
      * 
      * You can optionally provide a position, width, height, alpha and tint value to apply to
      * the frames before they are drawn. The position controls the top-left where the repeating
      * fill will start from. The width and height control the size of the filled area.
      * 
      * The position can be negative if required, but the dimensions cannot.
      * 
      * Calling this method will cause a batch flush by default. Use the `skipBatch` argument
      * to disable this if this call is part of a larger batch draw.
      * 
      * If you are not planning on using this Dynamic Texture as a base texture for Sprite
      * Game Objects, then you should set `DynamicTexture.isSpriteTexture = false` before
      * calling this method, otherwise you will get vertically inverted frames in WebGL.
      * @param key The key of the texture to be used, as stored in the Texture Manager.
      * @param frame The name or index of the frame within the Texture. Set to `null` to skip this argument if not required.
      * @param x The x position to start drawing the frames from (can be negative to offset). Default 0.
      * @param y The y position to start drawing the frames from (can be negative to offset). Default 0.
      * @param width The width of the area to repeat the frame within. Defaults to the width of this Dynamic Texture. Default this.width.
      * @param height The height of the area to repeat the frame within. Defaults to the height of this Dynamic Texture. Default this.height.
      * @param alpha The alpha to use. Defaults to 1, no alpha. Default 1.
      * @param tint WebGL only. The tint color to use. Leave as undefined, or 0xffffff to have no tint. Default 0xffffff.
      * @param skipBatch Skip beginning and ending a batch with this call. Use if this is part of a bigger batched draw. Default false.
      */
    def repeat(
      key: String,
      frame: js.UndefOr[String | Double],
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      alpha: js.UndefOr[Double],
      tint: js.UndefOr[Double],
      skipBatch: js.UndefOr[Boolean]
    ): this.type = js.native
    
    /**
      * If you are planning on using this Render Texture as a base texture for Sprite
      * Game Objects, then you should call this method with a value of `true` before
      * drawing anything to it, otherwise you will get inverted frames in WebGL.
      * @param value Is this Render Target being used as a Sprite Texture, or not?
      */
    def setIsSpriteTexture(value: Boolean): this.type = js.native
    
    /**
      * Resizes this Dynamic Texture to the new dimensions given.
      * 
      * In WebGL it will destroy and then re-create the frame buffer being used by this Dynamic Texture.
      * In Canvas it will resize the underlying canvas DOM element.
      * 
      * Both approaches will erase everything currently drawn to this texture.
      * 
      * If the dimensions given are the same as those already being used, calling this method will do nothing.
      * @param width The new width of this Dynamic Texture.
      * @param height The new height of this Dynamic Texture. If not specified, will be set the same as the `width`. Default width.
      */
    def setSize(width: Double): this.type = js.native
    def setSize(width: Double, height: Double): this.type = js.native
    
    /**
      * Takes a snapshot of the whole of this Dynamic Texture.
      * 
      * The snapshot is taken immediately, but the results are returned via the given callback.
      * 
      * To capture a portion of this Dynamic Texture see the `snapshotArea` method.
      * To capture just a specific pixel, see the `snapshotPixel` method.
      * 
      * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer
      * into an ArrayBufferView. It then parses this, copying the contents to a temporary Canvas and finally
      * creating an Image object from it, which is the image returned to the callback provided.
      * 
      * All in all, this is a computationally expensive and blocking process, which gets more expensive
      * the larger the resolution this Dynamic Texture has, so please be careful how you employ this in your game.
      * @param callback The Function to invoke after the snapshot image is created.
      * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
      * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
      */
    def snapshot(callback: SnapshotCallback): this.type = js.native
    def snapshot(callback: SnapshotCallback, `type`: String): this.type = js.native
    def snapshot(callback: SnapshotCallback, `type`: String, encoderOptions: Double): this.type = js.native
    def snapshot(callback: SnapshotCallback, `type`: Unit, encoderOptions: Double): this.type = js.native
    
    /**
      * Takes a snapshot of the given area of this Dynamic Texture.
      * 
      * The snapshot is taken immediately, but the results are returned via the given callback.
      * 
      * To capture the whole Dynamic Texture see the `snapshot` method.
      * To capture just a specific pixel, see the `snapshotPixel` method.
      * 
      * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer
      * into an ArrayBufferView. It then parses this, copying the contents to a temporary Canvas and finally
      * creating an Image object from it, which is the image returned to the callback provided.
      * 
      * All in all, this is a computationally expensive and blocking process, which gets more expensive
      * the larger the resolution this Dynamic Texture has, so please be careful how you employ this in your game.
      * @param x The x coordinate to grab from.
      * @param y The y coordinate to grab from.
      * @param width The width of the area to grab.
      * @param height The height of the area to grab.
      * @param callback The Function to invoke after the snapshot image is created.
      * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
      * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
      */
    def snapshotArea(x: Double, y: Double, width: Double, height: Double, callback: SnapshotCallback): this.type = js.native
    def snapshotArea(x: Double, y: Double, width: Double, height: Double, callback: SnapshotCallback, `type`: String): this.type = js.native
    def snapshotArea(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      callback: SnapshotCallback,
      `type`: String,
      encoderOptions: Double
    ): this.type = js.native
    def snapshotArea(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      callback: SnapshotCallback,
      `type`: Unit,
      encoderOptions: Double
    ): this.type = js.native
    
    /**
      * Takes a snapshot of the given pixel from this Dynamic Texture.
      * 
      * The snapshot is taken immediately, but the results are returned via the given callback.
      * 
      * To capture the whole Dynamic Texture see the `snapshot` method.
      * To capture a portion of this Dynamic Texture see the `snapshotArea` method.
      * 
      * Unlike the two other snapshot methods, this one will send your callback a `Color` object
      * containing the color data for the requested pixel. It doesn't need to create an internal
      * Canvas or Image object, so is a lot faster to execute, using less memory than the other snapshot methods.
      * @param x The x coordinate of the pixel to get.
      * @param y The y coordinate of the pixel to get.
      * @param callback The Function to invoke after the snapshot pixel data is extracted.
      */
    def snapshotPixel(x: Double, y: Double, callback: SnapshotCallback): this.type = js.native
    
    /**
      * Takes the given texture key and frame and then stamps it at the given
      * x and y coordinates. You can use the optional 'config' argument to provide
      * lots more options about how the stamp is applied, including the alpha,
      * tint, angle, scale and origin.
      * 
      * By default, the frame will stamp on the x/y coordinates based on its center.
      * 
      * If you wish to stamp from the top-left, set the config `originX` and
      * `originY` properties both to zero.
      * @param key The key of the texture to be used, as stored in the Texture Manager.
      * @param frame The name or index of the frame within the Texture. Set to `null` to skip this argument if not required.
      * @param x The x position to draw the frame at. Default 0.
      * @param y The y position to draw the frame at. Default 0.
      * @param config The stamp configuration object, allowing you to set the alpha, tint, angle, scale and origin of the stamp.
      */
    def stamp(key: String): this.type = js.native
    def stamp(key: String, frame: String): this.type = js.native
    def stamp(key: String, frame: String, x: Double): this.type = js.native
    def stamp(key: String, frame: String, x: Double, y: Double): this.type = js.native
    def stamp(key: String, frame: String, x: Double, y: Double, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: String, x: Double, y: Unit, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: String, x: Unit, y: Double): this.type = js.native
    def stamp(key: String, frame: String, x: Unit, y: Double, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: String, x: Unit, y: Unit, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: Double): this.type = js.native
    def stamp(key: String, frame: Double, x: Double): this.type = js.native
    def stamp(key: String, frame: Double, x: Double, y: Double): this.type = js.native
    def stamp(key: String, frame: Double, x: Double, y: Double, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: Double, x: Double, y: Unit, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: Double, x: Unit, y: Double): this.type = js.native
    def stamp(key: String, frame: Double, x: Unit, y: Double, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: Double, x: Unit, y: Unit, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: Unit, x: Double): this.type = js.native
    def stamp(key: String, frame: Unit, x: Double, y: Double): this.type = js.native
    def stamp(key: String, frame: Unit, x: Double, y: Double, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: Unit, x: Double, y: Unit, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: Unit, x: Unit, y: Double): this.type = js.native
    def stamp(key: String, frame: Unit, x: Unit, y: Double, config: StampConfig): this.type = js.native
    def stamp(key: String, frame: Unit, x: Unit, y: Unit, config: StampConfig): this.type = js.native
    
    /**
      * The internal data type of this object.
      */
    val `type`: String = js.native
  }
  
  /**
    * A Frame is a section of a Texture.
    */
  @js.native
  trait Frame extends StObject {
    
    /**
      * Over-rides the Renderer setting.
      * -1 = use Renderer Setting
      * 0 = No rounding
      * 1 = Round
      */
    var autoRound: Double = js.native
    
    /**
      * The Canvas drawImage data object.
      */
    val canvasData: js.Object = js.native
    
    /**
      * The x center of this frame, floored.
      */
    var centerX: Double = js.native
    
    /**
      * The y center of this frame, floored.
      */
    var centerY: Double = js.native
    
    /**
      * Any Frame specific custom data can be stored here.
      */
    var customData: js.Object = js.native
    
    /**
      * Does this Frame have a custom pivot point?
      */
    var customPivot: Boolean = js.native
    
    /**
      * The height of the area in the source image to cut.
      */
    var cutHeight: Double = js.native
    
    /**
      * The width of the area in the source image to cut.
      */
    var cutWidth: Double = js.native
    
    /**
      * X position within the source image to cut from.
      */
    var cutX: Double = js.native
    
    /**
      * Y position within the source image to cut from.
      */
    var cutY: Double = js.native
    
    /**
      * Destroys this Frame by nulling its reference to the parent Texture and and data objects.
      */
    def destroy(): Unit = js.native
    
    /**
      * A reference to the Texture Source WebGL Texture that this Frame is using.
      */
    var glTexture: WebGLTexture | Null = js.native
    
    /**
      * Half the height, floored.
      * Precalculated for the renderer.
      */
    var halfHeight: Double = js.native
    
    /**
      * Half the width, floored.
      * Precalculated for the renderer.
      */
    var halfWidth: Double = js.native
    
    /**
      * The rendering height of this Frame, taking trim into account.
      */
    var height: Double = js.native
    
    /**
      * The name of this Frame.
      * The name is unique within the Texture.
      */
    var name: String = js.native
    
    /**
      * The horizontal pivot point of this Frame.
      */
    var pivotX: Double = js.native
    
    /**
      * The vertical pivot point of this Frame.
      */
    var pivotY: Double = js.native
    
    /**
      * The radius of the Frame (derived from sqrt(w * w + h * h) / 2)
      */
    val radius: Double = js.native
    
    /**
      * The height of the Frame in its un-trimmed, un-padded state, as prepared in the art package,
      * before being packed.
      */
    val realHeight: Double = js.native
    
    /**
      * The width of the Frame in its un-trimmed, un-padded state, as prepared in the art package,
      * before being packed.
      */
    val realWidth: Double = js.native
    
    /**
      * **CURRENTLY UNSUPPORTED**
      * 
      * Is this frame is rotated or not in the Texture?
      * Rotation allows you to use rotated frames in texture atlas packing.
      * It has nothing to do with Sprite rotation.
      */
    var rotated: Boolean = js.native
    
    /**
      * Takes a crop data object and, based on the rectangular region given, calculates the
      * required UV coordinates in order to crop this Frame for WebGL and Canvas rendering.
      * 
      * This is called directly by the Game Object Texture Components `setCrop` method.
      * Please use that method to crop a Game Object.
      * @param crop The crop data object. This is the `GameObject._crop` property.
      * @param x The x coordinate to start the crop from. Cannot be negative or exceed the Frame width.
      * @param y The y coordinate to start the crop from. Cannot be negative or exceed the Frame height.
      * @param width The width of the crop rectangle. Cannot exceed the Frame width.
      * @param height The height of the crop rectangle. Cannot exceed the Frame height.
      * @param flipX Does the parent Game Object have flipX set?
      * @param flipY Does the parent Game Object have flipY set?
      */
    def setCropUVs(
      crop: js.Object,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      flipX: Boolean,
      flipY: Boolean
    ): js.Object = js.native
    
    /**
      * Sets the width, height, x and y of this Frame.
      * 
      * This is called automatically by the constructor
      * and should rarely be changed on-the-fly.
      * @param width The width of the frame before being trimmed.
      * @param height The height of the frame before being trimmed.
      * @param x The x coordinate of the top-left of this Frame. Default 0.
      * @param y The y coordinate of the top-left of this Frame. Default 0.
      */
    def setSize(width: Double, height: Double): this.type = js.native
    def setSize(width: Double, height: Double, x: Double): this.type = js.native
    def setSize(width: Double, height: Double, x: Double, y: Double): this.type = js.native
    def setSize(width: Double, height: Double, x: Unit, y: Double): this.type = js.native
    
    /**
      * If the frame was trimmed when added to the Texture Atlas, this records the trim and source data.
      * @param actualWidth The width of the frame before being trimmed.
      * @param actualHeight The height of the frame before being trimmed.
      * @param destX The destination X position of the trimmed frame for display.
      * @param destY The destination Y position of the trimmed frame for display.
      * @param destWidth The destination width of the trimmed frame for display.
      * @param destHeight The destination height of the trimmed frame for display.
      */
    def setTrim(
      actualWidth: Double,
      actualHeight: Double,
      destX: Double,
      destY: Double,
      destWidth: Double,
      destHeight: Double
    ): this.type = js.native
    
    /**
      * Directly sets the canvas and WebGL UV data for this frame.
      * 
      * Use this if you need to override the values that are generated automatically
      * when the Frame is created.
      * @param width Width of this frame for the Canvas data.
      * @param height Height of this frame for the Canvas data.
      * @param u0 UV u0 value.
      * @param v0 UV v0 value.
      * @param u1 UV u1 value.
      * @param v1 UV v1 value.
      */
    def setUVs(width: Double, height: Double, u0: Double, v0: Double, u1: Double, v1: Double): this.type = js.native
    
    /**
      * The TextureSource this Frame is part of.
      */
    var source: TextureSource = js.native
    
    /**
      * The index of the TextureSource in the Texture sources array.
      */
    var sourceIndex: Double = js.native
    
    /**
      * The Texture this Frame is a part of.
      */
    var texture: Texture = js.native
    
    /**
      * Is the Frame trimmed or not?
      */
    val trimmed: Boolean = js.native
    
    /**
      * WebGL UV u0 value.
      */
    var u0: Double = js.native
    
    /**
      * WebGL UV u1 value.
      */
    var u1: Double = js.native
    
    /**
      * Takes a crop data object and recalculates the UVs based on the dimensions inside the crop object.
      * Called automatically by `setFrame`.
      * @param crop The crop data object. This is the `GameObject._crop` property.
      * @param flipX Does the parent Game Object have flipX set?
      * @param flipY Does the parent Game Object have flipY set?
      */
    def updateCropUVs(crop: js.Object, flipX: Boolean, flipY: Boolean): js.Object = js.native
    
    /**
      * Updates the internal WebGL UV cache and the drawImage cache.
      */
    def updateUVs(): this.type = js.native
    
    /**
      * Updates the internal WebGL UV cache.
      */
    def updateUVsInverted(): this.type = js.native
    
    /**
      * WebGL UV v0 value.
      */
    var v0: Double = js.native
    
    /**
      * WebGL UV v1 value.
      */
    var v1: Double = js.native
    
    /**
      * The rendering width of this Frame, taking trim into account.
      */
    var width: Double = js.native
    
    /**
      * The X rendering offset of this Frame, taking trim into account.
      */
    var x: Double = js.native
    
    /**
      * The Y rendering offset of this Frame, taking trim into account.
      */
    var y: Double = js.native
  }
  
  /**
    * A Texture consists of a source, usually an Image from the Cache, and a collection of Frames.
    * The Frames represent the different areas of the Texture. For example a texture atlas
    * may have many Frames, one for each element within the atlas. Where-as a single image would have
    * just one frame, that encompasses the whole image.
    * 
    * Every Texture, no matter where it comes from, always has at least 1 frame called the `__BASE` frame.
    * This frame represents the entirety of the source image.
    * 
    * Textures are managed by the global TextureManager. This is a singleton class that is
    * responsible for creating and delivering Textures and their corresponding Frames to Game Objects.
    * 
    * Sprites and other Game Objects get the texture data they need from the TextureManager.
    */
  @js.native
  trait Texture extends StObject {
    
    def add(name: String, sourceIndex: Double, x: Double, y: Double, width: Double, height: Double): Frame | Null = js.native
    /**
      * Adds a new Frame to this Texture.
      * 
      * A Frame is a rectangular region of a TextureSource with a unique index or string-based key.
      * 
      * The name given must be unique within this Texture. If it already exists, this method will return `null`.
      * @param name The name of this Frame. The name is unique within the Texture.
      * @param sourceIndex The index of the TextureSource that this Frame is a part of.
      * @param x The x coordinate of the top-left of this Frame.
      * @param y The y coordinate of the top-left of this Frame.
      * @param width The width of this Frame.
      * @param height The height of this Frame.
      */
    def add(name: Double, sourceIndex: Double, x: Double, y: Double, width: Double, height: Double): Frame | Null = js.native
    
    /**
      * Any additional data that was set in the source JSON (if any),
      * or any extra data you'd like to store relating to this texture
      */
    var customData: js.Object = js.native
    
    /**
      * An array of TextureSource data instances.
      * Used to store additional data images, such as normal maps or specular maps.
      */
    var dataSource: js.Array[Any] = js.native
    
    /**
      * Destroys this Texture and releases references to its sources and frames.
      */
    def destroy(): Unit = js.native
    
    /**
      * The name of the first frame of the Texture.
      */
    var firstFrame: String = js.native
    
    /**
      * The total number of Frames in this Texture, including the `__BASE` frame.
      * 
      * A Texture will always contain at least 1 frame because every Texture contains a `__BASE` frame by default,
      * in addition to any extra frames that have been added to it, such as when parsing a Sprite Sheet or Texture Atlas.
      */
    var frameTotal: Double = js.native
    
    /**
      * A key-value object pair associating the unique Frame keys with the Frames objects.
      */
    var frames: js.Object = js.native
    
    /**
      * Gets a Frame from this Texture based on either the key or the index of the Frame.
      * 
      * In a Texture Atlas Frames are typically referenced by a key.
      * In a Sprite Sheet Frames are referenced by an index.
      * Passing no value for the name returns the base texture.
      * @param name The string-based name, or integer based index, of the Frame to get from this Texture.
      */
    def get(): Frame = js.native
    def get(name: String): Frame = js.native
    def get(name: Double): Frame = js.native
    
    /**
      * Given a Frame name, return the data source image it uses to render with.
      * You can use this to get the normal map for an image for example.
      * 
      * This will return the actual DOM Image.
      * @param name The string-based name, or integer based index, of the Frame to get from this Texture.
      */
    def getDataSourceImage(): HTMLImageElement | HTMLCanvasElement = js.native
    def getDataSourceImage(name: String): HTMLImageElement | HTMLCanvasElement = js.native
    def getDataSourceImage(name: Double): HTMLImageElement | HTMLCanvasElement = js.native
    
    /**
      * Returns an array with all of the names of the Frames in this Texture.
      * 
      * Useful if you want to randomly assign a Frame to a Game Object, as you can
      * pick a random element from the returned array.
      * @param includeBase Include the `__BASE` Frame in the output array? Default false.
      */
    def getFrameNames(): js.Array[String] = js.native
    def getFrameNames(includeBase: Boolean): js.Array[String] = js.native
    
    /**
      * Returns an array of all the Frames in the given TextureSource.
      * @param sourceIndex The index of the TextureSource to get the Frames from.
      * @param includeBase Include the `__BASE` Frame in the output array? Default false.
      */
    def getFramesFromTextureSource(sourceIndex: Double): js.Array[Frame] = js.native
    def getFramesFromTextureSource(sourceIndex: Double, includeBase: Boolean): js.Array[Frame] = js.native
    
    /**
      * Given a Frame name, return the source image it uses to render with.
      * 
      * This will return the actual DOM Image or Canvas element.
      * @param name The string-based name, or integer based index, of the Frame to get from this Texture.
      */
    def getSourceImage(): HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
    def getSourceImage(name: String): HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
    def getSourceImage(name: Double): HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
    
    /**
      * Takes the given TextureSource and returns the index of it within this Texture.
      * If it's not in this Texture, it returns -1.
      * Unless this Texture has multiple TextureSources, such as with a multi-atlas, this
      * method will always return zero or -1.
      * @param source The TextureSource to check.
      */
    def getTextureSourceIndex(source: TextureSource): Double = js.native
    
    /**
      * Checks to see if a Frame matching the given key exists within this Texture.
      * @param name The key of the Frame to check for.
      */
    def has(name: String): Boolean = js.native
    
    /**
      * The unique string-based key of this Texture.
      */
    var key: String = js.native
    
    /**
      * A reference to the Texture Manager this Texture belongs to.
      */
    var manager: TextureManager = js.native
    
    /**
      * Removes the given Frame from this Texture. The Frame is destroyed immediately.
      * 
      * Any Game Objects using this Frame should stop using it _before_ you remove it,
      * as it does not happen automatically.
      * @param name The key of the Frame to remove.
      */
    def remove(name: String): Boolean = js.native
    
    def setDataSource(data: js.Array[HTMLCanvasElement | HTMLImageElement]): Unit = js.native
    def setDataSource(data: HTMLCanvasElement): Unit = js.native
    /**
      * Adds a data source image to this Texture.
      * 
      * An example of a data source image would be a normal map, where all of the Frames for this Texture
      * equally apply to the normal map.
      * @param data The source image.
      */
    def setDataSource(data: HTMLImageElement): Unit = js.native
    
    /**
      * Sets the Filter Mode for this Texture.
      * 
      * The mode can be either Linear, the default, or Nearest.
      * 
      * For pixel-art you should use Nearest.
      * 
      * The mode applies to the entire Texture, not just a specific Frame of it.
      * @param filterMode The Filter Mode.
      */
    def setFilter(filterMode: FilterMode): Unit = js.native
    
    /**
      * An array of TextureSource instances.
      * These are unique to this Texture and contain the actual Image (or Canvas) data.
      */
    var source: js.Array[TextureSource] = js.native
  }
  
  /**
    * When Phaser boots it will create an instance of this Texture Manager class.
    * 
    * It is a global manager that handles all textures in your game. You can access it from within
    * a Scene via the `this.textures` property.
    * 
    * Its role is as a manager for all textures that your game uses. It can create, update and remove
    * textures globally, as well as parse texture data from external files, such as sprite sheets
    * and texture atlases.
    * 
    * Sprites and other texture-based Game Objects get their texture data directly from this class.
    */
  @js.native
  trait TextureManager
    extends StObject
       with EventEmitter {
    
    def addAtlas(key: String, source: js.Array[HTMLImageElement], data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlas(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlas(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: HTMLCanvasElement
    ): Texture | Null = js.native
    def addAtlas(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: HTMLImageElement
    ): Texture | Null = js.native
    def addAtlas(key: String, source: js.Array[HTMLImageElement], data: js.Object): Texture | Null = js.native
    def addAtlas(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlas(key: String, source: js.Array[HTMLImageElement], data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlas(key: String, source: js.Array[HTMLImageElement], data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlas(key: String, source: Texture, data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlas(
      key: String,
      source: Texture,
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlas(key: String, source: Texture, data: js.Array[js.Object], dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlas(key: String, source: Texture, data: js.Array[js.Object], dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlas(key: String, source: Texture, data: js.Object): Texture | Null = js.native
    def addAtlas(
      key: String,
      source: Texture,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlas(key: String, source: Texture, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlas(key: String, source: Texture, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlas(key: String, source: HTMLImageElement, data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlas(
      key: String,
      source: HTMLImageElement,
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlas(key: String, source: HTMLImageElement, data: js.Array[js.Object], dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlas(key: String, source: HTMLImageElement, data: js.Array[js.Object], dataSource: HTMLImageElement): Texture | Null = js.native
    /**
      * Adds a Texture Atlas to this Texture Manager.
      * 
      * In Phaser terminology, a Texture Atlas is a combination of an atlas image and a JSON data file,
      * such as those exported by applications like Texture Packer.
      * 
      * It can accept either JSON Array or JSON Hash formats, as exported by Texture Packer and similar software.
      * 
      * As of Phaser 3.60 you can use this method to add a atlas data to an existing Phaser Texture.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element/s, or a Phaser Texture.
      * @param data The Texture Atlas data/s.
      * @param dataSource An optional data Image element.
      */
    def addAtlas(key: String, source: HTMLImageElement, data: js.Object): Texture | Null = js.native
    def addAtlas(
      key: String,
      source: HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlas(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlas(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    
    def addAtlasJSONArray(key: String, source: js.Array[HTMLImageElement], data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: HTMLCanvasElement
    ): Texture | Null = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: HTMLImageElement
    ): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: js.Array[HTMLImageElement], data: js.Object): Texture | Null = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: js.Array[HTMLImageElement], data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: js.Array[HTMLImageElement], data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: Texture, data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlasJSONArray(
      key: String,
      source: Texture,
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: Texture, data: js.Array[js.Object], dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: Texture, data: js.Array[js.Object], dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: Texture, data: js.Object): Texture | Null = js.native
    def addAtlasJSONArray(
      key: String,
      source: Texture,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: Texture, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: Texture, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlasJSONArray(
      key: String,
      source: HTMLImageElement,
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Array[js.Object], dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Array[js.Object], dataSource: HTMLImageElement): Texture | Null = js.native
    /**
      * Adds a Texture Atlas to this Texture Manager.
      * 
      * In Phaser terminology, a Texture Atlas is a combination of an atlas image and a JSON data file,
      * such as those exported by applications like Texture Packer.
      * 
      * The frame data of the atlas must be stored in an Array within the JSON.
      * 
      * This is known as a JSON Array in software such as Texture Packer.
      * 
      * As of Phaser 3.60 you can use this method to add a atlas data to an existing Phaser Texture.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element/s, or a Phaser Texture.
      * @param data The Texture Atlas data/s.
      * @param dataSource An optional data Image element.
      */
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Object): Texture | Null = js.native
    def addAtlasJSONArray(
      key: String,
      source: HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    
    def addAtlasJSONHash(key: String, source: js.Array[HTMLImageElement], data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlasJSONHash(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONHash(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: HTMLCanvasElement
    ): Texture | Null = js.native
    def addAtlasJSONHash(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: HTMLImageElement
    ): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: js.Array[HTMLImageElement], data: js.Object): Texture | Null = js.native
    def addAtlasJSONHash(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: js.Array[HTMLImageElement], data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: js.Array[HTMLImageElement], data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: Texture, data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlasJSONHash(
      key: String,
      source: Texture,
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: Texture, data: js.Array[js.Object], dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: Texture, data: js.Array[js.Object], dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: Texture, data: js.Object): Texture | Null = js.native
    def addAtlasJSONHash(
      key: String,
      source: Texture,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: Texture, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: Texture, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: HTMLImageElement, data: js.Array[js.Object]): Texture | Null = js.native
    def addAtlasJSONHash(
      key: String,
      source: HTMLImageElement,
      data: js.Array[js.Object],
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: HTMLImageElement, data: js.Array[js.Object], dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: HTMLImageElement, data: js.Array[js.Object], dataSource: HTMLImageElement): Texture | Null = js.native
    /**
      * Adds a Texture Atlas to this Texture Manager.
      * 
      * In Phaser terminology, a Texture Atlas is a combination of an atlas image and a JSON data file,
      * such as those exported by applications like Texture Packer.
      * 
      * The frame data of the atlas must be stored in an Object within the JSON.
      * 
      * This is known as a JSON Hash in software such as Texture Packer.
      * 
      * As of Phaser 3.60 you can use this method to add a atlas data to an existing Phaser Texture.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element/s, or a Phaser Texture.
      * @param data The Texture Atlas data/s.
      * @param dataSource An optional data Image element.
      */
    def addAtlasJSONHash(key: String, source: HTMLImageElement, data: js.Object): Texture | Null = js.native
    def addAtlasJSONHash(
      key: String,
      source: HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasJSONHash(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    
    def addAtlasXML(key: String, source: Texture, data: js.Object): Texture | Null = js.native
    def addAtlasXML(
      key: String,
      source: Texture,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasXML(key: String, source: Texture, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasXML(key: String, source: Texture, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    /**
      * Adds a Texture Atlas to this Texture Manager.
      * 
      * In Phaser terminology, a Texture Atlas is a combination of an atlas image and a data file,
      * such as those exported by applications like Texture Packer.
      * 
      * The frame data of the atlas must be stored in an XML file.
      * 
      * As of Phaser 3.60 you can use this method to add a atlas data to an existing Phaser Texture.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element, or a Phaser Texture.
      * @param data The Texture Atlas XML data.
      * @param dataSource An optional data Image element.
      */
    def addAtlasXML(key: String, source: HTMLImageElement, data: js.Object): Texture | Null = js.native
    def addAtlasXML(
      key: String,
      source: HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addAtlasXML(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addAtlasXML(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    
    /**
      * Adds a new Texture to the Texture Manager created from the given Base64 encoded data.
      * 
      * It works by creating an `Image` DOM object, then setting the `src` attribute to
      * the given base64 encoded data. As a result, the process is asynchronous by its nature,
      * so be sure to listen for the events this method dispatches before using the texture.
      * @param key The unique string-based key of the Texture.
      * @param data The Base64 encoded data.
      */
    def addBase64(key: String, data: Any): this.type = js.native
    
    /**
      * Creates a new Canvas Texture object from an existing Canvas element
      * and adds it to this Texture Manager, unless `skipCache` is true.
      * @param key The unique string-based key of the Texture.
      * @param source The Canvas element to form the base of the new Texture.
      * @param skipCache Skip adding this Texture into the Cache? Default false.
      */
    def addCanvas(key: String, source: HTMLCanvasElement): CanvasTexture | Null = js.native
    def addCanvas(key: String, source: HTMLCanvasElement, skipCache: Boolean): CanvasTexture | Null = js.native
    
    /**
      * Adds a Compressed Texture to this Texture Manager.
      * 
      * The texture should typically have been loaded via the `CompressedTextureFile` loader,
      * in order to prepare the correct data object this method requires.
      * 
      * You can optionally also pass atlas data to this method, in which case a texture atlas
      * will be generated from the given compressed texture, combined with the atlas data.
      * @param key The unique string-based key of the Texture.
      * @param textureData The Compressed Texture data object.
      * @param atlasData Optional Texture Atlas data.
      */
    def addCompressedTexture(key: String, textureData: CompressedTextureData): Texture | Null = js.native
    def addCompressedTexture(key: String, textureData: CompressedTextureData, atlasData: js.Object): Texture | Null = js.native
    
    /**
      * Creates a Dynamic Texture instance and adds itself to this Texture Manager.
      * 
      * A Dynamic Texture is a special texture that allows you to draw textures, frames and most kind of
      * Game Objects directly to it.
      * 
      * You can take many complex objects and draw them to this one texture, which can then be used as the
      * base texture for other Game Objects, such as Sprites. Should you then update this texture, all
      * Game Objects using it will instantly be updated as well, reflecting the changes immediately.
      * 
      * It's a powerful way to generate dynamic textures at run-time that are WebGL friendly and don't invoke
      * expensive GPU uploads on each change.
      * 
      * See the methods available on the `DynamicTexture` class for more details.
      * 
      * Optionally, you can also pass a Dynamic Texture instance to this method to have
      * it added to the Texture Manager.
      * @param key The string-based key of this Texture. Must be unique within the Texture Manager. Or, a DynamicTexture instance.
      * @param width The width of this Dynamic Texture in pixels. Defaults to 256 x 256. Ignored if an instance is passed as the key. Default 256.
      * @param height The height of this Dynamic Texture in pixels. Defaults to 256 x 256. Ignored if an instance is passed as the key. Default 256.
      */
    def addDynamicTexture(key: String): DynamicTexture | Null = js.native
    def addDynamicTexture(key: String, width: Double): DynamicTexture | Null = js.native
    def addDynamicTexture(key: String, width: Double, height: Double): DynamicTexture | Null = js.native
    def addDynamicTexture(key: String, width: Unit, height: Double): DynamicTexture | Null = js.native
    def addDynamicTexture(key: DynamicTexture): DynamicTexture | Null = js.native
    def addDynamicTexture(key: DynamicTexture, width: Double): DynamicTexture | Null = js.native
    def addDynamicTexture(key: DynamicTexture, width: Double, height: Double): DynamicTexture | Null = js.native
    def addDynamicTexture(key: DynamicTexture, width: Unit, height: Double): DynamicTexture | Null = js.native
    
    /**
      * Takes a WebGL Texture and creates a Phaser Texture from it, which is added to the Texture Manager using the given key.
      * 
      * This allows you to then use the Texture as a normal texture for texture based Game Objects like Sprites.
      * 
      * If the `width` and `height` arguments are omitted, but the WebGL Texture was created by Phaser's WebGL Renderer
      * and has `glTexture.width` and `glTexture.height` properties, these values will be used instead.
      * 
      * This is a WebGL only feature.
      * @param key The unique string-based key of the Texture.
      * @param glTexture The source Render Texture.
      * @param width The new width of the Texture. Read from `glTexture.width` if omitted.
      * @param height The new height of the Texture. Read from `glTexture.height` if omitted.
      */
    def addGLTexture(key: String, glTexture: WebGLTexture): Texture | Null = js.native
    def addGLTexture(key: String, glTexture: WebGLTexture, width: Double): Texture | Null = js.native
    def addGLTexture(key: String, glTexture: WebGLTexture, width: Double, height: Double): Texture | Null = js.native
    def addGLTexture(key: String, glTexture: WebGLTexture, width: Unit, height: Double): Texture | Null = js.native
    
    /**
      * Adds a new Texture to the Texture Manager created from the given Image element.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param dataSource An optional data Image element.
      */
    def addImage(key: String, source: HTMLImageElement): Texture | Null = js.native
    def addImage(key: String, source: HTMLImageElement, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addImage(key: String, source: HTMLImageElement, dataSource: HTMLImageElement): Texture | Null = js.native
    
    /**
      * Adds a Render Texture to the Texture Manager using the given key.
      * This allows you to then use the Render Texture as a normal texture for texture based Game Objects like Sprites.
      * @param key The unique string-based key of the Texture.
      * @param renderTexture The source Render Texture.
      */
    def addRenderTexture(key: String, renderTexture: RenderTexture): Texture | Null = js.native
    
    def addSpriteSheet(key: String, source: Texture, config: SpriteSheetConfig): Texture | Null = js.native
    def addSpriteSheet(key: String, source: Texture, config: SpriteSheetConfig, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addSpriteSheet(key: String, source: Texture, config: SpriteSheetConfig, dataSource: HTMLImageElement): Texture | Null = js.native
    /**
      * Adds a Sprite Sheet to this Texture Manager.
      * 
      * In Phaser terminology a Sprite Sheet is a texture containing different frames, but each frame is the exact
      * same size and cannot be trimmed or rotated. This is different to a Texture Atlas, created by tools such as
      * Texture Packer, and more akin with the fixed-frame exports you get from apps like Aseprite or old arcade
      * games.
      * 
      * As of Phaser 3.60 you can use this method to add a sprite sheet to an existing Phaser Texture.
      * @param key The unique string-based key of the Texture. Give an empty string if you provide a Phaser Texture as the 2nd argument.
      * @param source The source Image element, or a Phaser Texture.
      * @param config The configuration object for this Sprite Sheet.
      * @param dataSource An optional data Image element.
      */
    def addSpriteSheet(key: String, source: HTMLImageElement, config: SpriteSheetConfig): Texture | Null = js.native
    def addSpriteSheet(key: String, source: HTMLImageElement, config: SpriteSheetConfig, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addSpriteSheet(key: String, source: HTMLImageElement, config: SpriteSheetConfig, dataSource: HTMLImageElement): Texture | Null = js.native
    
    /**
      * Adds a Sprite Sheet to this Texture Manager, where the Sprite Sheet exists as a Frame within a Texture Atlas.
      * 
      * In Phaser terminology a Sprite Sheet is a texture containing different frames, but each frame is the exact
      * same size and cannot be trimmed or rotated.
      * @param key The unique string-based key of the Texture.
      * @param config The configuration object for this Sprite Sheet.
      */
    def addSpriteSheetFromAtlas(key: String, config: SpriteSheetFromAtlasConfig): Texture | Null = js.native
    
    /**
      * Adds a Unity Texture Atlas to this Texture Manager.
      * 
      * In Phaser terminology, a Texture Atlas is a combination of an atlas image and a data file,
      * such as those exported by applications like Texture Packer or Unity.
      * 
      * The frame data of the atlas must be stored in a Unity YAML file.
      * 
      * As of Phaser 3.60 you can use this method to add a atlas data to an existing Phaser Texture.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param data The Texture Atlas data.
      * @param dataSource An optional data Image element.
      */
    def addUnityAtlas(key: String, source: HTMLImageElement, data: js.Object): Texture | Null = js.native
    def addUnityAtlas(
      key: String,
      source: HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[HTMLCanvasElement | HTMLImageElement]
    ): Texture | Null = js.native
    def addUnityAtlas(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLCanvasElement): Texture | Null = js.native
    def addUnityAtlas(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLImageElement): Texture | Null = js.native
    
    /**
      * Checks the given texture key and throws a console.warn if the key is already in use, then returns false.
      * 
      * If you wish to avoid the console.warn then use `TextureManager.exists` instead.
      * @param key The texture key to check.
      */
    def checkKey(key: String): Boolean = js.native
    
    /**
      * Takes a Texture key and Frame name and returns a clone of that Frame if found.
      * @param key The unique string-based key of the Texture.
      * @param frame The string or index of the Frame to be cloned.
      */
    def cloneFrame(key: String, frame: String): Frame = js.native
    def cloneFrame(key: String, frame: Double): Frame = js.native
    
    /**
      * Creates a new Texture using the given source and dimensions.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param width The width of the Texture.
      * @param height The height of the Texture.
      */
    def create(key: String, source: HTMLImageElement, width: Double, height: Double): Texture | Null = js.native
    
    /**
      * Creates a new Texture using a blank Canvas element of the size given.
      * 
      * Canvas elements are automatically pooled and calling this method will
      * extract a free canvas from the CanvasPool, or create one if none are available.
      * @param key The unique string-based key of the Texture.
      * @param width The width of the Canvas element. Default 256.
      * @param height The height of the Canvas element. Default 256.
      */
    def createCanvas(key: String): CanvasTexture | Null = js.native
    def createCanvas(key: String, width: Double): CanvasTexture | Null = js.native
    def createCanvas(key: String, width: Double, height: Double): CanvasTexture | Null = js.native
    def createCanvas(key: String, width: Unit, height: Double): CanvasTexture | Null = js.native
    
    /**
      * Passes all Textures to the given callback.
      * @param callback The callback function to be sent the Textures.
      * @param scope The value to use as `this` when executing the callback.
      * @param args Additional arguments that will be passed to the callback, after the child.
      */
    def each(callback: EachTextureCallback, scope: js.Object, args: Any*): Unit = js.native
    
    /**
      * Checks the given key to see if a Texture using it exists within this Texture Manager.
      * @param key The unique string-based key of the Texture.
      */
    def exists(key: String): Boolean = js.native
    
    /**
      * The Game that the Texture Manager belongs to.
      * 
      * A game will only ever have one instance of a Texture Manager.
      */
    var game: Game = js.native
    
    /**
      * Creates a new Texture using the given config values.
      * 
      * Generated textures consist of a Canvas element to which the texture data is drawn.
      * 
      * Generates a texture based on the given Create configuration object.
      * 
      * The texture is drawn using a fixed-size indexed palette of 16 colors, where the hex value in the
      * data cells map to a single color. For example, if the texture config looked like this:
      * 
      * ```javascript
      * var star = [
      *   '.....828.....',
      *   '....72227....',
      *   '....82228....',
      *   '...7222227...',
      *   '2222222222222',
      *   '8222222222228',
      *   '.72222222227.',
      *   '..787777787..',
      *   '..877777778..',
      *   '.78778887787.',
      *   '.27887.78872.',
      *   '.787.....787.'
      * ];
      * 
      * this.textures.generate('star', { data: star, pixelWidth: 4 });
      * ```
      * 
      * Then it would generate a texture that is 52 x 48 pixels in size, because each cell of the data array
      * represents 1 pixel multiplied by the `pixelWidth` value. The cell values, such as `8`, maps to color
      * number 8 in the palette. If a cell contains a period character `.` then it is transparent.
      * 
      * The default palette is Arne16, but you can specify your own using the `palette` property.
      * @param key The unique string-based key of the Texture.
      * @param config The configuration object needed to generate the texture.
      */
    def generate(key: String, config: GenerateTextureConfig): Texture | Null = js.native
    
    /**
      * Returns a Texture from the Texture Manager that matches the given key.
      * 
      * If the key is `undefined` it will return the `__DEFAULT` Texture.
      * 
      * If the key is an instance of a Texture, it will return the instance.
      * 
      * If the key is an instance of a Frame, it will return the frames parent Texture instance.
      * 
      * Finally, if the key is given, but not found, and not a Texture or Frame instance, it will return the `__MISSING` Texture.
      * @param key The unique string-based key of the Texture, or a Texture, or Frame instance.
      */
    def get(key: String): Texture = js.native
    def get(key: Frame): Texture = js.native
    def get(key: Texture): Texture = js.native
    
    /**
      * Gets an existing texture frame and converts it into a base64 encoded image and returns the base64 data.
      * 
      * You can also provide the image type and encoder options.
      * 
      * This will only work with bitmap based texture frames, such as those created from Texture Atlases.
      * It will not work with GL Texture objects, such as Shaders, or Render Textures. For those please
      * see the WebGL Snapshot function instead.
      * @param key The unique string-based key of the Texture.
      * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
      * @param type A DOMString indicating the image format. The default format type is image/png. Default 'image/png'.
      * @param encoderOptions A Number between 0 and 1 indicating the image quality to use for image formats that use lossy compression such as image/jpeg and image/webp. If this argument is anything else, the default value for image quality is used. The default value is 0.92. Other arguments are ignored. Default 0.92.
      */
    def getBase64(key: String): String = js.native
    def getBase64(key: String, frame: String): String = js.native
    def getBase64(key: String, frame: String, `type`: String): String = js.native
    def getBase64(key: String, frame: String, `type`: String, encoderOptions: Double): String = js.native
    def getBase64(key: String, frame: String, `type`: Unit, encoderOptions: Double): String = js.native
    def getBase64(key: String, frame: Double): String = js.native
    def getBase64(key: String, frame: Double, `type`: String): String = js.native
    def getBase64(key: String, frame: Double, `type`: String, encoderOptions: Double): String = js.native
    def getBase64(key: String, frame: Double, `type`: Unit, encoderOptions: Double): String = js.native
    def getBase64(key: String, frame: Unit, `type`: String): String = js.native
    def getBase64(key: String, frame: Unit, `type`: String, encoderOptions: Double): String = js.native
    def getBase64(key: String, frame: Unit, `type`: Unit, encoderOptions: Double): String = js.native
    
    /**
      * Takes a Texture key and Frame name and returns a reference to that Frame, if found.
      * @param key The unique string-based key of the Texture.
      * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
      */
    def getFrame(key: String): Frame = js.native
    def getFrame(key: String, frame: String): Frame = js.native
    def getFrame(key: String, frame: Double): Frame = js.native
    
    /**
      * Given a Texture and an `x` and `y` coordinate this method will return a new
      * Color object that has been populated with the color and alpha values of the pixel
      * at that location in the Texture.
      * @param x The x coordinate of the pixel within the Texture.
      * @param y The y coordinate of the pixel within the Texture.
      * @param key The unique string-based key of the Texture.
      * @param frame The string or index of the Frame.
      */
    def getPixel(x: Double, y: Double, key: String): Color | Null = js.native
    def getPixel(x: Double, y: Double, key: String, frame: String): Color | Null = js.native
    def getPixel(x: Double, y: Double, key: String, frame: Double): Color | Null = js.native
    
    /**
      * Given a Texture and an `x` and `y` coordinate this method will return a value between 0 and 255
      * corresponding to the alpha value of the pixel at that location in the Texture. If the coordinate
      * is out of bounds it will return null.
      * @param x The x coordinate of the pixel within the Texture.
      * @param y The y coordinate of the pixel within the Texture.
      * @param key The unique string-based key of the Texture.
      * @param frame The string or index of the Frame.
      */
    def getPixelAlpha(x: Double, y: Double, key: String): Double = js.native
    def getPixelAlpha(x: Double, y: Double, key: String, frame: String): Double = js.native
    def getPixelAlpha(x: Double, y: Double, key: String, frame: Double): Double = js.native
    
    /**
      * Returns an array with all of the keys of all Textures in this Texture Manager.
      * The output array will exclude the `__DEFAULT`, `__MISSING`, and `__WHITE` keys.
      */
    def getTextureKeys(): js.Array[String] = js.native
    
    /**
      * This object contains all Textures that belong to this Texture Manager.
      * 
      * Textures are identified by string-based keys, which are used as the property
      * within this object. Therefore, you can access any texture directly from this
      * object without any iteration.
      * 
      * You should not typically modify this object directly, but instead use the
      * methods provided by the Texture Manager to add and remove entries from it.
      */
    var list: js.Object = js.native
    
    /**
      * The internal name of this manager.
      */
    val name: String = js.native
    
    /**
      * Parses the 'key' parameter and returns a Texture Frame instance.
      * 
      * It can accept the following formats:
      * 
      * 1) A string
      * 2) An array where the elements are: [ key, [frame] ]
      * 3) An object with the properties: { key, [frame] }
      * 4) A Texture instance - which returns the default frame from the Texture
      * 5) A Frame instance - returns itself
      * @param key The key to be parsed.
      */
    def parseFrame(key: String): Frame = js.native
    def parseFrame(key: js.Array[Any]): Frame = js.native
    def parseFrame(key: js.Object): Frame = js.native
    def parseFrame(key: Frame): Frame = js.native
    def parseFrame(key: Texture): Frame = js.native
    
    /**
      * Removes a Texture from the Texture Manager and destroys it. This will immediately
      * clear all references to it from the Texture Manager, and if it has one, destroy its
      * WebGLTexture. This will emit a `removetexture` event.
      * 
      * Note: If you have any Game Objects still using this texture they will start throwing
      * errors the next time they try to render. Make sure that removing the texture is the final
      * step when clearing down to avoid this.
      * @param key The key of the Texture to remove, or a reference to it.
      */
    def remove(key: String): TextureManager = js.native
    def remove(key: Texture): TextureManager = js.native
    
    /**
      * Removes a key from the Texture Manager but does not destroy the Texture that was using the key.
      * @param key The key to remove from the texture list.
      */
    def removeKey(key: String): TextureManager = js.native
    
    /**
      * Changes the key being used by a Texture to the new key provided.
      * 
      * The old key is removed, allowing it to be re-used.
      * 
      * Game Objects are linked to Textures by a reference to the Texture object, so
      * all existing references will be retained.
      * @param currentKey The current string-based key of the Texture you wish to rename.
      * @param newKey The new unique string-based key to use for the Texture.
      */
    def renameTexture(currentKey: String, newKey: String): Boolean = js.native
    
    /**
      * Resets the internal Stamp object, ready for drawing and returns it.
      * @param alpha The alpha to use. Default 1.
      * @param tint WebGL only. The tint color to use. Default 0xffffff.
      */
    def resetStamp(): Image = js.native
    def resetStamp(alpha: Double): Image = js.native
    def resetStamp(alpha: Double, tint: Double): Image = js.native
    def resetStamp(alpha: Unit, tint: Double): Image = js.native
    
    /**
      * Sets the given Game Objects `texture` and `frame` properties so that it uses
      * the Texture and Frame specified in the `key` and `frame` arguments to this method.
      * @param gameObject The Game Object the texture would be set on.
      * @param key The unique string-based key of the Texture.
      * @param frame The string or index of the Frame.
      */
    def setTexture(gameObject: GameObject, key: String): GameObject = js.native
    def setTexture(gameObject: GameObject, key: String, frame: String): GameObject = js.native
    def setTexture(gameObject: GameObject, key: String, frame: Double): GameObject = js.native
    
    /**
      * If this flag is `true` then the Texture Manager will never emit any
      * warnings to the console log that report missing textures.
      */
    var silentWarnings: Boolean = js.native
    
    /**
      * An Image Game Object that belongs to this Texture Manager.
      * 
      * Used as a drawing stamp within Dynamic Textures.
      * 
      * This is not part of the display list and doesn't render.
      */
    val stamp: Image = js.native
    
    /**
      * The crop Rectangle as used by the Stamp when it needs to crop itself.
      */
    var stampCrop: Rectangle = js.native
  }
  
  /**
    * A Texture Source is the encapsulation of the actual source data for a Texture.
    * 
    * This is typically an Image Element, loaded from the file system or network, a Canvas Element or a Video Element.
    * 
    * A Texture can contain multiple Texture Sources, which only happens when a multi-atlas is loaded.
    */
  @js.native
  trait TextureSource extends StObject {
    
    /**
      * Holds the compressed textured algorithm, or `null` if it's not a compressed texture.
      * 
      * Prior to Phaser 3.60 this value always held `null`.
      */
    var compressionAlgorithm: Double = js.native
    
    /**
      * Destroys this Texture Source and nulls the references.
      */
    def destroy(): Unit = js.native
    
    /**
      * Sets the `UNPACK_FLIP_Y_WEBGL` flag the WebGL Texture uses during upload.
      */
    var flipY: Boolean = js.native
    
    /**
      * The WebGL Texture of the source image. If this TextureSource is driven from a WebGLTexture
      * already, then this is a reference to that WebGLTexture.
      */
    var glTexture: WebGLTexture | Null = js.native
    
    /**
      * The height of the source image. If not specified in the constructor it will check
      * the `naturalHeight` and then `height` properties of the source image.
      */
    var height: Double = js.native
    
    /**
      * The image data.
      * 
      * This is either an Image element, Canvas element or a Video Element.
      */
    var image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
    
    /**
      * Creates a WebGL Texture, if required, and sets the Texture filter mode.
      * @param game A reference to the Phaser Game instance.
      */
    def init(game: Game): Unit = js.native
    
    /**
      * Is the source image a Canvas Element?
      */
    var isCanvas: Boolean = js.native
    
    /**
      * Is the source image a WebGLTexture?
      */
    var isGLTexture: Boolean = js.native
    
    /**
      * Are the source image dimensions a power of two?
      */
    var isPowerOf2: Boolean = js.native
    
    /**
      * Is the source image a Render Texture?
      */
    var isRenderTexture: Boolean = js.native
    
    /**
      * Is the source image a Video Element?
      */
    var isVideo: Boolean = js.native
    
    /**
      * A reference to the Canvas or WebGL Renderer.
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
      * Sets the Filter Mode for this Texture.
      * 
      * The mode can be either Linear, the default, or Nearest.
      * 
      * For pixel-art you should use Nearest.
      * @param filterMode The Filter Mode.
      */
    def setFilter(filterMode: FilterMode): Unit = js.native
    
    /**
      * Sets the `UNPACK_FLIP_Y_WEBGL` flag for the WebGL Texture during texture upload.
      * @param value Should the WebGL Texture be flipped on the Y axis on texture upload or not? Default true.
      */
    def setFlipY(): Unit = js.native
    def setFlipY(value: Boolean): Unit = js.native
    
    /**
      * The source of the image data.
      * 
      * This is either an Image Element, a Canvas Element, a Video Element, a RenderTexture or a WebGLTexture.
      * 
      * In Phaser 3.60 and above it can also be a Compressed Texture data object.
      */
    var source: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | RenderTexture | WebGLTexture | CompressedTextureData | DynamicTexture = js.native
    
    /**
      * The Texture this TextureSource instance belongs to.
      */
    var texture: Texture = js.native
    
    /**
      * If this TextureSource is backed by a Canvas and is running under WebGL,
      * it updates the WebGLTexture using the canvas data.
      */
    def update(): Unit = js.native
    
    /**
      * The width of the source image. If not specified in the constructor it will check
      * the `naturalWidth` and then `width` properties of the source image.
      */
    var width: Double = js.native
  }
}
