package typings.phaser.Phaser.Cache

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Game
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
trait CacheManager extends js.Object {
  /**
    * A Cache storing all non-streaming audio files, typically added via the Loader.
    */
  var audio: BaseCache
  /**
    * A Cache storing all binary files, typically added via the Loader.
    */
  var binary: BaseCache
  /**
    * A Cache storing all bitmap font data files, typically added via the Loader.
    * Only the font data is stored in this cache, the textures are part of the Texture Manager.
    */
  var bitmapFont: BaseCache
  /**
    * An object that contains your own custom BaseCache entries.
    * Add to this via the `addCustom` method.
    */
  var custom: StringDictionary[BaseCache]
  /**
    * A reference to the Phaser.Game instance that owns this CacheManager.
    */
  var game: Game
  /**
    * A Cache storing all html files, typically added via the Loader.
    */
  var html: BaseCache
  /**
    * A Cache storing all JSON data files, typically added via the Loader.
    */
  var json: BaseCache
  /**
    * A Cache storing all WaveFront OBJ files, typically added via the Loader.
    */
  var obj: BaseCache
  /**
    * A Cache storing all physics data files, typically added via the Loader.
    */
  var physics: BaseCache
  /**
    * A Cache storing all shader source files, typically added via the Loader.
    */
  var shader: BaseCache
  /**
    * A Cache storing all text files, typically added via the Loader.
    */
  var text: BaseCache
  /**
    * A Cache storing all tilemap data files, typically added via the Loader.
    * Only the data is stored in this cache, the textures are part of the Texture Manager.
    */
  var tilemap: BaseCache
  /**
    * A Cache storing all non-streaming video files, typically added via the Loader.
    */
  var video: BaseCache
  /**
    * A Cache storing all xml data files, typically added via the Loader.
    */
  var xml: BaseCache
  /**
    * Add your own custom Cache for storing your own files.
    * The cache will be available under `Cache.custom.key`.
    * The cache will only be created if the key is not already in use.
    * @param key The unique key of your custom cache.
    */
  def addCustom(key: String): BaseCache
  /**
    * Removes all entries from all BaseCaches and destroys all custom caches.
    */
  def destroy(): Unit
}

object CacheManager {
  @scala.inline
  def apply(
    addCustom: String => BaseCache,
    audio: BaseCache,
    binary: BaseCache,
    bitmapFont: BaseCache,
    custom: StringDictionary[BaseCache],
    destroy: () => Unit,
    game: Game,
    html: BaseCache,
    json: BaseCache,
    obj: BaseCache,
    physics: BaseCache,
    shader: BaseCache,
    text: BaseCache,
    tilemap: BaseCache,
    video: BaseCache,
    xml: BaseCache
  ): CacheManager = {
    val __obj = js.Dynamic.literal(addCustom = js.Any.fromFunction1(addCustom), audio = audio.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], bitmapFont = bitmapFont.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), game = game.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], shader = shader.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tilemap = tilemap.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheManager]
  }
}

