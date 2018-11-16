package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "VideoBaseTexture")
@js.native
class VideoBaseTexture protected ()
  extends pixiDotJsLib.PIXINs.VideoBaseTexture {
  def this(source: stdLib.HTMLVideoElement) = this()
  def this(source: stdLib.HTMLVideoElement, scaleMode: scala.Double) = this()
  def this(source: stdLib.HTMLVideoElement, scaleMode: scala.Double, autoPlay: scala.Boolean) = this()
}

@JSImport("pixi.js", "VideoBaseTexture")
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

