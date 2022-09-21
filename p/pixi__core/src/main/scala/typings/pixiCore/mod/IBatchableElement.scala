package typings.pixiCore.mod

import typings.pixiConstants.mod.BLEND_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatchableElement extends StObject {
  
  var _texture: Texture[Resource]
  
  var _tintRGB: Double
  
  var blendMode: BLEND_MODES
  
  var indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.Array[Double]
  
  var uvs: js.typedarray.Float32Array
  
  var vertexData: js.typedarray.Float32Array
  
  var worldAlpha: Double
}
object IBatchableElement {
  
  inline def apply(
    _texture: Texture[Resource],
    _tintRGB: Double,
    blendMode: BLEND_MODES,
    indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.Array[Double],
    uvs: js.typedarray.Float32Array,
    vertexData: js.typedarray.Float32Array,
    worldAlpha: Double
  ): IBatchableElement = {
    val __obj = js.Dynamic.literal(_texture = _texture.asInstanceOf[js.Any], _tintRGB = _tintRGB.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], uvs = uvs.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any], worldAlpha = worldAlpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchableElement]
  }
  
  extension [Self <: IBatchableElement](x: Self) {
    
    inline def setBlendMode(value: BLEND_MODES): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setUvs(value: js.typedarray.Float32Array): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setVertexData(value: js.typedarray.Float32Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
    
    inline def setWorldAlpha(value: Double): Self = StObject.set(x, "worldAlpha", value.asInstanceOf[js.Any])
    
    inline def set_texture(value: Texture[Resource]): Self = StObject.set(x, "_texture", value.asInstanceOf[js.Any])
    
    inline def set_tintRGB(value: Double): Self = StObject.set(x, "_tintRGB", value.asInstanceOf[js.Any])
  }
}
