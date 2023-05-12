package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link ResourceLoader#load} when a resource is loaded (or an error occurs).
  *
  * @callback ResourceLoaderCallback
  * @param {string|null} err - The error message in the case where the load fails.
  * @param {*} [resource] - The resource that has been successfully loaded.
  */
/**
  * Load resource data, potentially from remote sources. Caches resource on load to prevent multiple
  * requests. Add ResourceHandlers to handle different types of resources.
  */
@JSImport("playcanvas", "ResourceLoader")
@js.native
open class ResourceLoader protected () extends StObject {
  /**
    * Create a new ResourceLoader instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application.
    */
  def this(app: AppBase) = this()
  
  var _app: AppBase = js.native
  
  def _loadNull(handler: Any, callback: Any, asset: Any): Unit = js.native
  
  def _onFailure(key: Any, err: Any): Unit = js.native
  
  def _onSuccess(key: Any, result: Any, extra: Any): Unit = js.native
  
  /**
    * Add a {@link ResourceHandler} for a resource type. Handler should support at least `load()`
    * and `open()`. Handlers can optionally support patch(asset, assets) to handle dependencies on
    * other assets.
    *
    * @param {string} type - The name of the resource type that the handler will be registered
    * with. Can be:
    *
    * - {@link ASSET_ANIMATION}
    * - {@link ASSET_AUDIO}
    * - {@link ASSET_IMAGE}
    * - {@link ASSET_JSON}
    * - {@link ASSET_MODEL}
    * - {@link ASSET_MATERIAL}
    * - {@link ASSET_TEXT}
    * - {@link ASSET_TEXTURE}
    * - {@link ASSET_CUBEMAP}
    * - {@link ASSET_SHADER}
    * - {@link ASSET_CSS}
    * - {@link ASSET_HTML}
    * - {@link ASSET_SCRIPT}
    * - {@link ASSET_CONTAINER}
    *
    * @param {import('./handler.js').ResourceHandler} handler - An instance of a resource handler
    * supporting at least `load()` and `open()`.
    * @example
    * const loader = new ResourceLoader();
    * loader.addHandler("json", new pc.JsonHandler());
    */
  def addHandler(`type`: String, handler: ResourceHandler): Unit = js.native
  
  /**
    * Remove resource from cache.
    *
    * @param {string} url - The URL of the resource.
    * @param {string} type - The type of resource.
    */
  def clearCache(url: String, `type`: String): Unit = js.native
  
  /**
    * Destroys the resource loader.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disables retrying of failed requests when loading assets.
    *
    * @ignore
    */
  def disableRetry(): Unit = js.native
  
  /**
    * Enables retrying of failed requests when loading assets.
    *
    * @param {number} maxRetries - The maximum number of times to retry loading an asset. Defaults
    * to 5.
    * @ignore
    */
  def enableRetry(): Unit = js.native
  def enableRetry(maxRetries: Double): Unit = js.native
  
  /**
    * Check cache for resource from a URL. If present, return the cached value.
    *
    * @param {string} url - The URL of the resource to get from the cache.
    * @param {string} type - The type of the resource.
    * @returns {*} The resource loaded from the cache.
    */
  def getFromCache(url: String, `type`: String): Any = js.native
  
  /**
    * Get a {@link ResourceHandler} for a resource type.
    *
    * @param {string} type - The name of the resource type that the handler is registered with.
    * @returns {import('./handler.js').ResourceHandler} The registered handler.
    */
  def getHandler(`type`: String): ResourceHandler = js.native
  
  /**
    * Make a request for a resource from a remote URL. Parse the returned data using the handler
    * for the specified type. When loaded and parsed, use the callback to return an instance of
    * the resource.
    *
    * @param {string} url - The URL of the resource to load.
    * @param {string} type - The type of resource expected.
    * @param {ResourceLoaderCallback} callback - The callback used when the resource is loaded or
    * an error occurs. Passed (err, resource) where err is null if there are no errors.
    * @param {import('../asset/asset.js').Asset} [asset] - Optional asset that is passed into
    * handler.
    * @example
    * app.loader.load("../path/to/texture.png", "texture", function (err, texture) {
    *     // use texture here
    * });
    */
  def load(url: String, `type`: String, callback: ResourceLoaderCallback): Unit = js.native
  def load(url: String, `type`: String, callback: ResourceLoaderCallback, asset: Asset_): Unit = js.native
  
  /**
    * Convert raw resource data into a resource instance. E.g. Take 3D model format JSON and
    * return a {@link Model}.
    *
    * @param {string} type - The type of resource.
    * @param {*} data - The raw resource data.
    * @returns {*} The parsed resource data.
    */
  def open(`type`: String, data: Any): Any = js.native
  
  /**
    * Perform any operations on a resource, that requires a dependency on its asset data or any
    * other asset data.
    *
    * @param {import('../asset/asset.js').Asset} asset - The asset to patch.
    * @param {import('../asset/asset-registry.js').AssetRegistry} assets - The asset registry.
    */
  def patch(asset: Asset_, assets: AssetRegistry): Unit = js.native
  
  /**
    * Remove a {@link ResourceHandler} for a resource type.
    *
    * @param {string} type - The name of the type that the handler will be removed.
    */
  def removeHandler(`type`: String): Unit = js.native
}
