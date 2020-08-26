package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.Loader.ILoaderSignal
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
@js.native
trait Loader extends js.Object {
  var baseUrl: String = js.native
  var concurrency: Double = js.native
  var defaultQueryString: String = js.native
  var loading: Boolean = js.native
  /**
    * @memberof PIXI.Loader#
    * @description Dispatched when completely loaded all resources.
    * @member {PIXI.Loader.ILoaderSignal} onComplete
    */
  var onComplete: ILoaderSignal = js.native
  /**
    * @memberof PIXI.Loader#
    * @description Dispatched once per errored resource.
    * @member {PIXI.Loader.ILoaderSignal} onError
    */
  var onError: ILoaderSignal = js.native
  /**
    * @memberof PIXI.Loader#
    * @description Dispatched once per loaded resource.
    * @member {PIXI.Loader.ILoaderSignal} onLoad
    */
  var onLoad: ILoaderSignal = js.native
  /**
    * @memberof PIXI.Loader#
    * @description Dispatched once per loaded or errored resource.
    * @member {PIXI.Loader.ILoaderSignal} onProgress
    */
  var onProgress: ILoaderSignal = js.native
  /**
    * @memberof PIXI.Loader#
    * @description Dispatched when the loader begins to loading process.
    * @member {PIXI.Loader.ILoaderSignal} onStart
    */
  var onStart: ILoaderSignal = js.native
  var progress: Double = js.native
  var resources: IResourceDictionary = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def add(name: String, url: String): this.type = js.native
  def add(name: String, url: String, options: js.UndefOr[scala.Nothing], cb: js.Function): this.type = js.native
  def add(name: String, url: String, options: ILoaderOptions): this.type = js.native
  def add(name: String, url: String, options: ILoaderOptions, cb: js.Function): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def add(obj: String): this.type = js.native
  def add(obj: String, options: js.UndefOr[scala.Nothing], cb: js.Function): this.type = js.native
  def add(obj: String, options: ILoaderOptions): this.type = js.native
  def add(obj: String, options: ILoaderOptions, cb: js.Function): this.type = js.native
  def add(obj: js.Any): this.type = js.native
  def add(obj: js.Any, options: js.UndefOr[scala.Nothing], cb: js.Function): this.type = js.native
  def add(obj: js.Any, options: ILoaderOptions): this.type = js.native
  def add(obj: js.Any, options: ILoaderOptions, cb: js.Function): this.type = js.native
  def add(obj: js.Array[_]): this.type = js.native
  def add(obj: js.Array[_], options: js.UndefOr[scala.Nothing], cb: js.Function): this.type = js.native
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
  def pre(fn: js.Function): this.type = js.native
  def reset(): this.type = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def use(fn: js.Function): this.type = js.native
}

@JSGlobal("PIXI.Loader")
@js.native
object Loader extends js.Object {
  /**
    * @memberof PIXI.Loader
    * @typedef ILoaderSignal
    * @property {ISignalCallback} add - Register callback
    * @property {ISignalCallback} once - Register oneshot callback
    * @property {ISignalDetach} detach - Detach specific callback by ID
    */
  @js.native
  trait ILoaderSignal extends js.Object {
    @JSName("add")
    var add_Original: ISignalCallback = js.native
    @JSName("detach")
    var detach_Original: ISignalDetach = js.native
    @JSName("once")
    var once_Original: ISignalCallback = js.native
    def add(callback: js.Function1[/* repeated */ js.Any, _]): ICallbackID = js.native
    def add(callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): ICallbackID = js.native
    def detach(id: ICallbackID): Unit = js.native
    def once(callback: js.Function1[/* repeated */ js.Any, _]): ICallbackID = js.native
    def once(callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): ICallbackID = js.native
  }
  
  /**
    * @memberof PIXI.Loader
    * @typedef {object} ICallbackID
    */
  type ICallbackID = js.Any
  /**
    * @memberof PIXI.Loader
    * @typedef {function} ISignalCallback
    * @param {function} callback - Callback function
    * @param {object} [context] - Context
    * @returns {ICallbackID} - CallbackID
    */
  type ISignalCallback = js.Function2[
    /* callback */ js.Function1[/* repeated */ js.Any, js.Any], 
    /* context */ js.UndefOr[js.Any], 
    ICallbackID
  ]
  /**
    * @memberof PIXI.Loader
    * @typedef {function} ISignalDetach
    * @param {ICallbackID} id - CallbackID returned by `add`/`once` methods
    */
  type ISignalDetach = js.Function1[/* id */ ICallbackID, Unit]
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

