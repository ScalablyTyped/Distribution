package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.utils.EventEmitter
import typings.pixiDotJs.pixiDotJsNumbers.`0`
import typings.pixiDotJs.pixiDotJsStrings.update
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Texture")
@js.native
class Texture protected () extends EventEmitter {
  def this(baseTexture: BaseTexture) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle, orig: Rectangle) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle, orig: Rectangle, trim: Rectangle) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle, orig: Rectangle, trim: Rectangle, rotate: Double) = this()
  def this(
    baseTexture: BaseTexture,
    frame: Rectangle,
    orig: Rectangle,
    trim: Rectangle,
    rotate: Double,
    anchor: Point
  ) = this()
  var _frame: Rectangle = js.native
  var _rotate: Boolean | `0` = js.native
  var _updateID: Double = js.native
  var _uvs: TextureUvs = js.native
  var baseTexture: BaseTexture = js.native
  var defaultAnchor: Point = js.native
  var frame: Rectangle = js.native
  var height: Double = js.native
  var noFrame: Boolean = js.native
  var orig: Rectangle = js.native
  var requiresUpdate: Boolean = js.native
  var rotate: Double = js.native
  var textureCacheIds: js.Array[String] = js.native
  var transform: TextureMatrix = js.native
  var trim: js.UndefOr[Rectangle] = js.native
  var valid: Boolean = js.native
  var width: Double = js.native
  def _updateUvs(): Unit = js.native
  @JSName("addListener")
  def addListener_update(event: update, fn: js.Function1[/* texture */ this.type, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_update(event: update, fn: js.Function1[/* texture */ this.type, Unit], context: js.Any): this.type = js.native
  def destroy(): Unit = js.native
  def destroy(destroyBase: Boolean): Unit = js.native
  @JSName("off")
  def off_update(event: update): this.type = js.native
  @JSName("off")
  def off_update(event: update, fn: js.Function1[/* texture */ this.type, Unit]): this.type = js.native
  @JSName("off")
  def off_update(event: update, fn: js.Function1[/* texture */ this.type, Unit], context: js.Any): this.type = js.native
  /* protected */ def onBaseTextureLoaded(baseTexture: BaseTexture): Unit = js.native
  /* protected */ def onBaseTextureUpdated(baseTexture: BaseTexture): Unit = js.native
  @JSName("on")
  def on_update(event: update, fn: js.Function1[/* texture */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_update(event: update, fn: js.Function1[/* texture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_update(event: update, fn: js.Function1[/* texture */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_update(event: update, fn: js.Function1[/* texture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_update(event: update): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(event: update): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(event: update, fn: js.Function1[/* texture */ this.type, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(event: update, fn: js.Function1[/* texture */ this.type, Unit], context: js.Any): this.type = js.native
  def update(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Texture")
@js.native
object Texture extends js.Object {
  var EMPTY: Texture = js.native
  var WHITE: Texture = js.native
  // depreciation
  def addTextureToCache(texture: Texture, id: String): Unit = js.native
  def addToCache(texture: Texture, id: String): Unit = js.native
  def from(source: String): Texture = js.native
  def from(source: Double): Texture = js.native
  def from(source: BaseTexture): Texture = js.native
  def from(source: HTMLCanvasElement): Texture = js.native
  def from(source: HTMLImageElement): Texture = js.native
  def from(source: HTMLVideoElement): Texture = js.native
  def fromCanvas(canvas: HTMLCanvasElement): Texture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double): Texture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double, origin: String): Texture = js.native
  def fromFrame(frameId: String): Texture = js.native
  def fromImage(imageUrl: String): Texture = js.native
  def fromImage(imageUrl: String, crossOrigin: Boolean): Texture = js.native
  def fromImage(imageUrl: String, crossOrigin: Boolean, scaleMode: Double): Texture = js.native
  def fromImage(imageUrl: String, crossOrigin: Boolean, scaleMode: Double, sourceScale: Double): Texture = js.native
  def fromLoader(source: HTMLCanvasElement, imageUrl: String): Texture = js.native
  def fromLoader(source: HTMLCanvasElement, imageUrl: String, name: String): Texture = js.native
  def fromLoader(source: HTMLImageElement, imageUrl: String): Texture = js.native
  def fromLoader(source: HTMLImageElement, imageUrl: String, name: String): Texture = js.native
  def fromVideo(video: String): Texture = js.native
  def fromVideo(video: String, scaleMode: Double): Texture = js.native
  def fromVideo(video: String, scaleMode: Double, crossorigin: Boolean): Texture = js.native
  def fromVideo(video: String, scaleMode: Double, crossorigin: Boolean, autoPlay: Boolean): Texture = js.native
  def fromVideo(video: HTMLVideoElement): Texture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double): Texture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double, crossorigin: Boolean): Texture = js.native
  def fromVideo(video: HTMLVideoElement, scaleMode: Double, crossorigin: Boolean, autoPlay: Boolean): Texture = js.native
  def fromVideoUrl(videoUrl: String): Texture = js.native
  def fromVideoUrl(videoUrl: String, scaleMode: Double): Texture = js.native
  def fromVideoUrl(videoUrl: String, scaleMode: Double, crossorigin: Boolean): Texture = js.native
  def fromVideoUrl(videoUrl: String, scaleMode: Double, crossorigin: Boolean, autoPlay: Boolean): Texture = js.native
  def removeFromCache(texture: String): Texture = js.native
  def removeFromCache(texture: Texture): Texture = js.native
  def removeTextureFromCache(id: String): Texture = js.native
}

