package typings.playcanvas.pc

import typings.playcanvas.Anon_Add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.AssetReference
  * @description An object that manages the case where an object holds a reference to an asset and needs to be notified when
  * changes occur in the asset. e.g. notifications include load, add and remove events.
  * @param {String} propertyName The name of the property that the asset is stored under, passed into callbacks to enable updating.
  * @param {pc.Asset|Object} parent The parent object that contains the asset reference, passed into callbacks to enable updating. Currently an asset, but could be component or other.
  * @param {pc.AssetRegistry} registry The asset registry that stores all assets.
  * @param {Object} callbacks A set of functions called when the asset state changes: load, add, remove.
  * @param {Object} [callbacks.load] The function called when the asset loads load(propertyName, parent, asset).
  * @param {Object} [callbacks.add] The function called when the asset is added to the registry add(propertyName, parent, asset).
  * @param {Object} [callbacks.remove] The function called when the asset is remove from the registry remove(propertyName, parent, asset).
  * @param {Object} [scope] The scope to call the callbacks in
  * @property {Number} id Get or set the asset id which this references. One of either id or url must be set to initialize an asset reference.
  * @property {String} url Get or set the asset url which this references. One of either id or url must be called to initialize an asset reference.
  * @example
  *
  * var reference = new pc.AssetReference('textureAsset', this, this.app.assets, {
  *     load: this.onTextureAssetLoad,
  *     add: this.onTextureAssetAdd,
  *     remove: this.onTextureAssetRemove
  * }, this);
  * reference.id = this.textureAsset.id;
  */
@JSGlobal("pc.AssetReference")
@js.native
class AssetReference protected () extends js.Object {
  def this(propertyName: String, parent: js.Any, registry: AssetRegistry, callbacks: Anon_Add) = this()
  def this(propertyName: String, parent: Asset, registry: AssetRegistry, callbacks: Anon_Add) = this()
  def this(propertyName: String, parent: js.Any, registry: AssetRegistry, callbacks: Anon_Add, scope: js.Any) = this()
  def this(propertyName: String, parent: Asset, registry: AssetRegistry, callbacks: Anon_Add, scope: js.Any) = this()
  /**
    * Get or set the asset id which this references. One of either id or url must be set to initialize an asset reference.
    */
  var id: Double = js.native
  /**
    * Get or set the asset url which this references. One of either id or url must be called to initialize an asset reference.
    */
  var url: String = js.native
}

