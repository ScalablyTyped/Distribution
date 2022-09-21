package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "LocalizedAsset")
@js.native
open class LocalizedAsset protected () extends EventHandler {
  def this(app: Any) = this()
  
  var _app: Any = js.native
  
  var _autoLoad: Boolean = js.native
  
  def _bindDefaultAsset(): Unit = js.native
  
  def _bindLocalizedAsset(): Unit = js.native
  
  var _defaultAsset: Any = js.native
  
  var _disableLocalization: Boolean = js.native
  
  var _localizedAsset: Any = js.native
  
  def _onDefaultAssetAdd(asset: Any): Unit = js.native
  
  def _onDefaultAssetRemove(asset: Any): Unit = js.native
  
  def _onLocaleAdd(locale: Any, assetId: Any): Unit = js.native
  
  def _onLocaleRemove(locale: Any, assetId: Any): Unit = js.native
  
  def _onLocalizedAssetAdd(asset: Any): Unit = js.native
  
  def _onLocalizedAssetChange(asset: Any, name: Any, newValue: Any, oldValue: Any): Unit = js.native
  
  def _onLocalizedAssetLoad(asset: Any): Unit = js.native
  
  def _onLocalizedAssetRemove(asset: Any): Unit = js.native
  
  def _onSetLocale(locale: Any): Unit = js.native
  
  def _unbindDefaultAsset(): Unit = js.native
  
  def _unbindLocalizedAsset(): Unit = js.native
  
  def autoLoad: Boolean = js.native
  def autoLoad_=(arg: Boolean): Unit = js.native
  
  def defaultAsset: Any = js.native
  def defaultAsset_=(arg: Any): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def disableLocalization: Boolean = js.native
  def disableLocalization_=(arg: Boolean): Unit = js.native
  
  def localizedAsset: Any = js.native
  def localizedAsset_=(arg: Any): Unit = js.native
}
