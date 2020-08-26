package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlendIndices extends js.Object {
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
  implicit class BlendIndicesOps[Self <: BlendIndices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlendIndicesVarargs(value: Double*): Self = this.set("blendIndices", js.Array(value :_*))
    @scala.inline
    def setBlendIndices(value: js.Array[Double]): Self = this.set("blendIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendIndices: Self = this.set("blendIndices", js.undefined)
    @scala.inline
    def setBlendWeightsVarargs(value: Double*): Self = this.set("blendWeights", js.Array(value :_*))
    @scala.inline
    def setBlendWeights(value: js.Array[Double]): Self = this.set("blendWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendWeights: Self = this.set("blendWeights", js.undefined)
    @scala.inline
    def setColorsVarargs(value: Double*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Double]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = this.set("indices", js.Array(value :_*))
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    @scala.inline
    def setNormalsVarargs(value: Double*): Self = this.set("normals", js.Array(value :_*))
    @scala.inline
    def setNormals(value: js.Array[Double]): Self = this.set("normals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormals: Self = this.set("normals", js.undefined)
    @scala.inline
    def setTangentsVarargs(value: Double*): Self = this.set("tangents", js.Array(value :_*))
    @scala.inline
    def setTangents(value: js.Array[Double]): Self = this.set("tangents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTangents: Self = this.set("tangents", js.undefined)
    @scala.inline
    def setUvsVarargs(value: Double*): Self = this.set("uvs", js.Array(value :_*))
    @scala.inline
    def setUvs(value: js.Array[Double]): Self = this.set("uvs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUvs: Self = this.set("uvs", js.undefined)
    @scala.inline
    def setUvs1Varargs(value: Double*): Self = this.set("uvs1", js.Array(value :_*))
    @scala.inline
    def setUvs1(value: js.Array[Double]): Self = this.set("uvs1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUvs1: Self = this.set("uvs1", js.undefined)
  }
  
}

