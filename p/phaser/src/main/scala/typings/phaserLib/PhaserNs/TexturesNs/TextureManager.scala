package typings
package phaserLib.PhaserNs.TexturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Textures are managed by the global TextureManager. This is a singleton class that is
  * responsible for creating and delivering Textures and their corresponding Frames to Game Objects.
  * 
  * Sprites and other Game Objects get the texture data they need from the TextureManager.
  * 
  * Access it via `scene.textures`.
  */
@JSGlobal("Phaser.Textures.TextureManager")
@js.native
class TextureManager protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param game The Phaser.Game instance this Texture Manager belongs to.
    */
  def this(game: phaserLib.PhaserNs.Game) = this()
  /**
    * The Game that this TextureManager belongs to.
    */
  var game: phaserLib.PhaserNs.Game = js.native
  /**
    * An object that has all of textures that Texture Manager creates.
    * Textures are assigned to keys so we can access to any texture that this object has directly by key value without iteration.
    */
  var list: js.Object = js.native
  /**
    * The name of this manager.
    */
  var name: java.lang.String = js.native
  /**
    * Adds a new Texture Atlas to this Texture Manager.
    * It can accept either JSON Array or JSON Hash formats, as exported by Texture Packer and similar software.
    * @param key The unique string-based key of the Texture.
    * @param source The source Image element.
    * @param data The Texture Atlas data.
    * @param dataSource An optional data Image element.
    */
  def addAtlas(key: java.lang.String, source: stdLib.HTMLImageElement, data: js.Object): Texture = js.native
  def addAtlas(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement]
  ): Texture = js.native
  def addAtlas(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLCanvasElement
  ): Texture = js.native
  def addAtlas(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLImageElement
  ): Texture = js.native
  def addAtlasJSONArray(key: java.lang.String, source: js.Array[stdLib.HTMLImageElement], data: js.Array[js.Object]): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: js.Array[stdLib.HTMLImageElement],
    data: js.Array[js.Object],
    dataSource: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement]
  ): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: js.Array[stdLib.HTMLImageElement],
    data: js.Array[js.Object],
    dataSource: stdLib.HTMLCanvasElement
  ): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: js.Array[stdLib.HTMLImageElement],
    data: js.Array[js.Object],
    dataSource: stdLib.HTMLImageElement
  ): Texture = js.native
  def addAtlasJSONArray(key: java.lang.String, source: js.Array[stdLib.HTMLImageElement], data: js.Object): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: js.Array[stdLib.HTMLImageElement],
    data: js.Object,
    dataSource: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement]
  ): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: js.Array[stdLib.HTMLImageElement],
    data: js.Object,
    dataSource: stdLib.HTMLCanvasElement
  ): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: js.Array[stdLib.HTMLImageElement],
    data: js.Object,
    dataSource: stdLib.HTMLImageElement
  ): Texture = js.native
  def addAtlasJSONArray(key: java.lang.String, source: stdLib.HTMLImageElement, data: js.Array[js.Object]): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Array[js.Object],
    dataSource: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement]
  ): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Array[js.Object],
    dataSource: stdLib.HTMLCanvasElement
  ): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Array[js.Object],
    dataSource: stdLib.HTMLImageElement
  ): Texture = js.native
  /**
    * Adds a Texture Atlas to this Texture Manager.
    * The frame data of the atlas must be stored in an Array within the JSON.
    * This is known as a JSON Array in software such as Texture Packer.
    * @param key The unique string-based key of the Texture.
    * @param source The source Image element/s.
    * @param data The Texture Atlas data/s.
    * @param dataSource An optional data Image element.
    */
  def addAtlasJSONArray(key: java.lang.String, source: stdLib.HTMLImageElement, data: js.Object): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement]
  ): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLCanvasElement
  ): Texture = js.native
  def addAtlasJSONArray(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLImageElement
  ): Texture = js.native
  /**
    * Adds a Texture Atlas to this Texture Manager.
    * The frame data of the atlas must be stored in an Object within the JSON.
    * This is known as a JSON Hash in software such as Texture Packer.
    * @param key The unique string-based key of the Texture.
    * @param source The source Image element.
    * @param data The Texture Atlas data.
    * @param dataSource An optional data Image element.
    */
  def addAtlasJSONHash(key: java.lang.String, source: stdLib.HTMLImageElement, data: js.Object): Texture = js.native
  def addAtlasJSONHash(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement]
  ): Texture = js.native
  def addAtlasJSONHash(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLCanvasElement
  ): Texture = js.native
  def addAtlasJSONHash(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLImageElement
  ): Texture = js.native
  /**
    * Adds a Texture Atlas to this Texture Manager, where the atlas data is given
    * in the XML format.
    * @param key The unique string-based key of the Texture.
    * @param source The source Image element.
    * @param data The Texture Atlas XML data.
    * @param dataSource An optional data Image element.
    */
  def addAtlasXML(key: java.lang.String, source: stdLib.HTMLImageElement, data: js.Object): Texture = js.native
  def addAtlasXML(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement]
  ): Texture = js.native
  def addAtlasXML(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLCanvasElement
  ): Texture = js.native
  def addAtlasXML(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLImageElement
  ): Texture = js.native
  /**
    * Adds a new Texture to the Texture Manager created from the given Base64 encoded data.
    * @param key The unique string-based key of the Texture.
    * @param data The Base64 encoded data.
    */
  def addBase64(key: java.lang.String, data: js.Any): this.type = js.native
  /**
    * Creates a new Canvas Texture object from an existing Canvas element
    * and adds it to this Texture Manager, unless `skipCache` is true.
    * @param key The unique string-based key of the Texture.
    * @param source The Canvas element to form the base of the new Texture.
    * @param skipCache Skip adding this Texture into the Cache? Default false.
    */
  def addCanvas(key: java.lang.String, source: stdLib.HTMLCanvasElement): CanvasTexture = js.native
  def addCanvas(key: java.lang.String, source: stdLib.HTMLCanvasElement, skipCache: scala.Boolean): CanvasTexture = js.native
  /**
    * Adds a new Texture to the Texture Manager created from the given Image element.
    * @param key The unique string-based key of the Texture.
    * @param source The source Image element.
    * @param dataSource An optional data Image element.
    */
  def addImage(key: java.lang.String, source: stdLib.HTMLImageElement): Texture = js.native
  def addImage(key: java.lang.String, source: stdLib.HTMLImageElement, dataSource: stdLib.HTMLCanvasElement): Texture = js.native
  def addImage(key: java.lang.String, source: stdLib.HTMLImageElement, dataSource: stdLib.HTMLImageElement): Texture = js.native
  /**
    * Adds a Render Texture to the Texture Manager using the given key.
    * This allows you to then use the Render Texture as a normal texture for texture based Game Objects like Sprites.
    * @param key The unique string-based key of the Texture.
    * @param renderTexture The source Render Texture.
    */
  def addRenderTexture(key: java.lang.String, renderTexture: phaserLib.PhaserNs.GameObjectsNs.RenderTexture): Texture = js.native
  /**
    * Adds a Sprite Sheet to this Texture Manager.
    * 
    * In Phaser terminology a Sprite Sheet is a texture containing different frames, but each frame is the exact
    * same size and cannot be trimmed or rotated.
    * @param key The unique string-based key of the Texture.
    * @param source The source Image element.
    * @param config The configuration object for this Sprite Sheet.
    */
  def addSpriteSheet(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    config: phaserLib.PhaserNs.TypesNs.TexturesNs.SpriteSheetConfig
  ): Texture = js.native
  /**
    * Adds a Sprite Sheet to this Texture Manager, where the Sprite Sheet exists as a Frame within a Texture Atlas.
    * 
    * In Phaser terminology a Sprite Sheet is a texture containing different frames, but each frame is the exact
    * same size and cannot be trimmed or rotated.
    * @param key The unique string-based key of the Texture.
    * @param config The configuration object for this Sprite Sheet.
    */
  def addSpriteSheetFromAtlas(key: java.lang.String, config: phaserLib.PhaserNs.TypesNs.TexturesNs.SpriteSheetFromAtlasConfig): Texture = js.native
  /**
    * Adds a Unity Texture Atlas to this Texture Manager.
    * The data must be in the form of a Unity YAML file.
    * @param key The unique string-based key of the Texture.
    * @param source The source Image element.
    * @param data The Texture Atlas data.
    * @param dataSource An optional data Image element.
    */
  def addUnityAtlas(key: java.lang.String, source: stdLib.HTMLImageElement, data: js.Object): Texture = js.native
  def addUnityAtlas(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: js.Array[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement]
  ): Texture = js.native
  def addUnityAtlas(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLCanvasElement
  ): Texture = js.native
  def addUnityAtlas(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    data: js.Object,
    dataSource: stdLib.HTMLImageElement
  ): Texture = js.native
  /**
    * Checks the given texture key and throws a console.warn if the key is already in use, then returns false.
    * If you wish to avoid the console.warn then use `TextureManager.exists` instead.
    * @param key The texture key to check.
    */
  def checkKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Takes a Texture key and Frame name and returns a clone of that Frame if found.
    * @param key The unique string-based key of the Texture.
    * @param frame The string or index of the Frame to be cloned.
    */
  def cloneFrame(key: java.lang.String, frame: java.lang.String): Frame = js.native
  def cloneFrame(key: java.lang.String, frame: phaserLib.integer): Frame = js.native
  /**
    * Creates a new Texture using the given source and dimensions.
    * @param key The unique string-based key of the Texture.
    * @param source The source Image element.
    * @param width The width of the Texture.
    * @param height The height of the Texture.
    */
  def create(
    key: java.lang.String,
    source: stdLib.HTMLImageElement,
    width: phaserLib.integer,
    height: phaserLib.integer
  ): Texture = js.native
  /**
    * Creates a new Texture using a blank Canvas element of the size given.
    * 
    * Canvas elements are automatically pooled and calling this method will
    * extract a free canvas from the CanvasPool, or create one if none are available.
    * @param key The unique string-based key of the Texture.
    * @param width The width of the Canvas element. Default 256.
    * @param height The height of the Canvas element. Default 256.
    */
  def createCanvas(key: java.lang.String): CanvasTexture = js.native
  def createCanvas(key: java.lang.String, width: phaserLib.integer): CanvasTexture = js.native
  def createCanvas(key: java.lang.String, width: phaserLib.integer, height: phaserLib.integer): CanvasTexture = js.native
  /**
    * Passes all Textures to the given callback.
    * @param callback The callback function to be sent the Textures.
    * @param scope The value to use as `this` when executing the callback.
    * @param args Additional arguments that will be passed to the callback, after the child.
    */
  def each(callback: phaserLib.EachTextureCallback, scope: js.Object, args: js.Any*): scala.Unit = js.native
  /**
    * Checks the given key to see if a Texture using it exists within this Texture Manager.
    * @param key The unique string-based key of the Texture.
    */
  def exists(key: java.lang.String): scala.Boolean = js.native
  /**
    * Creates a new Texture using the given config values.
    * Generated textures consist of a Canvas element to which the texture data is drawn.
    * See the Phaser.Create function for the more direct way to create textures.
    * @param key The unique string-based key of the Texture.
    * @param config The configuration object needed to generate the texture.
    */
  def generate(key: java.lang.String, config: js.Object): Texture = js.native
  /**
    * Returns a Texture from the Texture Manager that matches the given key.
    * If the key is undefined it will return the `__DEFAULT` Texture.
    * If the key is given, but not found, it will return the `__MISSING` Texture.
    * @param key The unique string-based key of the Texture.
    */
  def get(key: java.lang.String): Texture = js.native
  /**
    * Gets an existing texture frame and converts it into a base64 encoded image and returns the base64 data.
    * 
    * You can also provide the image type and encoder options.
    * @param key The unique string-based key of the Texture.
    * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
    * @param type [description] Default 'image/png'.
    * @param encoderOptions [description] Default 0.92.
    */
  def getBase64(key: java.lang.String): java.lang.String = js.native
  def getBase64(key: java.lang.String, frame: java.lang.String): java.lang.String = js.native
  def getBase64(key: java.lang.String, frame: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  def getBase64(
    key: java.lang.String,
    frame: java.lang.String,
    `type`: java.lang.String,
    encoderOptions: scala.Double
  ): java.lang.String = js.native
  def getBase64(key: java.lang.String, frame: phaserLib.integer): java.lang.String = js.native
  def getBase64(key: java.lang.String, frame: phaserLib.integer, `type`: java.lang.String): java.lang.String = js.native
  def getBase64(
    key: java.lang.String,
    frame: phaserLib.integer,
    `type`: java.lang.String,
    encoderOptions: scala.Double
  ): java.lang.String = js.native
  /**
    * Takes a Texture key and Frame name and returns a reference to that Frame, if found.
    * @param key The unique string-based key of the Texture.
    * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
    */
  def getFrame(key: java.lang.String): Frame = js.native
  def getFrame(key: java.lang.String, frame: java.lang.String): Frame = js.native
  def getFrame(key: java.lang.String, frame: phaserLib.integer): Frame = js.native
  /**
    * Given a Texture and an `x` and `y` coordinate this method will return a new
    * Color object that has been populated with the color and alpha values of the pixel
    * at that location in the Texture.
    * @param x The x coordinate of the pixel within the Texture.
    * @param y The y coordinate of the pixel within the Texture.
    * @param key The unique string-based key of the Texture.
    * @param frame The string or index of the Frame.
    */
  def getPixel(x: phaserLib.integer, y: phaserLib.integer, key: java.lang.String): phaserLib.PhaserNs.DisplayNs.Color = js.native
  def getPixel(x: phaserLib.integer, y: phaserLib.integer, key: java.lang.String, frame: java.lang.String): phaserLib.PhaserNs.DisplayNs.Color = js.native
  def getPixel(x: phaserLib.integer, y: phaserLib.integer, key: java.lang.String, frame: phaserLib.integer): phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * Given a Texture and an `x` and `y` coordinate this method will return a value between 0 and 255
    * corresponding to the alpha value of the pixel at that location in the Texture. If the coordinate
    * is out of bounds it will return null.
    * @param x The x coordinate of the pixel within the Texture.
    * @param y The y coordinate of the pixel within the Texture.
    * @param key The unique string-based key of the Texture.
    * @param frame The string or index of the Frame.
    */
  def getPixelAlpha(x: phaserLib.integer, y: phaserLib.integer, key: java.lang.String): phaserLib.integer = js.native
  def getPixelAlpha(x: phaserLib.integer, y: phaserLib.integer, key: java.lang.String, frame: java.lang.String): phaserLib.integer = js.native
  def getPixelAlpha(x: phaserLib.integer, y: phaserLib.integer, key: java.lang.String, frame: phaserLib.integer): phaserLib.integer = js.native
  /**
    * Returns an array with all of the keys of all Textures in this Texture Manager.
    * The output array will exclude the `__DEFAULT` and `__MISSING` keys.
    */
  def getTextureKeys(): js.Array[java.lang.String] = js.native
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
  def remove(key: java.lang.String): TextureManager = js.native
  def remove(key: Texture): TextureManager = js.native
  /**
    * Removes a key from the Texture Manager but does not destroy the Texture that was using the key.
    * @param key The key to remove from the texture list.
    */
  def removeKey(key: java.lang.String): TextureManager = js.native
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
  def renameTexture(currentKey: java.lang.String, newKey: java.lang.String): scala.Boolean = js.native
  /**
    * Sets the given Game Objects `texture` and `frame` properties so that it uses
    * the Texture and Frame specified in the `key` and `frame` arguments to this method.
    * @param gameObject The Game Object the texture would be set on.
    * @param key The unique string-based key of the Texture.
    * @param frame The string or index of the Frame.
    */
  def setTexture(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject, key: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setTexture(
    gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    key: java.lang.String,
    frame: java.lang.String
  ): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setTexture(
    gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    key: java.lang.String,
    frame: phaserLib.integer
  ): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}

