package typings.playcanvas.pcNs

import typings.playcanvas.Anon_Filename
import typings.playcanvas.pcNs.callbacksNs.AssetReady
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Asset
  * @classdesc An asset record of a file or data resource that can be loaded by the engine.
  * The asset contains three important fields:<br/>
  * <strong>file</strong>: contains the details of a file (filename, url) which contains the resource data, e.g. an image file for a texture asset<br/>
  * <strong>data</strong>: contains a JSON blob which contains either the resource data for the asset (e.g. material data) or additional data for the file (e.g. material mappings for a model)<br/>
  * <strong>resource</strong>: contains the final resource when it is loaded. (e.g. a {@link pc.StandardMaterial} or a {@link pc.Texture})<br/>
  *
  * See the {@link pc.AssetRegistry} for details on loading resources from assets.
  * @description Create a new Asset record. Generally, Assets are created in the loading process and you won't need to create them by hand.
  * @param {String} name A non-unique but human-readable name which can be later used to retrieve the asset.
  * @param {String} type Type of asset. One of ["animation", "audio", "binary", "cubemap", "css", "font", "json", "html", "material", "model", "script", "shader", "text", "texture"]
  * @param {Object} file Details about the file the asset is made from. At the least must contain the 'url' field. For assets that don't contain file data use null.
  * @example
  * var file = {
  *   filename: "filename.txt",
  *   url: "/example/filename.txt",
  * }
  * @param {Object} [data] JSON object with additional data about the asset (e.g. for texture and model assets) or contains the asset data itself (e.g. in the case of materials)
  * @example
  * var asset = new pc.Asset("a texture", "texture", {
  *     url: "http://example.com/my/assets/here/texture.png"
  * });
  * @property {String} name The name of the asset
  * @property {Number} id The asset id
  * @property {String} type The type of the asset. One of ["animation", "audio", "binary", "cubemap", "css", "font", "json", "html", "material", "model", "script", "shader", "text", "texture"]
  * @property {pc.Tags} tags Interface for tagging. Allows to find assets by tags using {@link pc.AssetRegistry#findByTag} method.
  * @property {Object} file The file details or null if no file
  * @property {String} [file.url] The URL of the resource file that contains the asset data
  * @property {String} [file.filename] The filename of the resource file
  * @property {Number} [file.size] The size of the resource file
  * @property {String} [file.hash] The MD5 hash of the resource file data and the Asset data field
  * @property {Object} data JSON data that contains either the complete resource data (e.g. in the case of a material) or additional data (e.g. in the case of a model it contains mappings from mesh to material)
  * @property {Object} resource A reference to the resource when the asset is loaded. e.g. a {@link pc.Texture} or a {@link pc.Model}
  * @property {Array} resources A reference to the resources of the asset when it's loaded. An asset can hold more runtime resources than one e.g. cubemaps
  * @property {Boolean} preload If true the asset will be loaded during the preload phase of application set up.
  * @property {Boolean} loaded True if the resource is loaded. e.g. if asset.resource is not null
  * @property {pc.AssetRegistry} registry The asset registry that this Asset belongs to
  */
@JSGlobal("pc.Asset")
@js.native
class Asset protected () extends js.Object {
  def this(name: String, `type`: String, file: js.Any) = this()
  def this(name: String, `type`: String, file: js.Any, data: js.Any) = this()
  /**
    * JSON data that contains either the complete resource data (e.g. in the case of a material) or additional data (e.g. in the case of a model it contains mappings from mesh to material)
    */
  var data: js.Any = js.native
  /**
    * The file details or null if no file
    */
  var file: Anon_Filename = js.native
  /**
    * The asset id
    */
  var id: Double = js.native
  /**
    * True if the resource is loaded. e.g. if asset.resource is not null
    */
  var loaded: Boolean = js.native
  /**
    * The name of the asset
    */
  var name: String = js.native
  /**
    * If true the asset will be loaded during the preload phase of application set up.
    */
  var preload: Boolean = js.native
  /**
    * The asset registry that this Asset belongs to
    */
  var registry: AssetRegistry = js.native
  /**
    * A reference to the resource when the asset is loaded. e.g. a {@link pc.Texture} or a {@link pc.Model}
    */
  var resource: js.Any = js.native
  /**
    * A reference to the resources of the asset when it's loaded. An asset can hold more runtime resources than one e.g. cubemaps
    */
  var resources: js.Array[_] = js.native
  /**
    * Interface for tagging. Allows to find assets by tags using {@link pc.AssetRegistry#findByTag} method.
    */
  var tags: Tags = js.native
  /**
    * The type of the asset. One of ["animation", "audio", "binary", "cubemap", "css", "font", "json", "html", "material", "model", "script", "shader", "text", "texture"]
    */
  var `type`: String = js.native
  /**
    * @name pc.Asset#getFileUrl
    * @function
    * @description Return the URL required to fetch the file for this asset.
    * @returns {String} The URL
    * @example
    * var assets = app.assets.find("My Image", "texture");
    * var img = "&lt;img src='" + assets[0].getFileUrl() + "'&gt;";
    */
  def getFileUrl(): String = js.native
  /**
    * @function
    * @name pc.Asset#ready
    * @description Take a callback which is called as soon as the asset is loaded. If the asset is already loaded the callback is called straight away
    * @param {pc.callbacks.AssetReady} callback The function called when the asset is ready. Passed the (asset) arguments
    * @param {Object} [scope] Scope object to use when calling the callback
    * @example
    * var asset = app.assets.find("My Asset");
    * asset.ready(function (asset) {
    *   // asset loaded
    * });
    * app.assets.load(asset);
    */
  def ready(callback: AssetReady): Unit = js.native
  def ready(callback: AssetReady, scope: js.Any): Unit = js.native
  /**
    * @function
    * @name pc.Asset#unload
    * @description Destroys the associated resource and marks asset as unloaded.
    * @example
    * var asset = app.assets.find("My Asset");
    * asset.unload();
    * // asset.resource is null
    */
  def unload(): Unit = js.native
}

