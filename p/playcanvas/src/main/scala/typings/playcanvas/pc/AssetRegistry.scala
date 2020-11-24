package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.FilterAsset
import typings.playcanvas.pc.callbacks.LoadAsset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of an AssetRegistry.
  * Note: PlayCanvas scripts are provided with an AssetRegistry instance as 'app.assets'.
  * @property prefix - A URL prefix that will be added to all asset loading requests.
  * @param loader - The ResourceLoader used to load the asset files.
  */
@js.native
trait AssetRegistry extends EventHandler {
  
  /**
    * Add an asset to the registry.
    * @example
    * var asset = new pc.Asset("My Asset", "texture", {
    *     url: "../path/to/image.jpg"
    * });
    * app.assets.add(asset);
    * @param asset - The asset to add.
    */
  def add(asset: Asset): Unit = js.native
  
  /**
    * Return all Assets that satisfy filter callback.
    * @example
    * var assets = app.assets.filter(function (asset) {
    *     return asset.name.indexOf('monster') !== -1;
    * });
    * console.log("Found " + assets.length + " assets, where names contains 'monster'");
    * @param callback - The callback function that is used to filter assets, return `true` to include asset to result list.
    * @returns A list of all Assets found.
    */
  def filter(callback: FilterAsset): js.Array[Asset] = js.native
  
  /**
    * Return the first Asset with the specified name and type found in the registry.
    * @example
    * var asset = app.assets.find("myTextureAsset", "texture");
    * @param name - The name of the Asset to find.
    * @param [type] - The type of the Asset to find.
    * @returns A single Asset or null if no Asset is found.
    */
  def find(name: String): Asset = js.native
  def find(name: String, `type`: String): Asset = js.native
  
  /**
    * Return all Assets with the specified name and type found in the registry.
    * @example
    * var assets = app.assets.findAll("myTextureAsset", "texture");
    * console.log("Found " + assets.length + " assets called " + name);
    * @param name - The name of the Assets to find.
    * @param [type] - The type of the Assets to find.
    * @returns A list of all Assets found.
    */
  def findAll(name: String): js.Array[Asset] = js.native
  def findAll(name: String, `type`: String): js.Array[Asset] = js.native
  
  /**
    * Return all Assets that satisfy the search query.
    * Query can be simply a string, or comma separated strings,
    * to have inclusive results of assets that match at least one query.
    * A query that consists of an array of tags can be used to match assets that have each tag of array.
    * @example
    * var assets = app.assets.findByTag("level-1");
    * // returns all assets that tagged by `level-1`
    * @example
    * var assets = app.assets.findByTag("level-1", "level-2");
    * // returns all assets that tagged by `level-1` OR `level-2`
    * @example
    * var assets = app.assets.findByTag(["level-1", "monster"]);
    * // returns all assets that tagged by `level-1` AND `monster`
    * @example
    * var assets = app.assets.findByTag(["level-1", "monster"], ["level-2", "monster"]);
    * // returns all assets that tagged by (`level-1` AND `monster`) OR (`level-2` AND `monster`)
    * @param query - Name of a tag or array of tags.
    * @returns A list of all Assets matched query.
    */
  def findByTag(query: js.Any*): js.Array[Asset] = js.native
  
  /**
    * Retrieve an asset from the registry by its id field.
    * @example
    * var asset = app.assets.get(100);
    * @param id - The id of the asset to get.
    * @returns The asset.
    */
  def get(id: Double): Asset = js.native
  
  /**
    * Retrieve an asset from the registry by it's file's URL field.
    * @example
    * var asset = app.assets.getByUrl("../path/to/image.jpg");
    * @param url - The url of the asset to get.
    * @returns The asset.
    */
  def getByUrl(url: String): Asset = js.native
  
  /**
    * Create a filtered list of assets from the registry.
    * @param filters - Properties to filter on, currently supports: 'preload: true|false'.
    * @returns The filtered list of assets.
    */
  def list(filters: js.Any): js.Array[Asset] = js.native
  
  /**
    * Load the asset's file from a remote source. Listen for "load" events on the asset to find out when it is loaded.
    * @example
    * // load some assets
    * var assetsToLoad = [
    *     app.assets.find("My Asset"),
    *     app.assets.find("Another Asset")
    * ];
    * var count = 0;
    * assetsToLoad.forEach(function (assetToLoad) {
    *     assetToLoad.ready(function (asset) {
    *         count++;
    *         if (count === assetsToLoad.length) {
    *             // done
    *         }
    *     });
    *     app.assets.load(assetToLoad);
    * });
    * @param asset - The asset to load.
    */
  def load(asset: Asset): Unit = js.native
  
  /**
    * Use this to load and create an asset if you don't have assets created. Usually you would only use this
    * if you are not integrated with the PlayCanvas Editor.
    * @example
    * app.assets.loadFromUrl("../path/to/texture.jpg", "texture", function (err, asset) {
    *     var texture = asset.resource;
    * });
    * @param url - The url to load.
    * @param type - The type of asset to load.
    * @param callback - Function called when asset is loaded, passed (err, asset), where err is null if no errors were encountered.
    */
  def loadFromUrl(url: String, `type`: String, callback: LoadAsset): Unit = js.native
  
  /**
    * Use this to load and create an asset when both the URL and filename are required. For example, use this function when loading
    * BLOB assets, where the URL does not adequately identify the file.
    * @example
    * var file = magicallyAttainAFile();
    * app.assets.loadFromUrlAndFilename(URL.createObjectURL(file), "texture.png", "texture", function (err, asset) {
    *     var texture = asset.resource;
    * });
    * @param url - The url to load.
    * @param filename - The filename of the asset to load.
    * @param type - The type of asset to load.
    * @param callback - Function called when asset is loaded, passed (err, asset), where err is null if no errors were encountered.
    */
  def loadFromUrlAndFilename(url: String, filename: String, `type`: String, callback: LoadAsset): Unit = js.native
  
  /**
    * A URL prefix that will be added to all asset loading requests.
    */
  var prefix: String = js.native
  
  /**
    * Remove an asset from the registry.
    * @example
    * var asset = app.assets.get(100);
    * app.assets.remove(asset);
    * @param asset - The asset to remove.
    * @returns True if the asset was successfully removed and false otherwise.
    */
  def remove(asset: Asset): Boolean = js.native
}
