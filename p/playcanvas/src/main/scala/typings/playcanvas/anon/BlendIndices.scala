package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlendIndices extends StObject {
  
  var blendIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var blendWeights: js.UndefOr[js.Array[Double]] = js.undefined
  
  var colors: js.UndefOr[js.Array[Double]] = js.undefined
  
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var normals: js.UndefOr[js.Array[Double]] = js.undefined
  
  var tangents: js.UndefOr[js.Array[Double]] = js.undefined
  
  var uvs: js.UndefOr[js.Array[Double]] = js.undefined
  
  var uvs1: js.UndefOr[js.Array[Double]] = js.undefined
}
object BlendIndices {
  
  inline def apply(): BlendIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlendIndices]
  }
  
  extension [Self <: BlendIndices](x: Self) {
    
    inline def setBlendIndices(value: js.Array[Double]): Self = StObject.set(x, "blendIndices", value.asInstanceOf[js.Any])
    
    inline def setBlendIndicesUndefined: Self = StObject.set(x, "blendIndices", js.undefined)
    
    inline def setBlendIndicesVarargs(value: Double*): Self = StObject.set(x, "blendIndices", js.Array(value :_*))
    
    inline def setBlendWeights(value: js.Array[Double]): Self = StObject.set(x, "blendWeights", value.asInstanceOf[js.Any])
    
    inline def setBlendWeightsUndefined: Self = StObject.set(x, "blendWeights", js.undefined)
    
    inline def setBlendWeightsVarargs(value: Double*): Self = StObject.set(x, "blendWeights", js.Array(value :_*))
    
    inline def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    inline def setNormals(value: js.Array[Double]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
    
    inline def setNormalsUndefined: Self = StObject.set(x, "normals", js.undefined)
    
    inline def setNormalsVarargs(value: Double*): Self = StObject.set(x, "normals", js.Array(value :_*))
    
    inline def setTangents(value: js.Array[Double]): Self = StObject.set(x, "tangents", value.asInstanceOf[js.Any])
    
    inline def setTangentsUndefined: Self = StObject.set(x, "tangents", js.undefined)
    
    inline def setTangentsVarargs(value: Double*): Self = StObject.set(x, "tangents", js.Array(value :_*))
    
    inline def setUvs(value: js.Array[Double]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setUvs1(value: js.Array[Double]): Self = StObject.set(x, "uvs1", value.asInstanceOf[js.Any])
    
    inline def setUvs1Undefined: Self = StObject.set(x, "uvs1", js.undefined)
    
    inline def setUvs1Varargs(value: Double*): Self = StObject.set(x, "uvs1", js.Array(value :_*))
    
    inline def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
    
    inline def setUvsVarargs(value: Double*): Self = StObject.set(x, "uvs", js.Array(value :_*))
  }
}
