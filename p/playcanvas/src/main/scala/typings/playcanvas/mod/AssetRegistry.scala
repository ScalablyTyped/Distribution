package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link AssetRegistry#filter} to filter assets.
  *
  * @callback FilterAssetCallback
  * @param {Asset} asset - The current asset to filter.
  * @returns {boolean} Return `true` to include asset to result list.
  */
/**
  * Callback used by {@link AssetRegistry#loadFromUrl} and called when an asset is loaded (or an
  * error occurs).
  *
  * @callback LoadAssetCallback
  * @param {string|null} err - The error message is null if no errors were encountered.
  * @param {Asset} [asset] - The loaded asset if no errors were encountered.
  */
/**
  * Container for all assets that are available to this application. Note that PlayCanvas scripts
  * are provided with an AssetRegistry instance as `app.assets`.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "AssetRegistry")
@js.native
open class AssetRegistry protected () extends EventHandler {
  /**
    * Create an instance of an AssetRegistry.
    *
    * @param {import('../handlers/loader.js').ResourceLoader} loader - The ResourceLoader used to
    * load the asset files.
    */
  def this(loader: ResourceLoader) = this()
  
  var _assets: js.Array[Any] = js.native
  
  def _loadMaterials(modelAsset: Any, mapping: Any, callback: Any): Unit = js.native
  
  def _loadModel(modelAsset: Any, continuation: Any): Unit = js.native
  
  def _loadTextures(materialAsset: Any, callback: Any): Unit = js.native
  
  var _loader: ResourceLoader = js.native
  
  def _onTagAdd(tag: Any, asset: Any): Unit = js.native
  
  def _onTagRemove(tag: Any, asset: Any): Unit = js.native
  
  var _tags: TagsCache = js.native
  
  /**
    * Add an asset to the registry.
    *
    * @param {Asset} asset - The asset to add.
    * @example
    * const asset = new pc.Asset("My Asset", "texture", {
    *     url: "../path/to/image.jpg"
    * });
    * app.assets.add(asset);
    */
  def add(asset: Asset_): Unit = js.native
  
  /**
    * Return all Assets that satisfy a filter callback.
    *
    * @param {FilterAssetCallback} callback - The callback function that is used to filter assets.
    * Return `true` to include an asset in the returned array.
    * @returns {Asset[]} A list of all Assets found.
    * @example
    * const assets = app.assets.filter(function (asset) {
    *     return asset.name.indexOf('monster') !== -1;
    * });
    * console.log("Found " + assets.length + " assets, where names contains 'monster'");
    */
  def filter(callback: FilterAssetCallback): js.Array[Asset_] = js.native
  
  /**
    * Return the first Asset with the specified name and type found in the registry.
    *
    * @param {string} name - The name of the Asset to find.
    * @param {string} [type] - The type of the Asset to find.
    * @returns {Asset|null} A single Asset or null if no Asset is found.
    * @example
    * const asset = app.assets.find("myTextureAsset", "texture");
    */
  def find(name: String): Asset_ | Null = js.native
  def find(name: String, `type`: String): Asset_ | Null = js.native
  
  /**
    * Return all Assets with the specified name and type found in the registry.
    *
    * @param {string} name - The name of the Assets to find.
    * @param {string} [type] - The type of the Assets to find.
    * @returns {Asset[]} A list of all Assets found.
    * @example
    * const assets = app.assets.findAll("myTextureAsset", "texture");
    * console.log("Found " + assets.length + " assets called " + name);
    */
  def findAll(name: String): js.Array[Asset_] = js.native
  def findAll(name: String, `type`: String): js.Array[Asset_] = js.native
  
  /**
    * Return all Assets that satisfy the search query. Query can be simply a string, or comma
    * separated strings, to have inclusive results of assets that match at least one query. A
    * query that consists of an array of tags can be used to match assets that have each tag of
    * array.
    *
    * @param {...*} query - Name of a tag or array of tags.
    * @returns {Asset[]} A list of all Assets matched query.
    * @example
    * const assets = app.assets.findByTag("level-1");
    * // returns all assets that tagged by `level-1`
    * @example
    * const assets = app.assets.findByTag("level-1", "level-2");
    * // returns all assets that tagged by `level-1` OR `level-2`
    * @example
    * const assets = app.assets.findByTag(["level-1", "monster"]);
    * // returns all assets that tagged by `level-1` AND `monster`
    * @example
    * const assets = app.assets.findByTag(["level-1", "monster"], ["level-2", "monster"]);
    * // returns all assets that tagged by (`level-1` AND `monster`) OR (`level-2` AND `monster`)
    */
  def findByTag(args: Any*): js.Array[Asset_] = js.native
  
  /**
    * Retrieve an asset from the registry by its id field.
    *
    * @param {number} id - The id of the asset to get.
    * @returns {Asset} The asset.
    * @example
    * const asset = app.assets.get(100);
    */
  def get(id: Double): Asset_ = js.native
  
  /**
    * Retrieve an asset from the registry by its file's URL field.
    *
    * @param {string} url - The url of the asset to get.
    * @returns {Asset} The asset.
    * @example
    * const asset = app.assets.getByUrl("../path/to/image.jpg");
    */
  def getByUrl(url: String): Asset_ = js.native
  
  /**
    * Fired when an asset completes loading.
    *
    * @event AssetRegistry#load
    * @param {Asset} asset - The asset that has just loaded.
    * @example
    * app.assets.on("load", function (asset) {
    *     console.log("asset loaded: " + asset.name);
    * });
    */
  /**
    * Fired when an asset completes loading.
    *
    * @event AssetRegistry#load:[id]
    * @param {Asset} asset - The asset that has just loaded.
    * @example
    * const id = 123456;
    * const asset = app.assets.get(id);
    * app.assets.on("load:" + id, function (asset) {
    *     console.log("asset loaded: " + asset.name);
    * });
    * app.assets.load(asset);
    */
  /**
    * Fired when an asset completes loading.
    *
    * @event AssetRegistry#load:url:[url]
    * @param {Asset} asset - The asset that has just loaded.
    * @example
    * const id = 123456;
    * const asset = app.assets.get(id);
    * app.assets.on("load:url:" + asset.file.url, function (asset) {
    *     console.log("asset loaded: " + asset.name);
    * });
    * app.assets.load(asset);
    */
  /**
    * Fired when an asset is added to the registry.
    *
    * @event AssetRegistry#add
    * @param {Asset} asset - The asset that was added.
    * @example
    * app.assets.on("add", function (asset) {
    *     console.log("New asset added: " + asset.name);
    * });
    */
  /**
    * Fired when an asset is added to the registry.
    *
    * @event AssetRegistry#add:[id]
    * @param {Asset} asset - The asset that was added.
    * @example
    * const id = 123456;
    * app.assets.on("add:" + id, function (asset) {
    *     console.log("Asset 123456 loaded");
    * });
    */
  /**
    * Fired when an asset is added to the registry.
    *
    * @event AssetRegistry#add:url:[url]
    * @param {Asset} asset - The asset that was added.
    */
  /**
    * Fired when an asset is removed from the registry.
    *
    * @event AssetRegistry#remove
    * @param {Asset} asset - The asset that was removed.
    * @example
    * app.assets.on("remove", function (asset) {
    *     console.log("Asset removed: " + asset.name);
    * });
    */
  /**
    * Fired when an asset is removed from the registry.
    *
    * @event AssetRegistry#remove:[id]
    * @param {Asset} asset - The asset that was removed.
    * @example
    * const id = 123456;
    * app.assets.on("remove:" + id, function (asset) {
    *     console.log("Asset removed: " + asset.name);
    * });
    */
  /**
    * Fired when an asset is removed from the registry.
    *
    * @event AssetRegistry#remove:url:[url]
    * @param {Asset} asset - The asset that was removed.
    */
  /**
    * Fired when an error occurs during asset loading.
    *
    * @event AssetRegistry#error
    * @param {string} err - The error message.
    * @param {Asset} asset - The asset that generated the error.
    * @example
    * const id = 123456;
    * const asset = app.assets.get(id);
    * app.assets.on("error", function (err, asset) {
    *     console.error(err);
    * });
    * app.assets.load(asset);
    */
  /**
    * Fired when an error occurs during asset loading.
    *
    * @event AssetRegistry#error:[id]
    * @param {Asset} asset - The asset that generated the error.
    * @example
    * const id = 123456;
    * const asset = app.assets.get(id);
    * app.assets.on("error:" + id, function (err, asset) {
    *     console.error(err);
    * });
    * app.assets.load(asset);
    */
  /**
    * Create a filtered list of assets from the registry.
    *
    * @param {object} filters - Properties to filter on, currently supports: 'preload: true|false'.
    * @returns {Asset[]} The filtered list of assets.
    */
  def list(filters: js.Object): js.Array[Asset_] = js.native
  
  /**
    * Load the asset's file from a remote source. Listen for "load" events on the asset to find
    * out when it is loaded.
    *
    * @param {Asset} asset - The asset to load.
    * @example
    * // load some assets
    * const assetsToLoad = [
    *     app.assets.find("My Asset"),
    *     app.assets.find("Another Asset")
    * ];
    * let count = 0;
    * assetsToLoad.forEach(function (assetToLoad) {
    *     assetToLoad.ready(function (asset) {
    *         count++;
    *         if (count === assetsToLoad.length) {
    *             // done
    *         }
    *     });
    *     app.assets.load(assetToLoad);
    * });
    */
  def load(asset: Asset_): Unit = js.native
  
  /**
    * Use this to load and create an asset if you don't have assets created. Usually you would
    * only use this if you are not integrated with the PlayCanvas Editor.
    *
    * @param {string} url - The url to load.
    * @param {string} type - The type of asset to load.
    * @param {LoadAssetCallback} callback - Function called when asset is loaded, passed (err,
    * asset), where err is null if no errors were encountered.
    * @example
    * app.assets.loadFromUrl("../path/to/texture.jpg", "texture", function (err, asset) {
    *     const texture = asset.resource;
    * });
    */
  def loadFromUrl(url: String, `type`: String, callback: LoadAssetCallback): Unit = js.native
  
  /**
    * Use this to load and create an asset when both the URL and filename are required. For
    * example, use this function when loading BLOB assets, where the URL does not adequately
    * identify the file.
    *
    * @param {string} url - The url to load.
    * @param {string} filename - The filename of the asset to load.
    * @param {string} type - The type of asset to load.
    * @param {LoadAssetCallback} callback - Function called when asset is loaded, passed (err,
    * asset), where err is null if no errors were encountered.
    * @example
    * const file = magicallyAttainAFile();
    * app.assets.loadFromUrlAndFilename(URL.createObjectURL(file), "texture.png", "texture", function (err, asset) {
    *     const texture = asset.resource;
    * });
    */
  def loadFromUrlAndFilename(url: String, filename: String, `type`: String, callback: LoadAssetCallback): Unit = js.native
  
  var loadFromUrlError: Any = js.native
  
  /**
    * A URL prefix that will be added to all asset loading requests.
    *
    * @type {string}
    */
  var prefix: String = js.native
  
  /**
    * Remove an asset from the registry.
    *
    * @param {Asset} asset - The asset to remove.
    * @returns {boolean} True if the asset was successfully removed and false otherwise.
    * @example
    * const asset = app.assets.get(100);
    * app.assets.remove(asset);
    */
  def remove(asset: Asset_): Boolean = js.native
}
