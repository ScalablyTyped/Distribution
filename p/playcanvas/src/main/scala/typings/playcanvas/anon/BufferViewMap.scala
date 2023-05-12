package typings.playcanvas.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferViewMap extends StObject {
  
  var bufferViewMap: Map[Any, Any]
  
  var buffers: js.Array[Any]
  
  var cameras: js.Array[Any]
  
  var entities: js.Array[Any]
  
  var entityMeshInstances: js.Array[Any]
  
  var materials: js.Array[Any]
  
  var textures: js.Array[Any]
}
object BufferViewMap {
  
  inline def apply(
    bufferViewMap: Map[Any, Any],
    buffers: js.Array[Any],
    cameras: js.Array[Any],
    entities: js.Array[Any],
    entityMeshInstances: js.Array[Any],
    materials: js.Array[Any],
    textures: js.Array[Any]
  ): BufferViewMap = {
    val __obj = js.Dynamic.literal(bufferViewMap = bufferViewMap.asInstanceOf[js.Any], buffers = buffers.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], entityMeshInstances = entityMeshInstances.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferViewMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferViewMap] (val x: Self) extends AnyVal {
    
    inline def setBufferViewMap(value: Map[Any, Any]): Self = StObject.set(x, "bufferViewMap", value.asInstanceOf[js.Any])
    
    inline def setBuffers(value: js.Array[Any]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setBuffersVarargs(value: Any*): Self = StObject.set(x, "buffers", js.Array(value*))
    
    inline def setCameras(value: js.Array[Any]): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
    
    inline def setCamerasVarargs(value: Any*): Self = StObject.set(x, "cameras", js.Array(value*))
    
    inline def setEntities(value: js.Array[Any]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Any*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEntityMeshInstances(value: js.Array[Any]): Self = StObject.set(x, "entityMeshInstances", value.asInstanceOf[js.Any])
    
    inline def setEntityMeshInstancesVarargs(value: Any*): Self = StObject.set(x, "entityMeshInstances", js.Array(value*))
    
    inline def setMaterials(value: js.Array[Any]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsVarargs(value: Any*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setTextures(value: js.Array[Any]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesVarargs(value: Any*): Self = StObject.set(x, "textures", js.Array(value*))
  }
}
