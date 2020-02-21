package typings.playcanvas.pc

import typings.playcanvas.AnonAdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.AssetReference
  * @description An object that manages the case where an object holds a reference to an asset and needs to be notified when
  * changes occur in the asset. e.g. notifications include load, add and remove events.
  * @param {string} propertyName - The name of the property that the asset is stored under, passed into callbacks to enable updating.
  * @param {pc.Asset|object} parent - The parent object that contains the asset reference, passed into callbacks to enable updating. Currently an asset, but could be component or other.
  * @param {pc.AssetRegistry} registry - The asset registry that stores all assets.
  * @param {object} callbacks - A set of functions called when the asset state changes: load, add, remove.
  * @param {object} [callbacks.load] - The function called when the asset loads load(propertyName, parent, asset).
  * @param {object} [callbacks.add] - The function called when the asset is added to the registry add(propertyName, parent, asset).
  * @param {object} [callbacks.remove] - The function called when the asset is remove from the registry remove(propertyName, parent, asset).
  * @param {object} [scope] - The scope to call the callbacks in
  * @property {number} id Get or set the asset id which this references. One of either id or url must be set to initialize an asset reference.
  * @property {string} url Get or set the asset url which this references. One of either id or url must be called to initialize an asset reference.
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
  def this(propertyName: String, parent: js.Any, registry: AssetRegistry, callbacks: AnonAdd) = this()
  def this(propertyName: String, parent: Asset, registry: AssetRegistry, callbacks: AnonAdd) = this()
  def this(propertyName: String, parent: js.Any, registry: AssetRegistry, callbacks: AnonAdd, scope: js.Any) = this()
  def this(propertyName: String, parent: Asset, registry: AssetRegistry, callbacks: AnonAdd, scope: js.Any) = this()
  /**
    * Get or set the asset id which this references. One of either id or url must be set to initialize an asset reference.
    */
  var id: Double = js.native
  /**
    * Get or set the asset url which this references. One of either id or url must be called to initialize an asset reference.
    */
  var url: String = js.native
}

