package typings.pixiDotJs.PIXI

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.VideoBaseTexture")
@js.native
class VideoBaseTexture protected () extends BaseTexture {
  def this(source: HTMLVideoElement) = this()
  def this(source: HTMLVideoElement, scaleMode: Double) = this()
  def this(source: HTMLVideoElement, scaleMode: Double, autoPlay: Boolean) = this()
  var _isAutoUpdating: Boolean = js.native
  var autoPlay: Boolean = js.native
  var autoUpdate: Boolean = js.native
  @JSName("source")
  var source_VideoBaseTexture: HTMLVideoElement = js.native
  /* protected */ def _isSourcePlaying(): Boolean = js.native
  /* protected */ def _isSourceReady(): Boolean = js.native
  /* protected */ def _onCanPlay(): Unit = js.native
  /* protected */ def _onPlayStart(): Unit = js.native
  /* protected */ def _onPlayStop(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.VideoBaseTexture")
@js.native
object VideoBaseTexture extends js.Object {
  def fromUrl(videoSrc: String): VideoBaseTexture = js.native
  def fromUrl(videoSrc: String, crossorigin: Boolean): VideoBaseTexture = js.native
  def fromUrl(videoSrc: String, crossorigin: Boolean, autoPlay: Boolean): VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any): VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any, crossorigin: Boolean): VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any, crossorigin: Boolean, autoPlay: Boolean): VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | String]): VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | String], crossorigin: Boolean): VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | String], crossorigin: Boolean, autoPlay: Boolean): VideoBaseTexture = js.native
  def fromUrls(videoSrc: String): VideoBaseTexture = js.native
  def fromUrls(videoSrc: js.Any): VideoBaseTexture = js.native
  def fromUrls(videoSrc: js.Array[_ | String]): VideoBaseTexture = js.native
  def fromVideo(video: HTMLVideoElement): VideoBaseTexture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double): VideoBaseTexture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double, autoPlay: Boolean): VideoBaseTexture = js.native
}

