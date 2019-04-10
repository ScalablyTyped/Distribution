package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// As of ResourceLoader v2 we no longer require EventEmitter
// However, for depreciation reasons, it remains.
@JSGlobal("PIXI.loaders.Loader")
@js.native
// below this line is the original non-pixi loader
class Loader ()
  extends pixiDotJsLib.PIXINs.utilsNs.EventEmitter {
  def this(baseUrl: java.lang.String) = this()
  def this(baseUrl: java.lang.String, concurrency: scala.Double) = this()
  var baseUrl: java.lang.String = js.native
  var concurrency: scala.Double = js.native
  var defaultQueryString: java.lang.String = js.native
  var loading: scala.Boolean = js.native
  var onComplete: pixiDotJsLib.PIXINs.MiniSignal[OnCompleteSignal] = js.native
  var onError: pixiDotJsLib.PIXINs.MiniSignal[OnErrorSignal] = js.native
  var onLoad: pixiDotJsLib.PIXINs.MiniSignal[OnLoadSignal] = js.native
  var onProgress: pixiDotJsLib.PIXINs.MiniSignal[OnProgressSignal] = js.native
  var onStart: pixiDotJsLib.PIXINs.MiniSignal[OnStartSignal] = js.native
  var progress: scala.Double = js.native
  var resources: ResourceDictionary = js.native
  def add(name: java.lang.String, url: java.lang.String): this.type = js.native
  def add(name: java.lang.String, url: java.lang.String, callback: OnCompleteSignal): this.type = js.native
  def add(name: java.lang.String, url: java.lang.String, options: LoaderOptions): this.type = js.native
  def add(name: java.lang.String, url: java.lang.String, options: LoaderOptions, callback: OnCompleteSignal): this.type = js.native
  def add(options: LoaderOptions): this.type = js.native
  def add(options: LoaderOptions, callback: OnCompleteSignal): this.type = js.native
  def add(params: js.Any*): this.type = js.native
  def add(resources: js.Array[LoaderOptions | java.lang.String]): this.type = js.native
  def add(resources: js.Array[LoaderOptions | java.lang.String], callback: OnCompleteSignal): this.type = js.native
  def add(url: java.lang.String): this.type = js.native
  def add(url: java.lang.String, callback: OnCompleteSignal): this.type = js.native
  def add(url: java.lang.String, options: LoaderOptions): this.type = js.native
  def add(url: java.lang.String, options: LoaderOptions, callback: OnCompleteSignal): this.type = js.native
  def destroy(): scala.Unit = js.native
  def load(): this.type = js.native
  def load(cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_complete(event: pixiDotJsLib.pixiDotJsLibStrings.complete): this.type = js.native
  @JSName("off")
  def off_complete(event: pixiDotJsLib.pixiDotJsLibStrings.complete, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_complete(
    event: pixiDotJsLib.pixiDotJsLibStrings.complete,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_error(event: pixiDotJsLib.pixiDotJsLibStrings.error): this.type = js.native
  @JSName("off")
  def off_error(event: pixiDotJsLib.pixiDotJsLibStrings.error, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_load(event: pixiDotJsLib.pixiDotJsLibStrings.load): this.type = js.native
  @JSName("off")
  def off_load(event: pixiDotJsLib.pixiDotJsLibStrings.load, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_load(
    event: pixiDotJsLib.pixiDotJsLibStrings.load,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_progress(event: pixiDotJsLib.pixiDotJsLibStrings.progress): this.type = js.native
  @JSName("off")
  def off_progress(event: pixiDotJsLib.pixiDotJsLibStrings.progress, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_progress(
    event: pixiDotJsLib.pixiDotJsLibStrings.progress,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_start(event: pixiDotJsLib.pixiDotJsLibStrings.start): this.type = js.native
  @JSName("off")
  def off_start(event: pixiDotJsLib.pixiDotJsLibStrings.start, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_start(
    event: pixiDotJsLib.pixiDotJsLibStrings.start,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): this.type = js.native
  // depreciation
  @JSName("on")
  def on_complete(
    event: pixiDotJsLib.pixiDotJsLibStrings.complete,
    fn: js.Function2[/* loader */ this.type, /* object */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_complete(
    event: pixiDotJsLib.pixiDotJsLibStrings.complete,
    fn: js.Function2[/* loader */ this.type, /* object */ js.Any, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function3[/* error */ stdLib.Error, /* loader */ this.type, /* resource */ Resource, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function3[/* error */ stdLib.Error, /* loader */ this.type, /* resource */ Resource, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_load(
    event: pixiDotJsLib.pixiDotJsLibStrings.load,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_load(
    event: pixiDotJsLib.pixiDotJsLibStrings.load,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_progress(
    event: pixiDotJsLib.pixiDotJsLibStrings.progress,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(
    event: pixiDotJsLib.pixiDotJsLibStrings.progress,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_start(
    event: pixiDotJsLib.pixiDotJsLibStrings.start,
    fn: js.Function1[/* loader */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_start(
    event: pixiDotJsLib.pixiDotJsLibStrings.start,
    fn: js.Function1[/* loader */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_complete(
    event: pixiDotJsLib.pixiDotJsLibStrings.complete,
    fn: js.Function2[/* loader */ this.type, /* object */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_complete(
    event: pixiDotJsLib.pixiDotJsLibStrings.complete,
    fn: js.Function2[/* loader */ this.type, /* object */ js.Any, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function3[/* error */ stdLib.Error, /* loader */ this.type, /* resource */ Resource, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: pixiDotJsLib.pixiDotJsLibStrings.error,
    fn: js.Function3[/* error */ stdLib.Error, /* loader */ this.type, /* resource */ Resource, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_load(
    event: pixiDotJsLib.pixiDotJsLibStrings.load,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_load(
    event: pixiDotJsLib.pixiDotJsLibStrings.load,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_progress(
    event: pixiDotJsLib.pixiDotJsLibStrings.progress,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_progress(
    event: pixiDotJsLib.pixiDotJsLibStrings.progress,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_start(
    event: pixiDotJsLib.pixiDotJsLibStrings.start,
    fn: js.Function1[/* loader */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_start(
    event: pixiDotJsLib.pixiDotJsLibStrings.start,
    fn: js.Function1[/* loader */ this.type, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def pre(fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def reset(): this.type = js.native
  def use(fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
}

/* static members */
@JSGlobal("PIXI.loaders.Loader")
@js.native
object Loader extends js.Object {
  var Resource: pixiDotJsLib.Anon_EMPTYGIF = js.native
  var async: pixiDotJsLib.Anon_EMPTYGIF = js.native
  @JSName("base64")
  var base64_Original: js.Function1[/* input */ java.lang.String, java.lang.String] = js.native
  @JSName("encodeBinary")
  var encodeBinary_Original: js.Function1[/* input */ java.lang.String, java.lang.String] = js.native
  // pixi overrides here
  def addPixiMiddleware(fn: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def base64(input: java.lang.String): java.lang.String = js.native
  def encodeBinary(input: java.lang.String): java.lang.String = js.native
  def pre(fn: js.Function1[/* repeated */ js.Any, _]): pixiDotJsLib.PIXINs.loadersNs.Loader = js.native
  def use(fn: js.Function1[/* repeated */ js.Any, _]): pixiDotJsLib.PIXINs.loadersNs.Loader = js.native
}

