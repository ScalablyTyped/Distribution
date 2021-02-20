package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlendIndices extends StObject {
  
  var blendIndices: js.UndefOr[js.Array[Double]] = js.native
  
  var blendWeights: js.UndefOr[js.Array[Double]] = js.native
  
  var colors: js.UndefOr[js.Array[Double]] = js.native
  
  var indices: js.UndefOr[js.Array[Double]] = js.native
  
  var normals: js.UndefOr[js.Array[Double]] = js.native
  
  var tangents: js.UndefOr[js.Array[Double]] = js.native
  
  var uvs: js.UndefOr[js.Array[Double]] = js.native
  
  var uvs1: js.UndefOr[js.Array[Double]] = js.native
}
object BlendIndices {
  
  @scala.inline
  def apply(): BlendIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlendIndices]
  }
  
  @scala.inline
  implicit class BlendIndicesMutableBuilder[Self <: BlendIndices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendIndices(value: js.Array[Double]): Self = StObject.set(x, "blendIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendIndicesUndefined: Self = StObject.set(x, "blendIndices", js.undefined)
    
    @scala.inline
    def setBlendIndicesVarargs(value: Double*): Self = StObject.set(x, "blendIndices", js.Array(value :_*))
    
    @scala.inline
    def setBlendWeights(value: js.Array[Double]): Self = StObject.set(x, "blendWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendWeightsUndefined: Self = StObject.set(x, "blendWeights", js.undefined)
    
    @scala.inline
    def setBlendWeightsVarargs(value: Double*): Self = StObject.set(x, "blendWeights", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    @scala.inline
    def setNormals(value: js.Array[Double]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalsUndefined: Self = StObject.set(x, "normals", js.undefined)
    
    @scala.inline
    def setNormalsVarargs(value: Double*): Self = StObject.set(x, "normals", js.Array(value :_*))
    
    @scala.inline
    def setTangents(value: js.Array[Double]): Self = StObject.set(x, "tangents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentsUndefined: Self = StObject.set(x, "tangents", js.undefined)
    
    @scala.inline
    def setTangentsVarargs(value: Double*): Self = StObject.set(x, "tangents", js.Array(value :_*))
    
    @scala.inline
    def setUvs(value: js.Array[Double]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvs1(value: js.Array[Double]): Self = StObject.set(x, "uvs1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvs1Undefined: Self = StObject.set(x, "uvs1", js.undefined)
    
    @scala.inline
    def setUvs1Varargs(value: Double*): Self = StObject.set(x, "uvs1", js.Array(value :_*))
    
    @scala.inline
    def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
    
    @scala.inline
    def setUvsVarargs(value: Double*): Self = StObject.set(x, "uvs", js.Array(value :_*))
  }
}
