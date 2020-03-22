package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.utils.EventEmitter
import typings.pixiJs.pixiJsStrings.complete
import typings.pixiJs.pixiJsStrings.error
import typings.pixiJs.pixiJsStrings.load
import typings.pixiJs.pixiJsStrings.progress
import typings.pixiJs.pixiJsStrings.start
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The new loader, extends Resource Loader by Chad Engler: https://github.com/englercj/resource-loader
  *
  * ```js
  * const loader = PIXI.Loader.shared; // PixiJS exposes a premade instance for you to use.
  * //or
  * const loader = new PIXI.Loader(); // you can also create your own if you want
  *
  * const sprites = {};
  *
  * // Chainable `add` to enqueue a resource
  * loader.add('bunny', 'data/bunny.png')
  *       .add('spaceship', 'assets/spritesheet.json');
  * loader.add('scoreFont', 'assets/score.fnt');
  *
  * // Chainable `pre` to add a middleware that runs for each resource, *before* loading that resource.
  * // This is useful to implement custom caching modules (using filesystem, indexeddb, memory, etc).
  * loader.pre(cachingMiddleware);
  *
  * // Chainable `use` to add a middleware that runs for each resource, *after* loading that resource.
  * // This is useful to implement custom parsing modules (like spritesheet parsers, spine parser, etc).
  * loader.use(parsingMiddleware);
  *
  * // The `load` method loads the queue of resources, and calls the passed in callback called once all
  * // resources have loaded.
  * loader.load((loader, resources) => {
  *     // resources is an object where the key is the name of the resource loaded and the value is the resource object.
  *     // They have a couple default properties:
  *     // - `url`: The URL that the resource was loaded from
  *     // - `error`: The error that happened when trying to load (if any)
  *     // - `data`: The raw data that was loaded
  *     // also may contain other properties based on the middleware that runs.
  *     sprites.bunny = new PIXI.TilingSprite(resources.bunny.texture);
  *     sprites.spaceship = new PIXI.TilingSprite(resources.spaceship.texture);
  *     sprites.scoreFont = new PIXI.TilingSprite(resources.scoreFont.texture);
  * });
  *
  * // throughout the process multiple signals can be dispatched.
  * loader.onProgress.add(() => {}); // called once per loaded/errored file
  * loader.onError.add(() => {}); // called once per errored file
  * loader.onLoad.add(() => {}); // called once per loaded file
  * loader.onComplete.add(() => {}); // called once when the queued resources all load.
  * ```
  *
  * @see https://github.com/englercj/resource-loader
  *
  * @class Loader
  * @memberof PIXI
  * @param {string} [baseUrl=''] - The base url for all resources loaded by this loader.
  * @param {number} [concurrency=10] - The number of resources to load concurrently.
  */
