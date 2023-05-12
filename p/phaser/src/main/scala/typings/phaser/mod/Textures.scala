package typings.phaser.mod

import typings.phaser.Phaser.GameObjects.RenderTexture
import typings.phaser.Phaser.Types.Textures.CompressedTextureData
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Textures {
  
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
  @JSImport("phaser", "Textures.CanvasTexture")
  @js.native
  open class CanvasTexture protected ()
    extends StObject
       with typings.phaser.Phaser.Textures.CanvasTexture {
    /**
      * 
      * @param manager A reference to the Texture Manager this Texture belongs to.
      * @param key The unique string-based key of this Texture.
      * @param source The canvas element that is used as the base of this texture.
      * @param width The width of the canvas.
      * @param height The height of the canvas.
      */
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement,
      width: Double,
      height: Double
    ) = this()
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
  @JSImport("phaser", "Textures.DynamicTexture")
  @js.native
  open class DynamicTexture protected ()
    extends StObject
       with typings.phaser.Phaser.Textures.DynamicTexture {
    /**
      * 
      * @param manager A reference to the Texture Manager this Texture belongs to.
      * @param key The unique string-based key of this Texture.
      * @param width The width of this Dymamic Texture in pixels. Defaults to 256 x 256. Default 256.
      * @param height The height of this Dymamic Texture in pixels. Defaults to 256 x 256. Default 256.
      */
    def this(manager: typings.phaser.Phaser.Textures.TextureManager, key: String) = this()
    def this(manager: typings.phaser.Phaser.Textures.TextureManager, key: String, width: Double) = this()
    def this(manager: typings.phaser.Phaser.Textures.TextureManager, key: String, width: Double, height: Double) = this()
    def this(manager: typings.phaser.Phaser.Textures.TextureManager, key: String, width: Unit, height: Double) = this()
  }
  
  object Events {
    
    /**
      * The Texture Add Event.
      * 
      * This event is dispatched by the Texture Manager when a texture is added to it.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('addtexture', listener)`.
      */
    @JSImport("phaser", "Textures.Events.ADD")
    @js.native
    val ADD: String = js.native
    
    /**
      * The Texture Add Key Event.
      * 
      * This event is dispatched by the Texture Manager when a texture with the given key is added to it.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('addtexture-key', listener)`.
      */
    @JSImport("phaser", "Textures.Events.ADD_KEY")
    @js.native
    val ADD_KEY: String = js.native
    
    /**
      * The Texture Load Error Event.
      * 
      * This event is dispatched by the Texture Manager when a texture it requested to load failed.
      * This only happens when base64 encoded textures fail. All other texture types are loaded via the Loader Plugin.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('onerror', listener)`.
      */
    @JSImport("phaser", "Textures.Events.ERROR")
    @js.native
    val ERROR: String = js.native
    
    /**
      * The Texture Load Event.
      * 
      * This event is dispatched by the Texture Manager when a texture has finished loading on it.
      * This only happens for base64 encoded textures. All other texture types are loaded via the Loader Plugin.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('onload', listener)`.
      * 
      * This event is dispatched after the [ADD]{@linkcode Phaser.Textures.Events#event:ADD} event.
      */
    @JSImport("phaser", "Textures.Events.LOAD")
    @js.native
    val LOAD: String = js.native
    
    /**
      * This internal event signifies that the Texture Manager is now ready and the Game can continue booting.
      * 
      * When a Phaser Game instance is booting for the first time, the Texture Manager has to wait on a couple of non-blocking
      * async events before it's fully ready to carry on. When those complete the Texture Manager emits this event via the Game
      * instance, which tells the Game to carry on booting.
      */
    @JSImport("phaser", "Textures.Events.READY")
    @js.native
    val READY: String = js.native
    
    /**
      * The Texture Remove Event.
      * 
      * This event is dispatched by the Texture Manager when a texture is removed from it.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('removetexture', listener)`.
      * 
      * If you have any Game Objects still using the removed texture, they will start throwing
      * errors the next time they try to render. Be sure to clear all use of the texture in this event handler.
      */
    @JSImport("phaser", "Textures.Events.REMOVE")
    @js.native
    val REMOVE: String = js.native
    
    /**
      * The Texture Remove Key Event.
      * 
      * This event is dispatched by the Texture Manager when a texture with the given key is removed from it.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('removetexture-key', listener)`.
      * 
      * If you have any Game Objects still using the removed texture, they will start throwing
      * errors the next time they try to render. Be sure to clear all use of the texture in this event handler.
      */
    @JSImport("phaser", "Textures.Events.REMOVE_KEY")
    @js.native
    val REMOVE_KEY: String = js.native
  }
  
  /**
    * Filter Types.
    */
  @JSImport("phaser", "Textures.FilterMode")
  @js.native
  object FilterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.Phaser.Textures.FilterMode & Double] = js.native
    
    /* 0 */ val LINEAR: typings.phaser.Phaser.Textures.FilterMode.LINEAR & Double = js.native
    
    /* 1 */ val NEAREST: typings.phaser.Phaser.Textures.FilterMode.NEAREST & Double = js.native
  }
  
  /**
    * A Frame is a section of a Texture.
    */
  @JSImport("phaser", "Textures.Frame")
  @js.native
  open class Frame protected ()
    extends StObject
       with typings.phaser.Phaser.Textures.Frame {
    def this(
      texture: typings.phaser.Phaser.Textures.Texture,
      name: String,
      sourceIndex: Double,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
    /**
      * 
      * @param texture The Texture this Frame is a part of.
      * @param name The name of this Frame. The name is unique within the Texture.
      * @param sourceIndex The index of the TextureSource that this Frame is a part of.
      * @param x The x coordinate of the top-left of this Frame.
      * @param y The y coordinate of the top-left of this Frame.
      * @param width The width of this Frame.
      * @param height The height of this Frame.
      */
    def this(
      texture: typings.phaser.Phaser.Textures.Texture,
      name: Double,
      sourceIndex: Double,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
  }
  
  /**
    * Linear filter type.
    */
  @JSImport("phaser", "Textures.LINEAR")
  @js.native
  val LINEAR: Double = js.native
  
  /**
    * Nearest Neighbor filter type.
    */
  @JSImport("phaser", "Textures.NEAREST")
  @js.native
  val NEAREST: Double = js.native
  
  object Parsers {
    
    @JSImport("phaser", "Textures.Parsers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a KTX format Compressed Texture file and generates texture data suitable for WebGL from it.
      * @param data The data object created by the Compressed Texture File Loader.
      */
    inline def KTXParser(data: js.typedarray.ArrayBuffer): CompressedTextureData = ^.asInstanceOf[js.Dynamic].applyDynamic("KTXParser")(data.asInstanceOf[js.Any]).asInstanceOf[CompressedTextureData]
    
    /**
      * Parses a PVR format Compressed Texture file and generates texture data suitable for WebGL from it.
      * @param data The data object created by the Compressed Texture File Loader.
      */
    inline def PVRParser(data: js.typedarray.ArrayBuffer): CompressedTextureData = ^.asInstanceOf[js.Dynamic].applyDynamic("PVRParser")(data.asInstanceOf[js.Any]).asInstanceOf[CompressedTextureData]
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
  @JSImport("phaser", "Textures.Texture")
  @js.native
  open class Texture protected ()
    extends StObject
       with typings.phaser.Phaser.Textures.Texture {
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | HTMLImageElement]
    ) = this()
    def this(manager: typings.phaser.Phaser.Textures.TextureManager, key: String, source: HTMLCanvasElement) = this()
    /**
      * 
      * @param manager A reference to the Texture Manager this Texture belongs to.
      * @param key The unique string-based key of this Texture.
      * @param source An array of sources that are used to create the texture. Usually Images, but can also be a Canvas.
      * @param width The width of the Texture. This is optional and automatically derived from the source images.
      * @param height The height of the Texture. This is optional and automatically derived from the source images.
      */
    def this(manager: typings.phaser.Phaser.Textures.TextureManager, key: String, source: HTMLImageElement) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | HTMLImageElement],
      width: Double
    ) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement,
      width: Double
    ) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLImageElement,
      width: Double
    ) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | HTMLImageElement],
      width: Double,
      height: Double
    ) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | HTMLImageElement],
      width: Unit,
      height: Double
    ) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement,
      width: Double,
      height: Double
    ) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLCanvasElement,
      width: Unit,
      height: Double
    ) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLImageElement,
      width: Double,
      height: Double
    ) = this()
    def this(
      manager: typings.phaser.Phaser.Textures.TextureManager,
      key: String,
      source: HTMLImageElement,
      width: Unit,
      height: Double
    ) = this()
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
  @JSImport("phaser", "Textures.TextureManager")
  @js.native
  open class TextureManager protected ()
    extends StObject
       with typings.phaser.Phaser.Textures.TextureManager {
    /**
      * 
      * @param game The Phaser.Game instance this Texture Manager belongs to.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
  
  /**
    * A Texture Source is the encapsulation of the actual source data for a Texture.
    * 
    * This is typically an Image Element, loaded from the file system or network, a Canvas Element or a Video Element.
    * 
    * A Texture can contain multiple Texture Sources, which only happens when a multi-atlas is loaded.
    */
  @JSImport("phaser", "Textures.TextureSource")
  @js.native
  open class TextureSource protected ()
    extends StObject
       with typings.phaser.Phaser.Textures.TextureSource {
    /**
      * 
      * @param texture The Texture this TextureSource belongs to.
      * @param source The source image data.
      * @param width Optional width of the source image. If not given it's derived from the source itself.
      * @param height Optional height of the source image. If not given it's derived from the source itself.
      * @param flipY Sets the `UNPACK_FLIP_Y_WEBGL` flag the WebGL Texture uses during upload. Default false.
      */
    def this(
      texture: typings.phaser.Phaser.Textures.Texture,
      source: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | RenderTexture | WebGLTexture | CompressedTextureData | typings.phaser.Phaser.Textures.DynamicTexture,
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      flipY: js.UndefOr[Boolean]
    ) = this()
  }
}
