package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// As of ResourceLoader v2 we no longer require EventEmitter
// However, for depreciation reasons, it remains.
@JSGlobal("PIXI.loaders.Loader")
@js.native
class Loader ()
  extends pixiDotJsLib.PIXINs.utilsNs.EventEmitter {
  def this(baseUrl: java.lang.String) = this()
  def this(baseUrl: java.lang.String, concurrency: scala.Double) = this()
  //tslint:disable-next-line:ban-types forbidden-types
  var _afterMiddleware: js.Array[js.Function] = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _beforeMiddleware: js.Array[js.Function] = js.native
  var _queue: js.Any = js.native
  var _resourcesParsing: js.Array[Resource] = js.native
  var baseUrl: java.lang.String = js.native
  var concurrency: scala.Double = js.native
  var defaultQueryString: java.lang.String = js.native
  var loading: scala.Boolean = js.native
  var onComplete: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var onError: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var onLoad: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var onProgress: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var onStart: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var progress: scala.Double = js.native
  var resources: ResourceDictionary = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def _boundLoadResource(r: Resource, d: js.Function): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def _loadResource(resource: Resource, dequeue: js.Function): scala.Unit = js.native
  /* protected */ def _onComplete(): scala.Unit = js.native
  /* protected */ def _onLoad(resource: Resource): scala.Unit = js.native
  /* protected */ def _onStart(): scala.Unit = js.native
  /* protected */ def _prepareUrl(url: java.lang.String): java.lang.String = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def add(name: java.lang.String, url: java.lang.String): this.type = js.native
  def add(name: java.lang.String, url: java.lang.String, options: LoaderOptions): this.type = js.native
  def add(name: java.lang.String, url: java.lang.String, options: LoaderOptions, cb: js.Function): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def add(obj: java.lang.String): this.type = js.native
  def add(obj: java.lang.String, options: LoaderOptions): this.type = js.native
  def add(obj: java.lang.String, options: LoaderOptions, cb: js.Function): this.type = js.native
  def add(obj: js.Any): this.type = js.native
  def add(obj: js.Any, options: LoaderOptions): this.type = js.native
  def add(obj: js.Any, options: LoaderOptions, cb: js.Function): this.type = js.native
  def add(obj: js.Array[_]): this.type = js.native
  def add(obj: js.Array[_], options: LoaderOptions): this.type = js.native
  def add(obj: js.Array[_], options: LoaderOptions, cb: js.Function): this.type = js.native
  def add(params: js.Any*): this.type = js.native
  def destroy(): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def load(): this.type = js.native
  def load(cb: js.Function): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  @JSName("off")
  def off_complete(event: pixiDotJsLib.pixiDotJsLibStrings.complete): this.type = js.native
  @JSName("off")
  def off_complete(event: pixiDotJsLib.pixiDotJsLibStrings.complete, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_complete(event: pixiDotJsLib.pixiDotJsLibStrings.complete, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_error(event: pixiDotJsLib.pixiDotJsLibStrings.error): this.type = js.native
  @JSName("off")
  def off_error(event: pixiDotJsLib.pixiDotJsLibStrings.error, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_error(event: pixiDotJsLib.pixiDotJsLibStrings.error, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_load(event: pixiDotJsLib.pixiDotJsLibStrings.load): this.type = js.native
  @JSName("off")
  def off_load(event: pixiDotJsLib.pixiDotJsLibStrings.load, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_load(event: pixiDotJsLib.pixiDotJsLibStrings.load, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_progress(event: pixiDotJsLib.pixiDotJsLibStrings.progress): this.type = js.native
  @JSName("off")
  def off_progress(event: pixiDotJsLib.pixiDotJsLibStrings.progress, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_progress(event: pixiDotJsLib.pixiDotJsLibStrings.progress, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_start(event: pixiDotJsLib.pixiDotJsLibStrings.start): this.type = js.native
  @JSName("off")
  def off_start(event: pixiDotJsLib.pixiDotJsLibStrings.start, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_start(event: pixiDotJsLib.pixiDotJsLibStrings.start, fn: js.Function, context: js.Any): this.type = js.native
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
  //tslint:disable-next-line:ban-types forbidden-types
  def pre(fn: js.Function): this.type = js.native
  def reset(): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def use(fn: js.Function): this.type = js.native
}

/* static members */
@JSGlobal("PIXI.loaders.Loader")
@js.native
object Loader extends js.Object {
  // below this line is the original non-pixi loader
  var Resource: js.Any = js.native
  var async: js.Any = js.native
  var base64: js.Any = js.native
  // pixi overrides here
  //tslint:disable-next-line:ban-types forbidden-types
  def addPixiMiddleware(fn: js.Function): scala.Unit = js.native
}

