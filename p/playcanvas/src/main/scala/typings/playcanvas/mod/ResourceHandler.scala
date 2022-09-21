package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../asset/asset.js').Asset} Asset */
/** @typedef {import('../asset/asset-registry.js').AssetRegistry} AssetRegistry */
/**
  * Callback used by {@link ResourceHandler#load} when a resource is loaded (or an error occurs).
  *
  * @callback ResourceHandlerCallback
  * @param {string|null} err - The error message in the case where the load fails.
  * @param {*} [response] - The raw data that has been successfully loaded.
  */
/**
  * @interface
  * @name ResourceHandler
  * @description Interface for ResourceHandlers used by {@link ResourceLoader}.
  */
@js.native
trait ResourceHandler extends StObject {
  
  /**
    * @function
    * @name ResourceHandler#load
    * @description Load a resource from a remote URL. When loaded (or failed),
    * use the callback to return an the raw resource data (or error).
    * @param {string|object} url - Either the URL of the resource to load or a structure containing the
    * load and original URL.
    * @param {string} [url.load] - The URL to be used for loading the resource.
    * @param {string} [url.original] - The original URL to be used for identifying the resource
    * format. This is necessary when loading, for example from blob.
    * @param {ResourceHandlerCallback} callback - The callback used when the resource is loaded or an error occurs.
    * @param {Asset} [asset] - Optional asset that is passed by ResourceLoader.
    */
  def load(url: String, callback: ResourceHandlerCallback): Unit = js.native
  def load(url: String, callback: ResourceHandlerCallback, asset: Asset_): Unit = js.native
  def load(url: js.Object, callback: ResourceHandlerCallback): Unit = js.native
  def load(url: js.Object, callback: ResourceHandlerCallback, asset: Asset_): Unit = js.native
  
  /**
    * @function
    * @name ResourceHandler#open
    * @description Convert raw resource data into a resource instance. E.g. Take 3D model format JSON and return a {@link Model}.
    * @param {string} url - The URL of the resource to open.
    * @param {*} data - The raw resource data passed by callback from {@link ResourceHandler#load}.
    * @param {Asset} [asset] - Optional asset that is passed by ResourceLoader.
    * @returns {*} The parsed resource data.
    */
  def open(url: String, data: Any): Any = js.native
  def open(url: String, data: Any, asset: Asset_): Any = js.native
  
  /**
    * @function
    * @name ResourceHandler#[patch]
    * @description Optional function to perform any operations on a resource, that requires a dependency on its asset data
    * or any other asset data.
    * @param {Asset} asset - The asset to patch.
    * @param {AssetRegistry} assets - The asset registry.
    */
  var patch: js.UndefOr[js.Function2[/* asset */ Asset_, /* assets */ AssetRegistry, Unit]] = js.native
}
