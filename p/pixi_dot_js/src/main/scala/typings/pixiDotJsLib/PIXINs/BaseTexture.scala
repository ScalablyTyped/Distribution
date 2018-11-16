package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.BaseTexture")
@js.native
class BaseTexture ()
  extends pixiDotJsLib.PIXINs.utilsNs.EventEmitter {
  def this(source: stdLib.HTMLCanvasElement) = this()
  def this(source: stdLib.HTMLImageElement) = this()
  def this(source: stdLib.HTMLVideoElement) = this()
  def this(source: stdLib.HTMLCanvasElement, scaleMode: scala.Double) = this()
  def this(source: stdLib.HTMLImageElement, scaleMode: scala.Double) = this()
  def this(source: stdLib.HTMLVideoElement, scaleMode: scala.Double) = this()
  def this(source: stdLib.HTMLCanvasElement, scaleMode: scala.Double, resolution: scala.Double) = this()
  def this(source: stdLib.HTMLImageElement, scaleMode: scala.Double, resolution: scala.Double) = this()
  def this(source: stdLib.HTMLVideoElement, scaleMode: scala.Double, resolution: scala.Double) = this()
  val _destroyed: scala.Boolean = js.native
  var _enabled: scala.Double = js.native
  var _glTextures: js.Any = js.native
  var _id: js.UndefOr[scala.Double] = js.native
  var _virtualBoundId: scala.Double = js.native
  var hasLoaded: scala.Boolean = js.native
  var height: scala.Double = js.native
  var imageType: java.lang.String | scala.Null = js.native
  var imageUrl: java.lang.String | scala.Null = js.native
  var isLoading: scala.Boolean = js.native
  var isPowerOfTwo: scala.Boolean = js.native
  var mipmap: scala.Boolean = js.native
  var origSource: stdLib.HTMLImageElement | scala.Null = js.native
  var premultipliedAlpha: scala.Boolean = js.native
  var realHeight: scala.Double = js.native
  var realWidth: scala.Double = js.native
  var resolution: scala.Double = js.native
  var scaleMode: scala.Double = js.native
  var source: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | scala.Null = js.native
  var sourceScale: scala.Double = js.native
  var textureCacheIds: js.Array[java.lang.String] = js.native
  var touched: scala.Double = js.native
  var uuid: js.UndefOr[scala.Double] = js.native
  var width: scala.Double = js.native
  var wrap: js.UndefOr[scala.Boolean] = js.native
  var wrapMode: scala.Double = js.native
  /* protected */ def _loadSvgSource(): scala.Unit = js.native
  /* protected */ def _loadSvgSourceUsingDataUri(dataUri: java.lang.String): scala.Unit = js.native
  /* protected */ def _loadSvgSourceUsingString(svgString: java.lang.String): scala.Unit = js.native
  /* protected */ def _loadSvgSourceUsingXhr(): scala.Unit = js.native
  /* protected */ def _sourceLoaded(): scala.Unit = js.native
  /* protected */ def _updateDimensions(): scala.Unit = js.native
  /* protected */ def _updateImageType(): scala.Unit = js.native
  @JSName("addListener")
  def addListener_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("addListener")
  def addListener_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("addListener")
  def addListener_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def destroy(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  /* protected */ def loadSource(source: stdLib.HTMLCanvasElement): scala.Unit = js.native
  /* protected */ def loadSource(source: stdLib.HTMLImageElement): scala.Unit = js.native
  /* protected */ def loadSource(source: stdLib.HTMLVideoElement): scala.Unit = js.native
  @JSName("off")
  def off_dispose(event: pixiDotJsLib.pixiDotJsLibStrings.dispose): this.type = js.native
  @JSName("off")
  def off_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_error(event: pixiDotJsLib.pixiDotJsLibStrings.error): this.type = js.native
  @JSName("off")
  def off_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_loaded(event: pixiDotJsLib.pixiDotJsLibStrings.loaded): this.type = js.native
  @JSName("off")
  def off_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_update(event: pixiDotJsLib.pixiDotJsLibStrings.update): this.type = js.native
  @JSName("off")
  def off_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_dispose(event: pixiDotJsLib.pixiDotJsLibStrings.dispose): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_error(event: pixiDotJsLib.pixiDotJsLibStrings.error): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_loaded(event: pixiDotJsLib.pixiDotJsLibStrings.loaded): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_update(event: pixiDotJsLib.pixiDotJsLibStrings.update): this.type = js.native
  @JSName("removeListener")
  def removeListener_dispose(event: pixiDotJsLib.pixiDotJsLibStrings.dispose): this.type = js.native
  @JSName("removeListener")
  def removeListener_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_dispose(
    event: pixiDotJsLib.pixiDotJsLibStrings.dispose,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: pixiDotJsLib.pixiDotJsLibStrings.error): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_loaded(event: pixiDotJsLib.pixiDotJsLibStrings.loaded): this.type = js.native
  @JSName("removeListener")
  def removeListener_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_loaded(
    event: pixiDotJsLib.pixiDotJsLibStrings.loaded,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(event: pixiDotJsLib.pixiDotJsLibStrings.update): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(
    event: pixiDotJsLib.pixiDotJsLibStrings.update,
    fn: js.Function1[/* baseTexture */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def update(): scala.Unit = js.native
  def updateSourceImage(newSrc: java.lang.String): scala.Unit = js.native
}

@JSGlobal("PIXI.BaseTexture")
@js.native
object BaseTexture extends js.Object {
  def addToCache(baseTexture: pixiDotJsLib.PIXINs.BaseTexture, id: java.lang.String): scala.Unit = js.native
  def from(source: java.lang.String): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: java.lang.String, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: java.lang.String, scaleMode: scala.Double, sourceScale: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLCanvasElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLCanvasElement, scaleMode: scala.Double, sourceScale: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLImageElement): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLImageElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def from(source: stdLib.HTMLImageElement, scaleMode: scala.Double, sourceScale: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromCanvas(canvas: stdLib.HTMLCanvasElement, scaleMode: scala.Double, origin: java.lang.String): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromImage(imageUrl: java.lang.String): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromImage(imageUrl: java.lang.String, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromImage(imageUrl: java.lang.String, crossorigin: scala.Boolean, scaleMode: scala.Double): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def fromImage(
    imageUrl: java.lang.String,
    crossorigin: scala.Boolean,
    scaleMode: scala.Double,
    sourceScale: scala.Double
  ): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def removeFromCache(baseTexture: java.lang.String): pixiDotJsLib.PIXINs.BaseTexture = js.native
  def removeFromCache(baseTexture: pixiDotJsLib.PIXINs.BaseTexture): pixiDotJsLib.PIXINs.BaseTexture = js.native
}

