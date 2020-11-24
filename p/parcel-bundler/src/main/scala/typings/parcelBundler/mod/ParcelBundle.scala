package typings.parcelBundler.mod

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParcelBundle extends js.Object {
  
  /**
    * A Set of all assets inside the bundle
    */
  var assets: Set[_] = js.native
  
  /**
    * A Set of all child bundles
    */
  var childBundles: Set[_] = js.native
  
  /**
    * The entryPoint of the bundle, used for generating the name and gathering assets.
    */
  var entryAsset: js.Any = js.native
  
  /**
    * The name of the bundle (generated using Asset.generateBundleName() of entryAsset)
    */
  var name: String = js.native
  
  /**
    * A Map<Asset, number(line number inside the bundle)> of all the locations of the assets inside the bundle, used to generate accurate source maps
    */
  var offsets: Map[ParcelAsset, Double] = js.native
  
  /**
    * The parent bundle, is null in case of the entry bundleany
    */
  var parentBundle: js.UndefOr[js.Any] = js.native
  
  /**
    * A Set of all sibling bundles
    */
  var siblingBundles: Set[_] = js.native
  
  /**
    * A Map<String(Type: js, css, map, ...), Bundle> of all sibling bundles
    */
  var siblingBundlesMap: Map[String, ParcelBundle] = js.native
  
  /**
    * The type of assets it contains (e.g. js, css, map, ...)
    */
  var `type`: String = js.native
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
    `type`: String
  ): ParcelBundle = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], childBundles = childBundles.asInstanceOf[js.Any], entryAsset = entryAsset.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], siblingBundles = siblingBundles.asInstanceOf[js.Any], siblingBundlesMap = siblingBundlesMap.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParcelBundle]
  }
  
  @scala.inline
  implicit class ParcelBundleOps[Self <: ParcelBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssets(value: Set[_]): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildBundles(value: Set[_]): Self = this.set("childBundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryAsset(value: js.Any): Self = this.set("entryAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsets(value: Map[ParcelAsset, Double]): Self = this.set("offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingBundles(value: Set[_]): Self = this.set("siblingBundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingBundlesMap(value: Map[String, ParcelBundle]): Self = this.set("siblingBundlesMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentBundle(value: js.Any): Self = this.set("parentBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentBundle: Self = this.set("parentBundle", js.undefined)
  }
}
