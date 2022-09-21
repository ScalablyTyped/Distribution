package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRenderable extends StObject {
  
  var _element: Any
  
  var _entity: Any
  
  var _meshDirty: Boolean
  
  def deleteParameter(name: Any): Unit
  
  def destroy(): Unit
  
  def forceUpdateAabb(mask: Any): Unit
  
  var mesh: Any
  
  var meshInstance: MeshInstance
  
  var model: Model
  
  var node: GraphNode
  
  def setAabbFunc(fn: Any): Unit
  
  def setCull(cull: Any): Unit
  
  def setDrawOrder(drawOrder: Any): Unit
  
  def setLayer(layer: Any): Unit
  
  def setMask(mask: Any): Unit
  
  def setMaterial(material: Any): Unit
  
  def setMesh(mesh: Any): Unit
  
  def setParameter(name: Any, value: Any): Unit
  
  def setScreenSpace(screenSpace: Any): Unit
  
  def setUnmaskDrawOrder(): Unit
  
  var unmaskMeshInstance: MeshInstance
}
object ImageRenderable {
  
  inline def apply(
    _element: Any,
    _entity: Any,
    _meshDirty: Boolean,
    deleteParameter: Any => Unit,
    destroy: () => Unit,
    forceUpdateAabb: Any => Unit,
    mesh: Any,
    meshInstance: MeshInstance,
    model: Model,
    node: GraphNode,
    setAabbFunc: Any => Unit,
    setCull: Any => Unit,
    setDrawOrder: Any => Unit,
    setLayer: Any => Unit,
    setMask: Any => Unit,
    setMaterial: Any => Unit,
    setMesh: Any => Unit,
    setParameter: (Any, Any) => Unit,
    setScreenSpace: Any => Unit,
    setUnmaskDrawOrder: () => Unit,
    unmaskMeshInstance: MeshInstance
  ): ImageRenderable = {
    val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _entity = _entity.asInstanceOf[js.Any], _meshDirty = _meshDirty.asInstanceOf[js.Any], deleteParameter = js.Any.fromFunction1(deleteParameter), destroy = js.Any.fromFunction0(destroy), forceUpdateAabb = js.Any.fromFunction1(forceUpdateAabb), mesh = mesh.asInstanceOf[js.Any], meshInstance = meshInstance.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], setAabbFunc = js.Any.fromFunction1(setAabbFunc), setCull = js.Any.fromFunction1(setCull), setDrawOrder = js.Any.fromFunction1(setDrawOrder), setLayer = js.Any.fromFunction1(setLayer), setMask = js.Any.fromFunction1(setMask), setMaterial = js.Any.fromFunction1(setMaterial), setMesh = js.Any.fromFunction1(setMesh), setParameter = js.Any.fromFunction2(setParameter), setScreenSpace = js.Any.fromFunction1(setScreenSpace), setUnmaskDrawOrder = js.Any.fromFunction0(setUnmaskDrawOrder), unmaskMeshInstance = unmaskMeshInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRenderable]
  }
  
  extension [Self <: ImageRenderable](x: Self) {
    
    inline def setDeleteParameter(value: Any => Unit): Self = StObject.set(x, "deleteParameter", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setForceUpdateAabb(value: Any => Unit): Self = StObject.set(x, "forceUpdateAabb", js.Any.fromFunction1(value))
    
    inline def setMesh(value: Any): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshInstance(value: MeshInstance): Self = StObject.set(x, "meshInstance", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setNode(value: GraphNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSetAabbFunc(value: Any => Unit): Self = StObject.set(x, "setAabbFunc", js.Any.fromFunction1(value))
    
    inline def setSetCull(value: Any => Unit): Self = StObject.set(x, "setCull", js.Any.fromFunction1(value))
    
    inline def setSetDrawOrder(value: Any => Unit): Self = StObject.set(x, "setDrawOrder", js.Any.fromFunction1(value))
    
    inline def setSetLayer(value: Any => Unit): Self = StObject.set(x, "setLayer", js.Any.fromFunction1(value))
    
    inline def setSetMask(value: Any => Unit): Self = StObject.set(x, "setMask", js.Any.fromFunction1(value))
    
    inline def setSetMaterial(value: Any => Unit): Self = StObject.set(x, "setMaterial", js.Any.fromFunction1(value))
    
    inline def setSetMesh(value: Any => Unit): Self = StObject.set(x, "setMesh", js.Any.fromFunction1(value))
    
    inline def setSetParameter(value: (Any, Any) => Unit): Self = StObject.set(x, "setParameter", js.Any.fromFunction2(value))
    
    inline def setSetScreenSpace(value: Any => Unit): Self = StObject.set(x, "setScreenSpace", js.Any.fromFunction1(value))
    
    inline def setSetUnmaskDrawOrder(value: () => Unit): Self = StObject.set(x, "setUnmaskDrawOrder", js.Any.fromFunction0(value))
    
    inline def setUnmaskMeshInstance(value: MeshInstance): Self = StObject.set(x, "unmaskMeshInstance", value.asInstanceOf[js.Any])
    
    inline def set_element(value: Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    inline def set_entity(value: Any): Self = StObject.set(x, "_entity", value.asInstanceOf[js.Any])
    
    inline def set_meshDirty(value: Boolean): Self = StObject.set(x, "_meshDirty", value.asInstanceOf[js.Any])
  }
}
