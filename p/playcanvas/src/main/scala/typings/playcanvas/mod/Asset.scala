package typings.playcanvas.mod

import typings.playcanvas.anon.CrossOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Asset record. Generally, Assets are created in the loading process and you won't need to create them by hand.
  * @example
  * var file = {
  *     filename: "filename.txt",
  *     url: "/example/filename.txt"
  * };
  * @example
  * var asset = new pc.Asset("a texture", "texture", {
  *     url: "http://example.com/my/assets/here/texture.png"
  * });
  * @property name - The name of the asset
  * @property id - The asset id
  * @property type - The type of the asset. One of ["animation", "audio", "binary", "cubemap", "css", "font", "json", "html", "material", "model", "script", "shader", "text", "texture"]
  * @property tags - Interface for tagging. Allows to find assets by tags using {@link pc.AssetRegistry#findByTag} method.
  * @property file - The file details or null if no file
  * @property [file.url] - The URL of the resource file that contains the asset data
  * @property [file.filename] - The filename of the resource file or null if no filename was set (e.g from using {@link pc.AssetRegistry#loadFromUrl})
  * @property [file.size] - The size of the resource file or null if no size was set (e.g from using {@link pc.AssetRegistry#loadFromUrl})
  * @property [file.hash] - The MD5 hash of the resource file data and the Asset data field or null if hash was set (e.g from using {@link pc.AssetRegistry#loadFromUrl})
  * @property [file.contents] - Optional file contents. This is faster than wrapping the data
  * in a (base64 encoded) blob. Currently only used by container assets.
  * @property [data] - Optional JSON data that contains either the complete resource data (e.g. in the case of a material) or additional data (e.g. in the case of a model it contains mappings from mesh to material)
  * @property [options] - Optional JSON data that contains the asset handler options.
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
  * @param [options] - The asset handler options. For container options see {@link pc.ContainerHandler}
  * @param [options.crossOrigin] - For use with texture resources. For browser-supported image formats only, enable cross origin.
  */
@JSImport("playcanvas", "Asset")
@js.native
class Asset protected ()
  extends typings.playcanvas.pc.Asset {
  def this(name: String, `type`: String) = this()
  def this(name: String, `type`: String, file: js.Any) = this()
  def this(name: String, `type`: String, file: js.UndefOr[scala.Nothing], data: js.Any) = this()
  def this(name: String, `type`: String, file: js.Any, data: js.Any) = this()
  def this(
    name: String,
    `type`: String,
    file: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    options: CrossOrigin
  ) = this()
  def this(name: String, `type`: String, file: js.UndefOr[scala.Nothing], data: js.Any, options: CrossOrigin) = this()
  def this(name: String, `type`: String, file: js.Any, data: js.UndefOr[scala.Nothing], options: CrossOrigin) = this()
  def this(name: String, `type`: String, file: js.Any, data: js.Any, options: CrossOrigin) = this()
}
