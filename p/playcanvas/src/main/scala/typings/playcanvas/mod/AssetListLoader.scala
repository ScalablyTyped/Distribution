package typings.playcanvas.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to load a group of assets and fires a callback when all assets are loaded.
  *
  * ```javascript
  * const assets = [
  *     new Asset('model', 'container', { url: `http://example.com/asset.glb` }),
  *     new Asset('styling', 'css', { url: `http://example.com/asset.css` })
  * ];
  * const assetListLoader = new AssetListLoader(assets, app.assets);
  * assetListLoader.load((err, failed) => {
  *     if (err) {
  *         console.error(`${failed.length} assets failed to load`);
  *     } else {
  *         console.log(`${assets.length} assets loaded`);
  *    }
  * });
  * ```
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "AssetListLoader")
@js.native
open class AssetListLoader protected () extends EventHandler {
  /**
    * Create a new AssetListLoader using a list of assets to load and the asset registry used to load and manage them.
    *
    * @param {Asset[]|number[]} assetList - An array of {@link Asset} objects to load or an array of Asset IDs to load.
    * @param {import('./asset-registry.js').AssetRegistry} assetRegistry - The application's asset registry.
    * @example
    * const assetListLoader = new pc.AssetListLoader([
    *     new pc.Asset("texture1", "texture", { url: 'http://example.com/my/assets/here/texture1.png') }),
    *     new pc.Asset("texture2", "texture", { url: 'http://example.com/my/assets/here/texture2.png') })
    * ], pc.app.assets);
    */
  def this(assetList: js.Array[Asset_ | Double], assetRegistry: AssetRegistry) = this()
  
  def _assetHasDependencies(asset: Any): Any = js.native
  
  var _assets: Set[Any] = js.native
  
  var _callback: js.Function = js.native
  
  var _failed: js.Array[Any] = js.native
  
  var _loaded: Boolean = js.native
  
  var _loading: Boolean = js.native
  
  var _loadingAssets: Set[Any] = js.native
  
  def _loadingComplete(): Unit = js.native
  
  def _onAddAsset(asset: Any): Unit = js.native
  
  def _onError(err: Any, asset: Any): Unit = js.native
  
  def _onLoad(asset: Any): Unit = js.native
  
  var _registry: AssetRegistry = js.native
  
  var _scope: Any = js.native
  
  def _waitForAsset(assetId: Any): Unit = js.native
  
  var _waitingAssets: Set[Any] = js.native
  
  /**
    * Removes all references to this asset list loader.
    */
  def destroy(): Unit = js.native
  
  /**
    * Start loading asset list, call done() when all assets have loaded or failed to load.
    *
    * @param {Function} done - Callback called when all assets in the list are loaded. Passed (err, failed) where err is the undefined if no errors are encountered and failed contains a list of assets that failed to load.
    * @param {object} [scope] - Scope to use when calling callback.
    */
  def load(done: js.Function): Unit = js.native
  def load(done: js.Function, scope: js.Object): Unit = js.native
  
  /**
    * Sets a callback which will be called when all assets in the list have been loaded.
    *
    * @param {Function} done - Callback called when all assets in the list are loaded.
    * @param {object} [scope] - Scope to use when calling callback.
    */
  def ready(done: js.Function): Unit = js.native
  def ready(done: js.Function, scope: js.Object): Unit = js.native
}
