package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.PostPipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.TextureCrop
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Textures.CanvasTexture
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Textures.TextureSource
import typings.phaser.Phaser.Types.Loader.FileTypes.VideoFileURLConfig
import typings.std.DOMException
import typings.std.DOMHighResTimeStamp
import typings.std.Event
import typings.std.HTMLVideoElement
import typings.std.VideoFrameCallbackMetadata
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
@js.native
trait Video
  extends StObject
     with GameObject
     with Alpha
     with BlendMode
     with Depth
     with Flip
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with PostPipeline
     with ScrollFactor
     with Size
     with TextureCrop
     with Tint
     with Transform
     with Visible {
  
  /**
    * Adds the playback specific event handlers to the video element.
    */
  def addEventHandlers(): Unit = js.native
  
  /**
    * Adds the loading specific event handlers to the video element.
    */
  def addLoadEventHandlers(): Unit = js.native
  
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
  def addMarker(key: String, markerIn: Double, markerOut: Double): this.type = js.native
  
  /**
    * The key of the current video as stored in the Video cache.
    * 
    * If the video did not come from the cache this will be an empty string.
    */
  val cacheKey: String = js.native
  
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
  def changeSource(key: String, autoplay: Boolean): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Boolean): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Boolean, markerIn: Double): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Boolean, markerIn: Double, markerOut: Double): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Boolean, markerIn: Unit, markerOut: Double): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Unit, markerIn: Double): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Unit, markerIn: Double, markerOut: Double): this.type = js.native
  def changeSource(key: String, autoplay: Boolean, loop: Unit, markerIn: Unit, markerOut: Double): this.type = js.native
  def changeSource(key: String, autoplay: Unit, loop: Boolean): this.type = js.native
  def changeSource(key: String, autoplay: Unit, loop: Boolean, markerIn: Double): this.type = js.native
  def changeSource(key: String, autoplay: Unit, loop: Boolean, markerIn: Double, markerOut: Double): this.type = js.native
  def changeSource(key: String, autoplay: Unit, loop: Boolean, markerIn: Unit, markerOut: Double): this.type = js.native
  def changeSource(key: String, autoplay: Unit, loop: Unit, markerIn: Double): this.type = js.native
  def changeSource(key: String, autoplay: Unit, loop: Unit, markerIn: Double, markerOut: Double): this.type = js.native
  def changeSource(key: String, autoplay: Unit, loop: Unit, markerIn: Unit, markerOut: Double): this.type = js.native
  
  /**
    * Called when the video completes playback, i.e. reaches an `ended` state.
    * 
    * This will never happen if the video is coming from a live stream, where the duration is `Infinity`.
    */
  def completeHandler(): Unit = js.native
  
  /**
    * Creates the video.play promise and adds the success and error handlers to it.
    * 
    * Not all browsers support the video.play promise, so this method will fall back to
    * the old-school way of handling the video.play call.
    * 
    * See https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/play#browser_compatibility for details.
    * @param catchError Should the error be caught and the video marked as failed to play? Default true.
    */
  def createPlayPromise(): Unit = js.native
  def createPlayPromise(catchError: Boolean): Unit = js.native
  
  /**
    * Records the number of times the video has failed to play,
    * typically because the user hasn't interacted with the page yet.
    */
  var failedPlayAttempts: Double = js.native
  
  /**
    * Has the video created its texture and populated it with the first frame of video?
    */
  var frameReady: Boolean = js.native
  
  /**
    * A double-precision floating-point value indicating the current playback time in seconds.
    * 
    * If the media has not started to play and has not been seeked, this value is the media's initial playback time.
    * 
    * For a more accurate value, use the `Video.metadata.mediaTime` property instead.
    */
  def getCurrentTime(): Double = js.native
  
  /**
    * A double-precision floating-point value which indicates the duration (total length) of the media in seconds,
    * on the media's timeline. If no media is present on the element, or the media is not valid, the returned value is NaN.
    * 
    * If the media has no known end (such as for live streams of unknown duration, web radio, media incoming from WebRTC,
    * and so forth), this value is +Infinity.
    * 
    * If no video has been loaded, this method will return 0.
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
    * Returns the current progress of the video as a float.
    * 
    * Progress is defined as a value between 0 (the start) and 1 (the end).
    * 
    * Progress can only be returned if the video has a duration. Some videos,
    * such as those coming from a live stream, do not have a duration. In this
    * case the method will return -1.
    */
  def getProgress(): Double = js.native
  
  /**
    * Returns the key of the currently played video, as stored in the Video Cache.
    * 
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
    * Is the video currently seeking?
    * 
    * This is set to `true` when the `seeking` event is fired,
    * and set to `false` when the `seeked` event is fired.
    */
  val isSeeking: Boolean = js.native
  
  /**
    * This read-only property returns `true` if the video is currently stalled, i.e. it has stopped
    * playing due to a lack of data, or too much data, but hasn't yet reached the end of the video.
    * 
    * This is set if the Video DOM element emits any of the following events:
    * 
    * `stalled`
    * `suspend`
    * `waiting`
    * 
    * And is cleared if the Video DOM element emits the `playing` event, or handles
    * a requestVideoFrame call.
    * 
    * Listen for the Phaser Event `VIDEO_STALLED` to be notified and inspect the event
    * to see which DOM event caused it.
    * 
    * Note that being stalled isn't always a negative thing. A video can be stalled if it
    * has downloaded enough data in to its buffer to not need to download any more until
    * the current batch of frames have rendered.
    */
  val isStalled: Boolean = js.native
  
  /**
    * Called when the video emits a `playing` event.
    * 
    * This is the legacy handler for browsers that don't support Promise based playback.
    */
  def legacyPlayHandler(): Unit = js.native
  
  /**
    * Loads a Video from the Video Cache, ready for playback with the `Video.play` method.
    * 
    * If a video is already playing, this method allows you to change the source of the current video element.
    * It works by first stopping the current video and then starts playback of the new source through the existing video element.
    * 
    * The reason you may wish to do this is because videos that require interaction to unlock, remain in an unlocked
    * state, even if you change the source of the video. By changing the source to a new video you avoid having to
    * go through the unlock process again.
    * @param key The key of the Video this Game Object will play, as stored in the Video Cache.
    */
  def load(key: String): this.type = js.native
  
  /**
    * This internal method is called automatically if the video fails to load.
    * @param event The error Event.
    */
  def loadErrorHandler(event: Event): Unit = js.native
  
  /**
    * Internal method that loads a Video from the given URL, ready for playback with the
    * `Video.play` method.
    * 
    * Normally you don't call this method directly, but instead use the `Video.loadURL` method,
    * or the `Video.load` method if you have preloaded the video.
    * 
    * Calling this method will skip checking if the browser supports the given format in
    * the URL, where-as the other two methods enforce these checks.
    * @param url The absolute or relative URL to load the video file from. Set to `null` if passing in a MediaStream object.
    * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it.
    * @param crossOrigin The value to use for the `crossOrigin` property in the video load request.  Either undefined, `anonymous` or `use-credentials`. If no value is given, `crossorigin` will not be set in the request.
    * @param stream A MediaStream object if this is playing a stream instead of a file.
    */
  def loadHandler(): this.type = js.native
  def loadHandler(url: String): this.type = js.native
  def loadHandler(url: String, noAudio: Boolean): this.type = js.native
  def loadHandler(url: String, noAudio: Boolean, crossOrigin: String): this.type = js.native
  def loadHandler(url: String, noAudio: Boolean, crossOrigin: String, stream: String): this.type = js.native
  def loadHandler(url: String, noAudio: Boolean, crossOrigin: Unit, stream: String): this.type = js.native
  def loadHandler(url: String, noAudio: Unit, crossOrigin: String): this.type = js.native
  def loadHandler(url: String, noAudio: Unit, crossOrigin: String, stream: String): this.type = js.native
  def loadHandler(url: String, noAudio: Unit, crossOrigin: Unit, stream: String): this.type = js.native
  def loadHandler(url: Unit, noAudio: Boolean): this.type = js.native
  def loadHandler(url: Unit, noAudio: Boolean, crossOrigin: String): this.type = js.native
  def loadHandler(url: Unit, noAudio: Boolean, crossOrigin: String, stream: String): this.type = js.native
  def loadHandler(url: Unit, noAudio: Boolean, crossOrigin: Unit, stream: String): this.type = js.native
  def loadHandler(url: Unit, noAudio: Unit, crossOrigin: String): this.type = js.native
  def loadHandler(url: Unit, noAudio: Unit, crossOrigin: String, stream: String): this.type = js.native
  def loadHandler(url: Unit, noAudio: Unit, crossOrigin: Unit, stream: String): this.type = js.native
  
  /**
    * Loads a Video from the given MediaStream object, ready for playback with the `Video.play` method.
    * @param stream The MediaStream object.
    * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it. Default false.
    * @param crossOrigin The value to use for the `crossOrigin` property in the video load request.  Either undefined, `anonymous` or `use-credentials`. If no value is given, `crossorigin` will not be set in the request.
    */
  def loadMediaStream(stream: String): this.type = js.native
  def loadMediaStream(stream: String, noAudio: Boolean): this.type = js.native
  def loadMediaStream(stream: String, noAudio: Boolean, crossOrigin: String): this.type = js.native
  def loadMediaStream(stream: String, noAudio: Unit, crossOrigin: String): this.type = js.native
  
  /**
    * Loads a Video from the given URL, ready for playback with the `Video.play` method.
    * 
    * If a video is already playing, this method allows you to change the source of the current video element.
    * It works by first stopping the current video and then starts playback of the new source through the existing video element.
    * 
    * The reason you may wish to do this is because videos that require interaction to unlock, remain in an unlocked
    * state, even if you change the source of the video. By changing the source to a new video you avoid having to
    * go through the unlock process again.
    * @param urls The absolute or relative URL to load the video files from.
    * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it. Default false.
    * @param crossOrigin The value to use for the `crossOrigin` property in the video load request.  Either undefined, `anonymous` or `use-credentials`. If no value is given, `crossorigin` will not be set in the request.
    */
  def loadURL(): this.type = js.native
  def loadURL(urls: String): this.type = js.native
  def loadURL(urls: String, noAudio: Boolean): this.type = js.native
  def loadURL(urls: String, noAudio: Boolean, crossOrigin: String): this.type = js.native
  def loadURL(urls: String, noAudio: Unit, crossOrigin: String): this.type = js.native
  def loadURL(urls: js.Array[String | VideoFileURLConfig]): this.type = js.native
  def loadURL(urls: js.Array[String | VideoFileURLConfig], noAudio: Boolean): this.type = js.native
  def loadURL(urls: js.Array[String | VideoFileURLConfig], noAudio: Boolean, crossOrigin: String): this.type = js.native
  def loadURL(urls: js.Array[String | VideoFileURLConfig], noAudio: Unit, crossOrigin: String): this.type = js.native
  def loadURL(urls: Unit, noAudio: Boolean): this.type = js.native
  def loadURL(urls: Unit, noAudio: Boolean, crossOrigin: String): this.type = js.native
  def loadURL(urls: Unit, noAudio: Unit, crossOrigin: String): this.type = js.native
  def loadURL(urls: VideoFileURLConfig): this.type = js.native
  def loadURL(urls: VideoFileURLConfig, noAudio: Boolean): this.type = js.native
  def loadURL(urls: VideoFileURLConfig, noAudio: Boolean, crossOrigin: String): this.type = js.native
  def loadURL(urls: VideoFileURLConfig, noAudio: Unit, crossOrigin: String): this.type = js.native
  
  /**
    * An object containing in and out markers for sequence playback.
    */
  var markers: Any = js.native
  
  /**
    * If the browser supports the Request Video Frame API then this
    * property will hold the metadata that is returned from
    * the callback each time it is invoked.
    * 
    * See https://wicg.github.io/video-rvfc/#video-frame-metadata-callback
    * for a complete list of all properties that will be in this object.
    * Likely of most interest is the `mediaTime` property:
    * 
    * The media presentation timestamp (PTS) in seconds of the frame presented
    * (e.g. its timestamp on the video.currentTime timeline). MAY have a zero
    * value for live-streams or WebRTC applications.
    * 
    * If the browser doesn't support the API then this property will be undefined.
    */
  var metadata: VideoFrameCallbackMetadata = js.native
  
  /**
    * Pauses the current Video, if one is playing.
    * 
    * If no video is loaded, this method does nothing.
    * 
    * Call `Video.resume` to resume playback.
    */
  def pause(): this.type = js.native
  
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
    *   this.load.video('pixar', 'nemo.mp4', true);
    * }
    * ```
    * 
    * The 3rd parameter in the load call tells Phaser that the video doesn't contain any audio tracks. Video without
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
  def play(loop: Boolean): this.type = js.native
  def play(loop: Boolean, markerIn: Double): this.type = js.native
  def play(loop: Boolean, markerIn: Double, markerOut: Double): this.type = js.native
  def play(loop: Boolean, markerIn: Unit, markerOut: Double): this.type = js.native
  def play(loop: Unit, markerIn: Double): this.type = js.native
  def play(loop: Unit, markerIn: Double, markerOut: Double): this.type = js.native
  def play(loop: Unit, markerIn: Unit, markerOut: Double): this.type = js.native
  
  /**
    * This internal method is called automatically if the playback Promise fails to resolve.
    * @param error The Promise DOM Exception error.
    */
  def playError(error: DOMException): Unit = js.native
  
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
    * This internal method is called automatically if the playback Promise resolves successfully.
    */
  def playSuccess(): Unit = js.native
  
  /**
    * Should the video auto play when document interaction is required and happens?
    */
  var playWhenUnlocked: Boolean = js.native
  
  /**
    * Called when the video emits a `playing` event.
    */
  def playingHandler(): Unit = js.native
  
  /**
    * Removes the playback specific event handlers from the video element.
    */
  def removeEventHandlers(): Unit = js.native
  
  /**
    * Removes the loading specific event handlers from the video element.
    */
  def removeLoadEventHandlers(): Unit = js.native
  
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
    * Also removes the autoplay and src attributes and nulls the `Video.video` reference.
    * 
    * If you loaded an external video via `Video.loadURL` then you should call this function
    * to clear up once you are done with the instance, but don't want to destroy this
    * Video Game Object.
    * 
    * This method is called automatically by `Video.destroy`.
    */
  def removeVideoElement(): Unit = js.native
  
  /**
    * This method handles the Request Video Frame callback.
    * 
    * It is called by the browser when a new video frame is ready to be displayed.
    * 
    * It's also responsible for the creation of the video texture, if it doesn't
    * already exist. If it does, it updates the texture as required.
    * 
    * For more details about the Request Video Frame callback, see:
    * https://web.dev/requestvideoframecallback-rvfc
    * @param now The current time in milliseconds.
    * @param metadata Useful metadata about the video frame that was most recently presented for composition. See https://wicg.github.io/video-rvfc/#video-frame-metadata-callback
    */
  def requestVideoFrame(now: DOMHighResTimeStamp, metadata: VideoFrameCallbackMetadata): Unit = js.native
  
  /**
    * Resumes the current Video, if one was previously playing and has been paused.
    * 
    * If no video is loaded, this method does nothing.
    * 
    * Call `Video.pause` to pause playback.
    */
  def resume(): this.type = js.native
  
  /**
    * The current retry elapsed time.
    */
  var retry: Double = js.native
  
  /**
    * If a video fails to play due to a lack of user interaction, this is the
    * amount of time, in ms, that the video will wait before trying again to
    * play. The default is 500ms.
    */
  var retryInterval: Double = js.native
  
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
    * which any texture-based Game Object, such as a Sprite, can use as its source:
    * 
    * ```javascript
    * const vid = this.add.video(0, 0, 'intro');
    * 
    * vid.play();
    * 
    * vid.saveTexture('doodle');
    * 
    * this.add.image(400, 300, 'doodle');
    * ```
    * 
    * If the video is not yet playing then you need to listen for the `TEXTURE_READY` event before
    * you can use this texture on a Game Object:
    * 
    * ```javascript
    * const vid = this.add.video(0, 0, 'intro');
    * 
    * vid.play();
    * 
    * vid.once('textureready', (video, texture, key) => {
    * 
    *     this.add.image(400, 300, key);
    * 
    * });
    * 
    * vid.saveTexture('doodle');
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
  def saveTexture(key: String): Boolean = js.native
  def saveTexture(key: String, flipY: Boolean): Boolean = js.native
  
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
    * 
    * Unfortunately, the DOM video element does not guarantee frame-accurate seeking.
    * This has been an ongoing subject of discussion: https://github.com/w3c/media-and-entertainment/issues/4
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
    * 
    * If the video has not yet been played, `Video.play` will be called with no parameters.
    * 
    * If the video has ended, this method will do nothing.
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
  def snapshot(width: Double): CanvasTexture = js.native
  def snapshot(width: Double, height: Double): CanvasTexture = js.native
  def snapshot(width: Unit, height: Double): CanvasTexture = js.native
  
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
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    srcWidth: js.UndefOr[Double],
    srcHeight: js.UndefOr[Double],
    destWidth: js.UndefOr[Double],
    destHeight: js.UndefOr[Double]
  ): CanvasTexture = js.native
  
  /**
    * A Phaser `CanvasTexture` instance that holds the most recent snapshot taken from the video.
    * 
    * This will only be set if the `snapshot` or `snapshotArea` methods have been called.
    * 
    * Until those methods are called, this property will be `undefined`.
    */
  var snapshotTexture: CanvasTexture | Null = js.native
  
  /**
    * This internal method is called automatically if the video stalls, for whatever reason.
    * @param event The error Event.
    */
  def stalledHandler(event: Event): Unit = js.native
  
  /**
    * Stops the video playing and clears all internal event listeners.
    * 
    * If you only wish to pause playback of the video, and resume it a later time, use the `Video.pause` method instead.
    * 
    * If the video hasn't finished downloading, calling this method will not abort the download. To do that you need to
    * call `destroy` instead.
    * @param emitStopEvent Should the `VIDEO_STOP` event be emitted? Default true.
    */
  def stop(): this.type = js.native
  def stop(emitStopEvent: Boolean): this.type = js.native
  
  /**
    * An internal flag holding the current state of the video lock, should document interaction be required
    * before playback can begin.
    */
  val touchLocked: Boolean = js.native
  
  /**
    * A reference to the HTML Video Element this Video Game Object is playing.
    * 
    * Will be `undefined` until a video is loaded for playback.
    */
  var video: HTMLVideoElement | Null = js.native
  
  /**
    * The Phaser Texture this Game Object is using to render the video to.
    * 
    * Will be `undefined` until a video is loaded for playback.
    */
  var videoTexture: Texture | Null = js.native
  
  /**
    * A reference to the TextureSource backing the `videoTexture` Texture object.
    * 
    * Will be `undefined` until a video is loaded for playback.
    */
  var videoTextureSource: TextureSource | Null = js.native
}
