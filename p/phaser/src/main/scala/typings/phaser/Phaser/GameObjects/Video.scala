package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.TextureCrop
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Textures.CanvasTexture
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Textures.TextureSource
import typings.phaser.integer
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait Video
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Flip
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with ScrollFactor
     with Size
     with TextureCrop
     with Tint
     with Transform
     with Visible {
  /**
    * An object containing in and out markers for sequence playback.
    */
  var markers: js.Any = js.native
  /**
    * Should the video auto play when document interaction is required and happens?
    */
  var playWhenUnlocked: Boolean = js.native
  /**
    * Should the Video element that this Video is using, be removed from the DOM
    * when this Video is destroyed?
    */
  var removeVideoElementOnDestroy: Boolean = js.native
  /**
    * The current retry attempt.
    */
  var retry: integer = js.native
  /**
    * The number of ms between each retry while monitoring the ready state of a downloading video.
    */
  var retryInterval: integer = js.native
  /**
    * When starting playback of a video Phaser will monitor its `readyState` using a `setTimeout` call.
    * The `setTimeout` happens once every `Video.retryInterval` ms. It will carry on monitoring the video
    * state in this manner until the `retryLimit` is reached and then abort.
    */
  var retryLimit: integer = js.native
  /**
    * A Phaser CanvasTexture instance that holds the most recent snapshot taken from the video.
    * This will only be set if `snapshot` or `snapshotArea` have been called, and will be `null` until that point.
    */
  var snapshotTexture: CanvasTexture = js.native
  /**
    * An internal flag holding the current state of the video lock, should document interaction be required
    * before playback can begin.
    */
  var touchLocked: Boolean = js.native
  /**
    * A reference to the HTML Video Element this Video Game Object is playing.
    * Will be `null` until a video is loaded for playback.
    */
  var video: HTMLVideoElement = js.native
  /**
    * The Phaser Texture this Game Object is using to render the video to.
    * Will be `null` until a video is loaded for playback.
    */
  var videoTexture: Texture = js.native
  /**
    * A reference to the TextureSource belong to the `videoTexture` Texture object.
    * Will be `null` until a video is loaded for playback.
    */
  var videoTextureSource: TextureSource = js.native
  /**
    * Adds a sequence marker to this video.
    * 
    * Markers allow you to split a video up into sequences, delineated by a start and end time, given in seconds.
    * 
    * You can then play back specific markers via the `playMarker` method.
    * 
    * Note that marker timing is _not_ frame-perfect. You should construct your videos in such a way that you allow for
    * plenty of extra padding before and after each sequence to allow for discrepancies in browser seek and currentTime accuracy.
    * 
    * See https://github.com/w3c/media-and-entertainment/issues/4 for more details about this issue.
    * @param key A unique name to give this marker.
    * @param markerIn The time, in seconds, representing the start of this marker.
    * @param markerOut The time, in seconds, representing the end of this marker.
    */
  def addMarker(key: String, markerIn: integer, markerOut: integer): this.type = js.native
  /**
    * This method allows you to change the source of the current video element. It works by first stopping the
    * current video, if playing. Then deleting the video texture, if one has been created. Finally, it makes a
    * new video texture and starts playback of the new source through the existing video element.
    * 
    * The reason you may wish to do this is because videos that require interaction to unlock, remain in an unlocked
    * state, even if you change the source of the video. By changing the source to a new video you avoid having to
    * go through the unlock process again.
    * @param key The key of the Video this Game Object will swap to playing, as stored in the Video Cache.
    * @param autoplay Should the video start playing immediately, once the swap is complete? Default true.
    * @param loop Should the video loop automatically when it reaches the end? Please note that not all browsers support _seamless_ video looping for all encoding formats. Default false.
    * @param markerIn Optional in marker time, in seconds, for playback of a sequence of the video.
    * @param markerOut Optional out marker time, in seconds, for playback of a sequence of the video.
    */
  def changeSource(key: String): this.type = js.native
  def changeSource(
    key: String,
    autoplay: js.UndefOr[scala.Nothing],
    loop: js.UndefOr[scala.Nothing],
    markerIn: js.UndefOr[scala.Nothing],
    markerOut: integer
  ): this.type = js.native
  def changeSource(
    key: String,
    autoplay: js.UndefOr[scala.Nothing],
    loop: js.UndefOr[scala.Nothing],
    markerIn: integer
  ): this.type = js.native
  def changeSource(
    key: String,
    autoplay: js.UndefOr[scala.Nothing],
    loop: js.UndefOr[scala.Nothing],
    markerIn: integer,
    markerOut: integer
  ): this.type = js.native
  def changeSource(key: String, autoplay: js.UndefOr[scala.Nothing], loop: Boolean): this.type = js.native
  def changeSource(
    key: String,
    autoplay: js.UndefOr[scala.Nothing],
    loop: Boolean,
    markerIn: js.UndefOr[scala.Nothing],
    markerOut: integer
  ): this.type = js.native
  def changeSource(key: String, autoplay: js.UndefOr[scala.Nothing], loop: Boolean, markerIn: integer): this.type = js.native
  def changeSource(
    key: String,
    autoplay: js.UndefOr[scala.Nothing],
    loop: Boolean,
    markerIn: integer,
    markerOut: integer
  ): this.type = js.native
  def changeSource(key: String, autoplay: Boolean): this.type = js.native
  def changeSource(
    key: String,
    autoplay: Boolean,
    loop: js.UndefOr[scala.Nothing],
    markerIn: js.UndefOr[scala.Nothing],
    markerOut: integer
  ): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: js.UndefOr[scala.Nothing], markerIn: integer): this.type = js.native
  def changeSource(
    key: String,
    autoplay: Boolean,
    loop: js.UndefOr[scala.Nothing],
    markerIn: integer,
    markerOut: integer
  ): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Boolean): this.type = js.native
  def changeSource(
    key: String,
    autoplay: Boolean,
    loop: Boolean,
    markerIn: js.UndefOr[scala.Nothing],
    markerOut: integer
  ): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Boolean, markerIn: integer): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Boolean, markerIn: integer, markerOut: integer): this.type = js.native
  /**
    * Called when the video completes playback, i.e. reaches an `ended` state.
    * 
    * This will never happen if the video is coming from a live stream, where the duration is `Infinity`.
    */
  def completeHandler(): Unit = js.native
  /**
    * A double-precision floating-point value indicating the current playback time in seconds.
    * If the media has not started to play and has not been seeked, this value is the media's initial playback time.
    */
  def getCurrentTime(): Double = js.native
  /**
    * A double-precision floating-point value which indicates the duration (total length) of the media in seconds,
    * on the media's timeline. If no media is present on the element, or the media is not valid, the returned value is NaN.
    * 
    * If the media has no known end (such as for live streams of unknown duration, web radio, media incoming from WebRTC,
    * and so forth), this value is +Infinity.
    */
  def getDuration(): Double = js.native
  /**
    * Returns a boolean which indicates whether the media element should start over when it reaches the end.
    */
  def getLoop(): Boolean = js.native
  /**
    * Returns a double that indicates the rate at which the media is being played back.
    */
  def getPlaybackRate(): Double = js.native
  /**
    * Returns the current progress of the video. Progress is defined as a value between 0 (the start)
    * and 1 (the end).
    * 
    * Progress can only be returned if the video has a duration, otherwise it will always return zero.
    */
  def getProgress(): Double = js.native
  /**
    * Returns the key of the currently played video, as stored in the Video Cache.
    * If the video did not come from the cache this will return an empty string.
    */
  def getVideoKey(): String = js.native
  /**
    * Returns a double indicating the audio volume, from 0.0 (silent) to 1.0 (loudest).
    */
  def getVolume(): Double = js.native
  /**
    * Returns a boolean indicating if this Video is currently muted.
    */
  def isMuted(): Boolean = js.native
  /**
    * Returns a boolean which indicates whether the video is currently paused.
    */
  def isPaused(): Boolean = js.native
  /**
    * Returns a boolean which indicates whether the video is currently playing.
    */
  def isPlaying(): Boolean = js.native
  /**
    * Returns a boolean indicating if this Video is currently seeking, or not.
    */
  def isSeeking(): Boolean = js.native
  /**
    * Loads a Video from the given URL, ready for playback with the `Video.play` method.
    * 
    * You can control at what point the browser determines the video as being ready for playback via
    * the `loadEvent` parameter. See https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement
    * for more details.
    * @param url The URL of the video to load or be streamed.
    * @param loadEvent The load event to listen for. Either `loadeddata`, `canplay` or `canplaythrough`. Default 'loadeddata'.
    * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it. Default false.
    */
  def loadURL(url: String): this.type = js.native
  def loadURL(url: String, loadEvent: js.UndefOr[scala.Nothing], noAudio: Boolean): this.type = js.native
  def loadURL(url: String, loadEvent: String): this.type = js.native
  def loadURL(url: String, loadEvent: String, noAudio: Boolean): this.type = js.native
  /**
    * Starts this video playing.
    * 
    * If the video is already playing, or has been queued to play with `changeSource` then this method just returns.
    * 
    * Videos can only autoplay if the browser has been unlocked. This happens if you have interacted with the browser, i.e.
    * by clicking on it or pressing a key, or due to server settings. The policies that control autoplaying are vast and
    * vary between browser. You can read more here: https://developer.mozilla.org/en-US/docs/Web/Media/Autoplay_guide
    * 
    * If your video doesn't contain any audio, then set the `noAudio` parameter to `true` when the video is loaded,
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
    * the browsers MEI settings. See the MDN Autoplay Guide for details.
    * 
    * If you need audio in your videos, then you'll have to consider the fact that the video cannot start playing until the
    * user has interacted with the browser, into your game flow.
    * @param loop Should the video loop automatically when it reaches the end? Please note that not all browsers support _seamless_ video looping for all encoding formats. Default false.
    * @param markerIn Optional in marker time, in seconds, for playback of a sequence of the video.
    * @param markerOut Optional out marker time, in seconds, for playback of a sequence of the video.
    */
  def play(): this.type = js.native
  def play(loop: js.UndefOr[scala.Nothing], markerIn: js.UndefOr[scala.Nothing], markerOut: integer): this.type = js.native
  def play(loop: js.UndefOr[scala.Nothing], markerIn: integer): this.type = js.native
  def play(loop: js.UndefOr[scala.Nothing], markerIn: integer, markerOut: integer): this.type = js.native
  def play(loop: Boolean): this.type = js.native
  def play(loop: Boolean, markerIn: js.UndefOr[scala.Nothing], markerOut: integer): this.type = js.native
  def play(loop: Boolean, markerIn: integer): this.type = js.native
  def play(loop: Boolean, markerIn: integer, markerOut: integer): this.type = js.native
  /**
    * Called when the video emits a `playing` event during load.
    * 
    * This is only listened for if the browser doesn't support Promises.
    */
  def playHandler(): Unit = js.native
  /**
    * Plays a pre-defined sequence in this video.
    * 
    * Markers allow you to split a video up into sequences, delineated by a start and end time, given in seconds and
    * specified via the `addMarker` method.
    * 
    * Note that marker timing is _not_ frame-perfect. You should construct your videos in such a way that you allow for
    * plenty of extra padding before and after each sequence to allow for discrepancies in browser seek and currentTime accuracy.
    * 
    * See https://github.com/w3c/media-and-entertainment/issues/4 for more details about this issue.
    * @param key The name of the marker sequence to play.
    * @param loop Should the video loop automatically when it reaches the end? Please note that not all browsers support _seamless_ video looping for all encoding formats. Default false.
    */
  def playMarker(key: String): this.type = js.native
  def playMarker(key: String, loop: Boolean): this.type = js.native
  /**
    * Removes a previously set marker from this video.
    * 
    * If the marker is currently playing it will _not_ stop playback.
    * @param key The name of the marker to remove.
    */
  def removeMarker(key: String): this.type = js.native
  /**
    * Removes the Video element from the DOM by calling parentNode.removeChild on itself.
    * 
    * Also removes the autoplay and src attributes and nulls the Video reference.
    * 
    * You should not call this method if you were playing a video from the Video Cache that
    * you wish to play again in your game, or if another Video object is also using the same
    * video.
    * 
    * If you loaded an external video via `Video.loadURL` then you should call this function
    * to clear up once you are done with the instance.
    */
  def removeVideoElement(): Unit = js.native
  /**
    * Stores a copy of this Videos `snapshotTexture` in the Texture Manager using the given key.
    * 
    * This texture is created when the `snapshot` or `snapshotArea` methods are called.
    * 
    * After doing this, any texture based Game Object, such as a Sprite, can use the contents of the
    * snapshot by using the texture key:
    * 
    * ```javascript
    * var vid = this.add.video(0, 0, 'intro');
    * 
    * vid.snapshot();
    * 
    * vid.saveSnapshotTexture('doodle');
    * 
    * this.add.image(400, 300, 'doodle');
    * ```
    * 
    * Updating the contents of the `snapshotTexture`, for example by calling `snapshot` again,
    * will automatically update _any_ Game Object that is using it as a texture.
    * Calling `saveSnapshotTexture` again will not save another copy of the same texture,
    * it will just rename the existing one.
    * 
    * By default it will create a single base texture. You can add frames to the texture
    * by using the `Texture.add` method. After doing this, you can then allow Game Objects
    * to use a specific frame.
    * @param key The unique key to store the texture as within the global Texture Manager.
    */
  def saveSnapshotTexture(key: String): CanvasTexture = js.native
  /**
    * Stores this Video in the Texture Manager using the given key as a dynamic texture,
    * which any texture-based Game Object, such as a Sprite, can use as its texture:
    * 
    * ```javascript
    * var vid = this.add.video(0, 0, 'intro');
    * 
    * vid.play();
    * 
    * vid.saveTexture('doodle');
    * 
    * this.add.image(400, 300, 'doodle');
    * ```
    * 
    * The saved texture is automatically updated as the video plays. If you pause this video,
    * or change its source, then the saved texture updates instantly.
    * 
    * Calling `saveTexture` again will not save another copy of the same texture, it will just rename the existing one.
    * 
    * By default it will create a single base texture. You can add frames to the texture
    * by using the `Texture.add` method. After doing this, you can then allow Game Objects
    * to use a specific frame.
    * 
    * If you intend to save the texture so you can use it as the input for a Shader, you may need to set the
    * `flipY` parameter to `true` if you find the video renders upside down in your shader.
    * @param key The unique key to store the texture as within the global Texture Manager.
    * @param flipY Should the WebGL Texture set `UNPACK_MULTIPLY_FLIP_Y` during upload? Default false.
    */
  def saveTexture(key: String): Texture = js.native
  def saveTexture(key: String, flipY: Boolean): Texture = js.native
  /**
    * Seeks to a given point in the video. The value is given as a float between 0 and 1,
    * where 0 represents the start of the video and 1 represents the end.
    * 
    * Seeking only works if the video has a duration, so will not work for live streams.
    * 
    * When seeking begins, this video will emit a `seeking` event. When the video completes
    * seeking (i.e. reaches its designated timestamp) it will emit a `seeked` event.
    * 
    * If you wish to seek based on time instead, use the `Video.setCurrentTime` method.
    * @param value The point in the video to seek to. A value between 0 and 1.
    */
  def seekTo(value: Double): this.type = js.native
  /**
    * Seeks to a given playback time in the video. The value is given in _seconds_ or as a string.
    * 
    * Seeking only works if the video has a duration, so will not work for live streams.
    * 
    * When seeking begins, this video will emit a `seeking` event. When the video completes
    * seeking (i.e. reaches its designated timestamp) it will emit a `seeked` event.
    * 
    * You can provide a string prefixed with either a `+` or a `-`, such as `+2.5` or `-2.5`.
    * In this case it will seek to +/- the value given, relative to the _current time_.
    * 
    * If you wish to seek based on a duration percentage instead, use the `Video.seekTo` method.
    * @param value The playback time to seek to in seconds. Can be expressed as a string, such as `+2` to seek 2 seconds ahead from the current time.
    */
  def setCurrentTime(value: String): this.type = js.native
  def setCurrentTime(value: Double): this.type = js.native
  /**
    * Sets the loop state of the current video.
    * 
    * The value given is a boolean which indicates whether the media element will start over when it reaches the end.
    * 
    * Not all videos can loop, for example live streams.
    * 
    * Please note that not all browsers support _seamless_ video looping for all encoding formats.
    * @param value A boolean which indicates whether the media element will start over when it reaches the end. Default true.
    */
  def setLoop(): this.type = js.native
  def setLoop(value: Boolean): this.type = js.native
  /**
    * Sets the muted state of the currently playing video, if one is loaded.
    * @param value The mute value. `true` if the video should be muted, otherwise `false`. Default true.
    */
  def setMute(): this.type = js.native
  def setMute(value: Boolean): this.type = js.native
  /**
    * Sets the paused state of the currently loaded video.
    * 
    * If the video is playing, calling this method with `true` will pause playback.
    * If the video is paused, calling this method with `false` will resume playback.
    * 
    * If no video is loaded, this method does nothing.
    * @param value The paused value. `true` if the video should be paused, `false` to resume it. Default true.
    */
  def setPaused(): this.type = js.native
  def setPaused(value: Boolean): this.type = js.native
  /**
    * Sets the playback rate of the current video.
    * 
    * The value given is a double that indicates the rate at which the media is being played back.
    * @param rate A double that indicates the rate at which the media is being played back.
    */
  def setPlaybackRate(): this.type = js.native
  def setPlaybackRate(rate: Double): this.type = js.native
  /**
    * Sets the volume of the currently playing video.
    * 
    * The value given is a double indicating the audio volume, from 0.0 (silent) to 1.0 (loudest).
    * @param value A double indicating the audio volume, from 0.0 (silent) to 1.0 (loudest). Default 1.
    */
  def setVolume(): this.type = js.native
  def setVolume(value: Double): this.type = js.native
  /**
    * Takes a snapshot of the current frame of the video and renders it to a CanvasTexture object,
    * which is then returned. You can optionally resize the grab by passing a width and height.
    * 
    * This method returns a reference to the `Video.snapshotTexture` object. Calling this method
    * multiple times will overwrite the previous snapshot with the most recent one.
    * @param width The width of the resulting CanvasTexture.
    * @param height The height of the resulting CanvasTexture.
    */
  def snapshot(): CanvasTexture = js.native
  def snapshot(width: js.UndefOr[scala.Nothing], height: integer): CanvasTexture = js.native
  def snapshot(width: integer): CanvasTexture = js.native
  def snapshot(width: integer, height: integer): CanvasTexture = js.native
  /**
    * Takes a snapshot of the specified area of the current frame of the video and renders it to a CanvasTexture object,
    * which is then returned. You can optionally resize the grab by passing a different `destWidth` and `destHeight`.
    * 
    * This method returns a reference to the `Video.snapshotTexture` object. Calling this method
    * multiple times will overwrite the previous snapshot with the most recent one.
    * @param x The horizontal location of the top-left of the area to grab from. Default 0.
    * @param y The vertical location of the top-left of the area to grab from. Default 0.
    * @param srcWidth The width of area to grab from the video. If not given it will grab the full video dimensions.
    * @param srcHeight The height of area to grab from the video. If not given it will grab the full video dimensions.
    * @param destWidth The destination width of the grab, allowing you to resize it.
    * @param destHeight The destination height of the grab, allowing you to resize it.
    */
  def snapshotArea(
    x: js.UndefOr[integer],
    y: js.UndefOr[integer],
    srcWidth: js.UndefOr[integer],
    srcHeight: js.UndefOr[integer],
    destWidth: js.UndefOr[integer],
    destHeight: js.UndefOr[integer]
  ): CanvasTexture = js.native
  /**
    * Stops the video playing and clears all internal event listeners.
    * 
    * If you only wish to pause playback of the video, and resume it a later time, use the `Video.pause` method instead.
    * 
    * If the video hasn't finished downloading, calling this method will not abort the download. To do that you need to
    * call `destroy` instead.
    */
  def stop(): this.type = js.native
  /**
    * Called when the video emits a `timeUpdate` event during playback.
    * 
    * This event is too slow and irregular to be used for actual video timing or texture updating,
    * but we can use it to determine if a video has looped.
    */
  def timeUpdateHandler(): Unit = js.native
  /**
    * Internal method that is called when enough video data has been received in order to create a texture
    * from it. The texture is assigned to the `Video.videoTexture` property and given a base frame that
    * encompases the whole video size.
    */
  def updateTexture(): Unit = js.native
}

