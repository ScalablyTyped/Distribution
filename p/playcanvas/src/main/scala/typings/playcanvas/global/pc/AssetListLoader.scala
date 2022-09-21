package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to load a group of assets and fires a callback when all assets are loaded.
  *
  * @augments EventHandler
  * @example
  *  const assets = [
  *      new Asset('model', 'container', { url: `http://example.com/asset.glb` }),
  *      new Asset('styling', 'css', { url: `http://example.com/asset.css` })
  *  ];
  *  const assetListLoader = new AssetListLoader(assets, app.assets);
  *  assetListLoader.load((err, failed) => {
  *      if (err) {
  *          console.error(`${failed.length} assets failed to load`);
  *      } else {
  *          console.log(`${assets.length} assets loaded`);
  *     }
  *  });
  */
@JSGlobal("pc.AssetListLoader")
@js.native
open class AssetListLoader protected ()
  extends typings.playcanvas.mod.AssetListLoader {
  /**
    * Create a new AssetListLoader using a list of assets to load and the asset registry used to load and manage them.
    *
    * @param {Asset[]|number[]} assetList - An array of {@link Asset} objects to load or an array of Asset IDs to load.
    * @param {AssetRegistry} assetRegistry - The application's asset registry.
    * @example
    * const assetListLoader = new pc.AssetListLoader([
    *     new pc.Asset("texture1", "texture", { url: 'http://example.com/my/assets/here/texture1.png') }),
    *     new pc.Asset("texture2", "texture", { url: 'http://example.com/my/assets/here/texture2.png') })
    * ], pc.app.assets);
    */
  def this(
    assetList: js.Array[typings.playcanvas.mod.Asset_ | Double],
    assetRegistry: typings.playcanvas.mod.AssetRegistry
  ) = this()
}
