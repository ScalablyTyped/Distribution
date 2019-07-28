package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "VideoBaseTexture")
@js.native
class VideoBaseTexture protected ()
  extends typings.pixiDotJs.PIXINs.VideoBaseTexture {
  def this(source: HTMLVideoElement) = this()
  def this(source: HTMLVideoElement, scaleMode: Double) = this()
  def this(source: HTMLVideoElement, scaleMode: Double, autoPlay: Boolean) = this()
}

/* static members */
@JSImport("pixi.js", "VideoBaseTexture")
@js.native
object VideoBaseTexture extends js.Object {
  def fromUrl(videoSrc: String): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: String, crossorigin: Boolean): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: String, crossorigin: Boolean, autoPlay: Boolean): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any, crossorigin: Boolean): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Any, crossorigin: Boolean, autoPlay: Boolean): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | String]): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | String], crossorigin: Boolean): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrl(videoSrc: js.Array[_ | String], crossorigin: Boolean, autoPlay: Boolean): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrls(videoSrc: String): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrls(videoSrc: js.Any): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromUrls(videoSrc: js.Array[_ | String]): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromVideo(video: HTMLVideoElement): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double, autoPlay: Boolean): typings.pixiDotJs.PIXINs.VideoBaseTexture = js.native
}

