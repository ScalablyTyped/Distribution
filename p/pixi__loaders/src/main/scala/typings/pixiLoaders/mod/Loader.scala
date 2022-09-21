package typings.pixiLoaders.mod

import typings.pixiLoaders.anon.TypeofLoader
import typings.pixiLoaders.mod.Loader.OnErrorSignal
import typings.pixiLoaders.mod.Loader.OnLoadSignal
import typings.pixiLoaders.mod.Loader.OnProgressSignal
import typings.pixiLoaders.mod.Loader.OnStartSignal
import typings.pixiLoaders.mod.LoaderResource.OnCompleteSignal
import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/loaders", "Loader")
@js.native
/**
  * @param baseUrl - The base url for all resources loaded by this loader.
  * @param concurrency - The number of resources to load concurrently.
  */
open class Loader () extends StObject {
  def this(baseUrl: String) = this()
  def this(baseUrl: String, concurrency: Double) = this()
  def this(baseUrl: Unit, concurrency: Double) = this()
  
  /**
    * Same as add, params have strict order
    * @private
    * @param name - The name of the resource to load.
    * @param url - The url for this resource, relative to the baseUrl of this loader.
    * @param options - The options for the load.
    * @param callback - Function to call when this specific resource completes loading.
    * @returns The loader itself.
    */
  /* protected */ def _add(name: String, url: String, options: IAddOptions): this.type = js.native
  /* protected */ def _add(name: String, url: String, options: IAddOptions, callback: OnCompleteSignal): this.type = js.native
  
  /** The middleware to run after loading each resource. */
  /* private */ var _afterMiddleware: Any = js.native
  
  /** The middleware to run before loading each resource. */
  /* private */ var _beforeMiddleware: Any = js.native
  
  /**
    * The `_loadResource` function bound with this object context.
    * @param r - The resource to load
    * @param d - The dequeue function
    */
  /* private */ var _boundLoadResource: Any = js.native
  
  /**
    * Loads a single resource.
    * @param resource - The resource to load.
    * @param dequeue - The function to call when we need to dequeue this item.
    */
  /* private */ var _loadResource: Any = js.native
  
  /** Called once each resource has loaded. */
  /* private */ var _onComplete: Any = js.native
  
  /**
    * Called each time a resources is loaded.
    * @param resource - The resource that was loaded
    */
  /* private */ var _onLoad: Any = js.native
  
  /** Called once loading has started. */
  /* private */ var _onStart: Any = js.native
  
  /**
    * Prepares a url for usage based on the configuration of this object
    * @param url - The url to prepare.
    * @returns The prepared url.
    */
  /* private */ var _prepareUrl: Any = js.native
  
  /**
    * If this loader cannot be destroyed.
    * @default false
    */
  /* private */ var _protected: Any = js.native
  
  /** The resources waiting to be loaded. */
  /* private */ var _queue: Any = js.native
  
  /** The tracks the resources we are currently completing parsing for. */
  /* private */ var _resourcesParsing: Any = js.native
  
