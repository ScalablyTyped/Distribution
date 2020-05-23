package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for ResourceHandlers used by {@link pc.ResourceLoader}.
  */
@js.native
trait ResourceHandler extends js.Object {
  /**
    * Optional function to perform any operations on a resource, that requires a dependency on its asset data
    or any other asset data.
    * @param asset - The asset to patch.
    * @param assets - The asset registry.
    */
  var patch: js.UndefOr[js.Function2[/* asset */ Asset, /* assets */ AssetRegistry, Unit]] = js.native
  /**
    * Load a resource from a remote URL. When loaded (or failed),
    use the callback to return an the raw resource data (or error).
    * @param url - The URL of the resource to load.
    * @param callback - The callback used when the resource is loaded or an error occurs.
    * @param [asset] - Optional asset that is passed by ResourceLoader.
    */
  def load(url: String, callback: typings.playcanvas.pc.callbacks.ResourceHandler): Unit = js.native
  def load(url: String, callback: typings.playcanvas.pc.callbacks.ResourceHandler, asset: Asset): Unit = js.native
  /**
    * Convert raw resource data into a resource instance. E.g. Take 3D model format JSON and return a pc.Model.
    * @param url - The URL of the resource to open.
    * @param data - The raw resource data passed by callback from {@link pc.ResourceHandler#load}.
    * @param [asset] - Optional asset that is passed by ResourceLoader.
    * @returns The parsed resource data.
    */
  def open(url: String, data: js.Any): js.Any = js.native
  def open(url: String, data: js.Any, asset: Asset): js.Any = js.native
}

