package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ResourceLoader
  * @param {pc.Application} app - The application.
  * @classdesc Load resource data, potentially from remote sources. Caches resource on load to prevent
  * multiple requests. Add ResourceHandlers to handle different types of resources.
  */
@JSGlobal("pc.ResourceLoader")
@js.native
class ResourceLoader protected () extends js.Object {
  def this(app: Application) = this()
  /**
    * @function
    * @name pc.ResourceLoader#addHandler
    * @description Add a {@link pc.ResourceHandler} for a resource type. Handler should support atleast load() and open().
    * Handlers can optionally support patch(asset, assets) to handle dependencies on other assets.
    * @param {string} type - The name of the resource type that the handler will be registerd with. Can be:
    *
    * * {@link pc.ASSET_ANIMATION}
    * * {@link pc.ASSET_AUDIO}
    * * {@link pc.ASSET_IMAGE}
    * * {@link pc.ASSET_JSON}
    * * {@link pc.ASSET_MODEL}
    * * {@link pc.ASSET_MATERIAL}
    * * {@link pc.ASSET_TEXT}
    * * {@link pc.ASSET_TEXTURE}
    * * {@link pc.ASSET_CUBEMAP}
    * * {@link pc.ASSET_SHADER}
    * * {@link pc.ASSET_CSS}
    * * {@link pc.ASSET_HTML}
    * * {@link pc.ASSET_SCRIPT}
    *
    * @param {pc.ResourceHandler} handler - An instance of a resource handler supporting atleast load() and open().
    * @example
    * var loader = new ResourceLoader();
    * loader.addHandler("json", new pc.JsonHandler());
    */
  def addHandler(`type`: String, handler: ResourceHandler): Unit = js.native
  /**
    * @function
    * @name pc.ResourceLoader#clearCache
    * @description Remove resource from cache.
    * @param {string} url - The URL of the resource.
    * @param {string} type - The type of resource.
    */
  def clearCache(url: String, `type`: String): Unit = js.native
  /**
    * @function
    * @name pc.ResourceLoader#destroy
    * @description Destroys the resource loader.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.ResourceLoader#getFromCache
    * @description Check cache for resource from a URL. If present, return the cached value.
    * @param {string} url - The URL of the resource to get from the cache.
    * @param {string} type - The type of the resource.
    * @returns {*} The resource loaded from the cache.
    */
  def getFromCache(url: String, `type`: String): js.Any = js.native
  /**
    * @function
    * @name pc.ResourceLoader#getHandler
    * @description Get a {@link pc.ResourceHandler} for a resource type.
    * @param {string} type - The name of the resource type that the handler is registerd with.
    * @returns {pc.ResourceHandler} The registerd handler.
    */
  def getHandler(`type`: String): ResourceHandler = js.native
  /**
    * @function
    * @name pc.ResourceLoader#load
    * @description Make a request for a resource from a remote URL. Parse the returned data using the
    * handler for the specified type. When loaded and parsed, use the callback to return an instance of
    * the resource.
    * @param {string} url - The URL of the resource to load.
    * @param {string} type - The type of resource expected.
    * @param {pc.callbacks.ResourceLoader} callback - The callback used when the resource is loaded or an error occurs.
    * @param {pc.Asset} [asset] - Optional asset that is passed into handler
    * Passed (err, resource) where err is null if there are no errors.
    * @example
    * app.loader.load("../path/to/texture.png", "texture", function (err, texture) {
    *     // use texture here
    * });
    */
  def load(url: String, `type`: String, callback: typings.playcanvas.pc.callbacks.ResourceLoader): Unit = js.native
  def load(
    url: String,
    `type`: String,
    callback: typings.playcanvas.pc.callbacks.ResourceLoader,
    asset: Asset
  ): Unit = js.native
  /**
    * @function
    * @name pc.ResourceLoader#open
    * @description Convert raw resource data into a resource instance. E.g. Take 3D model format JSON and return a pc.Model.
    * @param {string} type - The type of resource.
    * @param {*} data - The raw resource data.
    * @returns {*} The parsed resource data.
    */
  def open(`type`: String, data: js.Any): js.Any = js.native
  /**
    * @function
    * @name pc.ResourceLoader#patch
    * @description Perform any operations on a resource, that requires a dependency on its asset data
    * or any other asset data.
    * @param {pc.Asset} asset - The asset to patch.
    * @param {pc.AssetRegistry} assets - The asset registry.
    */
  def patch(asset: Asset, assets: AssetRegistry): Unit = js.native
  /**
    * @function
    * @name pc.ResourceLoader#removeHandler
    * @description Remove a {@link pc.ResourceHandler} for a resource type.
    * @param {string} type - The name of the type that the handler will be removed.
    */
  def removeHandler(`type`: String): Unit = js.native
}

