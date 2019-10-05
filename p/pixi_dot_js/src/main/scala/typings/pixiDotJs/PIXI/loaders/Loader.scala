package typings.pixiDotJs.PIXI.loaders

import org.scalablytyped.runtime.Instantiable3
import typings.pixiDotJs.PIXI.MiniSignal
import typings.pixiDotJs.PIXI.utils.EventEmitter
import typings.pixiDotJs.TypeofResource
import typings.pixiDotJs.pixiDotJsStrings.complete
import typings.pixiDotJs.pixiDotJsStrings.error
import typings.pixiDotJs.pixiDotJsStrings.load
import typings.pixiDotJs.pixiDotJsStrings.progress
import typings.pixiDotJs.pixiDotJsStrings.start
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// As of ResourceLoader v2 we no longer require EventEmitter
// However, for depreciation reasons, it remains.
@JSGlobal("PIXI.loaders.Loader")
@js.native
// below this line is the original non-pixi loader
class Loader () extends EventEmitter {
  def this(baseUrl: String) = this()
  def this(baseUrl: String, concurrency: Double) = this()
  var baseUrl: String = js.native
  var concurrency: Double = js.native
  var defaultQueryString: String = js.native
  var loading: Boolean = js.native
  var onComplete: MiniSignal[OnCompleteSignal] = js.native
  var onError: MiniSignal[OnErrorSignal] = js.native
  var onLoad: MiniSignal[OnLoadSignal] = js.native
  var onProgress: MiniSignal[OnProgressSignal] = js.native
  var onStart: MiniSignal[OnStartSignal] = js.native
  var progress: Double = js.native
  var resources: ResourceDictionary = js.native
  def add(name: String, url: String): this.type = js.native
  def add(name: String, url: String, callback: OnCompleteSignal): this.type = js.native
  def add(name: String, url: String, options: LoaderOptions): this.type = js.native
  def add(name: String, url: String, options: LoaderOptions, callback: OnCompleteSignal): this.type = js.native
  def add(options: LoaderOptions): this.type = js.native
  def add(options: LoaderOptions, callback: OnCompleteSignal): this.type = js.native
  def add(params: js.Any*): this.type = js.native
  def add(resources: js.Array[LoaderOptions | String]): this.type = js.native
  def add(resources: js.Array[LoaderOptions | String], callback: OnCompleteSignal): this.type = js.native
  def add(url: String): this.type = js.native
  def add(url: String, callback: OnCompleteSignal): this.type = js.native
  def add(url: String, options: LoaderOptions): this.type = js.native
  def add(url: String, options: LoaderOptions, callback: OnCompleteSignal): this.type = js.native
  def destroy(): Unit = js.native
  def load(): this.type = js.native
  def load(cb: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_complete(event: complete): this.type = js.native
  @JSName("off")
  def off_complete(event: complete, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_complete(event: complete, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  @JSName("off")
  def off_error(event: error): this.type = js.native
  @JSName("off")
  def off_error(event: error, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_error(event: error, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  @JSName("off")
  def off_load(event: load): this.type = js.native
  @JSName("off")
  def off_load(event: load, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_load(event: load, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  @JSName("off")
  def off_progress(event: progress): this.type = js.native
  @JSName("off")
  def off_progress(event: progress, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_progress(event: progress, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  @JSName("off")
  def off_start(event: start): this.type = js.native
  @JSName("off")
  def off_start(event: start, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_start(event: start, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  // depreciation
  @JSName("on")
  def on_complete(event: complete, fn: js.Function2[/* loader */ this.type, /* object */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_complete(
    event: complete,
    fn: js.Function2[/* loader */ this.type, /* object */ js.Any, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: error,
    fn: js.Function3[/* error */ Error, /* loader */ this.type, /* resource */ Resource, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: error,
    fn: js.Function3[/* error */ Error, /* loader */ this.type, /* resource */ Resource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_load(event: load, fn: js.Function2[/* loader */ this.type, /* resource */ Resource, Unit]): this.type = js.native
  @JSName("on")
  def on_load(
    event: load,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, fn: js.Function2[/* loader */ this.type, /* resource */ Resource, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(
    event: progress,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_start(event: start, fn: js.Function1[/* loader */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, fn: js.Function1[/* loader */ this.type, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_complete(event: complete, fn: js.Function2[/* loader */ this.type, /* object */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_complete(
    event: complete,
    fn: js.Function2[/* loader */ this.type, /* object */ js.Any, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: error,
    fn: js.Function3[/* error */ Error, /* loader */ this.type, /* resource */ Resource, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: error,
    fn: js.Function3[/* error */ Error, /* loader */ this.type, /* resource */ Resource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_load(event: load, fn: js.Function2[/* loader */ this.type, /* resource */ Resource, Unit]): this.type = js.native
  @JSName("once")
  def once_load(
    event: load,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_progress(event: progress, fn: js.Function2[/* loader */ this.type, /* resource */ Resource, Unit]): this.type = js.native
  @JSName("once")
  def once_progress(
    event: progress,
    fn: js.Function2[/* loader */ this.type, /* resource */ Resource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_start(event: start, fn: js.Function1[/* loader */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_start(event: start, fn: js.Function1[/* loader */ this.type, Unit], context: js.Any): this.type = js.native
  def pre(fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def reset(): this.type = js.native
  def use(fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
}

/* static members */
@JSGlobal("PIXI.loaders.Loader")
@js.native
object Loader extends js.Object {
  var Resource: TypeofResource with (Instantiable3[
    /* name */ String, 
    /* url */ String | js.Array[String], 
    js.UndefOr[/* options */ LoaderOptions], 
    typings.pixiDotJs.PIXI.loaders.Resource
  ]) = js.native
  var async: TypeofResource with (Instantiable3[
    /* name */ String, 
    /* url */ String | js.Array[String], 
    js.UndefOr[/* options */ LoaderOptions], 
    Resource
  ]) = js.native
  @JSName("base64")
  var base64_Original: js.Function1[/* input */ String, String] = js.native
  @JSName("encodeBinary")
  var encodeBinary_Original: js.Function1[/* input */ String, String] = js.native
  // pixi overrides here
  def addPixiMiddleware(fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def base64(input: String): String = js.native
  def encodeBinary(input: String): String = js.native
  def pre(fn: js.Function1[/* repeated */ js.Any, _]): Loader = js.native
  def use(fn: js.Function1[/* repeated */ js.Any, _]): Loader = js.native
}

