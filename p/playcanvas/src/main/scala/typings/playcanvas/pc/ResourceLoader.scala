package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Load resource data, potentially from remote sources. Caches resource on load to prevent
  multiple requests. Add ResourceHandlers to handle different types of resources.
  * @param app - The application.
  */
@js.native
trait ResourceLoader extends js.Object {
  /**
    * Add a {@link pc.ResourceHandler} for a resource type. Handler should support atleast load() and open().
    Handlers can optionally support patch(asset, assets) to handle dependencies on other assets.
    * @example
    * var loader = new ResourceLoader();
    loader.addHandler("json", new pc.JsonHandler());
    * @param type - The name of the resource type that the handler will be registerd with. Can be:
    
    * {@link pc.ASSET_ANIMATION}
    * {@link pc.ASSET_AUDIO}
    * {@link pc.ASSET_IMAGE}
    * {@link pc.ASSET_JSON}
    * {@link pc.ASSET_MODEL}
    * {@link pc.ASSET_MATERIAL}
    * {@link pc.ASSET_TEXT}
    * {@link pc.ASSET_TEXTURE}
    * {@link pc.ASSET_CUBEMAP}
    * {@link pc.ASSET_SHADER}
    * {@link pc.ASSET_CSS}
    * {@link pc.ASSET_HTML}
    * {@link pc.ASSET_SCRIPT}
    * {@link pc.ASSET_CONTAINER}
    * @param handler - An instance of a resource handler supporting atleast load() and open().
    */
  def addHandler(`type`: String, handler: ResourceHandler): Unit = js.native
  /**
    * Remove resource from cache.
    * @param url - The URL of the resource.
    * @param type - The type of resource.
    */
  def clearCache(url: String, `type`: String): Unit = js.native
  /**
    * Destroys the resource loader.
    */
  def destroy(): Unit = js.native
  /**
    * Check cache for resource from a URL. If present, return the cached value.
    * @param url - The URL of the resource to get from the cache.
    * @param type - The type of the resource.
    * @returns The resource loaded from the cache.
    */
  def getFromCache(url: String, `type`: String): js.Any = js.native
  /**
    * Get a {@link pc.ResourceHandler} for a resource type.
    * @param type - The name of the resource type that the handler is registerd with.
    * @returns The registerd handler.
    */
  def getHandler(`type`: String): ResourceHandler = js.native
  /**
    * Make a request for a resource from a remote URL. Parse the returned data using the
    handler for the specified type. When loaded and parsed, use the callback to return an instance of
    the resource.
    * @example
    * app.loader.load("../path/to/texture.png", "texture", function (err, texture) {
    // use texture here
    });
    * @param url - The URL of the resource to load.
    * @param type - The type of resource expected.
    * @param callback - The callback used when the resource is loaded or an error occurs.
    * @param [asset] - Optional asset that is passed into handler
    Passed (err, resource) where err is null if there are no errors.
    */
  def load(url: String, `type`: String, callback: typings.playcanvas.pc.callbacks.ResourceLoader): Unit = js.native
  def load(
    url: String,
    `type`: String,
    callback: typings.playcanvas.pc.callbacks.ResourceLoader,
    asset: Asset
  ): Unit = js.native
  /**
    * Convert raw resource data into a resource instance. E.g. Take 3D model format JSON and return a pc.Model.
    * @param type - The type of resource.
    * @param data - The raw resource data.
    * @returns The parsed resource data.
    */
  def open(`type`: String, data: js.Any): js.Any = js.native
  /**
    * Perform any operations on a resource, that requires a dependency on its asset data
    or any other asset data.
    * @param asset - The asset to patch.
    * @param assets - The asset registry.
    */
  def patch(asset: Asset, assets: AssetRegistry): Unit = js.native
  /**
    * Remove a {@link pc.ResourceHandler} for a resource type.
    * @param type - The name of the type that the handler will be removed.
    */
  def removeHandler(`type`: String): Unit = js.native
}

