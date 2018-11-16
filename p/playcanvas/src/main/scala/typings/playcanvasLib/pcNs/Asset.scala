package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @name pc.Asset
    * @class An asset record of a file or data resource that can be loaded by the engine.
    * The asset contains three important fields:<br/>
    * <strong>file</strong>: contains the details of a file (filename, url) which contains the resource data, e.g. an image file for a texture asset<br/>
    * <strong>data</strong>: contains a JSON blob which contains either the resource data for the asset (e.g. material data) or additional data for the file (e.g. material mappings for a model)<br/>
    * <strong>resource</strong>: contains the final resource when it is loaded. (e.g. a {@link pc.StandardMaterial} or a {@link pc.Texture})<br/>
    *
    * See the {@link pc.AssetRegistry} for details on loading resources from assets.
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
    */
@JSGlobal("pc.Asset")
@js.native
class Asset protected () extends js.Object {
  def this(name: java.lang.String, `type`: java.lang.String) = this()
  def this(name: java.lang.String, `type`: java.lang.String, file: playcanvasLib.Anon_Url) = this()
  def this(name: java.lang.String, `type`: java.lang.String, file: playcanvasLib.Anon_Url, data: js.Object) = this()
  def this(name: java.lang.String, `type`: java.lang.String, file: scala.Null, data: js.Object) = this()
  var file: playcanvasLib.Anon_Url | scala.Null = js.native
  var id: scala.Double = js.native
  var loaded: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var preload: scala.Boolean = js.native
  var registry: AssetRegistry = js.native
  var resource: Texture | Model | Material = js.native
  var resources: js.Array[Texture | Model | Material] = js.native
  var tags: Tags = js.native
  var `type`: java.lang.String = js.native
  /**
           * @function
           * @name pc.Asset#fire
           * @description Fire an event, all additional arguments are passed on to the event listener
           * @param {Object} name Name of event to fire
           * @param {*} [...] Arguments that are passed to the event handler
           * @example
           * obj.fire('test', 'This is the message');
           */
  def fire(
    name: java.lang.String,
    arg1: js.UndefOr[js.Any],
    arg2: js.UndefOr[js.Any],
    arg3: js.UndefOr[js.Any],
    arg4: js.UndefOr[js.Any],
    arg5: js.UndefOr[js.Any],
    arg6: js.UndefOr[js.Any],
    arg7: js.UndefOr[js.Any],
    arg8: js.UndefOr[js.Any]
  ): js.Any = js.native
  /**
          * @name pc.Asset#getFileUrl
          * @function
          * @description Return the URL required to fetch the file for this asset.
          * @returns {String} The URL
          * @example
          * var assets = app.assets.find("My Image", "texture");
          * var img = "&lt;img src='" + assets[0].getFileUrl() + "'&gt;";
          */
  def getFileUrl(): java.lang.String = js.native
  /**
          * @function
          * @name pc.Asset#hasEvent
          * @description Test if there are any handlers bound to an event name
          * @param {String} name The name of the event to test
          * @example
          * obj.on('test', function () { }); // bind an event to 'test'
          * obj.hasEvent('test'); // returns true
          */
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  /**
           * @function
           * @name pc.Asset#off
           * @description Detach an event handler from an event. If callback is not provided then all callbacks are unbound from the event,
           * if scope is not provided then all events with the callback will be unbound.
           * @param {String} [name] Name of the event to unbind
           * @param {Function} [callback] Function to be unbound
           * @param {Object} [scope] Scope that was used as the this when the event is fired
           * @example
           * var handler = function () {
           * };
           * obj.on('test', handler);
           *
           * obj.off(); // Removes all events
           * obj.off('test'); // Removes all events called 'test'
           * obj.off('test', handler); // Removes all handler functions, called 'test'
           * obj.off('test', handler, this); // Removes all hander functions, called 'test' with scope this
           */
  def off(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): js.Any = js.native
  /**
           * @function
           * @name pc.Asset#off
           * @description Detach an event handler from an event. If callback is not provided then all callbacks are unbound from the event,
           * if scope is not provided then all events with the callback will be unbound.
           * @param {String} [name] Name of the event to unbind
           * @param {Function} [callback] Function to be unbound
           * @param {Object} [scope] Scope that was used as the this when the event is fired
           * @example
           * var handler = function () {
           * };
           * obj.on('test', handler);
           *
           * obj.off(); // Removes all events
           * obj.off('test'); // Removes all events called 'test'
           * obj.off('test', handler); // Removes all handler functions, called 'test'
           * obj.off('test', handler, this); // Removes all hander functions, called 'test' with scope this
           */
  def off(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  // Events
  /**
           * @function
           * @name pc.Asset#on
           * @description Attach an event handler to an event
           * @param {String} name Name of the event to bind the callback to
           * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
           * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
           * @example
           * obj.on('test', function (a, b) {
           *     console.log(a + b);
           * });
           * obj.fire('test', 1, 2); // prints 3 to the console
           */
  def on(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): js.Any = js.native
  // Events
  /**
           * @function
           * @name pc.Asset#on
           * @description Attach an event handler to an event
           * @param {String} name Name of the event to bind the callback to
           * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
           * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
           * @example
           * obj.on('test', function (a, b) {
           *     console.log(a + b);
           * });
           * obj.fire('test', 1, 2); // prints 3 to the console
           */
  def on(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  /**
           * @function
           * @name pc.Asset#once
           * @description Attach an event handler to an event. This handler will be removed after being fired once.
           * @param {String} name Name of the event to bind the callback to
           * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
           * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
           * @example
           * obj.once('test', function (a, b) {
           *     console.log(a + b);
           * });
           * obj.fire('test', 1, 2); // prints 3 to the console
           * obj.fire('test', 1, 2); // not going to get handled
           */
  def once(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): js.Any = js.native
  /**
           * @function
           * @name pc.Asset#once
           * @description Attach an event handler to an event. This handler will be removed after being fired once.
           * @param {String} name Name of the event to bind the callback to
           * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
           * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
           * @example
           * obj.once('test', function (a, b) {
           *     console.log(a + b);
           * });
           * obj.fire('test', 1, 2); // prints 3 to the console
           * obj.fire('test', 1, 2); // not going to get handled
           */
  def once(name: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  /**
          * @function
          * @name pc.Asset#ready
          * @description Take a callback which is called as soon as the asset is loaded. If the asset is already loaded the callback is called straight away
          * @param {Function} callback The function called when the asset is ready. Passed the (asset) arguments
          * @example
          * var asset = app.assets.find("My Asset");
          * asset.ready(function (asset) {
          *   // asset loaded
          * });
          * app.assets.load(asset);
          */
  def ready(callback: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  /**
          * @function
          * @name pc.Asset#ready
          * @description Take a callback which is called as soon as the asset is loaded. If the asset is already loaded the callback is called straight away
          * @param {Function} callback The function called when the asset is ready. Passed the (asset) arguments
          * @example
          * var asset = app.assets.find("My Asset");
          * asset.ready(function (asset) {
          *   // asset loaded
          * });
          * app.assets.load(asset);
          */
  def ready(callback: js.Function1[/* repeated */js.Any, scala.Unit], scope: js.Any): scala.Unit = js.native
  /**
          * @function
          * @name pc.Asset#unload
          * @description Destroys the associated resource and marks asset as unloaded.
          * @example
          * var asset = app.assets.find("My Asset");
          * asset.unload();
          * // asset.resource is null
          */
  def unload(): scala.Unit = js.native
}

