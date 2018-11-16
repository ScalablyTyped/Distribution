package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.VideoBaseTexture")
@js.native
class VideoBaseTexture protected () extends BaseTexture {
  def this(source: stdLib.HTMLVideoElement) = this()
  def this(source: stdLib.HTMLVideoElement, scaleMode: scala.Double) = this()
  def this(source: stdLib.HTMLVideoElement, scaleMode: scala.Double, autoPlay: scala.Boolean) = this()
  var _isAutoUpdating: scala.Boolean = js.native
  var autoPlay: scala.Boolean = js.native
  var autoUpdate: scala.Boolean = js.native
  @JSName("source")
  var source_VideoBaseTexture: stdLib.HTMLVideoElement = js.native
  /* protected */ def _isSourcePlaying(): scala.Boolean = js.native
  /* protected */ def _isSourceReady(): scala.Boolean = js.native
  /* protected */ def _onCanPlay(): scala.Unit = js.native
  /* protected */ def _onPlayStart(): scala.Unit = js.native
  /* protected */ def _onPlayStop(): scala.Unit = js.native
}

@JSGlobal("PIXI.VideoBaseTexture")
@js.native
object VideoBaseTexture extends js.Object {
  def fromUrl(videoSrc: java.lang.String): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: java.lang.String, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: java.lang.String, crossorigin: scala.Boolean, autoPlay: scala.Boolean): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any, crossorigin: scala.Boolean, autoPlay: scala.Boolean): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | java.lang.String]): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | java.lang.String], crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | java.lang.String], crossorigin: scala.Boolean, autoPlay: scala.Boolean): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrls(videoSrc: java.lang.String): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrls(videoSrc: js.Any): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromUrls(videoSrc: js.Array[_ | java.lang.String]): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromVideo(video: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromVideo(video: stdLib.HTMLVideoElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
  def fromVideo(video: stdLib.HTMLVideoElement, scaleMode: scala.Double, autoPlay: scala.Boolean): pixiDotJsLib.PIXINs.VideoBaseTexture = js.native
}

