package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link AssetRegistry#filter} to filter assets.
  *
  * @callback FilterAssetCallback
  * @param {Asset} asset - The current asset to filter.
  * @returns {boolean} Return `true` to include asset to result list.
  */
/**
  * Callback used by {@link AssetRegistry#loadFromUrl} and called when an asset is loaded (or an
  * error occurs).
  *
  * @callback LoadAssetCallback
  * @param {string|null} err - The error message is null if no errors were encountered.
  * @param {Asset} [asset] - The loaded asset if no errors were encountered.
  */
/**
  * Container for all assets that are available to this application. Note that PlayCanvas scripts
  * are provided with an AssetRegistry instance as `app.assets`.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.AssetRegistry")
@js.native
open class AssetRegistry protected ()
  extends typings.playcanvas.mod.AssetRegistry {
  /**
    * Create an instance of an AssetRegistry.
    *
    * @param {import('../handlers/loader.js').ResourceLoader} loader - The ResourceLoader used to
    * load the asset files.
    */
  def this(loader: typings.playcanvas.mod.ResourceLoader) = this()
}
