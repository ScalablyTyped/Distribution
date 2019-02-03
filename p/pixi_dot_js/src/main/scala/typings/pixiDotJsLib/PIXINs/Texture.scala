package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Texture")
@js.native
class Texture protected ()
  extends pixiDotJsLib.PIXINs.utilsNs.EventEmitter {
  def this(baseTexture: BaseTexture) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle, orig: Rectangle) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle, orig: Rectangle, trim: Rectangle) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle, orig: Rectangle, trim: Rectangle, rotate: scala.Double) = this()
  def this(baseTexture: BaseTexture, frame: Rectangle, orig: Rectangle, trim: Rectangle, rotate: scala.Double, anchor: Point) = this()
  var _frame: Rectangle = js.native
  var _rotate: scala.Boolean | pixiDotJsLib.pixiDotJsLibNumbers.`0` = js.native
  var _updateID: scala.Double = js.native
  var _uvs: TextureUvs = js.native
  var baseTexture: BaseTexture = js.native
  var defaultAnchor: Point = js.native
  var frame: Rectangle = js.native
  var height: scala.Double = js.native
  var noFrame: scala.Boolean = js.native
  var orig: Rectangle = js.native
  var requiresUpdate: scala.Boolean = js.native
  var rotate: scala.Double = js.native
  var textureCacheIds: js.Array[java.lang.String] = js.native
  var transform: TextureMatrix = js.native
  var trim: js.UndefOr[Rectangle] = js.native
  var valid: scala.Boolean = js.native
  var width: scala.Double = js.native
  def _updateUvs(): scala.Unit = js.native
  @JSName("addListener")
  def addListener_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def destroy(): scala.Unit = js.native
  def destroy(destroyBase: scala.Boolean): scala.Unit = js.native
  @JSName("off")
  def off_update(event: pixiDotJsLib.pixiDotJsLibStrings.update): this.type = js.native
  @JSName("off")
  def off_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  /* protected */ def onBaseTextureLoaded(baseTexture: BaseTexture): scala.Unit = js.native
  /* protected */ def onBaseTextureUpdated(baseTexture: BaseTexture): scala.Unit = js.native
  @JSName("on")
  def on_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_update(event: pixiDotJsLib.pixiDotJsLibStrings.update): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(event: pixiDotJsLib.pixiDotJsLibStrings.update): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* texture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def update(): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Texture")
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