  /**
    * Adds a resource (or multiple resources) to the loader queue.
    *
    * This function can take a wide variety of different parameters. The only thing that is always
    * required the url to load. All the following will work:
    *
    * ```js
    * loader
    *     // normal param syntax
    *     .add('key', 'http://...', function () {})
    *     .add('http://...', function () {})
    *     .add('http://...')
    *
    *     // object syntax
    *     .add({
    *         name: 'key2',
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         name: 'key3',
    *         url: 'http://...'
    *         onComplete: function () {}
    *     })
    *     .add({
    *         url: 'https://...',
    *         onComplete: function () {},
    *         crossOrigin: true
    *     })
    *
    *     // you can also pass an array of objects or urls or both
    *     .add([
    *         { name: 'key4', url: 'http://...', onComplete: function () {} },
    *         { url: 'http://...', onComplete: function () {} },
    *         'http://...'
    *     ])
    *
    *     // and you can use both params and options
    *     .add('key', 'http://...', { crossOrigin: true }, function () {})
    *     .add('http://...', { crossOrigin: true }, function () {});
    * ```
    */
  def add(name: String, url: String): Loader = js.native
  def add(name: String, url: String, callback: OnCompleteSignal): Loader = js.native
  def add(name: String, url: String, options: Unit, callback: OnCompleteSignal): Loader = js.native
  def add(name: String, url: String, options: IAddOptions): Loader = js.native
  def add(name: String, url: String, options: IAddOptions, callback: OnCompleteSignal): Loader = js.native
  /**
    * Adds a resource (or multiple resources) to the loader queue.
    *
    * This function can take a wide variety of different parameters. The only thing that is always
    * required the url to load. All the following will work:
    *
    * ```js
    * loader
    *     // normal param syntax
    *     .add('key', 'http://...', function () {})
    *     .add('http://...', function () {})
    *     .add('http://...')
    *
    *     // object syntax
    *     .add({
    *         name: 'key2',
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         name: 'key3',
    *         url: 'http://...'
    *         onComplete: function () {}
    *     })
    *     .add({
    *         url: 'https://...',
    *         onComplete: function () {},
    *         crossOrigin: true
    *     })
    *
    *     // you can also pass an array of objects or urls or both
    *     .add([
    *         { name: 'key4', url: 'http://...', onComplete: function () {} },
    *         { url: 'http://...', onComplete: function () {} },
    *         'http://...'
    *     ])
    *
    *     // and you can use both params and options
    *     .add('key', 'http://...', { crossOrigin: true }, function () {})
    *     .add('http://...', { crossOrigin: true }, function () {});
    * ```
    */
  def add(options: IAddOptions): Loader = js.native
  def add(options: IAddOptions, callback: OnCompleteSignal): Loader = js.native
  /**
    * Adds a resource (or multiple resources) to the loader queue.
    *
    * This function can take a wide variety of different parameters. The only thing that is always
    * required the url to load. All the following will work:
    *
    * ```js
    * loader
    *     // normal param syntax
    *     .add('key', 'http://...', function () {})
    *     .add('http://...', function () {})
    *     .add('http://...')
    *
    *     // object syntax
    *     .add({
    *         name: 'key2',
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         name: 'key3',
    *         url: 'http://...'
    *         onComplete: function () {}
    *     })
    *     .add({
    *         url: 'https://...',
    *         onComplete: function () {},
    *         crossOrigin: true
    *     })
    *
    *     // you can also pass an array of objects or urls or both
    *     .add([
    *         { name: 'key4', url: 'http://...', onComplete: function () {} },
    *         { url: 'http://...', onComplete: function () {} },
    *         'http://...'
    *     ])
    *
    *     // and you can use both params and options
    *     .add('key', 'http://...', { crossOrigin: true }, function () {})
    *     .add('http://...', { crossOrigin: true }, function () {});
    * ```
    */
  def add(resources: js.Array[IAddOptions | String]): Loader = js.native
  def add(resources: js.Array[IAddOptions | String], callback: OnCompleteSignal): Loader = js.native
  /**
    * Adds a resource (or multiple resources) to the loader queue.
    *
    * This function can take a wide variety of different parameters. The only thing that is always
    * required the url to load. All the following will work:
    *
    * ```js
    * loader
    *     // normal param syntax
    *     .add('key', 'http://...', function () {})
    *     .add('http://...', function () {})
    *     .add('http://...')
    *
    *     // object syntax
    *     .add({
    *         name: 'key2',
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         name: 'key3',
    *         url: 'http://...'
    *         onComplete: function () {}
    *     })
    *     .add({
    *         url: 'https://...',
    *         onComplete: function () {},
    *         crossOrigin: true
    *     })
    *
    *     // you can also pass an array of objects or urls or both
    *     .add([
    *         { name: 'key4', url: 'http://...', onComplete: function () {} },
    *         { url: 'http://...', onComplete: function () {} },
    *         'http://...'
    *     ])
    *
    *     // and you can use both params and options
    *     .add('key', 'http://...', { crossOrigin: true }, function () {})
    *     .add('http://...', { crossOrigin: true }, function () {});
    * ```
    */
  def add(url: String): Loader = js.native
  def add(url: String, callback: OnCompleteSignal): Loader = js.native
  def add(url: String, options: Unit, callback: OnCompleteSignal): Loader = js.native
  def add(url: String, options: IAddOptions): Loader = js.native
  def add(url: String, options: IAddOptions, callback: OnCompleteSignal): Loader = js.native
  /**
    * Adds a resource (or multiple resources) to the loader queue.
    *
    * This function can take a wide variety of different parameters. The only thing that is always
    * required the url to load. All the following will work:
    *
    * ```js
    * loader
    *     // normal param syntax
    *     .add('key', 'http://...', function () {})
    *     .add('http://...', function () {})
    *     .add('http://...')
    *
    *     // object syntax
    *     .add({
    *         name: 'key2',
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         url: 'http://...'
    *     }, function () {})
    *     .add({
    *         name: 'key3',
    *         url: 'http://...'
    *         onComplete: function () {}
    *     })
    *     .add({
    *         url: 'https://...',
    *         onComplete: function () {},
    *         crossOrigin: true
    *     })
    *
    *     // you can also pass an array of objects or urls or both
    *     .add([
    *         { name: 'key4', url: 'http://...', onComplete: function () {} },
    *         { url: 'http://...', onComplete: function () {} },
    *         'http://...'
    *     ])
    *
    *     // and you can use both params and options
    *     .add('key', 'http://...', { crossOrigin: true }, function () {})
    *     .add('http://...', { crossOrigin: true }, function () {});
    * ```
    */
  @JSName("add")
  var add_Original: ILoaderAdd = js.native
  
