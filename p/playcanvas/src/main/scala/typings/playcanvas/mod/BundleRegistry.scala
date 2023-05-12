package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Keeps track of which assets are in bundles and loads files from bundles.
  *
  * @ignore
  */
@JSImport("playcanvas", "BundleRegistry")
@js.native
open class BundleRegistry protected () extends StObject {
  /**
    * Create a new BundleRegistry instance.
    *
    * @param {import('../asset/asset-registry.js').AssetRegistry} assets - The asset registry.
    */
  def this(assets: AssetRegistry) = this()
  
  var _assets: AssetRegistry = js.native
  
  def _findLoadedOrLoadingBundleForUrl(url: Any): Any = js.native
  
  def _getAssetFileUrls(asset: Any): js.Array[Any] = js.native
  
  def _indexAssetFileUrls(asset: Any): Unit = js.native
  
  def _indexAssetInBundle(assetId: Any, bundleAsset: Any): Unit = js.native
  
  def _normalizeUrl(url: Any): Any = js.native
  
  def _onAssetAdded(asset: Any): Unit = js.native
  
  def _onAssetRemoved(asset: Any): Unit = js.native
  
  def _onBundleError(err: Any, bundleAsset: Any): Unit = js.native
  
  def _onBundleLoaded(bundleAsset: Any): Unit = js.native
  
  def _registerBundleEventListeners(bundleAssetId: Any): Unit = js.native
  
  def _unregisterBundleEventListeners(bundleAssetId: Any): Unit = js.native
  
  /**
    * Returns true if there is a bundle that contains the specified URL and that bundle is either
    * loaded or currently being loaded.
    *
    * @param {string} url - The url.
    * @returns {boolean} True or false.
    */
  def canLoadUrl(url: String): Boolean = js.native
  
  /**
    * Destroys the registry, and releases its resources. Does not unload bundle assets as these
    * should be unloaded by the {@link AssetRegistry}.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns true if there is a bundle that contains the specified URL.
    *
    * @param {string} url - The url.
    * @returns {boolean} True or false.
    */
  def hasUrl(url: String): Boolean = js.native
  
  /**
    * Lists all of the available bundles. This includes bundles that are not loaded.
    *
    * @returns {import('../asset/asset.js').Asset[]} An array of bundle assets.
    */
  def list(): js.Array[Asset_] = js.native
  
  /**
    * Lists all of the available bundles that reference the specified asset id.
    *
    * @param {import('../asset/asset.js').Asset} asset - The asset.
    * @returns {import('../asset/asset.js').Asset[]} An array of bundle assets or null if the
    * asset is not in any bundle.
    */
  def listBundlesForAsset(asset: Asset_): js.Array[Asset_] = js.native
  
  /**
    * Loads the specified file URL from a bundle that is either loaded or currently being loaded.
    *
    * @param {string} url - The URL. Make sure you are using a relative URL that does not contain
    * any query parameters.
    * @param {Function} callback - The callback is called when the file has been loaded or if an
    * error occurs. The callback expects the first argument to be the error message (if any) and
    * the second argument is the file blob URL.
    * @example
    * const url = asset.getFileUrl().split('?')[0]; // get normalized asset URL
    * this.app.bundles.loadFile(url, function (err, blobUrl) {
    *     // do something with the blob URL
    * });
    */
  def loadUrl(url: String, callback: js.Function): Unit = js.native
}
