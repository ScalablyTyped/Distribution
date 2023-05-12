package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Video Game Object.
  * 
  * This Game Object is capable of handling playback of a video file, video stream or media stream.
  * 
  * You can optionally 'preload' the video into the Phaser Video Cache:
  * 
  * ```javascript
  * preload () {
  *   this.load.video('ripley', 'assets/aliens.mp4');
  * }
  * 
  * create () {
  *   this.add.video(400, 300, 'ripley');
  * }
  * ```
  * 
  * You don't have to 'preload' the video. You can also play it directly from a URL:
  * 
  * ```javascript
  * create () {
  *   this.add.video(400, 300).loadURL('assets/aliens.mp4');
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
  * Playback is handled entirely via the Request Video Frame API, which is supported by most modern browsers.
  * A polyfill is provided for older browsers.
  * 
  * ### Autoplaying Videos
  * 
  * Videos can only autoplay if the browser has been unlocked with an interaction, or satisfies the MEI settings.
  * The policies that control autoplaying are vast and vary between browser. You can, and should, read more about
  * it here: https://developer.mozilla.org/en-US/docs/Web/Media/Autoplay_guide
  * 
  * If your video doesn't contain any audio, then set the `noAudio` parameter to `true` when the video is _loaded_,
  * and it will often allow the video to play immediately:
  * 
  * ```javascript
  * preload () {
  *   this.load.video('pixar', 'nemo.mp4', true);
  * }
  * ```
  * 
  * The 3rd parameter in the load call tells Phaser that the video doesn't contain any audio tracks. Video without
  * audio can autoplay without requiring a user interaction. Video with audio cannot do this unless it satisfies
  * the browsers MEI settings. See the MDN Autoplay Guide for further details.
  * 
  * Or:
  * 
  * ```javascript
  * create () {
  *   this.add.video(400, 300).loadURL('assets/aliens.mp4', true);
  * }
  * ```
  * 
  * You can set the `noAudio` parameter to `true` even if the video does contain audio. It will still allow the video
  * to play immediately, but the audio will not start.
  * 
  * Note that due to a bug in IE11 you cannot play a video texture to a Sprite in WebGL. For IE11 force Canvas mode.
  * 
  * More details about video playback and the supported media formats can be found on MDN:
  * 
  * https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement
  * https://developer.mozilla.org/en-US/docs/Web/Media/Formats
  */
@JSGlobal("Phaser.GameObjects.Video")
@js.native
open class Video protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Video {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key Optional key of the Video this Game Object will play, as stored in the Video Cache.
    */
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, key: String) = this()
  
  /**
    * The depth of this Game Object within the Scene. Ensure this value is only ever set to a number data-type.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  var depth: Double = js.native
  
  /**
    * The horizontally flipped state of the Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  var flipX: Boolean = js.native
  
  /**
    * The vertically flipped state of the Game Object.
    * 
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  var flipY: Boolean = js.native
  
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  /* CompleteClass */
  override def resetFlip(): this.type = js.native
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object. Ensure this value is only ever a number data-type.
    */
  /* CompleteClass */
  override def setDepth(value: Double): this.type = js.native
  
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * 
    * A Game Object that is flipped will render inversed on the flipped axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlip(x: Boolean, y: Boolean): this.type = js.native
  
  /**
    * Sets the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipX(value: Boolean): this.type = js.native
  
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipY(value: Boolean): this.type = js.native
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * Toggles the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override def toggleFlipX(): this.type = js.native
  
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipY(): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