  /** The base url for all resources loaded by this loader. */
  var baseUrl: String = js.native
  
  /**
    * The number of resources to load concurrently.
    * @default 10
    */
  def concurrency: Double = js.native
  def concurrency_=(concurrency: Double): Unit = js.native
  
  /**
    * A querystring to append to every URL added to the loader.
    *
    * This should be a valid query string *without* the question-mark (`?`). The loader will
    * also *not* escape values for you. Make sure to escape your parameters with
    * [`encodeURIComponent`](https://mdn.io/encodeURIComponent) before assigning this property.
    * @example
    * const loader = new Loader();
    *
    * loader.defaultQueryString = 'user=me&password=secret';
    *
    * // This will request 'image.png?user=me&password=secret'
    * loader.add('image.png').load();
    *
    * loader.reset();
    *
    * // This will request 'image.png?v=1&user=me&password=secret'
    * loader.add('iamge.png?v=1').load();
    */
  var defaultQueryString: String = js.native
  
  /** Destroy the loader, removes references. */
  def destroy(): Unit = js.native
  
  /**
    * Starts loading the queued resources.
    * @param cb - Optional callback that will be bound to the `complete` event.
    * @returns The loader itself.
    */
  def load(): this.type = js.native
  def load(cb: typings.pixiLoaders.mod.Loader.OnCompleteSignal): this.type = js.native
  
  /** Loading state of the loader, true if it is currently loading resources. */
  var loading: Boolean = js.native
  
  /** Dispatched when the queued resources all load. */
  var onComplete: Signal[typings.pixiLoaders.mod.Loader.OnCompleteSignal] = js.native
  
  /** Dispatched once per errored resource. */
  var onError: Signal[OnErrorSignal] = js.native
  
  /** Dispatched once per loaded resource. */
  var onLoad: Signal[OnLoadSignal] = js.native
  
  /** Dispatched once per loaded or errored resource. */
  var onProgress: Signal[OnProgressSignal] = js.native
  
  /** Dispatched when the loader begins to process the queue. */
  var onStart: Signal[OnStartSignal] = js.native
  
  /**
    * Sets up a middleware function that will run *before* the
    * resource is loaded.
    * @param fn - The middleware function to register.
    * @returns The loader itself.
    */
  def pre(fn: ILoaderMiddleware): this.type = js.native
  
  /** The progress percent of the loader going through the queue. */
  var progress: Double = js.native
  
  /**
    * Resets the queue of the loader to prepare for a new load.
    * @returns The loader itself.
    */
  def reset(): this.type = js.native
  
  /** All the resources for this loader keyed by name. */
  var resources: Dict[LoaderResource] = js.native
  
  /**
    * Sets up a middleware function that will run *after* the
    * resource is loaded.
    * @param fn - The middleware function to register.
    * @returns The loader itself.
    */
  def use(fn: ILoaderMiddleware): this.type = js.native
}
/* static members */
object Loader {
  
  @JSImport("@pixi/loaders", "Loader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/loaders", "Loader._plugins")
  @js.native
  def _plugins: js.Array[ILoaderPlugin] = js.native
  inline def _plugins_=(x: js.Array[ILoaderPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plugins")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/loaders", "Loader._shared")
  @js.native
  def _shared: Any = js.native
  inline def _shared_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_shared")(x.asInstanceOf[js.Any])
  
  /**
    * Use the {@link PIXI.extensions.add} API to register plugins.
    * @deprecated since 6.5.0
    * @param plugin - The plugin to add
    * @returns Reference to PIXI.Loader for chaining
    */
  inline def registerPlugin(plugin: ILoaderPlugin): TypeofLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[TypeofLoader]
  
  type OnCompleteSignal = js.Function2[/* loader */ Loader, /* resources */ Dict[LoaderResource], Unit]
  
  type OnErrorSignal = js.Function3[/* error */ js.Error, /* loader */ Loader, /* resource */ LoaderResource, Unit]
  
  type OnLoadSignal = js.Function2[/* loader */ Loader, /* resource */ LoaderResource, Unit]
  
  type OnProgressSignal = js.Function2[/* loader */ Loader, /* resource */ LoaderResource, Unit]
  
  type OnStartSignal = js.Function1[/* loader */ Loader, Unit]
}