@JSGlobal("PIXI.Loader")
@js.native
class Loader () extends EventEmitter {
  def this(baseUrl: String) = this()
  def this(baseUrl: String, concurrency: Double) = this()
  var baseUrl: String = js.native
  var concurrency: Double = js.native
  var defaultQueryString: String = js.native
  var loading: Boolean = js.native
  /**
    * @memberof PIXI.Loader#
    * @member {object} onComplete
    */
  var onComplete: js.Any = js.native
  /**
    * @memberof PIXI.Loader#
    * @member {object} onError
    */
  var onError: js.Any = js.native
  /**
    * @memberof PIXI.Loader#
    * @member {object} onLoad
    */
  var onLoad: js.Any = js.native
  /**
    * @memberof PIXI.Loader#
    * @member {object} onProgress
    */
  var onProgress: js.Any = js.native
  /**
    * @memberof PIXI.Loader#
    * @member {object} onStart
    */
  var onStart: js.Any = js.native
  var progress: Double = js.native
  var resources: IResourceDictionary = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def add(name: String, url: String): this.type = js.native
  def add(name: String, url: String, options: ILoaderOptions): this.type = js.native
  def add(name: String, url: String, options: ILoaderOptions, cb: js.Function): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def add(obj: String): this.type = js.native
  def add(obj: String, options: ILoaderOptions): this.type = js.native
  def add(obj: String, options: ILoaderOptions, cb: js.Function): this.type = js.native
  def add(obj: js.Any): this.type = js.native
  def add(obj: js.Any, options: ILoaderOptions): this.type = js.native
  def add(obj: js.Any, options: ILoaderOptions, cb: js.Function): this.type = js.native
  def add(obj: js.Array[_]): this.type = js.native
  def add(obj: js.Array[_], options: ILoaderOptions): this.type = js.native
  def add(obj: js.Array[_], options: ILoaderOptions, cb: js.Function): this.type = js.native
  def add(params: js.Any*): this.type = js.native
  def destroy(): Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def load(): this.type = js.native
  def load(
    cb: js.Function2[
      /* loader */ this.type, 
      /* resources */ Partial[Record[String, LoaderResource]], 
      Unit
    ]
  ): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  @JSName("off")
  def off_complete(event: complete): this.type = js.native
  @JSName("off")
  def off_complete(event: complete, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_complete(event: complete, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_error(event: error): this.type = js.native
  @JSName("off")
  def off_error(event: error, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_error(event: error, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_load(event: load): this.type = js.native
  @JSName("off")
  def off_load(event: load, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_load(event: load, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_progress(event: progress): this.type = js.native
  @JSName("off")
  def off_progress(event: progress, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_progress(event: progress, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_start(event: start): this.type = js.native
  @JSName("off")
  def off_start(event: start, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_start(event: start, fn: js.Function, context: js.Any): this.type = js.native
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
    fn: js.Function3[/* error */ Error, /* loader */ this.type, /* resource */ LoaderResource, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: error,
    fn: js.Function3[/* error */ Error, /* loader */ this.type, /* resource */ LoaderResource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_load(event: load, fn: js.Function2[/* loader */ this.type, /* resource */ LoaderResource, Unit]): this.type = js.native
  @JSName("on")
  def on_load(
    event: load,
    fn: js.Function2[/* loader */ this.type, /* resource */ LoaderResource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, fn: js.Function2[/* loader */ this.type, /* resource */ LoaderResource, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(
    event: progress,
    fn: js.Function2[/* loader */ this.type, /* resource */ LoaderResource, Unit],
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
    fn: js.Function3[/* error */ Error, /* loader */ this.type, /* resource */ LoaderResource, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: error,
    fn: js.Function3[/* error */ Error, /* loader */ this.type, /* resource */ LoaderResource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_load(event: load, fn: js.Function2[/* loader */ this.type, /* resource */ LoaderResource, Unit]): this.type = js.native
  @JSName("once")
  def once_load(
    event: load,
    fn: js.Function2[/* loader */ this.type, /* resource */ LoaderResource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_progress(event: progress, fn: js.Function2[/* loader */ this.type, /* resource */ LoaderResource, Unit]): this.type = js.native
  @JSName("once")
  def once_progress(
    event: progress,
    fn: js.Function2[/* loader */ this.type, /* resource */ LoaderResource, Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_start(event: start, fn: js.Function1[/* loader */ this.type, Unit]): this.type = js.native
  @JSName("once")
  def once_start(event: start, fn: js.Function1[/* loader */ this.type, Unit], context: js.Any): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def pre(fn: js.Function): this.type = js.native
  def reset(): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def use(fn: js.Function): this.type = js.native
}

/* static members */
@JSGlobal("PIXI.Loader")
@js.native
object Loader extends js.Object {
  /**
    * A premade instance of the loader that can be used to load resources.
    * @name shared
    * @type {PIXI.Loader}
    * @static
    * @memberof PIXI.Loader
    */
  var shared: Loader = js.native
  /**
    * Adds a Loader plugin for the global shared loader and all
    * new Loader instances created.
    *
    * @static
    * @method registerPlugin
    * @memberof PIXI.Loader
    * @param {PIXI.ILoaderPlugin} plugin - The plugin to add
    * @return {PIXI.Loader} Reference to PIXI.Loader for chaining
    */
  def registerPlugin(plugin: ILoaderPlugin): Loader = js.native
  /**
    * @memberof PIXI.Loader
    * @callback loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  type loaderMiddleware = js.Function2[
    /* resource */ LoaderResource, 
    /* next */ js.Function1[/* repeated */ js.Any, js.Any], 
    Unit
  ]
}

