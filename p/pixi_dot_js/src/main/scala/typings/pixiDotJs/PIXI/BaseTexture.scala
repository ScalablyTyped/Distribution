package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.utils.EventEmitter
import typings.pixiDotJs.pixiDotJsStrings.dispose
import typings.pixiDotJs.pixiDotJsStrings.error
import typings.pixiDotJs.pixiDotJsStrings.loaded
import typings.pixiDotJs.pixiDotJsStrings.update
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.BaseTexture")
@js.native
class BaseTexture () extends EventEmitter {
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLImageElement) = this()
  def this(source: HTMLVideoElement) = this()
  def this(source: HTMLCanvasElement, scaleMode: Double) = this()
  def this(source: HTMLImageElement, scaleMode: Double) = this()
  def this(source: HTMLVideoElement, scaleMode: Double) = this()
  def this(source: HTMLCanvasElement, scaleMode: Double, resolution: Double) = this()
  def this(source: HTMLImageElement, scaleMode: Double, resolution: Double) = this()
  def this(source: HTMLVideoElement, scaleMode: Double, resolution: Double) = this()
  val _destroyed: Boolean = js.native
  var _enabled: Double = js.native
  var _glTextures: js.Any = js.native
  var _id: js.UndefOr[Double] = js.native
  var _virtualBoundId: Double = js.native
  var hasLoaded: Boolean = js.native
  var height: Double = js.native
  var imageType: String | Null = js.native
  var imageUrl: String | Null = js.native
  var isLoading: Boolean = js.native
  var isPowerOfTwo: Boolean = js.native
  var mipmap: Boolean = js.native
  var origSource: HTMLImageElement | Null = js.native
  var premultipliedAlpha: Boolean = js.native
  var realHeight: Double = js.native
  var realWidth: Double = js.native
  var resolution: Double = js.native
  var scaleMode: Double = js.native
  var source: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | Null = js.native
  var sourceScale: Double = js.native
  var textureCacheIds: js.Array[String] = js.native
  var touched: Double = js.native
  var uuid: js.UndefOr[Double] = js.native
  var width: Double = js.native
  var wrap: js.UndefOr[Boolean] = js.native
  var wrapMode: Double = js.native
  /* protected */ def _loadSvgSource(): Unit = js.native
  /* protected */ def _loadSvgSourceUsingDataUri(dataUri: String): Unit = js.native
  /* protected */ def _loadSvgSourceUsingString(svgString: String): Unit = js.native
  /* protected */ def _loadSvgSourceUsingXhr(): Unit = js.native
  /* protected */ def _sourceLoaded(): Unit = js.native
  /* protected */ def _updateDimensions(): Unit = js.native
  /* protected */ def _updateImageType(): Unit = js.native
  @JSName("addListener")
  def addListener_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("addListener")
  def addListener_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("addListener")
  def addListener_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  def destroy(): Unit = js.native
  def dispose(): Unit = js.native
  /* protected */ def loadSource(source: HTMLCanvasElement): Unit = js.native
  /* protected */ def loadSource(source: HTMLImageElement): Unit = js.native
  /* protected */ def loadSource(source: HTMLVideoElement): Unit = js.native
  @JSName("off")
  def off_dispose(event: dispose): this.type = js.native
  @JSName("off")
  def off_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("off")
  def off_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("off")
  def off_error(event: error): this.type = js.native
  @JSName("off")
  def off_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("off")
  def off_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("off")
  def off_loaded(event: loaded): this.type = js.native
  @JSName("off")
  def off_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("off")
  def off_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("off")
  def off_update(event: update): this.type = js.native
  @JSName("off")
  def off_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("off")
  def off_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_dispose(event: dispose): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_error(event: error): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_loaded(event: loaded): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_update(event: update): this.type = js.native
  @JSName("removeListener")
  def removeListener_dispose(event: dispose): this.type = js.native
  @JSName("removeListener")
  def removeListener_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_dispose(event: dispose, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("removeListener")
  def removeListener_loaded(event: loaded): this.type = js.native
  @JSName("removeListener")
  def removeListener_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_loaded(event: loaded, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(event: update): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(event: update, fn: js.Function1[/* baseTexture */ this.type, Unit], context: js.Any): this.type = js.native
  def update(): Unit = js.native
  def updateSourceImage(newSrc: String): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.BaseTexture")
@js.native
object BaseTexture extends js.Object {
  def addToCache(baseTexture: BaseTexture, id: String): Unit = js.native
  def from(source: String): BaseTexture = js.native
  def from(source: String, scaleMode: Double): BaseTexture = js.native
  def from(source: String, scaleMode: Double, sourceScale: Double): BaseTexture = js.native
  def from(source: HTMLCanvasElement): BaseTexture = js.native
  def from(source: HTMLCanvasElement, scaleMode: Double): BaseTexture = js.native
  def from(source: HTMLCanvasElement, scaleMode: Double, sourceScale: Double): BaseTexture = js.native
  def from(source: HTMLImageElement): BaseTexture = js.native
  def from(source: HTMLImageElement, scaleMode: Double): BaseTexture = js.native
  def from(source: HTMLImageElement, scaleMode: Double, sourceScale: Double): BaseTexture = js.native
  def fromCanvas(canvas: HTMLCanvasElement): BaseTexture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double): BaseTexture = js.native
  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double, origin: String): BaseTexture = js.native
  def fromImage(imageUrl: String): BaseTexture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean): BaseTexture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean, scaleMode: Double): BaseTexture = js.native
  def fromImage(imageUrl: String, crossorigin: Boolean, scaleMode: Double, sourceScale: Double): BaseTexture = js.native
  def removeFromCache(baseTexture: String): BaseTexture = js.native
  def removeFromCache(baseTexture: BaseTexture): BaseTexture = js.native
}

