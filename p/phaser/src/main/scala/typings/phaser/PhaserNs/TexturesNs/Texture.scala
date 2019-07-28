package typings.phaser.PhaserNs.TexturesNs

import typings.phaser.PhaserNs.GameObjectsNs.RenderTexture
import typings.phaser.integer
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("Phaser.Textures.Texture")
@js.native
class Texture protected () extends js.Object {
  def this(manager: TextureManager, key: String, source: js.Array[HTMLCanvasElement | HTMLImageElement]) = this()
  def this(manager: TextureManager, key: String, source: HTMLCanvasElement) = this()
  /**
    * 
    * @param manager A reference to the Texture Manager this Texture belongs to.
    * @param key The unique string-based key of this Texture.
    * @param source An array of sources that are used to create the texture. Usually Images, but can also be a Canvas.
    * @param width The width of the Texture. This is optional and automatically derived from the source images.
    * @param height The height of the Texture. This is optional and automatically derived from the source images.
    */
  def this(manager: TextureManager, key: String, source: HTMLImageElement) = this()
  def this(
    manager: TextureManager,
    key: String,
    source: js.Array[HTMLCanvasElement | HTMLImageElement],
    width: Double
  ) = this()
  def this(manager: TextureManager, key: String, source: HTMLCanvasElement, width: Double) = this()
  def this(manager: TextureManager, key: String, source: HTMLImageElement, width: Double) = this()
  def this(
    manager: TextureManager,
    key: String,
    source: js.Array[HTMLCanvasElement | HTMLImageElement],
    width: Double,
    height: Double
  ) = this()
  def this(manager: TextureManager, key: String, source: HTMLCanvasElement, width: Double, height: Double) = this()
  def this(manager: TextureManager, key: String, source: HTMLImageElement, width: Double, height: Double) = this()
  /**
    * Any additional data that was set in the source JSON (if any),
    * or any extra data you'd like to store relating to this texture
    */
  var customData: js.Object = js.native
  /**
    * An array of TextureSource data instances.
    * Used to store additional data images, such as normal maps or specular maps.
    */
  var dataSource: js.Array[_] = js.native
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
  var frameTotal: integer = js.native
  /**
    * A key-value object pair associating the unique Frame keys with the Frames objects.
    */
  var frames: js.Object = js.native
  /**
    * The unique string-based key of this Texture.
    */
  var key: String = js.native
  /**
    * A reference to the Texture Manager this Texture belongs to.
    */
  var manager: TextureManager = js.native
  /**
    * An array of TextureSource instances.
    * These are unique to this Texture and contain the actual Image (or Canvas) data.
    */
  var source: js.Array[TextureSource] = js.native
  def add(name: String, sourceIndex: integer, x: Double, y: Double, width: Double, height: Double): Frame = js.native
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
  def add(name: integer, sourceIndex: integer, x: Double, y: Double, width: Double, height: Double): Frame = js.native
  /**
    * Destroys this Texture and releases references to its sources and frames.
    */
  def destroy(): Unit = js.native
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
  def get(name: integer): Frame = js.native
  /**
    * Given a Frame name, return the data source image it uses to render with.
    * You can use this to get the normal map for an image for example.
    * 
    * This will return the actual DOM Image.
    * @param name The string-based name, or integer based index, of the Frame to get from this Texture.
    */
  def getDataSourceImage(): HTMLImageElement | HTMLCanvasElement = js.native
  def getDataSourceImage(name: String): HTMLImageElement | HTMLCanvasElement = js.native
  def getDataSourceImage(name: integer): HTMLImageElement | HTMLCanvasElement = js.native
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
  def getFramesFromTextureSource(sourceIndex: integer): js.Array[Frame] = js.native
  def getFramesFromTextureSource(sourceIndex: integer, includeBase: Boolean): js.Array[Frame] = js.native
  /**
    * Given a Frame name, return the source image it uses to render with.
    * 
    * This will return the actual DOM Image or Canvas element.
    * @param name The string-based name, or integer based index, of the Frame to get from this Texture.
    */
  def getSourceImage(): HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
  def getSourceImage(name: String): HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
  def getSourceImage(name: integer): HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
  /**
    * Takes the given TextureSource and returns the index of it within this Texture.
    * If it's not in this Texture, it returns -1.
    * Unless this Texture has multiple TextureSources, such as with a multi-atlas, this
    * method will always return zero or -1.
    * @param source The TextureSource to check.
    */
  def getTextureSourceIndex(source: TextureSource): integer = js.native
  /**
    * Checks to see if a Frame matching the given key exists within this Texture.
    * @param name The key of the Frame to check for.
    */
  def has(name: String): Boolean = js.native
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
}

