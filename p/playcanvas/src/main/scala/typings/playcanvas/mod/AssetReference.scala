package typings.playcanvas.mod

import typings.playcanvas.anon.Add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that manages the case where an object holds a reference to an asset and needs to be
  * notified when changes occur in the asset. e.g. notifications include load, add and remove
  * events.
  */
@JSImport("playcanvas", "AssetReference")
@js.native
open class AssetReference protected () extends StObject {
  def this(propertyName: String, parent: js.Object, registry: AssetRegistry, callbacks: Add) = this()
  /**
    * Create a new AssetReference instance.
    *
    * @param {string} propertyName - The name of the property that the asset is stored under,
    * passed into callbacks to enable updating.
    * @param {import('./asset.js').Asset|object} parent - The parent object that contains the
    * asset reference, passed into callbacks to enable updating. Currently an asset, but could be
    * component or other.
    * @param {import('./asset-registry.js').AssetRegistry} registry - The asset registry that
    * stores all assets.
    * @param {object} callbacks - A set of functions called when the asset state changes: load,
    * add, remove.
    * @param {object} [callbacks.load] - The function called when the asset loads
    * load(propertyName, parent, asset).
    * @param {object} [callbacks.add] - The function called when the asset is added to the
    * registry add(propertyName, parent, asset).
    * @param {object} [callbacks.remove] - The function called when the asset is remove from the
    * registry remove(propertyName, parent, asset).
    * @param {object} [callbacks.unload] - The function called when the asset is unloaded
    * unload(propertyName, parent, asset).
    * @param {object} [scope] - The scope to call the callbacks in.
    * @example
    * const reference = new pc.AssetReference('textureAsset', this, this.app.assets, {
    *     load: this.onTextureAssetLoad,
    *     add: this.onTextureAssetAdd,
    *     remove: this.onTextureAssetRemove
    * }, this);
    * reference.id = this.textureAsset.id;
    */
  def this(propertyName: String, parent: Asset_, registry: AssetRegistry, callbacks: Add) = this()
  def this(propertyName: String, parent: js.Object, registry: AssetRegistry, callbacks: Add, scope: js.Object) = this()
  def this(propertyName: String, parent: Asset_, registry: AssetRegistry, callbacks: Add, scope: js.Object) = this()
  
  def _bind(): Unit = js.native
  
  var _id: Any = js.native
  
  def _onAdd(asset: Any): Unit = js.native
  
  var _onAssetAdd: Any = js.native
  
  var _onAssetLoad: Any = js.native
  
  var _onAssetRemove: Any = js.native
  
  var _onAssetUnload: Any = js.native
  
  def _onLoad(asset: Any): Unit = js.native
  
  def _onRemove(asset: Any): Unit = js.native
  
  def _onUnload(asset: Any): Unit = js.native
  
  var _registry: AssetRegistry = js.native
  
  var _scope: Any = js.native
  
  def _unbind(): Unit = js.native
  
  var _url: Any = js.native
  
  var asset: Any = js.native
  
  def id: Any = js.native
  /**
    * Get or set the asset id which this references. One of either id or url must be set to
    * initialize an asset reference.
    *
    * @type {number}
    */
  def id_=(arg: Any): Unit = js.native
  
  var parent: Any = js.native
  
  var propertyName: String = js.native
  
  def url: Any = js.native
  /**
    * Get or set the asset url which this references. One of either id or url must be called to
    * initialize an asset reference.
    *
    * @type {string}
    */
  def url_=(arg: Any): Unit = js.native
}
