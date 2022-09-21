package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardMaterialOptionsBuilder extends StObject {
  
  def _collectLights(lType: Any, lights: Any, lightsFiltered: Any, mask: Any, staticLightList: Any): Unit
  
  def _getMapTransformID(xform: Any, uv: Any): Any
  
  var _mapXForms: js.Array[Any]
  
  def _updateEnvOptions(options: Any, stdMat: Any, scene: Any): Unit
  
  def _updateLightOptions(options: Any, stdMat: Any, objDefs: Any, sortedLights: Any, staticLightList: Any): Unit
  
  def _updateMaterialOptions(options: Any, stdMat: Any): Unit
  
  def _updateMinOptions(options: Any, stdMat: Any): Unit
  
  def _updateSharedOptions(options: Any, scene: Any, stdMat: Any, objDefs: Any, pass: Any): Unit
  
  def _updateTexOptions(options: Any, stdMat: Any, p: Any, hasUv0: Any, hasUv1: Any, hasVcolor: Any, minimalOptions: Any): Unit
  
  def _updateUVOptions(options: Any, stdMat: Any, objDefs: Any, minimalOptions: Any): Unit
  
  def updateMinRef(
    options: Any,
    scene: Any,
    stdMat: Any,
    objDefs: Any,
    staticLightList: Any,
    pass: Any,
    sortedLights: Any
  ): Unit
  
  def updateRef(
    options: Any,
    scene: Any,
    stdMat: Any,
    objDefs: Any,
    staticLightList: Any,
    pass: Any,
    sortedLights: Any
  ): Unit
}
object StandardMaterialOptionsBuilder {
  
  inline def apply(
    _collectLights: (Any, Any, Any, Any, Any) => Unit,
    _getMapTransformID: (Any, Any) => Any,
    _mapXForms: js.Array[Any],
    _updateEnvOptions: (Any, Any, Any) => Unit,
    _updateLightOptions: (Any, Any, Any, Any, Any) => Unit,
    _updateMaterialOptions: (Any, Any) => Unit,
    _updateMinOptions: (Any, Any) => Unit,
    _updateSharedOptions: (Any, Any, Any, Any, Any) => Unit,
    _updateTexOptions: (Any, Any, Any, Any, Any, Any, Any) => Unit,
    _updateUVOptions: (Any, Any, Any, Any) => Unit,
    updateMinRef: (Any, Any, Any, Any, Any, Any, Any) => Unit,
    updateRef: (Any, Any, Any, Any, Any, Any, Any) => Unit
  ): StandardMaterialOptionsBuilder = {
    val __obj = js.Dynamic.literal(_collectLights = js.Any.fromFunction5(_collectLights), _getMapTransformID = js.Any.fromFunction2(_getMapTransformID), _mapXForms = _mapXForms.asInstanceOf[js.Any], _updateEnvOptions = js.Any.fromFunction3(_updateEnvOptions), _updateLightOptions = js.Any.fromFunction5(_updateLightOptions), _updateMaterialOptions = js.Any.fromFunction2(_updateMaterialOptions), _updateMinOptions = js.Any.fromFunction2(_updateMinOptions), _updateSharedOptions = js.Any.fromFunction5(_updateSharedOptions), _updateTexOptions = js.Any.fromFunction7(_updateTexOptions), _updateUVOptions = js.Any.fromFunction4(_updateUVOptions), updateMinRef = js.Any.fromFunction7(updateMinRef), updateRef = js.Any.fromFunction7(updateRef))
    __obj.asInstanceOf[StandardMaterialOptionsBuilder]
  }
  
  extension [Self <: StandardMaterialOptionsBuilder](x: Self) {
    
    inline def setUpdateMinRef(value: (Any, Any, Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "updateMinRef", js.Any.fromFunction7(value))
    
    inline def setUpdateRef(value: (Any, Any, Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "updateRef", js.Any.fromFunction7(value))
    
    inline def set_collectLights(value: (Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "_collectLights", js.Any.fromFunction5(value))
    
    inline def set_getMapTransformID(value: (Any, Any) => Any): Self = StObject.set(x, "_getMapTransformID", js.Any.fromFunction2(value))
    
    inline def set_mapXForms(value: js.Array[Any]): Self = StObject.set(x, "_mapXForms", value.asInstanceOf[js.Any])
    
    inline def set_mapXFormsVarargs(value: Any*): Self = StObject.set(x, "_mapXForms", js.Array(value*))
    
    inline def set_updateEnvOptions(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "_updateEnvOptions", js.Any.fromFunction3(value))
    
    inline def set_updateLightOptions(value: (Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "_updateLightOptions", js.Any.fromFunction5(value))
    
    inline def set_updateMaterialOptions(value: (Any, Any) => Unit): Self = StObject.set(x, "_updateMaterialOptions", js.Any.fromFunction2(value))
    
    inline def set_updateMinOptions(value: (Any, Any) => Unit): Self = StObject.set(x, "_updateMinOptions", js.Any.fromFunction2(value))
    
    inline def set_updateSharedOptions(value: (Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "_updateSharedOptions", js.Any.fromFunction5(value))
    
    inline def set_updateTexOptions(value: (Any, Any, Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "_updateTexOptions", js.Any.fromFunction7(value))
    
    inline def set_updateUVOptions(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "_updateUVOptions", js.Any.fromFunction4(value))
  }
}
