package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Video Game Object.
  * 
  * This Game Object is capable of handling playback of a previously loaded video from the Phaser Video Cache,
  * or playing a video based on a given URL. Videos can be either local, or streamed.
  * 
  * ```javascript
  * preload () {
  *   this.load.video('pixar', 'nemo.mp4');
  * }
  * 
  * create () {
  *   this.add.video(400, 300, 'pixar');
  * }
  * ```
  * 
  * To all intents and purposes, a video is a standard Game Object, just like a Sprite. And as such, you can do
  * all the usual things to it, such as scaling, rotating, cropping, tinting, making interactive, giving a
  * physics body, etc.
  * 
  * Transparent videos are also possible via the WebM file format. Providing the video file has was encoded with
  * an alpha channel, and providing the browser supports WebM playback (not all of them do), then it will render
  * in-game with full transparency.
  * 
  * ### Autoplaying Videos
  * 
  * Videos can only autoplay if the browser has been unlocked with an interaction, or satisfies the MEI settings.
  * The policies that control autoplaying are vast and vary between browser.
  * You can, ahd should, read more about it here: https://developer.mozilla.org/en-US/docs/Web/Media/Autoplay_guide
  * 
  * If your video doesn't contain any audio, then set the `noAudio` parameter to `true` when the video is _loaded_,
  * and it will often allow the video to play immediately:
  * 
  * ```javascript
  * preload () {
  *   this.load.video('pixar', 'nemo.mp4', 'loadeddata', false, true);
  * }
  * ```
  * 
  * The 5th parameter in the load call tells Phaser that the video doesn't contain any audio tracks. Video without
  * audio can autoplay without requiring a user interaction. Video with audio cannot do this unless it satisfies
  * the browsers MEI settings. See the MDN Autoplay Guide for further details.
  * 
  * Note that due to a bug in IE11 you cannot play a video texture to a Sprite in WebGL. For IE11 force Canvas mode.
  * 
  * More details about video playback and the supported media formats can be found on MDN:
  * 
  * https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement
  * https://developer.mozilla.org/en-US/docs/Web/Media/Formats
  */
@JSImport("phaser", "GameObjects.Video")
@js.native
class Video protected ()
  extends typings.phaser.Phaser.GameObjects.Video {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key Optional key of the Video this Game Object will play, as stored in the Video Cache.
    */
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, key: String) = this()
}
