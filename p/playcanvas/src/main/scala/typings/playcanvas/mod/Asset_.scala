package typings.playcanvas.mod

import typings.playcanvas.anon.Contents
import typings.playcanvas.anon.CrossOrigin
import typings.playcanvas.playcanvasStrings.animation
import typings.playcanvas.playcanvasStrings.audio
import typings.playcanvas.playcanvasStrings.binary
import typings.playcanvas.playcanvasStrings.container
import typings.playcanvas.playcanvasStrings.css
import typings.playcanvas.playcanvasStrings.cubemap
import typings.playcanvas.playcanvasStrings.font
import typings.playcanvas.playcanvasStrings.html
import typings.playcanvas.playcanvasStrings.json
import typings.playcanvas.playcanvasStrings.material
import typings.playcanvas.playcanvasStrings.model
import typings.playcanvas.playcanvasStrings.render
import typings.playcanvas.playcanvasStrings.shader
import typings.playcanvas.playcanvasStrings.sprite
import typings.playcanvas.playcanvasStrings.template
import typings.playcanvas.playcanvasStrings.text
import typings.playcanvas.playcanvasStrings.texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link Asset#ready} and called when an asset is ready.
  *
  * @callback AssetReadyCallback
  * @param {Asset} asset - The ready asset.
  */
