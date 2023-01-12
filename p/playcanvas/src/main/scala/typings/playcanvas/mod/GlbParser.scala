package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlbParser extends StObject {
  
  var _assets: Any
  
  var _defaultMaterial: StandardMaterial
  
  var _device: Any
  
  def _getUrlWithoutParams(url: Any): Any
  
  def load(url: Any, callback: Any, asset: Any): Unit
  
  var maxRetries: Any
  
  def open(url: Any, data: Any, asset: Any): Any
  
  def patch(asset: Any, assets: Any): Unit
}
object GlbParser {
  
  inline def apply(
    _assets: Any,
    _defaultMaterial: StandardMaterial,
    _device: Any,
    _getUrlWithoutParams: Any => Any,
    load: (Any, Any, Any) => Unit,
    maxRetries: Any,
    open: (Any, Any, Any) => Any,
    patch: (Any, Any) => Unit
  ): GlbParser = {
    val __obj = js.Dynamic.literal(_assets = _assets.asInstanceOf[js.Any], _defaultMaterial = _defaultMaterial.asInstanceOf[js.Any], _device = _device.asInstanceOf[js.Any], _getUrlWithoutParams = js.Any.fromFunction1(_getUrlWithoutParams), load = js.Any.fromFunction3(load), maxRetries = maxRetries.asInstanceOf[js.Any], open = js.Any.fromFunction3(open), patch = js.Any.fromFunction2(patch))
    __obj.asInstanceOf[GlbParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlbParser] (val x: Self) extends AnyVal {
    
    inline def setLoad(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction3(value))
    
    inline def setMaxRetries(value: Any): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: (Any, Any, Any) => Any): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
    
    inline def setPatch(value: (Any, Any) => Unit): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
    
    inline def set_assets(value: Any): Self = StObject.set(x, "_assets", value.asInstanceOf[js.Any])
    
    inline def set_defaultMaterial(value: StandardMaterial): Self = StObject.set(x, "_defaultMaterial", value.asInstanceOf[js.Any])
    
    inline def set_device(value: Any): Self = StObject.set(x, "_device", value.asInstanceOf[js.Any])
    
    inline def set_getUrlWithoutParams(value: Any => Any): Self = StObject.set(x, "_getUrlWithoutParams", js.Any.fromFunction1(value))
  }
}
