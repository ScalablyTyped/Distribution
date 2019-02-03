package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Texture")
@js.native
class Texture protected ()
  extends pixiDotJsLib.PIXINs.Texture {
  def this(baseTexture: pixiDotJsLib.PIXINs.BaseTexture) = this()
  def this(baseTexture: pixiDotJsLib.PIXINs.BaseTexture, frame: pixiDotJsLib.PIXINs.Rectangle) = this()
  def this(baseTexture: pixiDotJsLib.PIXINs.BaseTexture, frame: pixiDotJsLib.PIXINs.Rectangle, orig: pixiDotJsLib.PIXINs.Rectangle) = this()
  def this(baseTexture: pixiDotJsLib.PIXINs.BaseTexture, frame: pixiDotJsLib.PIXINs.Rectangle, orig: pixiDotJsLib.PIXINs.Rectangle, trim: pixiDotJsLib.PIXINs.Rectangle) = this()
  def this(baseTexture: pixiDotJsLib.PIXINs.BaseTexture, frame: pixiDotJsLib.PIXINs.Rectangle, orig: pixiDotJsLib.PIXINs.Rectangle, trim: pixiDotJsLib.PIXINs.Rectangle, rotate: scala.Double) = this()
  def this(baseTexture: pixiDotJsLib.PIXINs.BaseTexture, frame: pixiDotJsLib.PIXINs.Rectangle, orig: pixiDotJsLib.PIXINs.Rectangle, trim: pixiDotJsLib.PIXINs.Rectangle, rotate: scala.Double, anchor: pixiDotJsLib.PIXINs.Point) = this()
}

/* static members */
@JSImport("pixi.js", "Texture")
@js.native
object Texture extends js.Object {
  var EMPTY: pixiDotJsLib.PIXINs.Texture = js.native
  var WHITE: pixiDotJsLib.PIXINs.Texture = js.native
  // depreciation
  def addTextureToCache(texture: pixiDotJsLib.PIXINs.Texture, id: java.lang.String): scala.Unit = js.native
  def addToCache(texture: pixiDotJsLib.PIXINs.Texture, id: java.lang.String): scala.Unit = js.native
  def from(source: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def from(source: pixiDotJsLib.PIXINs.BaseTexture): pixiDotJsLib.PIXINs.Texture = js.native
  def from(source: scala.Double): pixiDotJsLib.PIXINs.Texture = js.native
  def from(source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.Texture = js.native
  def from(source: stdLib.HTMLImageElement): pixiDotJsLib.PIXINs.Texture = js.native
  def from(source: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.Texture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.Texture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Texture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement, scaleMode: scala.Double, origin: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromFrame(frameId: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromImage(imageUrl: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromImage(imageUrl: java.lang.String, crossOrigin: scala.Boolean): pixiDotJsLib.PIXINs.Texture = js.native
  def fromImage(imageUrl: java.lang.String, crossOrigin: scala.Boolean, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Texture = js.native
  def fromImage(
    imageUrl: java.lang.String,
    crossOrigin: scala.Boolean,
    scaleMode: scala.Double,
    sourceScale: scala.Double
  ): pixiDotJsLib.PIXINs.Texture = js.native
  def fromLoader(source: stdLib.HTMLCanvasElement, imageUrl: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromLoader(source: stdLib.HTMLCanvasElement, imageUrl: java.lang.String, name: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromLoader(source: stdLib.HTMLImageElement, imageUrl: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromLoader(source: stdLib.HTMLImageElement, imageUrl: java.lang.String, name: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideo(video: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideo(video: java.lang.String, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideo(video: java.lang.String, scaleMode: scala.Double, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideo(
    video: java.lang.String,
    scaleMode: scala.Double,
    crossorigin: scala.Boolean,
    autoPlay: scala.Boolean
  ): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideo(video: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideo(video: stdLib.HTMLVideoElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideo(video: stdLib.HTMLVideoElement, scaleMode: scala.Double, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideo(
    video: stdLib.HTMLVideoElement,
    scaleMode: scala.Double,
    crossorigin: scala.Boolean,
    autoPlay: scala.Boolean
  ): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideoUrl(videoUrl: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideoUrl(videoUrl: java.lang.String, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideoUrl(videoUrl: java.lang.String, scaleMode: scala.Double, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.Texture = js.native
  def fromVideoUrl(
    videoUrl: java.lang.String,
    scaleMode: scala.Double,
    crossorigin: scala.Boolean,
    autoPlay: scala.Boolean
  ): pixiDotJsLib.PIXINs.Texture = js.native
  def removeFromCache(texture: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
  def removeFromCache(texture: pixiDotJsLib.PIXINs.Texture): pixiDotJsLib.PIXINs.Texture = js.native
  def removeTextureFromCache(id: java.lang.String): pixiDotJsLib.PIXINs.Texture = js.native
}

