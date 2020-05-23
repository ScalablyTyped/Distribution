package typings.playcanvas.pc

import typings.playcanvas.anon.Filename
import typings.playcanvas.pc.callbacks.AssetReady
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Asset record. Generally, Assets are created in the loading process and you won't need to create them by hand.
  * @example
  * var file = {
  filename: "filename.txt",
  url: "/example/filename.txt"
  };
  * @example
  * var asset = new pc.Asset("a texture", "texture", {
  url: "http://example.com/my/assets/here/texture.png"
  });
  * @property name - The name of the asset
  * @property id - The asset id
  * @property type - The type of the asset. One of ["animation", "audio", "binary", "cubemap", "css", "font", "json", "html", "material", "model", "script", "shader", "text", "texture"]
  * @property tags - Interface for tagging. Allows to find assets by tags using {@link pc.AssetRegistry#findByTag} method.
  * @property file - The file details or null if no file
  * @property [file.url] - The URL of the resource file that contains the asset data
  * @property [file.filename] - The filename of the resource file
  * @property [file.size] - The size of the resource file
  * @property [file.hash] - The MD5 hash of the resource file data and the Asset data field
  * @property data - JSON data that contains either the complete resource data (e.g. in the case of a material) or additional data (e.g. in the case of a model it contains mappings from mesh to material)
  * @property resource - A reference to the resource when the asset is loaded. e.g. a {@link pc.Texture} or a {@link pc.Model}
  * @property resources - A reference to the resources of the asset when it's loaded. An asset can hold more runtime resources than one e.g. cubemaps
  * @property preload - If true the asset will be loaded during the preload phase of application set up.
  * @property loaded - True if the resource is loaded. e.g. if asset.resource is not null
  * @property loading - True if the resource is currently being loaded
  * @property registry - The asset registry that this Asset belongs to
  * @param name - A non-unique but human-readable name which can be later used to retrieve the asset.
  * @param type - Type of asset. One of ["animation", "audio", "binary", "cubemap", "css", "font", "json", "html", "material", "model", "script", "shader", "text", "texture"]
  * @param [file] - Details about the file the asset is made from. At the least must contain the 'url' field. For assets that don't contain file data use null.
  * @param [data] - JSON object with additional data about the asset (e.g. for texture and model assets) or contains the asset data itself (e.g. in the case of materials)
  */
@js.native
trait Asset extends EventHandler {
  /**
    * JSON data that contains either the complete resource data (e.g. in the case of a material) or additional data (e.g. in the case of a model it contains mappings from mesh to material)
    */
  var data: js.Any = js.native
  /**
    * The file details or null if no file
    */
  var file: Filename = js.native
  /**
    * The asset id
    */
  var id: Double = js.native
  /**
    * True if the resource is loaded. e.g. if asset.resource is not null
    */
  var loaded: Boolean = js.native
  /**
    * True if the resource is currently being loaded
    */
  var loading: Boolean = js.native
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
    * Return the URL required to fetch the file for this asset.
    * @example
    * var assets = app.assets.find("My Image", "texture");
    var img = "&lt;img src='" + assets[0].getFileUrl() + "'&gt;";
    * @returns The URL.
    */
  def getFileUrl(): String = js.native
  /**
    * Take a callback which is called as soon as the asset is loaded. If the asset is already loaded the callback is called straight away.
    * @example
    * var asset = app.assets.find("My Asset");
    asset.ready(function (asset) {
    // asset loaded
    });
    app.assets.load(asset);
    * @param callback - The function called when the asset is ready. Passed the (asset) arguments.
    * @param [scope] - Scope object to use when calling the callback.
    */
  def ready(callback: AssetReady): Unit = js.native
  def ready(callback: AssetReady, scope: js.Any): Unit = js.native
  /**
    * Destroys the associated resource and marks asset as unloaded.
    * @example
    * var asset = app.assets.find("My Asset");
    asset.unload();
    // asset.resource is null
    */
  def unload(): Unit = js.native
}

