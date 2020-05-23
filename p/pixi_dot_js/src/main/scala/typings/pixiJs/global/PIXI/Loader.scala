package typings.pixiJs.global.PIXI

import typings.pixiJs.PIXI.ILoaderPlugin
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
class Loader ()
  extends typings.pixiJs.PIXI.Loader {
  def this(baseUrl: String) = this()
  def this(baseUrl: String, concurrency: Double) = this()
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
  var shared: typings.pixiJs.PIXI.Loader = js.native
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
  def registerPlugin(plugin: ILoaderPlugin): typings.pixiJs.PIXI.Loader = js.native
}

