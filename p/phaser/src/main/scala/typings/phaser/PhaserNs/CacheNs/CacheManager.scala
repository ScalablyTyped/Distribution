package typings.phaser.PhaserNs.CacheNs

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.PhaserNs.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Cache Manager is the global cache owned and maintained by the Game instance.
  * 
  * Various systems, such as the file Loader, rely on this cache in order to store the files
  * it has loaded. The manager itself doesn't store any files, but instead owns multiple BaseCache
  * instances, one per type of file. You can also add your own custom caches.
  */
@JSGlobal("Phaser.Cache.CacheManager")
@js.native
class CacheManager protected () extends js.Object {
  /**
    * 
    * @param game A reference to the Phaser.Game instance that owns this CacheManager.
    */
  def this(game: Game) = this()
  /**
    * A Cache storing all non-streaming audio files, typically added via the Loader.
    */
  var audio: BaseCache = js.native
  /**
    * A Cache storing all binary files, typically added via the Loader.
    */
  var binary: BaseCache = js.native
  /**
    * A Cache storing all bitmap font data files, typically added via the Loader.
    * Only the font data is stored in this cache, the textures are part of the Texture Manager.
    */
  var bitmapFont: BaseCache = js.native
  /**
    * An object that contains your own custom BaseCache entries.
    * Add to this via the `addCustom` method.
    */
  var custom: StringDictionary[BaseCache] = js.native
  /**
    * A reference to the Phaser.Game instance that owns this CacheManager.
    */
  var game: Game = js.native
  /**
    * A Cache storing all html files, typically added via the Loader.
    */
  var html: BaseCache = js.native
  /**
    * A Cache storing all JSON data files, typically added via the Loader.
    */
  var json: BaseCache = js.native
  /**
    * A Cache storing all WaveFront OBJ files, typically added via the Loader.
    */
  var obj: BaseCache = js.native
  /**
    * A Cache storing all physics data files, typically added via the Loader.
    */
  var physics: BaseCache = js.native
  /**
    * A Cache storing all shader source files, typically added via the Loader.
    */
  var shader: BaseCache = js.native
  /**
    * A Cache storing all text files, typically added via the Loader.
    */
  var text: BaseCache = js.native
  /**
    * A Cache storing all tilemap data files, typically added via the Loader.
    * Only the data is stored in this cache, the textures are part of the Texture Manager.
    */
  var tilemap: BaseCache = js.native
  /**
    * A Cache storing all xml data files, typically added via the Loader.
    */
  var xml: BaseCache = js.native
  /**
    * Add your own custom Cache for storing your own files.
    * The cache will be available under `Cache.custom.key`.
    * The cache will only be created if the key is not already in use.
    * @param key The unique key of your custom cache.
    */
  def addCustom(key: String): BaseCache = js.native
  /**
    * Removes all entries from all BaseCaches and destroys all custom caches.
    */
  def destroy(): Unit = js.native
}

