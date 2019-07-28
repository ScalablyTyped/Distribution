package typings.parcelDashBundler.parcelDashBundlerMod

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParcelBundle extends js.Object {
  /**
    * A Set of all assets inside the bundle
    */
  var assets: Set[_]
  /**
    * A Set of all child bundles
    */
  var childBundles: Set[_]
  /**
    * The entryPoint of the bundle, used for generating the name and gathering assets.
    */
  var entryAsset: js.Any
  /**
    * The name of the bundle (generated using Asset.generateBundleName() of entryAsset)
    */
  var name: String
  /**
    * A Map<Asset, number(line number inside the bundle)> of all the locations of the assets inside the bundle, used to generate accurate source maps
    */
  var offsets: Map[ParcelAsset, Double]
  /**
    * The parent bundle, is null in case of the entry bundleany
    */
  var parentBundle: js.UndefOr[js.Any] = js.undefined
  /**
    * A Set of all sibling bundles
    */
  var siblingBundles: Set[_]
  /**
    * A Map<String(Type: js, css, map, ...), Bundle> of all sibling bundles
    */
  var siblingBundlesMap: Map[String, ParcelBundle]
  /**
    * The type of assets it contains (e.g. js, css, map, ...)
    */
  var `type`: String
}

object ParcelBundle {
  @scala.inline
  def apply(
    assets: Set[_],
    childBundles: Set[_],
    entryAsset: js.Any,
    name: String,
    offsets: Map[ParcelAsset, Double],
    siblingBundles: Set[_],
    siblingBundlesMap: Map[String, ParcelBundle],
    `type`: String,
    parentBundle: js.Any = null
  ): ParcelBundle = {
    val __obj = js.Dynamic.literal(assets = assets, childBundles = childBundles, entryAsset = entryAsset, name = name, offsets = offsets, siblingBundles = siblingBundles, siblingBundlesMap = siblingBundlesMap)
    __obj.updateDynamic("type")(`type`)
    if (parentBundle != null) __obj.updateDynamic("parentBundle")(parentBundle)
    __obj.asInstanceOf[ParcelBundle]
  }
}

