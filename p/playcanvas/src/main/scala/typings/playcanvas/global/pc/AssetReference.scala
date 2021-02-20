package typings.playcanvas.global.pc

import typings.playcanvas.anon.Add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that manages the case where an object holds a reference to an asset and needs to be notified when
  * changes occur in the asset. e.g. notifications include load, add and remove events.
  * @example
  * var reference = new pc.AssetReference('textureAsset', this, this.app.assets, {
  *     load: this.onTextureAssetLoad,
  *     add: this.onTextureAssetAdd,
  *     remove: this.onTextureAssetRemove
  * }, this);
  * reference.id = this.textureAsset.id;
  * @property id - Get or set the asset id which this references. One of either id or url must be set to initialize an asset reference.
  * @property url - Get or set the asset url which this references. One of either id or url must be called to initialize an asset reference.
  * @param propertyName - The name of the property that the asset is stored under, passed into callbacks to enable updating.
  * @param parent - The parent object that contains the asset reference, passed into callbacks to enable updating. Currently an asset, but could be component or other.
  * @param registry - The asset registry that stores all assets.
  * @param callbacks - A set of functions called when the asset state changes: load, add, remove.
  * @param [callbacks.load] - The function called when the asset loads load(propertyName, parent, asset).
  * @param [callbacks.add] - The function called when the asset is added to the registry add(propertyName, parent, asset).
  * @param [callbacks.remove] - The function called when the asset is remove from the registry remove(propertyName, parent, asset).
  * @param [scope] - The scope to call the callbacks in
  */
@JSGlobal("pc.AssetReference")
@js.native
class AssetReference protected ()
  extends typings.playcanvas.pc.AssetReference {
  def this(
    propertyName: String,
    parent: js.Any,
    registry: typings.playcanvas.pc.AssetRegistry,
    callbacks: Add
  ) = this()
  def this(
    propertyName: String,
    parent: typings.playcanvas.pc.Asset,
    registry: typings.playcanvas.pc.AssetRegistry,
    callbacks: Add
  ) = this()
  def this(
    propertyName: String,
    parent: js.Any,
    registry: typings.playcanvas.pc.AssetRegistry,
    callbacks: Add,
    scope: js.Any
  ) = this()
  def this(
    propertyName: String,
    parent: typings.playcanvas.pc.Asset,
    registry: typings.playcanvas.pc.AssetRegistry,
    callbacks: Add,
    scope: js.Any
  ) = this()
}
