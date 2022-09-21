package typings.playcanvas.global.pc

import typings.playcanvas.anon.Contents
import typings.playcanvas.anon.CrossOrigin
import typings.playcanvas.mod.ResourceLoaderCallback
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
@JSGlobal("pc.Asset")
@js.native
open class Asset_ protected ()
  extends typings.playcanvas.mod.Asset_ {
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
}
object Asset_ {
  
  @JSGlobal("pc.Asset")
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
  inline def fetchArrayBuffer(loadUrl: String, callback: ResourceLoaderCallback, asset: typings.playcanvas.mod.Asset_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(loadUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], asset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fetchArrayBuffer(
    loadUrl: String,
    callback: ResourceLoaderCallback,
    asset: typings.playcanvas.mod.Asset_,
    maxRetries: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(loadUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], asset.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