/**
  * An asset record of a file or data resource that can be loaded by the engine. The asset contains
  * four important fields:
  *
  * - `file`: contains the details of a file (filename, url) which contains the resource data, e.g.
  * an image file for a texture asset.
  * - `data`: contains a JSON blob which contains either the resource data for the asset (e.g.
  * material data) or additional data for the file (e.g. material mappings for a model).
  * - `options`: contains a JSON blob with handler-specific load options.
  * - `resource`: contains the final resource when it is loaded. (e.g. a {@link StandardMaterial} or
  * a {@link Texture}).
  *
  * See the {@link AssetRegistry} for details on loading resources from assets.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "Asset")
@js.native
open class Asset_ protected () extends EventHandler {
  /**
    * Create a new Asset record. Generally, Assets are created in the loading process and you
    * won't need to create them by hand.
    *
    * @param {string} name - A non-unique but human-readable name which can be later used to
    * retrieve the asset.
    * @param {string} type - Type of asset. One of ["animation", "audio", "binary", "container",
    * "cubemap", "css", "font", "json", "html", "material", "model", "script", "shader", "sprite",
    * "template", text", "texture"]
    * @param {object} [file] - Details about the file the asset is made from. At the least must
    * contain the 'url' field. For assets that don't contain file data use null.
    * @param {string} [file.url] - The URL of the resource file that contains the asset data.
    * @param {string} [file.filename] - The filename of the resource file or null if no filename
    * was set (e.g from using {@link AssetRegistry#loadFromUrl}).
    * @param {number} [file.size] - The size of the resource file or null if no size was set
    * (e.g. from using {@link AssetRegistry#loadFromUrl}).
    * @param {string} [file.hash] - The MD5 hash of the resource file data and the Asset data
    * field or null if hash was set (e.g from using {@link AssetRegistry#loadFromUrl}).
    * @param {ArrayBuffer} [file.contents] - Optional file contents. This is faster than wrapping
    * the data in a (base64 encoded) blob. Currently only used by container assets.
    * @param {object|string} [data] - JSON object or string with additional data about the asset.
    * (e.g. for texture and model assets) or contains the asset data itself (e.g. in the case of
    * materials).
    * @param {object} [options] - The asset handler options. For container options see
    * {@link ContainerHandler}.
    * @param {boolean} [options.crossOrigin] - For use with texture resources. For
    * browser-supported image formats only, enable cross origin.
    * @example
    * var asset = new pc.Asset("a texture", "texture", {
    *     url: "http://example.com/my/assets/here/texture.png"
    * });
    */
  def this(name: String, `type`: String) = this()
  def this(name: String, `type`: String, file: Contents) = this()
  def this(name: String, `type`: String, file: Unit, data: String) = this()
  def this(name: String, `type`: String, file: Unit, data: js.Object) = this()
  def this(name: String, `type`: String, file: Contents, data: String) = this()
  def this(name: String, `type`: String, file: Contents, data: js.Object) = this()
  def this(name: String, `type`: String, file: Unit, data: String, options: CrossOrigin) = this()
  def this(name: String, `type`: String, file: Unit, data: js.Object, options: CrossOrigin) = this()
  def this(name: String, `type`: String, file: Unit, data: Unit, options: CrossOrigin) = this()
  def this(name: String, `type`: String, file: Contents, data: String, options: CrossOrigin) = this()
  def this(name: String, `type`: String, file: Contents, data: js.Object, options: CrossOrigin) = this()
  def this(name: String, `type`: String, file: Contents, data: Unit, options: CrossOrigin) = this()
  
  var _data: Any = js.native
  
  var _file: Any = js.native
  
  var _id: Double = js.native
  
  var _loadFaces: Any = js.native
  
  var _preload: Boolean = js.native
  
  var _resources: js.Array[Any] = js.native
  
  /**
    * Adds a replacement asset id for the specified locale. When the locale in
    * {@link Application#i18n} changes then references to this asset will be replaced with the
    * specified asset id. (Currently only supported by the {@link ElementComponent}).
    *
    * @param {string} locale - The locale e.g. Ar-AR.
    * @param {number} assetId - The asset id.
    * @ignore
    */
  def addLocalizedAssetId(locale: String, assetId: Double): Unit = js.native
  
  def data: Any = js.native
  /**
    * Optional JSON data that contains either the complete resource data. (e.g. in the case of a
    * material) or additional data (e.g. in the case of a model it contains mappings from mesh to
    * material).
    *
    * @type {object}
    */
  def data_=(arg: Any): Unit = js.native
  
  def file: Any = js.native
  /**
    * The file details or null if no file.
    *
    * @type {object}
    */
  def file_=(arg: Any): Unit = js.native
  
  /**
    * Construct an asset URL from this asset's location and a relative path. If the relativePath
    * is a blob or Base64 URI, then return that instead.
    *
    * @param {string} relativePath - The relative path to be concatenated to this asset's base url.
    * @returns {string} Resulting URL of the asset.
    * @ignore
    */
  def getAbsoluteUrl(relativePath: String): String = js.native
  
  /**
    * Return the URL required to fetch the file for this asset.
    *
    * @returns {string|null} The URL. Returns null if the asset has no associated file.
    * @example
    * var assets = app.assets.find("My Image", "texture");
    * var img = "&lt;img src='" + assets[0].getFileUrl() + "'&gt;";
    */
  def getFileUrl(): String | Null = js.native
  
  /**
    * Returns the asset id of the asset that corresponds to the specified locale.
    *
    * @param {string} locale - The desired locale e.g. Ar-AR.
    * @returns {number} An asset id or null if there is no asset specified for the desired locale.
    * @ignore
    */
  def getLocalizedAssetId(locale: String): Double = js.native
  
  def id: Double = js.native
  /**
    * Fired when the asset has completed loading.
    *
    * @event Asset#load
    * @param {Asset} asset - The asset that was loaded.
    */
  /**
    * Fired just before the asset unloads the resource. This allows for the opportunity to prepare
    * for an asset that will be unloaded. E.g. Changing the texture of a model to a default before
    * the one it was using is unloaded.
    *
    * @event Asset#unload
    * @param {Asset} asset - The asset that is due to be unloaded.
    */
  /**
    * Fired when the asset is removed from the asset registry.
    *
    * @event Asset#remove
    * @param {Asset} asset - The asset that was removed.
    */
  /**
    * Fired if the asset encounters an error while loading.
    *
    * @event Asset#error
    * @param {string} err - The error message.
    * @param {Asset} asset - The asset that generated the error.
    */
  /**
    * Fired when one of the asset properties `file`, `data`, `resource` or `resources` is changed.
    *
    * @event Asset#change
    * @param {Asset} asset - The asset that was loaded.
    * @param {string} property - The name of the property that changed.
    * @param {*} value - The new property value.
    * @param {*} oldValue - The old property value.
    */
  /**
    * Fired when we add a new localized asset id to the asset.
    *
    * @event Asset#add:localized
    * @param {string} locale - The locale.
    * @param {number} assetId - The asset id we added.
    */
  /**
    * Fired when we remove a localized asset id from the asset.
    *
    * @event Asset#remove:localized
    * @param {string} locale - The locale.
    * @param {number} assetId - The asset id we removed.
    */
  /**
    * The asset id.
    *
    * @type {number}
    */
  def id_=(arg: Double): Unit = js.native
  
  def loadFaces: Any = js.native
  def loadFaces_=(arg: Any): Unit = js.native
  
  /**
    * True if the asset has finished attempting to load the resource. It is not guaranteed
    * that the resources are available as there could have been a network error.
    *
    * @type {boolean}
    */
  var loaded: Boolean = js.native
  
  /**
    * True if the resource is currently being loaded.
    *
    * @type {boolean}
    */
  var loading: Boolean = js.native
  
  /**
    * The name of the asset.
    *
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * Optional JSON data that contains the asset handler options.
    *
    * @type {object}
    */
  var options: js.Object = js.native
  
  def preload: Boolean = js.native
  /**
    * If true the asset will be loaded during the preload phase of application set up.
    *
    * @type {boolean}
    */
  def preload_=(arg: Boolean): Unit = js.native
  
  /**
    * Take a callback which is called as soon as the asset is loaded. If the asset is already
    * loaded the callback is called straight away.
    *
    * @param {AssetReadyCallback} callback - The function called when the asset is ready. Passed
    * the (asset) arguments.
    * @param {object} [scope] - Scope object to use when calling the callback.
    * @example
    * var asset = app.assets.find("My Asset");
    * asset.ready(function (asset) {
    *   // asset loaded
    * });
    * app.assets.load(asset);
    */
  def ready(callback: AssetReadyCallback): Unit = js.native
  def ready(callback: AssetReadyCallback, scope: js.Object): Unit = js.native
  
  /**
    * The asset registry that this Asset belongs to.
    *
    * @type {AssetRegistry}
    */
  var registry: AssetRegistry = js.native
  
  def reload(): Unit = js.native
  
  /**
    * Removes a localized asset.
    *
    * @param {string} locale - The locale e.g. Ar-AR.
    * @ignore
    */
  def removeLocalizedAssetId(locale: String): Unit = js.native
  
  def resource: Any = js.native
  /**
    * A reference to the resource when the asset is loaded. e.g. a {@link Texture} or a {@link Model}.
    *
    * @type {object}
    */
  def resource_=(arg: Any): Unit = js.native
  
  def resources: js.Array[Any] = js.native
  /**
    * A reference to the resources of the asset when it's loaded. An asset can hold more runtime
    * resources than one e.g. cubemaps.
    *
    * @type {object[]}
    */
  def resources_=(arg: js.Array[Any]): Unit = js.native
  
  /**
    * Asset tags. Enables finding of assets by tags using the {@link AssetRegistry#findByTag} method.
    *
    * @type {Tags}
    */
  var tags: Tags = js.native
  
  /**
    * The type of the asset. One of ["animation", "audio", "binary", "container", "cubemap",
    * "css", "font", "json", "html", "material", "model", "render", "script", "shader", "sprite",
    * "template", "text", "texture"]
    *
    * @type {("animation"|"audio"|"binary"|"container"|"cubemap"|"css"|"font"|"json"|"html"|"material"|"model"|"render"|"script"|"shader"|"sprite"|"template"|"text"|"texture")}
    */
  var `type`: animation | audio | binary | container | cubemap | css | font | json | html | material | model | render | typings.playcanvas.playcanvasStrings.script | shader | sprite | template | text | texture = js.native
  
  /**
    * Destroys the associated resource and marks asset as unloaded.
    *
    * @example
    * var asset = app.assets.find("My Asset");
    * asset.unload();
    * // asset.resource is null
    */
  def unload(): Unit = js.native
}
object Asset_ {
  
  @JSImport("playcanvas", "Asset")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to resolve asset file data and return the contents as an ArrayBuffer. If the
    * asset file contents are present, that is returned. Otherwise the file data is be downloaded
    * via http.
    *
    * @param {string} loadUrl - The URL as passed into the handler
    * @param {ResourceLoaderCallback} callback - The callback function to receive results.
    * @param {Asset} [asset] - The asset
    * @param {number} maxRetries - Number of retries if http download is required
    * @ignore
    */
  /* static member */
  inline def fetchArrayBuffer(loadUrl: String, callback: ResourceLoaderCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(loadUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fetchArrayBuffer(loadUrl: String, callback: ResourceLoaderCallback, asset: Unit, maxRetries: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(loadUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], asset.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fetchArrayBuffer(loadUrl: String, callback: ResourceLoaderCallback, asset: Asset_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(loadUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], asset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fetchArrayBuffer(loadUrl: String, callback: ResourceLoaderCallback, asset: Asset_, maxRetries: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(loadUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], asset.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
