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
@js.native
trait CacheManager extends js.Object {
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
    * A Cache storing all non-streaming video files, typically added via the Loader.
    */
  var video: BaseCache = js.native
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
  @scala.inline
  implicit class CacheManagerOps[Self <: CacheManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddCustom(value: String => BaseCache): Self = this.set("addCustom", js.Any.fromFunction1(value))
    @scala.inline
    def setAudio(value: BaseCache): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinary(value: BaseCache): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitmapFont(value: BaseCache): Self = this.set("bitmapFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: StringDictionary[BaseCache]): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGame(value: Game): Self = this.set("game", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: BaseCache): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: BaseCache): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setObj(value: BaseCache): Self = this.set("obj", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysics(value: BaseCache): Self = this.set("physics", value.asInstanceOf[js.Any])
    @scala.inline
    def setShader(value: BaseCache): Self = this.set("shader", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: BaseCache): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTilemap(value: BaseCache): Self = this.set("tilemap", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideo(value: BaseCache): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def setXml(value: BaseCache): Self = this.set("xml", value.asInstanceOf[js.Any])
  }
  
}

