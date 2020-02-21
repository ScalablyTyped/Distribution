package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @interface
  * @name pc.ResourceHandler
  * @description Interface for ResourceHandlers used by {@link pc.ResourceLoader}.
  */
@js.native
trait ResourceHandler extends js.Object {
  /**
    * @function
    * @name pc.ResourceHandler#[patch]
    * @description Optional function to perform any operations on a resource, that requires a dependency on its asset data
    * or any other asset data.
    * @param {pc.Asset} asset - The asset to patch.
    * @param {pc.AssetRegistry} assets - The asset registry.
    */
  var patch: js.UndefOr[js.Function2[/* asset */ Asset, /* assets */ AssetRegistry, Unit]] = js.native
  /**
    * @function
    * @name pc.ResourceHandler#load
    * @description Load a resource from a remote URL. When loaded (or failed),
    * use the callback to return an the raw resource data (or error).
    * @param {string} url - The URL of the resource to load.
    * @param {pc.callbacks.ResourceHandler} callback - The callback used when the resource is loaded or an error occurs.
    * @param {pc.Asset} [asset] - Optional asset that is passed by ResourceLoader.
    */
  def load(url: String, callback: typings.playcanvas.pc.callbacks.ResourceHandler): Unit = js.native
  def load(url: String, callback: typings.playcanvas.pc.callbacks.ResourceHandler, asset: Asset): Unit = js.native
  /**
    * @function
    * @name pc.ResourceHandler#open
    * @description Convert raw resource data into a resource instance. E.g. Take 3D model format JSON and return a pc.Model.
    * @param {string} url - The URL of the resource to open.
    * @param {*} data - The raw resource data passed by callback from {@link pc.ResourceHandler#load}.
    * @param {pc.Asset} [asset] - Optional asset that is passed by ResourceLoader.
    * @returns {*} The parsed resource data.
    */
  def open(url: String, data: js.Any): js.Any = js.native
  def open(url: String, data: js.Any, asset: Asset): js.Any = js.native
}

