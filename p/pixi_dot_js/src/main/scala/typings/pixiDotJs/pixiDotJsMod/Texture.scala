package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Texture")
@js.native
class Texture protected ()
  extends typings.pixiDotJs.PIXI.Texture {
  def this(baseTexture: typings.pixiDotJs.PIXI.BaseTexture) = this()
  def this(baseTexture: typings.pixiDotJs.PIXI.BaseTexture, frame: typings.pixiDotJs.PIXI.Rectangle) = this()
  def this(
    baseTexture: typings.pixiDotJs.PIXI.BaseTexture,
    frame: typings.pixiDotJs.PIXI.Rectangle,
    orig: typings.pixiDotJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiDotJs.PIXI.BaseTexture,
    frame: typings.pixiDotJs.PIXI.Rectangle,
    orig: typings.pixiDotJs.PIXI.Rectangle,
    trim: typings.pixiDotJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiDotJs.PIXI.BaseTexture,
    frame: typings.pixiDotJs.PIXI.Rectangle,
    orig: typings.pixiDotJs.PIXI.Rectangle,
    trim: typings.pixiDotJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiDotJs.PIXI.BaseTexture,
    frame: typings.pixiDotJs.PIXI.Rectangle,
    orig: typings.pixiDotJs.PIXI.Rectangle,
    trim: typings.pixiDotJs.PIXI.Rectangle,
    rotate: Double,
    anchor: typings.pixiDotJs.PIXI.Point
  ) = this()
}

/* static members */
@JSImport("pixi.js", "Texture")
@js.native
object Texture extends js.Object {
  var EMPTY: typings.pixiDotJs.PIXI.Texture = js.native
  var WHITE: typings.pixiDotJs.PIXI.Texture = js.native
  // depreciation
  def addTextureToCache(texture: typings.pixiDotJs.PIXI.Texture, id: String): Unit = js.native
  def addToCache(texture: typings.pixiDotJs.PIXI.Texture, id: String): Unit = js.native
  def from(source: String): typings.pixiDotJs.PIXI.Texture = js.native
  def from(source: Double): typings.pixiDotJs.PIXI.Texture = js.native
  def from(source: typings.pixiDotJs.PIXI.BaseTexture): typings.pixiDotJs.PIXI.Texture = js.native
  def from(source: HTMLCanvasElement): typings.pixiDotJs.PIXI.Texture = js.native
  def from(source: HTMLImageElement): typings.pixiDotJs.PIXI.Texture = js.native
  def from(source: HTMLVideoElement): typings.pixiDotJs.PIXI.Texture = js.native
  def fromCanvas(canvas: HTMLCanvasElement): typings.pixiDotJs.PIXI.Texture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double): typings.pixiDotJs.PIXI.Texture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double, origin: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromFrame(frameId: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromImage(imageUrl: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromImage(imageUrl: String, crossOrigin: Boolean): typings.pixiDotJs.PIXI.Texture = js.native
  def fromImage(imageUrl: String, crossOrigin: Boolean, scaleMode: Double): typings.pixiDotJs.PIXI.Texture = js.native
  def fromImage(imageUrl: String, crossOrigin: Boolean, scaleMode: Double, sourceScale: Double): typings.pixiDotJs.PIXI.Texture = js.native
  def fromLoader(source: HTMLCanvasElement, imageUrl: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromLoader(source: HTMLCanvasElement, imageUrl: String, name: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromLoader(source: HTMLImageElement, imageUrl: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromLoader(source: HTMLImageElement, imageUrl: String, name: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideo(video: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideo(video: String, scaleMode: Double): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideo(video: String, scaleMode: Double, crossorigin: Boolean): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideo(video: String, scaleMode: Double, crossorigin: Boolean, autoPlay: Boolean): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideo(video: HTMLVideoElement): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double, crossorigin: Boolean): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double, crossorigin: Boolean, autoPlay: Boolean): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideoUrl(videoUrl: String): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideoUrl(videoUrl: String, scaleMode: Double): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideoUrl(videoUrl: String, scaleMode: Double, crossorigin: Boolean): typings.pixiDotJs.PIXI.Texture = js.native
  def fromVideoUrl(videoUrl: String, scaleMode: Double, crossorigin: Boolean, autoPlay: Boolean): typings.pixiDotJs.PIXI.Texture = js.native
  def removeFromCache(texture: String): typings.pixiDotJs.PIXI.Texture = js.native
  def removeFromCache(texture: typings.pixiDotJs.PIXI.Texture): typings.pixiDotJs.PIXI.Texture = js.native
  def removeTextureFromCache(id: String): typings.pixiDotJs.PIXI.Texture = js.native
}

